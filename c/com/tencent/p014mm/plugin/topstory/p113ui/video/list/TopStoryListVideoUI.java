package com.tencent.p014mm.plugin.topstory.p113ui.video.list;

import a13.C16424b;
import a13.C66990c;
import a13.C66999e;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aw0.C103928o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.topstory.p113ui.video.TopStoryBaseVideoUI;
import com.tencent.p014mm.plugin.topstory.p113ui.widget.TopStoryCommentFloatDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import o03.C21724i;
import p03.C21912d;
import p03.C21914h;
import p03.C47419f;
import p1042u.C111060j;
import r03.C22193b;
import s03.C22290h;
import s03.C77599f;
import t03.C64200a;
import te3.C49768hy;
import te3.e54;
import te3.qh4;
import te3.sh4;
import te3.uh4;
import te3.xh4;
import tw0.C90583b;
import tw0.C90584e;
import u73.C101987v0;
import v73.C102158a;
import x03.C102531s;
import x03.C22949d;
import x03.C22950e;
import x03.C22951f;
import x03.C22953h;
import x03.C22974q;
import x03.C22983u;
import y03.C23181c;
import y03.C23182d;
import y03.C66481b;
import z03.C23423b;
import z03.C23424d;
import z03.C23425e;
import z03.C66711c;
import zn0.C91802b;
import zn0.C91803c;

/* renamed from: com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI */
public class TopStoryListVideoUI extends TopStoryBaseVideoUI implements C23423b {

    /* renamed from: Q0 */
    public View f54691Q0;

    /* renamed from: R0 */
    public View f54692R0;

    /* renamed from: S0 */
    public View f54693S0;

    /* renamed from: T0 */
    public View f54694T0;

    /* renamed from: U0 */
    public View f54695U0;

    /* renamed from: V0 */
    public Button f54696V0;

    /* renamed from: W0 */
    public View f54697W0;

    /* renamed from: X0 */
    public View f54698X0;

    /* renamed from: Y */
    public View f54699Y;

    /* renamed from: Y0 */
    public C66990c f54700Y0;

    /* renamed from: Z */
    public TextView f54701Z;

    /* renamed from: Z0 */
    public View f54702Z0;

    /* renamed from: a1 */
    public C66990c f54703a1;

    /* renamed from: b1 */
    public View f54704b1;

    /* renamed from: c1 */
    public TopStoryCommentFloatDialog f54705c1;

    /* renamed from: d1 */
    public boolean f54706d1;

    /* renamed from: e1 */
    public long f54707e1 = 0;

    /* renamed from: p0 */
    public ProgressDialog f54708p0;

    /* renamed from: x0 */
    public C23425e f54709x0;

    /* renamed from: y0 */
    public C23182d f54710y0;

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI$a */
    public class C19376a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f54711d;

        public C19376a(int i) {
            this.f54711d = i;
        }

