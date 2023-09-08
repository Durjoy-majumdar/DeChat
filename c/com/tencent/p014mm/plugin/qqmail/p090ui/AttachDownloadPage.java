package com.tencent.p014mm.plugin.qqmail.p090ui;

import ag2.C27900o;
import ag2.C79540c0;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMImageView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.FileExplorerUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import p214om.C11502f;
import p262wm.C22921c;
import p262wm.C22923f;
import pb1.C100718j1;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101835rd0;
import yf2.C15998c;
import yf2.C91444a;
import yf2.C91446b;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage */
public class AttachDownloadPage extends MMActivity {

    /* renamed from: D */
    public static final /* synthetic */ int f248733D = 0;

    /* renamed from: A */
    public int f248734A = 0;

    /* renamed from: B */
    public long f248735B;

    /* renamed from: C */
    public int f248736C = 0;

    /* renamed from: d */
    public MMImageView f248737d;

    /* renamed from: e */
    public View f248738e;

    /* renamed from: f */
    public ProgressBar f248739f;

    /* renamed from: g */
    public ImageView f248740g;

    /* renamed from: h */
    public ImageView f248741h;

    /* renamed from: i */
    public TextView f248742i;

    /* renamed from: j */
    public Button f248743j;

    /* renamed from: n */
    public Button f248744n;

    /* renamed from: o */
    public LinearLayout f248745o;

    /* renamed from: p */
    public TextView f248746p;

    /* renamed from: q */
    public TextView f248747q;

    /* renamed from: r */
    public String f248748r;

    /* renamed from: s */
    public int f248749s;

    /* renamed from: t */
    public boolean f248750t = false;

    /* renamed from: u */
    public String f248751u;

    /* renamed from: v */
    public String f248752v;

    /* renamed from: w */
    public String f248753w;

    /* renamed from: x */
    public String f248754x;

    /* renamed from: y */
    public long f248755y;

    /* renamed from: z */
    public boolean f248756z = true;

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage$a */
    public class C85365a implements MenuItem.OnMenuItemClickListener {
        public C85365a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AttachDownloadPage.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage$b */
    public class C85366b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage$b$a */
        public class C85367a implements C76879j.C11180n {
            public C85367a() {
            }

            /* renamed from: j */
            public void mo782j(int i) {
                C86001b0 q;
                if (i == 0) {
                    AttachDownloadPage attachDownloadPage = AttachDownloadPage.this;
                    int i2 = AttachDownloadPage.f248733D;
                    String L7 = attachDownloadPage.mo118680L7(false);
                    attachDownloadPage.getClass();
                    DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                    String r = C86013q1.m106457r(L7);
                    if (Util.isNullOrNil(L7)) {
                        Log.m105928w("MicroMsg.Qqmail.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
                        doFavoriteEvent.f264674d.f264687l = C0966R.string.f360421co1;
                    } else {
                        Log.m105919d("MicroMsg.Qqmail.GetFavDataSource", "do fill event info(fav simple file), title %s, desc %s, path %s, sourceType %d", r, "", L7, 9);
                        Uri n = C116299g2.m163858n(L7);
                        String path = n.getPath();
                        if (path != null) {
                            String k = C116299g2.m163855k(path, false, false);
                            if (!n.getPath().equals(k)) {
                                n = n.buildUpon().path(k).build();
                            }
                        }
                        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                        long j = 0;
                        if (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) {
                            j = q.f250473c;
                        }
                        if (j > ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128210aN(true)) {
                            doFavoriteEvent.f264674d.f264687l = C0966R.string.hle;
                        } else {
                            C101801kd0 kd02 = new C101801kd0();
                            C101835rd0 rd02 = new C101835rd0();
                            C101834rc0 rc02 = new C101834rc0();
                            rc02.f299284V = L7;
                            rc02.mo141260p(8);
                            rc02.mo141261q(C86013q1.m106454o(L7));
                            rc02.mo141232F(true);
                            rc02.mo141246U(r);
                            rc02.mo141265u("");
                            rd02.mo141275k(C75592q0.m90789s());
                            rd02.mo141279o(C75592q0.m90789s());
                            rd02.mo141277m(9);
                            rd02.mo141273f(Util.nowMilliSecond());
                            kd02.mo141219q(rd02);
                            kd02.f298618f.add(rc02);
                            DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                            String str = rc02.f299297d;
                            aVar.f264679d = str;
                            aVar.f264680e = str;
                            aVar.f264676a = kd02;
                            aVar.f264678c = 8;
                        }
                    }
                    DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
                    aVar2.f264684i = attachDownloadPage;
                    aVar2.f264688m = 6;
                    doFavoriteEvent.publish();
                }
            }
        }

