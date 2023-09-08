package com.tencent.p014mm.plugin.component.editor;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Base64;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c02.C92331c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.modelmsg.WXFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMImageView;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.component.editor.C93062a;
import com.tencent.p014mm.plugin.component.editor.C93065b;
import com.tencent.p014mm.plugin.handoff.model.AbsHandOffFile;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96895y1;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import lc3.C10485b;
import nj3.C76879j;
import o21.C100273b;
import p206nj.C76861g;
import p206nj.C88955f;
import p262wm.C22921c;
import p444at.C92087b;
import p500dy.C97560f;
import p645pj.C77092c;
import pb1.C100702d1;
import pb1.C100734q;
import pc0.C100760a0;
import qo3.C89779i0;
import te3.C101834rc0;
import te3.C101849uc0;
import wc3.C102430l;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.component.editor.EditorFileUI */
public class EditorFileUI extends MMActivity {

    /* renamed from: A */
    public static final /* synthetic */ int f267956A = 0;

    /* renamed from: z */
    public static final long f267957z = C77092c.m93047i();

    /* renamed from: d */
    public Button f267958d;

    /* renamed from: e */
    public Button f267959e;

    /* renamed from: f */
    public Button f267960f;

    /* renamed from: g */
    public MMImageView f267961g;

    /* renamed from: h */
    public TextView f267962h;

    /* renamed from: i */
    public TextView f267963i;

    /* renamed from: j */
    public ProgressBar f267964j;

    /* renamed from: n */
    public TextView f267965n;

    /* renamed from: o */
    public View f267966o;

    /* renamed from: p */
    public View f267967p;

    /* renamed from: q */
    public C96875r0 f267968q = null;

    /* renamed from: r */
    public MMHandler f267969r = new MMHandler();

    /* renamed from: s */
    public C101834rc0 f267970s;

    /* renamed from: t */
    public AbsHandOffFile f267971t;

    /* renamed from: u */
    public boolean f267972u = false;

    /* renamed from: v */
    public boolean f267973v = false;

    /* renamed from: w */
    public boolean f267974w = false;

    /* renamed from: x */
    public C93065b.C93067b f267975x = new C93022g();

    /* renamed from: y */
    public boolean f267976y;

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorFileUI$b */
    public class C2190b implements MenuItem.OnMenuItemClickListener {
        public C2190b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            EditorFileUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorFileUI$d */
    public class C2191d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f12179d;

