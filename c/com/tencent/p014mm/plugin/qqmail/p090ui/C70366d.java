package com.tencent.p014mm.plugin.qqmail.p090ui;

import ag2.C39599v0;
import ag2.C67039p0;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import cg2.C54716a;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.tools.FileExplorerUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import j20.C117292a;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p823sg.C48379o;
import pe3.C47465a;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.d */
public class C70366d implements C11385n, CdnLogic.UploadCallback {

    /* renamed from: d */
    public ComposeUI f203250d;

    /* renamed from: e */
    public ViewGroup f203251e;

    /* renamed from: f */
    public TextView f203252f;

    /* renamed from: g */
    public ImageView f203253g;

    /* renamed from: h */
    public Map<String, C67039p0> f203254h = new HashMap();

    /* renamed from: i */
    public Map<String, C54716a> f203255i = new HashMap();

    /* renamed from: j */
    public Map<String, String> f203256j = new HashMap();

    /* renamed from: n */
    public C70374g f203257n = null;

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.d$a */
    public class C70367a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ImageView f203258d;

        public C70367a(C70366d dVar, ImageView imageView) {
            this.f203258d = imageView;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/FileUploadHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f203258d.getVisibility() == 0) {
                this.f203258d.performClick();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/FileUploadHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.d$b */
    public class C70368b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C67039p0 f203259d;

        public C70368b(C67039p0 p0Var) {
            this.f203259d = p0Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/FileUploadHelper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C67039p0 p0Var = this.f203259d;
            p0Var.f192583h = C70366d.this.mo96896c(p0Var.f192579d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/FileUploadHelper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.d$c */
    public class C70369c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C67039p0 f203261d;

        /* renamed from: e */
        public final /* synthetic */ LinearLayout f203262e;

        /* renamed from: com.tencent.mm.plugin.qqmail.ui.d$c$a */
        public class C70370a implements DialogInterface.OnClickListener {
            public C70370a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C70369c cVar = C70369c.this;
                C67039p0 p0Var = cVar.f203261d;
                int i2 = p0Var.f192582g;
                if (i2 == 0 || i2 == 1) {
                    C54716a aVar = (C54716a) ((HashMap) C70366d.this.f203255i).get(p0Var.f192579d);
                    if (aVar != null) {
                        C86709a0.m107529k().f251779b.mo123458d(aVar);
                    }
                }
                C70369c cVar2 = C70369c.this;
                ((HashMap) C70366d.this.f203254h).remove(cVar2.f203261d.f192579d);
                C70369c cVar3 = C70369c.this;
                ((HashMap) C70366d.this.f203255i).remove(cVar3.f203261d.f192579d);
                C70369c cVar4 = C70369c.this;
                C70366d.this.f203251e.removeView(cVar4.f203262e);
                C70366d.this.mo96895b();
            }
        }

        public C70369c(C67039p0 p0Var, LinearLayout linearLayout) {
            this.f203261d = p0Var;
            this.f203262e = linearLayout;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/FileUploadHelper$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76879j.m92743n(C70366d.this.f203250d, C0966R.string.hkb, C0966R.string.a3h, new C70370a(), (DialogInterface.OnClickListener) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/FileUploadHelper$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.d$d */
    public class C70371d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C67039p0 f203265d;

        public C70371d(C67039p0 p0Var) {
            this.f203265d = p0Var;
        }

        public void run() {
            C70366d.this.mo96900g(this.f203265d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.d$e */
    public class C70372e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C67039p0 f203267d;

        /* renamed from: e */
        public final /* synthetic */ CdnLogic.C2CUploadResult f203268e;

        public C70372e(C67039p0 p0Var, CdnLogic.C2CUploadResult c2CUploadResult) {
            this.f203267d = p0Var;
            this.f203268e = c2CUploadResult;
        }

        public void run() {
            boolean z;
            C70374g gVar;
            C67039p0 p0Var = this.f203267d;
            if (p0Var != null) {
                if (this.f203268e.errorCode != 0) {
                    p0Var.f192582g = 3;
                } else {
                    p0Var.f192582g = 2;
                    C70366d dVar = C70366d.this;
                    if (!dVar.mo96899f()) {
                        C70374g gVar2 = dVar.f203257n;
                        if (gVar2 != null) {
                            ((HashMap) dVar.f203254h).size();
                            for (String str : ((HashMap) dVar.f203254h).keySet()) {
                                if (((C67039p0) ((HashMap) dVar.f203254h).get(str)).f192582g != 2) {
                                    break;
                                }
                            }
                            ComposeUI composeUI = ComposeUI.this;
                            composeUI.f203092A.setMessage(composeUI.getString(C0966R.string.hka));
                        }
                    } else {
                        Iterator it = ((HashMap) dVar.f203254h).keySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            }
                            if (((C67039p0) ((HashMap) dVar.f203254h).get((String) it.next())).f192582g != 2) {
                                z = false;
                                break;
                            }
                        }
                        if (z && (gVar = dVar.f203257n) != null) {
                            ComposeUI composeUI2 = ComposeUI.this;
                            composeUI2.f203095D = ComposeUI.m82865I7(composeUI2);
                        }
                    }
                }
                C70366d.this.mo96900g(this.f203267d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.d$f */
    public class C70373f {

        /* renamed from: a */
        public TextView f203270a;

        /* renamed from: b */
        public ProgressBar f203271b;

        /* renamed from: c */
        public TextView f203272c;

        /* renamed from: d */
        public ImageView f203273d;

        /* renamed from: e */
        public ImageView f203274e;

        public C70373f(C70366d dVar, C70367a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.d$g */
    public interface C70374g {
    }

    public C70366d(ComposeUI composeUI, TextView textView, ImageView imageView, ViewGroup viewGroup) {
        this.f203250d = composeUI;
        this.f203251e = viewGroup;
        this.f203252f = textView;
        this.f203253g = imageView;
        mo96895b();
        C86709a0.m107529k().f251779b.mo123455a(11665, this);
    }

    /* renamed from: a */
    public void mo96894a() {
        for (String str : ((HashMap) this.f203254h).keySet()) {
            C67039p0 p0Var = (C67039p0) ((HashMap) this.f203254h).get(str);
            if (p0Var.f192582g != 2) {
                C54716a aVar = (C54716a) ((HashMap) this.f203255i).get(p0Var.f192579d);
                if (aVar != null) {
                    C86709a0.m107529k().f251779b.mo123458d(aVar);
                    p0Var.f192582g = 3;
                    mo96900g(p0Var);
                    ((HashMap) this.f203255i).remove(p0Var.f192579d);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo96895b() {
        if (this.f203254h.size() == 0) {
            TextView textView = this.f203252f;
            textView.setText(this.f203250d.getString(C0966R.string.hki) + " " + this.f203250d.getString(C0966R.string.hkl));
            this.f203253g.setImageResource(C0966R.raw.qqmail_attach_icon_normal);
            View view = (View) this.f203251e.getParent();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/FileUploadHelper", "changeSummary", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/qqmail/ui/FileUploadHelper", "changeSummary", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            TextView textView2 = this.f203252f;
            textView2.setText(this.f203250d.getString(C0966R.string.hki) + this.f203250d.getResources().getQuantityString(C0966R.plurals.f7245a0, this.f203254h.size(), new Object[]{Integer.valueOf(this.f203254h.size()), Util.getSizeKB((long) mo96897d())}));
            this.f203253g.setImageResource(C0966R.raw.qqmail_attach_icon_pressed);
            View view3 = (View) this.f203251e.getParent();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/FileUploadHelper", "changeSummary", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/qqmail/ui/FileUploadHelper", "changeSummary", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int childCount = this.f203251e.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (childCount == 1) {
                this.f203251e.getChildAt(i).setBackgroundResource(C0966R.C0969drawable.aet);
            } else if (i == 0) {
                this.f203251e.getChildAt(i).setBackgroundResource(C0966R.C0969drawable.aeu);
            } else if (i <= 0 || i >= childCount - 1) {
                this.f203251e.getChildAt(i).setBackgroundResource(C0966R.C0969drawable.aew);
            } else {
                this.f203251e.getChildAt(i).setBackgroundResource(C0966R.C0969drawable.aev);
            }
        }
    }

    /* renamed from: c */
    public final long mo96896c(String str) {
        try {
            C86009m1 m1Var = new C86009m1(str);
            Log.m105925i("MicroMsg.Mail.FileUploadHelper", "doNormalUpload %s", str, m1Var.getName());
            byte[] O = C86013q1.m106433O(str, 0, (int) m1Var.mo119980r());
            C54716a aVar = new C54716a(str, (int) m1Var.mo119980r(), C48379o.m53724a(MessageDigest.getInstance(AndroidUtilsLight.DIGEST_ALGORITHM_SHA1).digest(O)), MD5Util.getMD5String(O));
            C86709a0.m107524d().mo123460f(aVar);
            ((HashMap) this.f203255i).put(str, aVar);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Mail.FileUploadHelper", e, "", new Object[0]);
        }
        return System.currentTimeMillis();
    }

    /* renamed from: d */
    public int mo96897d() {
        int i = 0;
        for (String str : this.f203254h.keySet()) {
            i = (int) (((long) i) + this.f203254h.get(str).f192581f);
        }
        return i;
    }

    /* renamed from: e */
    public LinkedList<C67039p0> mo96898e() {
        LinkedList<C67039p0> linkedList = new LinkedList<>();
        for (String str : ((HashMap) this.f203254h).keySet()) {
            linkedList.add((C67039p0) ((HashMap) this.f203254h).get(str));
        }
        return linkedList;
    }

    /* renamed from: f */
    public boolean mo96899f() {
        for (String str : ((HashMap) this.f203254h).keySet()) {
            int i = ((C67039p0) ((HashMap) this.f203254h).get(str)).f192582g;
            if (i != 2 && i != 3) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void mo96900g(C67039p0 p0Var) {
        LinearLayout linearLayout = (LinearLayout) this.f203251e.findViewById(Math.abs(p0Var.f192579d.hashCode() / 2));
        if (linearLayout != null) {
            C70373f fVar = (C70373f) linearLayout.getTag();
            Log.m105925i("MicroMsg.Mail.FileUploadHelper", "show upload status %d", Integer.valueOf(p0Var.f192582g));
            int i = p0Var.f192582g;
            if (i == 0 || i == 1) {
                fVar.f203270a.setTextColor(this.f203250d.getResources().getColor(C0966R.color.a7f));
                fVar.f203271b.setVisibility(0);
                fVar.f203272c.setVisibility(8);
                fVar.f203273d.setVisibility(8);
                fVar.f203274e.setVisibility(0);
            } else if (i == 2) {
                fVar.f203270a.setTextColor(this.f203250d.getResources().getColor(C0966R.color.a7f));
                fVar.f203271b.setVisibility(8);
                fVar.f203272c.setVisibility(8);
                fVar.f203273d.setVisibility(8);
                fVar.f203274e.setVisibility(0);
            } else if (i == 3) {
                fVar.f203270a.setTextColor(C76577a.m92153d(this.f203250d, C0966R.color.a1a));
                fVar.f203271b.setVisibility(8);
                fVar.f203272c.setVisibility(0);
                fVar.f203273d.setVisibility(0);
                fVar.f203274e.setVisibility(0);
            }
        }
    }

    /* renamed from: h */
    public final void mo96901h(C67039p0 p0Var) {
        LinearLayout linearLayout = (LinearLayout) ((ViewGroup) View.inflate(this.f203250d, C0966R.C0971layout.boz, (ViewGroup) null)).findViewById(C0966R.C0970id.hxx);
        TextView textView = (TextView) linearLayout.findViewById(C0966R.C0970id.hxy);
        ImageView imageView = (ImageView) linearLayout.findViewById(C0966R.C0970id.hxz);
        ImageView imageView2 = (ImageView) linearLayout.findViewById(C0966R.C0970id.hxv);
        ((ViewGroup) linearLayout.getParent()).removeView(linearLayout);
        ((ImageView) linearLayout.findViewById(C0966R.C0970id.hxw)).setImageResource(FileExplorerUI.m20925I7(p0Var.f192580e));
        textView.setText(p0Var.f192580e);
        ((TextView) linearLayout.findViewById(C0966R.C0970id.f358930hy0)).setText(Util.getSizeKB(p0Var.f192581f));
        C70373f fVar = new C70373f(this, (C70367a) null);
        fVar.f203270a = textView;
        fVar.f203271b = (ProgressBar) linearLayout.findViewById(C0966R.C0970id.f358931hy1);
        fVar.f203272c = (TextView) linearLayout.findViewById(C0966R.C0970id.f358932hy2);
        fVar.f203273d = imageView;
        fVar.f203274e = imageView2;
        linearLayout.setTag(fVar);
        linearLayout.setId(Math.abs(p0Var.f192579d.hashCode() / 2));
        this.f203251e.addView(linearLayout);
        mo96895b();
        linearLayout.setOnClickListener(new C70367a(this, imageView));
        imageView.setOnClickListener(new C70368b(p0Var));
        imageView2.setOnClickListener(new C70369c(p0Var, linearLayout));
        this.f203251e.post(new C70371d(p0Var));
        if (p0Var.f192582g == 0) {
            p0Var.f192583h = mo96896c(p0Var.f192579d);
        }
    }

    /* renamed from: i */
    public void mo96902i(List<C67039p0> list) {
        if (list != null) {
            for (C67039p0 next : list) {
                ((HashMap) this.f203254h).put(next.f192579d, next);
                mo96901h(next);
            }
        }
    }

    public void onC2CUploadCompleted(String str, CdnLogic.C2CUploadResult c2CUploadResult) {
        Log.m105925i("MicroMsg.Mail.FileUploadHelper", "onC2CUploadCompleted %s", str);
        if (((HashMap) this.f203256j).containsKey(str)) {
            MMHandlerThread.postToMainThread(new C70372e((C67039p0) ((HashMap) this.f203254h).get(((HashMap) this.f203256j).get(str)), c2CUploadResult));
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.getType() == 11665) {
            C54716a aVar = (C54716a) yVar;
            String str2 = aVar.f153355f;
            Log.m105925i("MicroMsg.Mail.FileUploadHelper", "errType %d, errCode %d, errMsg %s, filePath %s", Integer.valueOf(i), Integer.valueOf(i2), str, str2);
            C67039p0 p0Var = (C67039p0) ((HashMap) this.f203254h).get(str2);
            ((HashMap) this.f203255i).remove(str2);
            if (p0Var == null) {
                return;
            }
            if (i == 0 && i2 == 0) {
                CdnLogic.C2CUploadRequest c2CUploadRequest = new CdnLogic.C2CUploadRequest();
                c2CUploadRequest.fileKey = aVar.f153356g;
                c2CUploadRequest.setFilePath2(str2);
                C47465a aVar2 = aVar.f153353d.f127056b.f127083a;
                c2CUploadRequest.forwardFileid = ((C39599v0) aVar2).f106318g;
                c2CUploadRequest.host = ((C39599v0) aVar2).f106317f;
                ((HashMap) this.f203256j).put(c2CUploadRequest.fileKey, str2);
                p0Var.f192582g = 1;
                p0Var.f192584i = ((C39599v0) aVar.f153353d.f127056b.f127083a).f106315d;
                mo96900g(p0Var);
                CdnLogic.startFtnUpload(c2CUploadRequest, this);
                return;
            }
            p0Var.f192582g = 3;
            mo96900g(p0Var);
        }
    }

    public void onUploadProgressChanged(String str, long j, long j2) {
        Log.m105925i("MicroMsg.Mail.FileUploadHelper", "onUploadProgressChanged fileKey:%s finish:%d total:%d", str, Long.valueOf(j), Long.valueOf(j2));
    }
}