        public C85366b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AttachDownloadPage attachDownloadPage = AttachDownloadPage.this;
            C76879j.m92737h(attachDownloadPage, "", new String[]{attachDownloadPage.getString(C0966R.string.f361137hk2)}, "", false, new C85367a());
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage$c */
    public class C85368c implements View.OnClickListener {
        public C85368c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AttachDownloadPage.this.f248734A = 2;
            ((C27900o) C86312j.m106911c(C27900o.class)).mo55677fI().mo109594b(AttachDownloadPage.this.f248735B);
            AttachDownloadPage attachDownloadPage = AttachDownloadPage.this;
            attachDownloadPage.f248735B = 0;
            attachDownloadPage.mo118682N7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage$d */
    public class C85369d implements View.OnClickListener {
        public C85369d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AttachDownloadPage attachDownloadPage = AttachDownloadPage.this;
            attachDownloadPage.f248736C = 0;
            attachDownloadPage.mo118677I7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage$e */
    public class C85370e implements View.OnClickListener {
        public C85370e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AttachDownloadPage attachDownloadPage = AttachDownloadPage.this;
            if (attachDownloadPage.f248750t) {
                Intent intent = new Intent(attachDownloadPage.getContext(), CompressPreviewUI.class);
                intent.putExtra("mail_id", attachDownloadPage.f248752v);
                intent.putExtra("attach_id", attachDownloadPage.f248753w);
                intent.putExtra("attach_size", attachDownloadPage.f248755y);
                intent.putExtra("attach_name", attachDownloadPage.f248751u);
                AppCompatActivity context = attachDownloadPage.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                AppCompatActivity appCompatActivity = context;
                C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "previewAttach", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "previewAttach", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                String[] strArr = {"mailid=" + attachDownloadPage.f248752v, "attachid=" + attachDownloadPage.f248753w, "texttype=html"};
                Intent intent2 = new Intent();
                intent2.putExtra("uri", "/cgi-bin/viewdocument");
                intent2.putExtra("params", strArr);
                intent2.putExtra("baseurl", C79540c0.m96570c());
                intent2.putExtra(FirebaseAnalytics.C113379b.METHOD, "get");
                intent2.putExtra("singleColumn", FileExplorerUtil.isImg(attachDownloadPage.f248751u));
                intent2.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, attachDownloadPage.f248751u);
                intent2.setClass(attachDownloadPage, MailWebViewUI.class);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                AttachDownloadPage attachDownloadPage2 = attachDownloadPage;
                C117292a.m165358d(attachDownloadPage2, aVar2.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "previewAttach", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                attachDownloadPage.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(attachDownloadPage2, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "previewAttach", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage$f */
    public class C85371f implements View.OnClickListener {
        public C85371f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AttachDownloadPage attachDownloadPage = AttachDownloadPage.this;
            int i = AttachDownloadPage.f248733D;
            String L7 = attachDownloadPage.mo118680L7(false);
            String o = C86013q1.m106454o(L7);
            if (!(o == null || o.length() == 0)) {
                ((C22921c) C86312j.m106911c(C22921c.class)).mo35876EU(attachDownloadPage, L7, o, 3);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage$g */
    public class C85372g implements View.OnClickListener {
        public C85372g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AttachDownloadPage attachDownloadPage = AttachDownloadPage.this;
            attachDownloadPage.f248736C = 0;
            attachDownloadPage.mo118677I7();
            AttachDownloadPage.this.mo118681M7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage$h */
    public class C85373h implements View.OnClickListener {
        public C85373h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AttachDownloadPage attachDownloadPage = AttachDownloadPage.this;
            if (attachDownloadPage.f248734A == 3) {
                String L7 = attachDownloadPage.mo118680L7(false);
                String o = C86013q1.m106454o(L7);
                if (!(o == null || o.length() == 0)) {
                    ((C22921c) C86312j.m106911c(C22921c.class)).mo35876EU(attachDownloadPage, L7, o, 3);
                }
            } else {
                attachDownloadPage.mo118681M7();
                AttachDownloadPage attachDownloadPage2 = AttachDownloadPage.this;
                attachDownloadPage2.f248736C = 0;
                attachDownloadPage2.mo118677I7();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage$i */
    public class C85374i implements C91444a.C91445a {
        public C85374i() {
        }
    }

    /* renamed from: H7 */
    public final void mo118676H7() {
        if (C86013q1.m106450k(mo118680L7(true))) {
            C86013q1.m106451l(mo118680L7(true));
            this.f248734A = 2;
        } else if (C86013q1.m106450k(mo118680L7(false))) {
            this.f248734A = 3;
        } else if (!C86013q1.m106450k(mo118679K7())) {
            this.f248734A = 0;
        } else if (C86013q1.m106451l(mo118679K7()) == this.f248755y) {
            C86013q1.m106435Q(this.f248748r, this.f248751u, mo118678J7());
            this.f248734A = 3;
        } else if (C86013q1.m106451l(mo118679K7()) > this.f248755y) {
            C86013q1.m106447h(mo118679K7());
            this.f248734A = 4;
        } else {
            this.f248734A = 0;
        }
    }

    /* renamed from: I7 */
    public final void mo118677I7() {
        mo118676H7();
        int i = this.f248734A;
        if (i == 4) {
            int i2 = this.f248736C;
            if (i2 < 5) {
                this.f248736C = i2 + 1;
                mo118677I7();
            } else {
                mo118682N7();
            }
        } else if (i == 3) {
            String str = this.f248748r;
            C86013q1.m106435Q(str, mo118678J7() + ".temp", mo118678J7());
            this.f248734A = 3;
            mo118682N7();
        }
        String L7 = mo118680L7(true);
        Log.m105925i("MicroMsg.AttachDownloadPage", "download attach url %s", this.f248754x);
        String str2 = this.f248754x;
        String stringExtra = getIntent().getStringExtra("qqmail_cookie");
        C85374i iVar = new C85374i();
        String str3 = C15998c.f43047a;
        C91446b bVar = new C91446b(str2, L7, iVar);
        Bundle bundle = new Bundle();
        bundle.putString("param_cookie", stringExtra);
        bVar.mo119143f(bundle);
    }

    /* renamed from: J7 */
    public final String mo118678J7() {
        String str;
        String str2;
        int hashCode = this.f248753w.hashCode() & 65535;
        int lastIndexOf = this.f248751u.lastIndexOf(".");
        if (lastIndexOf != -1) {
            str = this.f248751u.substring(0, lastIndexOf);
            String str3 = this.f248751u;
            str2 = str3.substring(lastIndexOf, str3.length());
        } else {
            str = this.f248751u;
            str2 = "";
        }
        return String.format("%s_%d%s", new Object[]{str, Integer.valueOf(hashCode), str2});
    }

    /* renamed from: K7 */
    public final String mo118679K7() {
        return this.f248748r + this.f248751u;
    }

    /* renamed from: L7 */
    public final String mo118680L7(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f248748r);
        sb.append(mo118678J7());
        sb.append(!z ? "" : ".temp");
        return sb.toString();
    }

    /* renamed from: M7 */
    public final void mo118681M7() {
        View view = this.f248738e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "renderDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "renderDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f248743j.setVisibility(8);
        this.f248744n.setVisibility(8);
        this.f248740g.setVisibility(0);
        this.f248741h.setVisibility(8);
        this.f248742i.setVisibility(8);
        this.f248746p.setVisibility(8);
        this.f248747q.setVisibility(8);
        this.f248740g.setOnClickListener(new C85368c());
        this.f248741h.setOnClickListener(new C85369d());
    }

    /* renamed from: N7 */
    public final void mo118682N7() {
        int i = this.f248749s;
        if (i == 1) {
            if (FileExplorerUtil.isImg(this.f248751u)) {
                int i2 = this.f248734A;
                if (i2 == 3) {
                    Intent intent = new Intent();
                    intent.putExtra("key_favorite", true);
                    intent.putExtra("key_favorite_source_type", 9);
                    intent.putExtra("key_image_path", mo118680L7(false));
                    ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93188u(getContext(), intent);
                    finish();
                    return;
                } else if (i2 == 0 || this.f248756z) {
                    this.f248736C = 0;
                    this.f248756z = false;
                    mo118677I7();
                    mo118681M7();
                    return;
                }
            }
            View view = this.f248738e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "renderNotDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "renderNotDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f248746p.setVisibility(0);
            this.f248742i.setVisibility(8);
            this.f248743j.setVisibility(0);
            this.f248744n.setVisibility(8);
            this.f248747q.setVisibility(0);
            this.f248743j.setOnClickListener(new C85370e());
            if (this.f248734A == 3) {
                this.f248746p.setText(C0966R.string.gld);
                this.f248747q.setText(C0966R.string.gla);
                this.f248747q.setOnClickListener(new C85371f());
                enableOptionMenu(true);
                return;
            }
            this.f248746p.setText(C0966R.string.gld);
            if (this.f248734A == 2) {
                this.f248747q.setText(C0966R.string.glc);
            } else {
                this.f248747q.setText(C0966R.string.glb);
            }
            this.f248747q.setOnClickListener(new C85372g());
        } else if (i == 0) {
            View view3 = this.f248738e;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "renderNotDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "renderNotDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f248743j.setVisibility(8);
            this.f248744n.setVisibility(0);
            this.f248742i.setVisibility(8);
            this.f248746p.setVisibility(0);
            this.f248747q.setVisibility(8);
            int i3 = this.f248734A;
            if (i3 == 3) {
                this.f248744n.setText(C0966R.string.gl8);
                enableOptionMenu(true);
            } else if (i3 == 2) {
                this.f248744n.setText(C0966R.string.gle);
            } else {
                this.f248744n.setText(C0966R.string.gl5);
            }
            this.f248746p.setText(C0966R.string.gl7);
            this.f248744n.setOnClickListener(new C85373h());
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6524h8;
    }

    public void initView() {
        this.f248737d = (MMImageView) findViewById(C0966R.C0970id.c_m);
        this.f248738e = findViewById(C0966R.C0970id.c_c);
        this.f248739f = (ProgressBar) findViewById(C0966R.C0970id.c_a);
        this.f248740g = (ImageView) findViewById(C0966R.C0970id.c_h);
        this.f248741h = (ImageView) findViewById(C0966R.C0970id.c_g);
        this.f248742i = (TextView) findViewById(C0966R.C0970id.f6182zl);
        this.f248743j = (Button) findViewById(C0966R.C0970id.f6184zn);
        this.f248744n = (Button) findViewById(C0966R.C0970id.f6181zk);
        this.f248745o = (LinearLayout) findViewById(C0966R.C0970id.f6180zj);
        this.f248746p = (TextView) findViewById(C0966R.C0970id.f6183zm);
        this.f248747q = (TextView) findViewById(C0966R.C0970id.f6185zo);
        if (FileExplorerUtil.isImg(this.f248751u)) {
            this.f248737d.setBackgroundResource(C0966R.raw.download_image_icon);
        } else if (FileExplorerUtil.isMedia(this.f248751u)) {
            this.f248737d.setImageResource(C0966R.raw.app_attach_file_icon_video);
        } else {
            int u8 = ((C22923f) C86312j.m106911c(C22923f.class)).mo35908u8(C86013q1.m106454o(this.f248751u));
            if (u8 > 0) {
                this.f248737d.setImageResource(u8);
            } else {
                this.f248737d.setImageResource(C0966R.raw.app_attach_file_icon_unknow);
            }
        }
        setBackBtn(new C85365a());
        addIconOptionMenu(0, C0966R.raw.icons_outlined_share, new C85366b());
        enableOptionMenu(false);
        mo118676H7();
        if (this.f248734A == 1) {
            mo118681M7();
        } else {
            mo118682N7();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((C22921c) C86312j.m106911c(C22921c.class)).mo35885Yc(this, i, i2, intent, true, C0966R.string.c1b, C0966R.string.c1c, 3);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = getResources().getConfiguration().orientation;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f248745o.getLayoutParams();
        if (i == 2) {
            layoutParams.bottomMargin = C74942w4.m89784a(getContext(), 60);
        } else if (i == 1) {
            layoutParams.bottomMargin = C74942w4.m89784a(getContext(), 120);
        }
        this.f248745o.setLayoutParams(layoutParams);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f248749s = getIntent().getIntExtra("is_preview", 0);
        this.f248750t = getIntent().getBooleanExtra("is_compress", false);
        this.f248751u = getIntent().getStringExtra("attach_name");
        this.f248752v = getIntent().getStringExtra("mail_id");
        this.f248753w = getIntent().getStringExtra("attach_id");
        this.f248754x = C79540c0.m96570c() + getIntent().getStringExtra("attach_url");
        this.f248755y = (long) getIntent().getIntExtra("total_size", 0);
        this.f248748r = ((C27900o) C86312j.m106911c(C27900o.class)).mo55677fI().mo109595d();
        setMMTitle(this.f248751u);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        ((C27900o) C86312j.m106911c(C27900o.class)).mo55677fI().mo109594b(this.f248735B);
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }
}