        public C2191d(String str) {
            this.f12179d = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/EditorFileUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f12179d);
            C88144b.m109791i(EditorFileUI.this.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/EditorFileUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorFileUI$a */
    public class C93017a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f267977d;

        /* renamed from: e */
        public final /* synthetic */ String f267978e;

        /* renamed from: f */
        public final /* synthetic */ Runnable f267979f;

        /* renamed from: com.tencent.mm.plugin.component.editor.EditorFileUI$a$a */
        public class C93018a implements Runnable {
            public C93018a() {
            }

            public void run() {
                EditorFileUI editorFileUI = EditorFileUI.this;
                C75026b.m89951a(editorFileUI, editorFileUI.getString(C0966R.string.a2x));
            }
        }

        public C93017a(List list, String str, Runnable runnable) {
            this.f267977d = list;
            this.f267978e = str;
            this.f267979f = runnable;
        }

        public void run() {
            String c = C100273b.m131075c(EditorFileUI.this.f267970s);
            WXFileObject wXFileObject = new WXFileObject();
            wXFileObject.setFilePath(c);
            WXMediaMessage wXMediaMessage = new WXMediaMessage();
            wXMediaMessage.mediaObject = wXFileObject;
            C101834rc0 rc02 = EditorFileUI.this.f267970s;
            wXMediaMessage.title = rc02.f299297d;
            wXMediaMessage.description = rc02.f299301f;
            wXMediaMessage.thumbData = Util.readFromFile(C100273b.m131077e(rc02));
            for (String str : this.f267977d) {
                ((C100702d1) C86312j.m106911c(C100702d1.class)).mo123896Bb(wXMediaMessage, "", "", str, 3, (String) null);
                if (!Util.isNullOrNil(this.f267978e)) {
                    C100760a0.C100764f a = C100760a0.m131931a(str);
                    a.f295187a = str;
                    a.f295189c = this.f267978e;
                    a.f295190d = C45628s0.m50810y(str);
                    a.f295191e = 0;
                    a.f295194h = 4;
                    a.mo140195a().mo123694a();
                }
            }
            ((C119157j) C119157j.f356862d).mo183895z(new C93018a());
            MMHandlerThread.postToMainThread(this.f267979f);
        }

        public String toString() {
            return super.toString() + "|onActivityResult2";
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorFileUI$c */
    public class C93019c implements View.OnClickListener {
        public C93019c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/EditorFileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String c = C100273b.m131075c(EditorFileUI.this.f267970s);
            new Intent().setAction("android.intent.action.VIEW");
            if (4 == EditorFileUI.this.mo127443H7()) {
                EditorFileUI editorFileUI = EditorFileUI.this;
                editorFileUI.f267974w = false;
                editorFileUI.mo127447L7();
            } else {
                EditorFileUI editorFileUI2 = EditorFileUI.this;
                editorFileUI2.getClass();
                ((C22921c) C86312j.m106911c(C22921c.class)).mo35876EU(editorFileUI2, c, editorFileUI2.f267970s.f299262K, 5);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/EditorFileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorFileUI$e */
    public class C93020e implements View.OnClickListener {
        public C93020e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/EditorFileUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!C88955f.m111058b()) {
                C76879j.m92738i(EditorFileUI.this.getContext(), C0966R.string.cpf, C0966R.string.a3h);
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/EditorFileUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C93065b.f268104d.mo127511c(new C93062a(EditorFileUI.this.f267970s, false, C93062a.C93063a.TYPE_FILE, -1));
            EditorFileUI editorFileUI = EditorFileUI.this;
            editorFileUI.f267960f.setVisibility(8);
            editorFileUI.f267958d.setVisibility(8);
            editorFileUI.f267959e.setVisibility(8);
            editorFileUI.f267963i.setVisibility(8);
            View view2 = editorFileUI.f267966o;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/component/editor/EditorFileUI", "initDownloadingStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/component/editor/EditorFileUI", "initDownloadingStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/EditorFileUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorFileUI$f */
    public class C93021f implements View.OnClickListener {
        public C93021f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/EditorFileUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            EditorFileUI editorFileUI = EditorFileUI.this;
            int i = EditorFileUI.f267956A;
            editorFileUI.mo127446K7();
            C93065b.f268104d.mo127513e(EditorFileUI.this.f267970s.f299280T);
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/EditorFileUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorFileUI$g */
    public class C93022g implements C93065b.C93067b {

        /* renamed from: com.tencent.mm.plugin.component.editor.EditorFileUI$g$a */
        public class C93023a implements Runnable {
            public C93023a() {
            }

            public void run() {
                EditorFileUI.this.enableOptionMenu(true);
                EditorFileUI editorFileUI = EditorFileUI.this;
                int i = EditorFileUI.f267956A;
                editorFileUI.mo127444I7();
            }
        }

        /* renamed from: com.tencent.mm.plugin.component.editor.EditorFileUI$g$b */
        public class C93024b implements Runnable {
            public C93024b() {
            }

            public void run() {
                EditorFileUI editorFileUI = EditorFileUI.this;
                int i = EditorFileUI.f267956A;
                editorFileUI.mo127445J7();
            }
        }

        /* renamed from: com.tencent.mm.plugin.component.editor.EditorFileUI$g$c */
        public class C93025c implements Runnable {
            public C93025c() {
            }

            public void run() {
                EditorFileUI editorFileUI = EditorFileUI.this;
                int i = EditorFileUI.f267956A;
                editorFileUI.mo127446K7();
                C76879j.m92726T(EditorFileUI.this.getContext(), EditorFileUI.this.getString(C0966R.string.f360348c13));
            }
        }

        public C93022g() {
        }

        /* renamed from: a */
        public void mo127454a(C93062a aVar, C93062a.C93064b bVar) {
            if (EditorFileUI.this.f267970s.f299280T.equals(aVar.f268082b)) {
                if (bVar == C93062a.C93064b.SUCC) {
                    EditorFileUI.this.f267969r.post(new C93023a());
                } else if (bVar == C93062a.C93064b.OUT_OF_DATE) {
                    EditorFileUI.this.f267969r.post(new C93024b());
                } else if (bVar == C93062a.C93064b.ERR) {
                    EditorFileUI.this.f267969r.post(new C93025c());
                } else {
                    EditorFileUI editorFileUI = EditorFileUI.this;
                    editorFileUI.getClass();
                    editorFileUI.f267969r.post(new C93068c(editorFileUI, (int) ((((float) aVar.f268087g) / ((float) Math.max(1, aVar.f268086f))) * 100.0f), aVar.f268087g, aVar.f268086f));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorFileUI$h */
    public class C93026h implements C96875r0.C96876a {

        /* renamed from: com.tencent.mm.plugin.component.editor.EditorFileUI$h$a */
        public class C2192a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f12181d;

            /* renamed from: e */
            public final /* synthetic */ String f12182e;

            public C2192a(Bitmap bitmap, String str) {
                this.f12181d = bitmap;
                this.f12182e = str;
            }

            public void run() {
                ImageView imageView = (ImageView) EditorFileUI.this.findViewById(C0966R.C0970id.f359495l82);
                imageView.setImageBitmap(this.f12181d);
                imageView.setVisibility(0);
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                FileProviderHelper.setIntentDataAndType((Context) EditorFileUI.this.getContext(), intent, new C86009m1(this.f12182e), "video/*", false);
                try {
                    EditorFileUI editorFileUI = EditorFileUI.this;
                    Intent createChooser = Intent.createChooser(intent, editorFileUI.getString(C0966R.string.cs8));
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(createChooser);
                    C117292a.m165358d(editorFileUI, aVar.mo10232b(), "com/tencent/mm/plugin/component/editor/EditorFileUI$8$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    editorFileUI.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(editorFileUI, "com/tencent/mm/plugin/component/editor/EditorFileUI$8$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.EditorFileUI", "startActivity fail, activity not found");
                    C76879j.m92738i(EditorFileUI.this.getContext(), C0966R.string.cpc, C0966R.string.cpd);
                }
            }
        }

        public C93026h() {
        }

        /* renamed from: M0 */
        public int mo76207M0(int i, int i2) {
            return 0;
        }

        public void onCompletion() {
        }

        public void onError(int i, int i2) {
            EditorFileUI.this.f267968q.stop();
            EditorFileUI editorFileUI = EditorFileUI.this;
            if (!editorFileUI.f267972u) {
                editorFileUI.f267972u = true;
                Bitmap f = C93088r.m117436f(C100273b.m131077e(editorFileUI.f267970s), (String) null);
                String videoPath = EditorFileUI.this.f267968q.getVideoPath();
                CrashReportFactory.reportRawMessage(Base64.encodeToString((((C97560f) C86312j.m106911c(C97560f.class)).mo136822Ww() + "[RecordMsgFileUI] on play sight error, what=" + i + ", extra=" + i2 + ", path=" + Util.nullAs(videoPath, "")).getBytes(), 2), "FullScreenPlaySight");
                MMHandlerThread.postToMainThread(new C2192a(f, videoPath));
            }
        }

        public void onPrepared() {
            Log.m105918d("MicroMsg.EditorFileUI", C76861g.m92659b() + " onPrepared");
            EditorFileUI.this.f267968q.setLoop(true);
            EditorFileUI.this.f267968q.start();
        }

        /* renamed from: p3 */
        public void mo76226p3(int i, int i2) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorFileUI$i */
    public class C93027i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Dialog f267990d;

        public C93027i(EditorFileUI editorFileUI, Dialog dialog) {
            this.f267990d = dialog;
        }

        public void run() {
            this.f267990d.dismiss();
        }
    }

    /* renamed from: H7 */
    public final int mo127443H7() {
        int i = this.f267970s.f299258I;
        if (i == 15) {
            return 4;
        }
        return i;
    }

    /* renamed from: I7 */
    public final void mo127444I7() {
        C101849uc0 uc02;
        Class cls = C92331c.class;
        if (this.f267971t.getFileStatus() != 1) {
            this.f267971t.setFileStatus(1);
            this.f267971t.setFullPath(Util.nullAsNil(C100273b.m131075c(this.f267970s)));
            ((C92331c) C86312j.m106911c(cls)).mo58375rt(this.f267971t);
            ((C92331c) C86312j.m106911c(cls)).Gg0(this.f267971t);
        }
        if (mo127443H7() == 15 && (uc02 = this.f267970s.f299306h1) != null && !Util.isNullOrNil(uc02.f299610d) && !Util.isNullOrNil(this.f267970s.f299306h1.f299613g)) {
            this.f267973v = true;
            this.f267961g.setVisibility(8);
            View view = this.f267966o;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f267960f.setVisibility(8);
            this.f267958d.setVisibility(8);
            this.f267959e.setVisibility(8);
            this.f267963i.setVisibility(8);
            String c = C100273b.m131075c(this.f267970s);
            Log.m105918d("MicroMsg.EditorFileUI", C76861g.m92659b() + " initView: fullpath:" + c);
            this.f267968q = C96895y1.m124471a(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            ((ViewGroup) findViewById(C0966R.C0970id.f359485l50)).addView((View) this.f267968q, 0, layoutParams);
            this.f267968q.setVideoCallback(new C93026h());
            Log.m105918d("MicroMsg.EditorFileUI", C76861g.m92659b() + " initView :" + c);
            if (c != null) {
                this.f267968q.stop();
                this.f267968q.setVideoPath(c);
            }
            Log.m105918d("MicroMsg.EditorFileUI", C76861g.m92659b() + " initView");
        }
        if (mo127443H7() != 15 && mo127443H7() != 4) {
            View view3 = this.f267966o;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f267960f.setVisibility(4);
            if (Util.isNullOrNil(this.f267970s.f299242A)) {
                this.f267958d.setVisibility(8);
            } else {
                this.f267958d.setVisibility(0);
            }
            this.f267959e.setVisibility(0);
            this.f267963i.setVisibility(0);
        } else if (!this.f267973v) {
            View view5 = this.f267966o;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f267960f.setVisibility(8);
            this.f267958d.setVisibility(8);
            this.f267959e.setVisibility(0);
            this.f267959e.setText(C0966R.string.f360425cp0);
            this.f267963i.setVisibility(8);
            mo127447L7();
        }
    }

    /* renamed from: J7 */
    public final void mo127445J7() {
        this.f267960f.setVisibility(8);
        this.f267958d.setVisibility(8);
        this.f267959e.setVisibility(8);
        View view = this.f267966o;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOutOfDateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOutOfDateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f267963i.setVisibility(0);
        if (this.f267970s.f299258I == 4) {
            this.f267963i.setGravity(17);
            this.f267963i.setText(C0966R.string.cpm);
            return;
        }
        this.f267963i.setGravity(17);
        this.f267963i.setText(C0966R.string.cpl);
        if (!this.f267976y) {
            this.f267976y = true;
        }
    }

    /* renamed from: K7 */
    public final void mo127446K7() {
        View view = this.f267966o;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/component/editor/EditorFileUI", "initWaitDownloadStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/component/editor/EditorFileUI", "initWaitDownloadStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f267959e.setVisibility(8);
        if (Util.isNullOrNil(this.f267970s.f299242A)) {
            this.f267958d.setVisibility(8);
        } else {
            this.f267958d.setVisibility(0);
        }
        this.f267960f.setVisibility(0);
        this.f267960f.setText(C0966R.string.coy);
        this.f267963i.setVisibility(8);
    }

    /* renamed from: L7 */
    public final void mo127447L7() {
        if (!this.f267974w) {
            this.f267974w = true;
            Intent intent = new Intent();
            intent.putExtra("key_detail_fav_path", C100273b.m131075c(this.f267970s));
            intent.putExtra("key_detail_fav_thumb_path", C100273b.m131077e(this.f267970s));
            intent.putExtra("key_detail_fav_video_duration", this.f267970s.f299338y);
            intent.putExtra("key_detail_statExtStr", this.f267970s.f299311k1);
            intent.putExtra("key_detail_fav_video_scene_from", 1);
            intent.putExtra("key_detail_msg_uuid", this.f267970s.f299259I1);
            C100734q.m131875t0(this, ".ui.detail.FavoriteVideoPlayUI", intent, (Bundle) null);
            finish();
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359644cl2;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((C22921c) C86312j.m106911c(C22921c.class)).mo35885Yc(this, i, i2, intent, true, C0966R.string.c1b, C0966R.string.c1c, 5);
        if (i2 == -1 && i == 1001) {
            String str = null;
            String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            if (intent != null) {
                str = intent.getStringExtra("custom_send_text");
            }
            C89779i0 Q = C76879j.m92723Q(getContext(), "", getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null);
            Log.m105919d("MicroMsg.EditorFileUI", "do share msg, fav msg type %d", Integer.valueOf(mo127443H7()));
            C93027i iVar = new C93027i(this, Q);
            if (!Util.isNullOrNil(stringExtra)) {
                ((C119157j) C119157j.f356862d).mo183870a(new C93017a(Util.stringsToList(stringExtra.split(",")), str, iVar));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f267970s = new C101834rc0();
        try {
            this.f267970s.parseFrom(getIntent().getByteArrayExtra("data_item_key"));
        } catch (IOException unused) {
        }
        this.f267958d = (Button) findViewById(C0966R.C0970id.f358953i20);
        this.f267959e = (Button) findViewById(C0966R.C0970id.hma);
        this.f267960f = (Button) findViewById(C0966R.C0970id.c9o);
        this.f267961g = (MMImageView) findViewById(C0966R.C0970id.f2a);
        this.f267962h = (TextView) findViewById(C0966R.C0970id.h_d);
        this.f267963i = (TextView) findViewById(C0966R.C0970id.knp);
        this.f267967p = findViewById(C0966R.C0970id.c_h);
        this.f267966o = findViewById(C0966R.C0970id.c_c);
        this.f267964j = (ProgressBar) findViewById(C0966R.C0970id.c_a);
        this.f267965n = (TextView) findViewById(C0966R.C0970id.c_e);
        if (4 == mo127443H7()) {
            setMMTitle((int) C0966R.string.cs8);
        } else if (15 == mo127443H7()) {
            setMMTitle((int) C0966R.string.crc);
            findViewById(C0966R.C0970id.f359485l50).setBackgroundResource(C0966R.color.f3131gg);
        } else {
            setMMTitle((int) C0966R.string.coj);
        }
        if (mo127443H7() == 4) {
            this.f267961g.setImageResource(C0966R.raw.app_attach_file_icon_video);
        } else {
            this.f267961g.setImageResource(C102430l.m135146a(this.f267970s.f299262K));
        }
        this.f267962h.setText(this.f267970s.f299297d);
        setBackBtn(new C2190b());
        this.f267959e.setOnClickListener(new C93019c());
        String str = this.f267970s.f299242A;
        if (!Util.isNullOrNil(str)) {
            this.f267958d.setOnClickListener(new C2191d(str));
        }
        this.f267960f.setOnClickListener(new C93020e());
        this.f267967p.setOnClickListener(new C93021f());
        Class cls = C92331c.class;
        AbsHandOffFile NN = ((C92087b) C86312j.m106911c(C92087b.class)).mo126070NN(this.f267970s, (String) null, (C72963f4) null, C100273b.m131075c((C101834rc0) null));
        this.f267971t = NN;
        NN.setSource(1);
        this.f267971t.setFileStatus(C86013q1.m106450k(C100273b.m131075c(this.f267970s)) ? 1 : 2);
        ((C92331c) C86312j.m106911c(cls)).mo58375rt(this.f267971t);
        ((C92331c) C86312j.m106911c(cls)).mo58377tt(this.f267971t);
        if (mo127443H7() != 15 || Util.safeParseInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("SightForwardEnable")) == 1) {
            addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C93069d(this));
        } else {
            Log.m105928w("MicroMsg.EditorFileUI", "can not retransmit sight msg");
        }
        boolean z = Util.isNullOrNil(this.f267970s.f299325s) || Util.isNullOrNil(this.f267970s.f299329u);
        boolean z2 = Util.isNullOrNil(this.f267970s.f299342z1) || Util.isNullOrNil(this.f267970s.f299337x1);
        if (!z && !z2) {
            mo127445J7();
        } else if (C86013q1.m106450k(C100273b.m131075c(this.f267970s))) {
            enableOptionMenu(true);
            mo127444I7();
        } else {
            mo127446K7();
            enableOptionMenu(false);
        }
        C93065b.f268104d.mo127510b(this.f267975x);
    }

    public void onDestroy() {
        C96875r0 r0Var = this.f267968q;
        if (r0Var != null) {
            r0Var.setVideoCallback((C96875r0.C96876a) null);
            this.f267968q.stop();
            this.f267968q.onDetach();
        }
        C93065b bVar = C93065b.f268104d;
        bVar.mo127513e(this.f267970s.f299280T);
        ((ArrayList) bVar.f268105a).remove(this.f267975x);
        if (this.f267971t != null) {
            ((C92331c) C86312j.m106911c(C92331c.class)).A70(this.f267971t);
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        C96875r0 r0Var = this.f267968q;
        if (r0Var != null) {
            r0Var.stop();
        }
    }

    public void onResume() {
        super.onResume();
        C96875r0 r0Var = this.f267968q;
        if (r0Var != null) {
            r0Var.start();
        }
    }
}