        public void run() {
            TopStoryListVideoUI.this.mo24951K0().notifyItemInserted(this.f54711d + TopStoryListVideoUI.this.mo24951K0().mo36133O4());
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI$b */
    public class C19377b implements C66990c.C66992b {

        /* renamed from: a */
        public final /* synthetic */ xh4 f54713a;

        /* renamed from: com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI$b$a */
        public class C19378a implements TopStoryCommentFloatDialog.C71559h {
            public C19378a() {
            }

            /* renamed from: a */
            public void mo25022a() {
                View view = TopStoryListVideoUI.this.f54698X0;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$11$1", "onSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$11$1", "onSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view2 = TopStoryListVideoUI.this.f54697W0;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$11$1", "onSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$11$1", "onSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }

            public void onDismiss() {
                TopStoryListVideoUI.this.f54587J.mo36219k();
            }
        }

        public C19377b(xh4 xh4) {
            this.f54713a = xh4;
        }

        /* renamed from: a */
        public void mo25021a(C77599f fVar) {
            TopStoryListVideoUI topStoryListVideoUI = TopStoryListVideoUI.this;
            topStoryListVideoUI.f54705c1.mo98674e(fVar, new C19378a(), (int) topStoryListVideoUI.f54608o.f64641h, this.f54713a.f64700A);
            if (TopStoryListVideoUI.this.f54587J.mo36212d()) {
                TopStoryListVideoUI.this.f54587J.mo36216h();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI$d */
    public class C19379d implements C66990c.C66992b {

        /* renamed from: a */
        public final /* synthetic */ xh4 f54716a;

        /* renamed from: com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI$d$a */
        public class C19380a implements TopStoryCommentFloatDialog.C71559h {
            public C19380a() {
            }

            /* renamed from: a */
            public void mo25022a() {
                View view = TopStoryListVideoUI.this.f54698X0;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$13$1", "onSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$13$1", "onSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view2 = TopStoryListVideoUI.this.f54697W0;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$13$1", "onSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$13$1", "onSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }

            public void onDismiss() {
                TopStoryListVideoUI.this.f54587J.mo36219k();
            }
        }

        public C19379d(xh4 xh4) {
            this.f54716a = xh4;
        }

        /* renamed from: a */
        public void mo25021a(C77599f fVar) {
            TopStoryListVideoUI topStoryListVideoUI = TopStoryListVideoUI.this;
            topStoryListVideoUI.f54705c1.mo98674e(fVar, new C19380a(), (int) topStoryListVideoUI.f54608o.f64641h, this.f54716a.f64700A);
            if (TopStoryListVideoUI.this.f54587J.mo36212d()) {
                TopStoryListVideoUI.this.f54587J.mo36216h();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI$e */
    public class C19381e implements View.OnClickListener {
        public C19381e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C22983u uVar = TopStoryListVideoUI.this.f54587J;
            if (uVar.f66031e && uVar.f66029c.getItemUIComponent() != null) {
                TopStoryListVideoUI.this.f54587J.f66029c.getItemUIComponent().mo36116A();
                TopStoryListVideoUI.this.f54587J.f66029c.getItemUIComponent().mo36117Y();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI$f */
    public class C19382f implements DialogInterface.OnCancelListener {
        public C19382f() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            TopStoryListVideoUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI$g */
    public class C19383g implements Runnable {
        public C19383g() {
        }

        public void run() {
            TopStoryListVideoUI.this.f54585H.mo36205c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI$j */
    public class C19384j implements Runnable {
        public C19384j() {
        }

        public void run() {
            TopStoryListVideoUI topStoryListVideoUI = TopStoryListVideoUI.this;
            if (!topStoryListVideoUI.f54597U) {
                View view = topStoryListVideoUI.f54692R0;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$6", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$6", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = TopStoryListVideoUI.this.f54691Q0;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(4);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$6", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$6", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view5 = topStoryListVideoUI.f54694T0;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(4);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$6", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$6", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view7 = TopStoryListVideoUI.this.f54693S0;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(4);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$6", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$6", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TopStoryListVideoUI.this.f54613t.smoothScrollBy(0, 3);
            }
            ProgressDialog progressDialog = TopStoryListVideoUI.this.f54708p0;
            if (progressDialog != null) {
                progressDialog.dismiss();
                TopStoryListVideoUI.this.f54708p0 = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI$k */
    public class C19385k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f54723d;

        public C19385k(String str) {
            this.f54723d = str;
        }

        public void run() {
            TopStoryListVideoUI topStoryListVideoUI = TopStoryListVideoUI.this;
            if (!topStoryListVideoUI.f54597U) {
                View view = topStoryListVideoUI.f54692R0;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = TopStoryListVideoUI.this.f54691Q0;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(4);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view5 = topStoryListVideoUI.f54694T0;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(4);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view7 = TopStoryListVideoUI.this.f54693S0;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(4);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ProgressDialog progressDialog = TopStoryListVideoUI.this.f54708p0;
            if (progressDialog != null) {
                progressDialog.dismiss();
                TopStoryListVideoUI.this.f54708p0 = null;
            }
            TopStoryListVideoUI topStoryListVideoUI2 = TopStoryListVideoUI.this;
            String str = this.f54723d;
            topStoryListVideoUI2.getClass();
            if (!NetStatusUtil.isNetworkConnected(topStoryListVideoUI2)) {
                Toast.makeText(topStoryListVideoUI2, topStoryListVideoUI2.getString(C0966R.string.ht6), 1).show();
            } else if (!Util.isNullOrNil(str)) {
                Toast.makeText(topStoryListVideoUI2, str, 1).show();
            } else {
                Toast.makeText(topStoryListVideoUI2, topStoryListVideoUI2.getString(C0966R.string.ht7), 1).show();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI$m */
    public class C19386m implements View.OnClickListener {
        public C19386m() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TOP_STORY_SHORT_VIDEO_FS_SCROLL_TIPS_INT, 1);
            TopStoryListVideoUI.this.f54587J.mo36219k();
            View view2 = TopStoryListVideoUI.this.f54695U0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$9", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$9", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TopStoryListVideoUI topStoryListVideoUI = TopStoryListVideoUI.this;
            topStoryListVideoUI.f54616w.mo36129c(topStoryListVideoUI);
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI$c */
    public class C19387c implements Runnable {
        public C19387c() {
        }

        public void run() {
            if (TopStoryListVideoUI.this.f54698X0.getVisibility() == 0) {
                View view = TopStoryListVideoUI.this.f54698X0;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI$h */
    public class C19388h implements View.OnTouchListener {
        public C19388h() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (TopStoryListVideoUI.this.f54697W0.getVisibility() == 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                TopStoryListVideoUI topStoryListVideoUI = TopStoryListVideoUI.this;
                if (TopStoryListVideoUI.m20654X7(topStoryListVideoUI, topStoryListVideoUI.f54702Z0, x, y)) {
                    Log.m105924i("MicroMsg.TopStory.TopStoryListVideoUI", "touch in mContentViewNotFull");
                    C117292a.m165362h(false, this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                }
                View view2 = TopStoryListVideoUI.this.f54697W0;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$4", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$4", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI$i */
    public class C19389i implements View.OnTouchListener {
        public C19389i() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (TopStoryListVideoUI.this.f54698X0.getVisibility() == 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                TopStoryListVideoUI topStoryListVideoUI = TopStoryListVideoUI.this;
                if (TopStoryListVideoUI.m20654X7(topStoryListVideoUI, topStoryListVideoUI.f54704b1, x, y)) {
                    Log.m105924i("MicroMsg.TopStory.TopStoryListVideoUI", "touch in mContentViewFull");
                    C117292a.m165362h(false, this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                }
                View view2 = TopStoryListVideoUI.this.f54698X0;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI$l */
    public class C19390l implements View.OnTouchListener {
        public C19390l(TopStoryListVideoUI topStoryListVideoUI) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: X7 */
    public static boolean m20654X7(TopStoryListVideoUI topStoryListVideoUI, View view, float f, float f2) {
        topStoryListVideoUI.getClass();
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return f2 >= ((float) i2) && f2 <= ((float) (view.getMeasuredHeight() + i2)) && f >= ((float) i) && f <= ((float) (view.getMeasuredWidth() + i));
    }

    /* renamed from: A */
    public void mo24943A() {
        TextView textView;
        this.f54600d.animate().cancel();
        View view = this.f54600d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onExitImmersionModel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onExitImmersionModel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (this.f54608o.f64646p != null && (textView = this.f54701Z) != null) {
            textView.setAlpha(1.0f);
        }
    }

    /* renamed from: H7 */
    public C22950e mo24948H7() {
        C23425e eVar = new C23425e(this);
        this.f54709x0 = eVar;
        View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.cah, (ViewGroup) null);
        inflate.setClickable(false);
        inflate.setFocusableInTouchMode(false);
        inflate.setFocusable(false);
        View findViewById = inflate.findViewById(C0966R.C0970id.euh);
        View findViewById2 = inflate.findViewById(C0966R.C0970id.euu);
        if (this.f54608o.f64646p != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "createHeaderView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "createHeaderView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "createHeaderView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "createHeaderView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.eve);
            this.f54701Z = textView;
            textView.setText(this.f54608o.f64646p.f63775i);
            TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.k9h);
            if (!Util.isNullOrNil(this.f54608o.f64646p.f63776j)) {
                textView2.setText(this.f54608o.f64646p.f63776j);
            } else {
                textView2.setVisibility(8);
            }
        } else {
            View view3 = findViewById2;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view4 = findViewById;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "createHeaderView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "createHeaderView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view5 = findViewById2;
            C117292a.m165358d(findViewById2, aVar4.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "createHeaderView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "createHeaderView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        if (C85875k4.m106205t(this, false)) {
            layoutParams.topMargin = C85875k4.m106198o(this);
        }
        inflate.setLayoutParams(layoutParams);
        C111060j<View> jVar = eVar.f65915d;
        jVar.mo162807g(jVar.mo162808h() + 100000, inflate);
        C23425e eVar2 = this.f54709x0;
        View inflate2 = LayoutInflater.from(this).inflate(C0966R.C0971layout.caj, (ViewGroup) null);
        inflate2.setPadding(0, 0, 0, ((C76577a.m92159j(getContext()) * 2) / 5) - getResources().getDimensionPixelSize(C0966R.dimen.arg));
        inflate2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f54692R0 = inflate2.findViewById(C0966R.C0970id.ed_);
        this.f54691Q0 = inflate2.findViewById(C0966R.C0970id.edd);
        C111060j<View> jVar2 = eVar2.f65916e;
        jVar2.mo162807g(jVar2.mo162808h() + 200000, inflate2);
        return this.f54709x0;
    }

    /* renamed from: I7 */
    public C22950e mo24949I7() {
        C23182d dVar = new C23182d(this);
        this.f54710y0 = dVar;
        View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.caj, (ViewGroup) null);
        inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f54694T0 = inflate.findViewById(C0966R.C0970id.ed_);
        this.f54693S0 = inflate.findViewById(C0966R.C0970id.edd);
        C111060j<View> jVar = dVar.f65916e;
        jVar.mo162807g(jVar.mo162808h() + 200000, inflate);
        return this.f54710y0;
    }

    /* renamed from: J7 */
    public C22949d mo24950J7() {
        return new C23181c();
    }

    /* renamed from: K7 */
    public C22949d mo24953K7() {
        return new C23424d();
    }

    /* renamed from: L7 */
    public void mo24954L7() {
        if (!this.f54597U) {
            View view = this.f54692R0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchNextPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchNextPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f54691Q0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchNextPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchNextPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view4 = this.f54694T0;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchNextPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchNextPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view5 = this.f54693S0;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchNextPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchNextPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C22974q qVar = this.f54588K;
        qVar.mo36197p(qVar.mo36194e());
    }

    /* renamed from: M */
    public void mo24955M(int i, int i2) {
        if ((i2 == 2 || i2 == 1) && this.f54706d1) {
            mo25024Y7();
        }
        super.mo24955M(i, i2);
    }

    /* renamed from: O4 */
    public int mo25014O4() {
        return 0;
    }

    /* renamed from: O7 */
    public void mo24958O7() {
        super.mo24958O7();
        this.f54695U0 = findViewById(C0966R.C0970id.eg4);
        this.f54696V0 = (Button) findViewById(C0966R.C0970id.j47);
        View findViewById = findViewById(C0966R.C0970id.koa);
        this.f54699Y = findViewById;
        findViewById.setOnClickListener(new C19381e());
        overridePendingTransition(MMFragmentActivity$$c.f318644a, MMFragmentActivity$$c.f318645b);
        if (this.f54608o.f64646p != null) {
            this.f54601e.setVisibility(8);
        }
        this.f54585H.f66023d = 2;
        uh4 uh4 = this.f54608o;
        if (!(uh4.f64642i != 36 && !uh4.f64636A)) {
            View view = this.f54692R0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f54691Q0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(4);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (this.f54584G.mo36183b()) {
            mo25024Y7();
            this.f54706d1 = false;
            uh4 uh42 = this.f54608o;
            if (uh42.f64642i != 21 && uh42.f64646p == null) {
                this.f54708p0 = C76879j.m92723Q(this, "", getString(C0966R.string.gas), true, true, new C19382f());
            }
        } else {
            Toast.makeText(this, C0966R.string.ht8, 1).show();
            this.f54706d1 = true;
        }
        this.f54709x0.f67182h = true;
        if (this.f54608o.f64650t) {
            this.f54584G.f65982a = true;
        }
        this.f54609p.post(new C19383g());
        new C66711c(this).mo74459b(this.f54609p);
        new C66481b().mo74459b(this.f54613t);
        this.f54697W0 = findViewById(C0966R.C0970id.c6s);
        this.f54702Z0 = findViewById(C0966R.C0970id.c6t);
        View view5 = this.f54697W0;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view6 = view5;
        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f54698X0 = findViewById(C0966R.C0970id.c6n);
        this.f54704b1 = findViewById(C0966R.C0970id.c6o);
        View view7 = this.f54698X0;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view8 = view7;
        C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view8, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f54697W0.setOnTouchListener(new C19388h());
        this.f54698X0.setOnTouchListener(new C19389i());
        TopStoryCommentFloatDialog topStoryCommentFloatDialog = (TopStoryCommentFloatDialog) findViewById(C0966R.C0970id.bjn);
        this.f54705c1 = topStoryCommentFloatDialog;
        topStoryCommentFloatDialog.setVisibility(8);
        this.f54705c1.mo98673d(this);
        mo25025Z7();
    }

    /* renamed from: P7 */
    public void mo24959P7() {
        super.mo24959P7();
        xh4 xh4 = this.f54608o.f64645o;
        if (xh4 != null) {
            C22974q qVar = this.f54588K;
            synchronized (qVar) {
                ((LinkedList) qVar.mo36192b()).add(xh4);
            }
        }
    }

    /* renamed from: Q7 */
    public void mo24961Q7() {
        if (this.f54597U) {
            mo25026d6();
            return;
        }
        if (this.f54608o != null) {
            this.f54585H.mo36203a();
            Intent intent = new Intent();
            intent.putExtra("isMute", this.f54608o.f64654x);
            intent.putExtra("MOBILE_CHECK_FLAG", this.f54608o.f64656z);
            intent.putExtra("key_video_play_info", Util.listToString(this.f54585H.f66026g, ";"));
            intent.putExtra("key_search_id", this.f54608o.f64643j);
            setResult(-1, intent);
        }
        if (!this.f54617x.mo67896U(2, false)) {
            finish();
        }
        if (!this.f54618y.mo64004y0(2)) {
            finish();
        }
    }

    /* renamed from: R7 */
    public void mo24963R7(int i) {
        boolean z = Settings.System.getInt(getContentResolver(), "accelerometer_rotation", 0) == 1;
        Log.m105925i("MicroMsg.TopStory.TopStoryListVideoUI", "onDeviceOrientationChange, orientation: %s sysOrienOn: %s", Integer.valueOf(i), Boolean.valueOf(z));
        if (!z) {
            return;
        }
        if (i == 90 || i == 270) {
            if (!this.f54597U) {
                mo25027p();
            }
        } else if ((i == 180 || i == 0) && this.f54597U) {
            mo25026d6();
        }
    }

    /* renamed from: S2 */
    public int mo24964S2() {
        return C85875k4.m106205t(this, false) ? C64200a.f181921a + C85875k4.m106198o(this) : C64200a.f181921a;
    }

    /* renamed from: S7 */
    public void mo24965S7(xh4 xh4, View view, boolean z) {
        C66990c cVar;
        String str;
        String str2;
        xh4 xh42 = xh4;
        View view2 = view;
        Log.m105925i("MicroMsg.TopStory.TopStoryListVideoUI", "onLikeSceneEnd vid:%s, thumb:%s", xh42.f64729h, Boolean.valueOf(z));
        if (z) {
            String str3 = "" + System.currentTimeMillis();
            String str4 = xh42.f64706G;
            String str5 = xh42.f64725d;
            uh4 uh4 = this.f54608o;
            C77599f fVar = new C77599f(str3, str4, "", "", "", "", str5, uh4.f64643j, uh4.f64642i, mo24970W3() ? C91802b.CTRL_INDEX : C91803c.CTRL_INDEX, xh42.f64729h, xh42.f64717S, 1);
            if (this.f54597U) {
                View view3 = this.f54698X0;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view5 = this.f54697W0;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C66990c cVar2 = new C66990c(this, this.f54704b1, new C19377b(xh42), fVar, xh42.f64729h);
                this.f54703a1 = cVar2;
                int b = C66999e.m79152b(this, 10.0f);
                Context context = view.getContext();
                View view7 = cVar2.f192454a;
                int[] iArr = new int[2];
                view2.getLocationInWindow(iArr);
                view.getHeight();
                int width = view.getWidth();
                int i = C85875k4.m106184h(context).x;
                view7.measure(0, 0);
                int measuredHeight = view7.getMeasuredHeight();
                int measuredWidth = view7.getMeasuredWidth();
                int[] iArr2 = {(iArr[0] + (width / 2)) - (measuredWidth / 2), iArr[1] - measuredHeight};
                Log.m105924i("PopupUtil", "window pos x:" + iArr2[0] + ", windowWidth:" + measuredWidth + ", screenWidth:" + i);
                if (iArr2[0] + measuredWidth > i) {
                    iArr2[0] = i - measuredWidth;
                }
                iArr2[0] = iArr2[0] + 0;
                iArr2[1] = iArr2[1] + b;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) cVar2.f192454a.getLayoutParams();
                layoutParams.leftMargin = iArr2[0];
                layoutParams.topMargin = iArr2[1];
                cVar2.f192454a.setLayoutParams(layoutParams);
                this.f54698X0.postDelayed(new C19387c(), 1800);
                return;
            }
            View view8 = this.f54698X0;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view9 = view8;
            C117292a.m165358d(view9, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view10 = this.f54697W0;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view11 = view10;
            C117292a.m165358d(view11, aVar4.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view11, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C66990c cVar3 = new C66990c(this, this.f54702Z0, new C19379d(xh42), fVar, xh42.f64729h);
            this.f54700Y0 = cVar3;
            cVar3.mo90955a(view2, false, 0, C66999e.m79152b(this, 8.0f));
        } else if (this.f54698X0.getVisibility() == 0) {
            C66990c cVar4 = this.f54703a1;
            if (cVar4 != null && (str2 = cVar4.f192459f) != null && str2.equals(xh42.f64729h)) {
                View view12 = this.f54698X0;
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar5.mo10233c(8);
                View view13 = view12;
                C117292a.m165358d(view13, aVar5.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view12.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view13, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (this.f54697W0.getVisibility() == 0 && (cVar = this.f54700Y0) != null && (str = cVar.f192459f) != null && str.equals(xh42.f64729h)) {
            View view14 = this.f54697W0;
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar6.mo10233c(8);
            View view15 = view14;
            C117292a.m165358d(view15, aVar6.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view14.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view15, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: T7 */
    public void mo24966T7() {
        super.mo24966T7();
        if (!this.f54597U && this.f54699Y.getAlpha() != 0.0f) {
            this.f54699Y.animate().cancel();
            View view = this.f54699Y;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.0f));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onRecyclerViewScroll", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onRecyclerViewScroll", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* renamed from: Y */
    public void mo24974Y() {
        TextView textView;
        if (!this.f54597U) {
            this.f54699Y.animate().alpha(1.0f).setDuration(200).setStartDelay(1800);
        } else {
            View view = this.f54698X0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onEnterImmersionModel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onEnterImmersionModel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f54600d.animate().alpha(0.1f).setDuration(200).setStartDelay(1800);
        if (this.f54608o.f64646p != null && (textView = this.f54701Z) != null) {
            textView.animate().alpha(0.1f).setDuration(200).setStartDelay(1800);
        }
    }

    /* renamed from: Y7 */
    public final void mo25024Y7() {
        if (!this.f54597U) {
            View view = this.f54692R0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f54691Q0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view4 = this.f54694T0;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view5 = this.f54693S0;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f54588K.mo36197p(0);
    }

    /* renamed from: Z7 */
    public final void mo25025Z7() {
        if (C85875k4.m106205t(this, false)) {
            int o = C85875k4.m106198o(this);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f54600d.getLayoutParams();
            layoutParams.topMargin = o;
            layoutParams.leftMargin = 0;
            this.f54600d.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = this.f54699Y.getLayoutParams();
            layoutParams2.height += o;
            this.f54699Y.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: a3 */
    public void mo24976a3(int i, String str) {
        MMHandlerThread.postToMainThread(new C19385k(str));
    }

    /* renamed from: a6 */
    public void mo25015a6(xh4 xh4, C22951f fVar, int i, int i2) {
        C22193b bVar;
        xh4 xh42 = xh4;
        int i3 = i;
        if (this.f54608o.f64646p == null && xh42 != null && xh42.f64713N != null && (bVar = this.f54585H.f66025f) != null && bVar.f62804a != 0) {
            long currentTimeMillis = (System.currentTimeMillis() - bVar.f62804a) / 1000;
            sh4 sh4 = xh42.f64713N;
            int i4 = sh4.f64608g - 10;
            int i5 = ((sh4.f64609h * i2) / 100) - 10;
            if (!sh4.f64611j && currentTimeMillis >= ((long) i4) && i3 >= i5) {
                C22974q qVar = this.f54588K;
                uh4 uh4 = this.f54608o;
                int e = qVar.mo36194e();
                qVar.getClass();
                Log.m105925i("MicroMsg.TopStory.TopStoryVideoDataMgr", "requestRelVideo %s %d %d", xh42.f64729h, Integer.valueOf(e), Long.valueOf(currentTimeMillis));
                if (qVar.f66003e != null) {
                    C86709a0.m107524d().mo123458d(qVar.f66003e);
                    qVar.f66003e = null;
                }
                uh4 a = C21914h.m25153a(uh4);
                a.f64649s = e;
                C22290h hVar = r1;
                C22974q qVar2 = qVar;
                C22290h hVar2 = new C22290h(a, qVar.f65999a.mo24981e2(), 1, xh4, currentTimeMillis);
                qVar2.f66003e = hVar;
                C86709a0.m107524d().mo123460f(qVar2.f66003e);
                C86709a0.m107524d().mo123455a(1943, qVar2.f66004f);
                xh42.f64713N.f64611j = true;
            }
            sh4 sh42 = xh42.f64713N;
            if (!sh42.f64612n && currentTimeMillis >= ((long) (i4 + 10)) && i3 >= i5 + 10) {
                sh42.f64612n = true;
                Log.m105925i("MicroMsg.TopStory.TopStoryListVideoUI", "start to show second video info %d", Integer.valueOf(sh42.f64610i.size()));
                Iterator<xh4> it = xh42.f64713N.f64610i.iterator();
                while (it.hasNext()) {
                    xh4 next = it.next();
                    sh4 sh43 = next.f64713N;
                    if (sh43 == null) {
                        Log.m105925i("MicroMsg.TopStory.TopStoryListVideoUI", "videoId %s not have secondInfo", next.f64729h);
                    } else {
                        Log.m105925i("MicroMsg.TopStory.TopStoryListVideoUI", "videoId %s secondVideoInfoType %d", next.f64729h, Integer.valueOf(sh43.f64605d));
                        sh4 sh44 = next.f64713N;
                        if (sh44.f64605d == 2) {
                            int i6 = sh44.f64607f;
                            int i7 = this.f54608o.f64652v;
                            int i8 = (i6 > 0 ? i6 : 1) + i7;
                            int e2 = this.f54588K.mo36194e() - 1;
                            if (i8 > e2) {
                                i8 = e2;
                            }
                            ((LinkedList) this.f54588K.mo36192b()).add(i8, next);
                            Log.m105925i("MicroMsg.TopStory.TopStoryListVideoUI", "high complete insert success curPos %s insertOffset %s pos:%s, vid[%s], title:%s", Integer.valueOf(i7), Integer.valueOf(i6), Integer.valueOf(i8), next.f64729h, next.f64725d);
                            getRecyclerView().post(new C19376a(i8));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d6 */
    public void mo25026d6() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f54707e1 >= 1000) {
            this.f54707e1 = currentTimeMillis;
            Log.m105918d("MicroMsg.TopStory.TopStoryListVideoUI", "exitFullScreen");
            C103928o.m138642b();
            C22951f fVar = this.f54587J.f66029c;
            if (fVar != null) {
                this.f54608o.f64653w = fVar.getControlBar().getmPosition();
                if (this.f54587J.f66029c.getControlBar().getVideoTotalTime() - this.f54608o.f64653w < 2) {
                    return;
                }
            }
            mo24968U7(false);
            this.f54597U = false;
            View view = this.f54698X0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "exitFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "exitFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f54697W0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "exitFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "exitFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!mo24970W3()) {
                setRequestedOrientation(1);
            }
            C16424b bVar = this.f54592P;
            if (bVar != null && bVar.isShowing()) {
                this.f54592P.dismiss();
                this.f54592P = null;
            }
            View view4 = this.f54699Y;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "exitFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "exitFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f54608o.f64646p == null) {
                this.f54601e.setVisibility(0);
            }
            this.f54609p.setVisibility(0);
            this.f54613t.setVisibility(8);
            this.f54710y0.notifyDataSetChanged();
            View view5 = this.f54695U0;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "exitFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "exitFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C23425e eVar = this.f54709x0;
            eVar.f67183i = true;
            LinearLayoutManager linearLayoutManager = this.f54610q;
            int O4 = this.f54608o.f64652v + eVar.mo36133O4();
            int S2 = mo24964S2();
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(Integer.valueOf(S2));
            aVar5.mo10233c(Integer.valueOf(O4));
            LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
            C117292a.m165358d(linearLayoutManager2, aVar5.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "exitFullScreen", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.mo16973V(((Integer) aVar5.mo10231a(0)).intValue(), ((Integer) aVar5.mo10231a(1)).intValue());
            C117292a.m165359e(linearLayoutManager2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "exitFullScreen", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            getSwipeBackLayout().setEnableGesture(true);
            mo24968U7(true);
            mo25025Z7();
        }
    }

    public int getForceOrientation() {
        return (!this.f54597U || mo24970W3()) ? 1 : 0;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cak;
    }

    /* renamed from: i6 */
    public void mo25016i6(xh4 xh4, C22951f fVar, int i, int i2) {
        qh4 qh4 = xh4.f64723Y;
        if (qh4 != null && qh4.f64507n != null) {
            if (i < qh4.f64500d || i > qh4.f64501e) {
                fVar.mo36137a();
            } else if (!qh4.f64508o) {
                qh4.f64508o = true;
                fVar.mo36159o();
            }
        }
    }

    /* renamed from: j1 */
    public boolean mo25017j1(int i) {
        int i2 = i;
        View view = this.f54697W0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "tryToPlayPositionVideo", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "tryToPlayPositionVideo", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f54698X0;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "tryToPlayPositionVideo", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "tryToPlayPositionVideo", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Log.m105925i("MicroMsg.TopStory.TopStoryListVideoUI", "tryToPlayPositionVideo %d", Integer.valueOf(i));
        try {
            if (this.f54597U) {
                if (i2 < (this.f54615v.getItemCount() - this.f54615v.mo36132G4()) - this.f54615v.mo36133O4()) {
                    RecyclerView recyclerView = this.f54613t;
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(Integer.valueOf(i));
                    C117292a.m165358d(recyclerView, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "tryToPlayPositionVideo", "(I)Z", "Undefined", "smoothScrollToPosition", "(I)V");
                    recyclerView.mo17149t1(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "tryToPlayPositionVideo", "(I)Z", "Undefined", "smoothScrollToPosition", "(I)V");
                    return true;
                }
                Log.m105929w("MicroMsg.TopStory.TopStoryListVideoUI", "tryToPlayPositionVideo fullScreen, position invalid, pos:%s, itemCount:%s, footer:%s, header:%s", Integer.valueOf(i), Integer.valueOf(this.f54615v.getItemCount()), Integer.valueOf(this.f54615v.mo36132G4()), Integer.valueOf(this.f54615v.mo36133O4()));
            } else if (i2 < (this.f54709x0.getItemCount() - this.f54709x0.mo36132G4()) - this.f54709x0.mo36133O4()) {
                this.f54612s.mo36130d(this, i2 + this.f54709x0.mo36133O4());
                return true;
            } else {
                Log.m105929w("MicroMsg.TopStory.TopStoryListVideoUI", "tryToPlayPositionVideo, position invalid, pos:%s, itemCount:%s, footer:%s, header:%s", Integer.valueOf(i), Integer.valueOf(this.f54709x0.getItemCount()), Integer.valueOf(this.f54709x0.mo36132G4()), Integer.valueOf(this.f54709x0.mo36133O4()));
            }
        } catch (Exception e) {
            Log.m105929w("MicroMsg.TopStory.TopStoryListVideoUI", "tryToPlayPositionVideo Exception:%s", e.getMessage());
        }
        return false;
    }

    /* renamed from: m5 */
    public void mo24986m5(List<xh4> list, boolean z) {
        super.mo24986m5(list, z);
        MMHandlerThread.postToMainThreadDelayed(new C19384j(), 50);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        uh4 uh4;
        uh4 uh42;
        C102531s.f301890b.mo142143b(this, i, i2, intent);
        if (i == 10001) {
            RecyclerView.C16631z e = C23424d.m27948e(this);
            if (e != null && (e instanceof C22953h)) {
                ((C22953h) e).mo36171I(false);
            }
            if (!(intent == null || !intent.hasExtra("isMute") || (uh42 = this.f54608o) == null)) {
                mo24971W7(intent.getBooleanExtra("isMute", uh42.f64654x));
            }
            if (intent != null && intent.hasExtra("MOBILE_CHECK_FLAG") && (uh4 = this.f54608o) != null) {
                this.f54608o.f64656z = intent.getIntExtra("MOBILE_CHECK_FLAG", uh4.f64656z);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 28) {
            customfixStatusbar(true);
        }
        super.onCreate(bundle);
        ((C90584e) C86312j.m106911c(C90584e.class)).bs0(C90583b.f260259c, 885);
        C102158a.m134600a(13);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f54705c1.f207338h.mo104021d();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || this.f54705c1.getVisibility() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f54705c1.mo98671b();
        return true;
    }

    public void onPause() {
        super.onPause();
        TopStoryCommentFloatDialog topStoryCommentFloatDialog = this.f54705c1;
        topStoryCommentFloatDialog.f207338h.f220015b = null;
        C86709a0.m107524d().mo123470p(2906, topStoryCommentFloatDialog);
    }

    public void onResume() {
        super.onResume();
        TopStoryCommentFloatDialog topStoryCommentFloatDialog = this.f54705c1;
        topStoryCommentFloatDialog.f207338h.f220015b = topStoryCommentFloatDialog;
        C86709a0.m107524d().mo123455a(2906, topStoryCommentFloatDialog);
    }

    /* renamed from: p */
    public void mo25027p() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f54707e1 >= 1000) {
            this.f54707e1 = currentTimeMillis;
            Log.m105918d("MicroMsg.TopStory.TopStoryListVideoUI", "enterFullScreen");
            C103928o.m138641a(true, true, true);
            C22951f fVar = this.f54587J.f66029c;
            if (fVar != null) {
                this.f54608o.f64653w = fVar.getControlBar().getmPosition();
                if (this.f54587J.f66029c.getControlBar().getVideoTotalTime() - this.f54608o.f64653w < 2) {
                    return;
                }
            }
            mo24968U7(false);
            this.f54597U = true;
            View view = this.f54698X0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f54697W0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!mo24970W3()) {
                setRequestedOrientation(0);
            }
            C16424b bVar = this.f54592P;
            if (bVar != null && bVar.isShowing()) {
                this.f54592P.dismiss();
                this.f54592P = null;
            }
            View view4 = this.f54699Y;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f54601e.setVisibility(8);
            this.f54605i.setVisibility(8);
            this.f54609p.setVisibility(8);
            this.f54613t.setVisibility(0);
            this.f54709x0.notifyDataSetChanged();
            if (C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_TOP_STORY_SHORT_VIDEO_FS_SCROLL_TIPS_INT, 0) == 0) {
                this.f54587J.mo36216h();
                View view5 = this.f54695U0;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(0);
                C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f54695U0.setOnTouchListener(new C19390l(this));
                this.f54696V0.setOnClickListener(new C19386m());
            } else {
                View view6 = this.f54695U0;
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(8);
                View view7 = view6;
                C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f54710y0.f66575i = true;
            LinearLayoutManager linearLayoutManager = this.f54614u;
            int i = this.f54608o.f64652v;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(0);
            aVar6.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(linearLayoutManager, aVar6.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.mo16973V(((Integer) aVar6.mo10231a(0)).intValue(), ((Integer) aVar6.mo10231a(1)).intValue());
            C117292a.m165359e(linearLayoutManager, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            getSwipeBackLayout().setEnableGesture(false);
            mo24968U7(true);
            if (C85875k4.m106205t(this, false)) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f54600d.getLayoutParams();
                layoutParams.topMargin = 0;
                layoutParams.leftMargin = C76577a.m92151b(getContext(), 24);
                this.f54600d.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: p5 */
    public void mo25018p5(int i, e54 e54) {
        if (this.f54597U) {
            mo25026d6();
        }
        boolean z = true;
        this.f54584G.f65982a = true;
        this.f54587J.mo36221m();
        xh4 d = this.f54588K.mo36193d(this.f54608o.f64652v);
        uh4 a = C21914h.m25153a(this.f54608o);
        a.f64648r = UUID.randomUUID().toString();
        a.f64637d = d.f64729h;
        a.f64641h = e54.f63772f;
        a.f64645o = null;
        a.f64646p = e54;
        a.f64650t = this.f54584G.f65982a;
        Iterator<C49768hy> it = a.f64647q.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C49768hy next = it.next();
            if ("show_tag_list".equals(next.f134951d)) {
                next.f134953f = e54.f63770d;
                break;
            }
        }
        if (!z) {
            C49768hy hyVar = new C49768hy();
            hyVar.f134951d = "show_tag_list";
            hyVar.f134953f = e54.f63770d;
            a.f64647q.add(hyVar);
        }
        C101987v0.m134279m(this, a, 10001);
        C102158a.m134600a(28);
        C47419f av02 = ((C21912d) C86312j.m106911c(C21912d.class)).av0();
        uh4 uh4 = this.f54608o;
        int i2 = uh4.f64652v;
        ((C21724i) av02).mo34016a(uh4, d, i2, 4, e54.f63771e + XVFSFile.PATH_SEPARATOR + e54.f63770d);
    }
}
