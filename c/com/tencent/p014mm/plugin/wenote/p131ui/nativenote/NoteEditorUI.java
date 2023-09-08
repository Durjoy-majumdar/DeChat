package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import ab3.C91983a;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.C67092e0;
import androidx.recyclerview.widget.RecyclerView;
import bb3.C92221d;
import bb3.C92232k;
import bb3.C92238l;
import cb3.C92389a;
import cb3.C92391b;
import cb3.C92393d;
import cb3.C92394e;
import cb3.C92395f;
import cb3.C92396g;
import cb3.C92397h;
import cb3.C92398i;
import cb3.C92399j;
import cb3.C92400k;
import cb3.C92406p;
import cb3.C92407q;
import cb3.C92408r;
import cb3.C92409s;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FavNoteSaveEvent;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.autogen.events.RecordOperationEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WeNoteMenuOperationStruct;
import com.tencent.p014mm.model.newabtest.SubCoreNewABTest;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.C85861e4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85878m2;
import com.tencent.p014mm.p136ui.C85985z2;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.fav.p047ui.detail.BaseFavDetailReportUI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.adapter.NoteLinearLayoutManager;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.voiceview.C96750a;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LongBitmapHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C97625j3;
import eb3.C97637b;
import eb3.C97638c;
import f40.C86709a0;
import fb3.C97855a;
import fc1.C8006b;
import gb3.C32384a;
import gb3.C98095b;
import gb3.C98096c;
import gy3.C87412m;
import h81.C32735h;
import hb3.C98332a;
import hb3.C98333b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kj2.C117407d;
import l31.C61212e;
import lu3.C34379c;
import nc0.C76850a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import ob0.C11385n;
import p159gw.C98250h;
import p244tt.C14088e;
import p433g.C27075b;
import p447aw.C103918d;
import p823sg.C101611g;
import p823sg.C90193h;
import p849e3.C107168a0;
import p849e3.C107207u;
import p910lj.C76701a;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100755z;
import pb1.C11881t1;
import qo3.C77407n;
import qo3.C89779i0;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C49544gd0;
import ua3.C101994r;
import va3.C102165b;
import va3.C102166c;
import wa3.C102364c;
import wa3.C102365e;
import wa3.C102368h;
import wa3.C102374m;
import wa3.C102378p;
import wa3.C53142b;
import wc3.C78538u;
import xa3.C102587c;
import xa3.C102590f;
import xa3.C102593i;
import xa3.C102602r;
import xa3.C102607w;
import xb1.C102614d;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI */
public class NoteEditorUI extends BaseFavDetailReportUI implements C91983a, C92232k.C92237e, C11385n, C96738o {

    /* renamed from: p1 */
    public static final /* synthetic */ int f283207p1 = 0;

    /* renamed from: A */
    public boolean f283208A = false;

    /* renamed from: B */
    public boolean f283209B = false;

    /* renamed from: C */
    public boolean f283210C = false;

    /* renamed from: D */
    public String f283211D = "";

    /* renamed from: E */
    public MMHandler f283212E;

    /* renamed from: F */
    public NoteLinearLayoutManager f283213F;

    /* renamed from: G */
    public boolean f283214G = false;

    /* renamed from: H */
    public ProgressDialog f283215H = null;

    /* renamed from: I */
    public boolean f283216I = false;

    /* renamed from: J */
    public C101834rc0 f283217J;

    /* renamed from: K */
    public boolean f283218K = false;

    /* renamed from: L */
    public final Object f283219L = new Object();

    /* renamed from: M */
    public LinearLayout f283220M = null;

    /* renamed from: N */
    public String f283221N = "";

    /* renamed from: P */
    public int f283222P = 0;

    /* renamed from: Q */
    public int f283223Q = 0;

    /* renamed from: Q0 */
    public boolean f283224Q0 = true;

    /* renamed from: R */
    public int f283225R = 0;

    /* renamed from: R0 */
    public int f283226R0 = 0;

    /* renamed from: S */
    public int f283227S = 0;

    /* renamed from: S0 */
    public RecyclerView.C0130p f283228S0 = null;

    /* renamed from: T */
    public String f283229T;

    /* renamed from: T0 */
    public C102166c f283230T0;

    /* renamed from: U */
    public String[] f283231U = null;

    /* renamed from: U0 */
    public C97637b f283232U0;

    /* renamed from: V */
    public int f283233V;

    /* renamed from: V0 */
    public boolean f283234V0 = false;

    /* renamed from: W */
    public boolean f283235W = true;

    /* renamed from: W0 */
    public boolean f283236W0 = false;

    /* renamed from: X */
    public long f283237X = 0;

    /* renamed from: X0 */
    public C92221d f283238X0 = new C92221d();

    /* renamed from: Y */
    public boolean f283239Y = false;

    /* renamed from: Y0 */
    public C102374m f283240Y0 = new C102374m();

    /* renamed from: Z */
    public String f283241Z;

    /* renamed from: Z0 */
    public C96750a f283242Z0 = new C96750a();

    /* renamed from: a1 */
    public ViewTreeObserver.OnGlobalLayoutListener f283243a1 = new C96685a();

    /* renamed from: b1 */
    public ViewTreeObserver.OnGlobalLayoutListener f283244b1 = new C96687b();

    /* renamed from: c1 */
    public boolean f283245c1 = false;

    /* renamed from: d1 */
    public float f283246d1 = 0.0f;

    /* renamed from: e1 */
    public float f283247e1 = 0.0f;

    /* renamed from: f1 */
    public View.OnTouchListener f283248f1 = new C96689c();

    /* renamed from: g1 */
    public C89779i0 f283249g1 = null;

    /* renamed from: h1 */
    public boolean f283250h1 = false;

    /* renamed from: i1 */
    public int f283251i1 = -1;

    /* renamed from: j */
    public C96679b f283252j;

    /* renamed from: j1 */
    public boolean f283253j1 = false;

    /* renamed from: k1 */
    public C75018a.C75024d f283254k1 = new C6633p(this);

    /* renamed from: l1 */
    public IListener<FavNoteSaveEvent> f283255l1 = new IListener<FavNoteSaveEvent>(C40008f.f107254d) {
        {
            this.__eventId = 998161952;
        }

        public boolean callback(IEvent iEvent) {
            FavNoteSaveEvent favNoteSaveEvent = (FavNoteSaveEvent) iEvent;
            Log.m105925i("MicroMsg.Note.NoteEditorUI", "FavNoteSaveEvent, isFinish:%s", Boolean.valueOf(NoteEditorUI.this.f283256m1));
            NoteEditorUI.this.mo134923R7(1);
            return true;
        }
    };

    /* renamed from: m1 */
    public boolean f283256m1 = false;

    /* renamed from: n */
    public RecyclerView f283257n;

    /* renamed from: n1 */
    public C34379c<?> f283258n1 = null;

    /* renamed from: o */
    public C98333b f283259o;

    /* renamed from: o1 */
    public final boolean f283260o1 = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_fav_note_pre_minute_upload_open, false);

    /* renamed from: p */
    public LinearLayout f283261p;

    /* renamed from: p0 */
    public boolean f283262p0 = false;

    /* renamed from: q */
    public C96728e0 f283263q = null;

    /* renamed from: r */
    public RelativeLayout f283264r = null;

    /* renamed from: s */
    public C92232k f283265s = null;

    /* renamed from: t */
    public View f283266t = null;

    /* renamed from: u */
    public TextView f283267u = null;

    /* renamed from: v */
    public boolean f283268v = false;

    /* renamed from: w */
    public long f283269w = -1;

    /* renamed from: x */
    public long f283270x = -1;

    /* renamed from: x0 */
    public boolean f283271x0 = false;

    /* renamed from: y */
    public String f283272y = "";

    /* renamed from: y0 */
    public boolean f283273y0 = false;

    /* renamed from: z */
    public boolean f283274z = false;

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$p */
    public class C6633p implements C75018a.C75024d {
        public C6633p(NoteEditorUI noteEditorUI) {
        }

        /* renamed from: a */
        public void mo7429a() {
            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
            favoriteOperationEvent.f264833d.f264835a = 35;
            favoriteOperationEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$w */
    public class C6634w implements DialogInterface.OnClickListener {
        public C6634w() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(NoteEditorUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$x */
    public class C6635x implements DialogInterface.OnClickListener {
        public C6635x() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(NoteEditorUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$y */
    public class C6636y implements DialogInterface.OnClickListener {
        public C6636y(NoteEditorUI noteEditorUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$a0 */
    public class C44467a0 implements C14088e.C14090b {
        /* renamed from: a */
        public void mo1717a() {
            Log.m105924i("MicroMsg.Note.NoteEditorUI", "OpenLiteApp success");
        }

        /* renamed from: b */
        public void mo1718b() {
            Log.m105924i("MicroMsg.Note.NoteEditorUI", "OpenLiteApp fail");
            Intent intent = new Intent();
            intent.putExtra("showShare", false);
            intent.putExtra("rawUrl", String.format(C74928u.C45092d.f122306a, new Object[]{57}));
            C88144b.m109791i(MMApplicationContext.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$c0 */
    public class C44468c0 implements MenuItem.OnMenuItemClickListener {
        public C44468c0() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C85878m2.m106216e(NoteEditorUI.this.getTaskId(), (C85878m2.C85879a) null);
            C85861e4.m106119f(NoteEditorUI.this, true, true, (C85861e4.C85862a) null);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$f0 */
    public class C44469f0 implements Runnable {
        public C44469f0() {
        }

        public void run() {
            View findViewById = NoteEditorUI.this.findViewById(C0966R.C0970id.f5421eo);
            if (findViewById != null) {
                findViewById.setTag(C0966R.C0970id.f359346ke3, "1");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$u */
    public class C44470u implements View.OnClickListener {
        public C44470u(NoteEditorUI noteEditorUI) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            NoteEditorUI.m124142O7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$a */
    public class C96685a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$a$a */
        public class C96686a implements Runnable {
            public C96686a() {
            }

            public void run() {
                NoteEditorUI.this.mo134926U7(false);
            }
        }

        public C96685a() {
        }

        public void onGlobalLayout() {
            long currentTimeMillis = System.currentTimeMillis();
            Log.m105925i("MicroMsg.Note.NoteEditorUI", "startnoteeditorui, onGlobalLayout, current time is %d,from oncreate to dataloading, cost %d", Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis - NoteEditorUI.this.f283237X));
            C86709a0.m107525e().postToWorkerDelayed(new C96686a(), NoteEditorUI.this.f283233V == 1 ? 100 : 0);
            NoteEditorUI.this.f283257n.getViewTreeObserver().removeGlobalOnLayoutListener(NoteEditorUI.this.f283243a1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$b */
    public class C96687b implements ViewTreeObserver.OnGlobalLayoutListener {
        public C96687b() {
        }

        public void onGlobalLayout() {
            Log.m105924i("MicroMsg.Note.NoteEditorUI", "mOnGlobalLayoutComplaintListener scrollRange:" + NoteEditorUI.this.f283257n.computeVerticalScrollRange());
            NoteEditorUI noteEditorUI = NoteEditorUI.this;
            if (noteEditorUI.f283267u == null) {
                return;
            }
            if (noteEditorUI.f283257n.computeVerticalScrollRange() + NoteEditorUI.this.f283267u.getMeasuredHeight() > NoteEditorUI.this.f283257n.getMeasuredHeight()) {
                C98333b bVar = NoteEditorUI.this.f283259o;
                bVar.f288231h = true;
                bVar.notifyDataSetChanged();
                NoteEditorUI.this.f283267u.setVisibility(8);
                NoteEditorUI.this.f283257n.getViewTreeObserver().removeOnGlobalLayoutListener(NoteEditorUI.this.f283244b1);
                return;
            }
            NoteEditorUI.this.f283267u.setVisibility(0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$b0 */
    public class C96688b0 implements DialogInterface.OnCancelListener {
        public C96688b0() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C89779i0 i0Var = NoteEditorUI.this.f283249g1;
            if (i0Var != null) {
                i0Var.dismiss();
                NoteEditorUI.this.f283249g1 = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$c */
    public class C96689c implements View.OnTouchListener {

        /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$c$a */
        public class C96690a implements Runnable {
            public C96690a(C96689c cVar) {
            }

            public void run() {
                C92400k.m116191h().mo126365A(true);
                C92400k.m116191h().mo126367C(true);
            }
        }

        public C96689c() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$16", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                NoteEditorUI.this.f283246d1 = motionEvent.getX();
                NoteEditorUI.this.f283247e1 = motionEvent.getY();
            }
            if (motionEvent.getAction() == 1 && NoteEditorUI.this.f283257n.mo17019D0(motionEvent.getX(), motionEvent.getY()) == null) {
                float abs = Math.abs(NoteEditorUI.this.f283246d1 - motionEvent.getX());
                float abs2 = Math.abs(NoteEditorUI.this.f283247e1 - motionEvent.getY());
                if (abs < 30.0f && abs2 < 30.0f) {
                    if (NoteEditorUI.this.f283264r.getVisibility() != 8) {
                        C92232k kVar = NoteEditorUI.this.f283265s;
                        if (kVar != null) {
                            kVar.f263993a.dismiss();
                        }
                        NoteEditorUI.this.f283264r.setVisibility(8);
                    } else {
                        int F = NoteEditorUI.this.f283238X0.mo126186F() - 1;
                        C102587c k = NoteEditorUI.this.f283238X0.mo126201k(F);
                        if (k != null) {
                            boolean z = k.f302071b;
                            NoteEditorUI.this.f283238X0.mo126198h();
                            k.f302071b = true;
                            k.f302077h = false;
                            k.f302072c = -1;
                            NoteEditorUI.this.f283259o.notifyItemChanged(F);
                            NoteEditorUI.this.mo134937e8(true, 50);
                            NoteEditorUI.this.mo134936d8(1, 0);
                            NoteEditorUI noteEditorUI = NoteEditorUI.this;
                            if (noteEditorUI.f283224Q0 && z) {
                                noteEditorUI.f283212E.postDelayed(new C96690a(this), 100);
                            }
                        }
                    }
                }
            } else if (motionEvent.getAction() == 2) {
                float abs3 = Math.abs(NoteEditorUI.this.f283246d1 - motionEvent.getX());
                float abs4 = Math.abs(NoteEditorUI.this.f283247e1 - motionEvent.getY());
                if (abs3 > 120.0f || abs4 > 120.0f) {
                    NoteEditorUI noteEditorUI2 = NoteEditorUI.this;
                    if (noteEditorUI2.f283224Q0) {
                        if (C92400k.m116191h().mo126386m() == 1) {
                            NoteEditorUI.this.mo134927V7();
                            C92400k.m116191h().mo126377c();
                        }
                    } else if (!noteEditorUI2.f283214G) {
                        noteEditorUI2.mo134927V7();
                    }
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$16", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d */
    public class C96691d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f283281d;

        public C96691d(int i) {
            this.f283281d = i;
        }

        public void run() {
            Log.m105925i("MicroMsg.Note.NoteEditorUI", "huahuastart: onNotifyItemChanged,position is %d %s", Integer.valueOf(this.f283281d), Long.valueOf(NoteEditorUI.this.f283270x));
            NoteEditorUI.this.f283259o.notifyItemChanged(this.f283281d);
            Log.m105925i("MicroMsg.Note.NoteEditorUI", "huahuaend: onNotifyItemChanged,position is %d", Integer.valueOf(this.f283281d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 */
    public class C96692d0 implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0$a */
        public class C96693a implements C11182m0 {
            public C96693a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                NoteEditorUI noteEditorUI = NoteEditorUI.this;
                int i = noteEditorUI.f283233V;
                if (i == 1) {
                    e0Var.mo107142f(4, noteEditorUI.getString(C0966R.string.crb));
                    C97637b bVar = NoteEditorUI.this.f283232U0;
                    if (bVar != null) {
                        bVar.getClass();
                        e0Var.mo107142f(17, NoteEditorUI.this.getString(C0966R.string.cak));
                    }
                    NoteEditorUI.m124141L7(NoteEditorUI.this, e0Var);
                    e0Var.mo107142f(3, NoteEditorUI.this.getString(C0966R.string.f361137hk2));
                } else if (i == 2) {
                    boolean z = false;
                    e0Var.mo107142f(0, noteEditorUI.getString(C0966R.string.crb));
                    C97637b bVar2 = NoteEditorUI.this.f283232U0;
                    if (bVar2 != null) {
                        bVar2.getClass();
                        e0Var.mo107142f(17, NoteEditorUI.this.getString(C0966R.string.cak));
                    }
                    if (C32384a.m39700a()) {
                        e0Var.mo107142f(7, NoteEditorUI.this.getContext().getString(C0966R.string.cpw));
                    }
                    NoteEditorUI noteEditorUI2 = NoteEditorUI.this;
                    if (!noteEditorUI2.f283239Y) {
                        e0Var.mo107142f(14, noteEditorUI2.getString(C0966R.string.cqz));
                    }
                    String str = SubCoreNewABTest.wx0().mo57622Lo("100353").mo135598l2().get("Close");
                    if ((!Util.isNullOrNil(str) ? Util.getInt(str, 0) : 0) == 0) {
                        z = true;
                    }
                    if (z) {
                        e0Var.mo107142f(8, NoteEditorUI.this.getContext().getString(C0966R.string.h_r));
                    }
                    NoteEditorUI.m124141L7(NoteEditorUI.this, e0Var);
                    e0Var.mo107142f(1, NoteEditorUI.this.getString(C0966R.string.cnr));
                    e0Var.mo107142f(2, NoteEditorUI.this.getContext().getString(C0966R.string.f7944x1));
                } else if (i == 4) {
                    e0Var.mo107142f(9, noteEditorUI.getString(C0966R.string.crb));
                    C97637b bVar3 = NoteEditorUI.this.f283232U0;
                    if (bVar3 != null) {
                        bVar3.getClass();
                        e0Var.mo107142f(17, NoteEditorUI.this.getString(C0966R.string.cak));
                    }
                    if (C32384a.m39700a()) {
                        e0Var.mo107142f(12, NoteEditorUI.this.getContext().getString(C0966R.string.cpw));
                    }
                    e0Var.mo107142f(10, NoteEditorUI.this.getString(C0966R.string.f361137hk2));
                }
                if (Log.isDebug()) {
                    e0Var.mo107142f(19, "test_auto_save");
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0$b */
        public class C96694b implements C11184p0 {
            public C96694b() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:110:0x053d  */
            /* JADX WARNING: Removed duplicated region for block: B:111:0x0580  */
            /* JADX WARNING: Removed duplicated region for block: B:112:0x05a8  */
            /* JADX WARNING: Removed duplicated region for block: B:113:0x05e2  */
            /* JADX WARNING: Removed duplicated region for block: B:117:0x0634  */
            /* JADX WARNING: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x00c2  */
            /* JADX WARNING: Removed duplicated region for block: B:29:0x00d5  */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x00f7  */
            /* JADX WARNING: Removed duplicated region for block: B:33:0x0104  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x015d  */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x018a  */
            /* JADX WARNING: Removed duplicated region for block: B:54:0x01e1  */
            /* JADX WARNING: Removed duplicated region for block: B:68:0x02b7  */
            /* JADX WARNING: Removed duplicated region for block: B:76:0x03aa  */
            /* JADX WARNING: Removed duplicated region for block: B:97:0x0455  */
            /* JADX WARNING: Removed duplicated region for block: B:98:0x0479  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onMMMenuItemSelected(android.view.MenuItem r23, int r24) {
                /*
                    r22 = this;
                    r0 = r22
                    java.lang.Class<oo.h> r1 = p215oo.C77032h.class
                    int r2 = r23.getItemId()
                    r3 = 2
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                    r5 = 5
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                    r8 = 7
                    r9 = 6
                    r10 = 0
                    java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
                    r12 = 4
                    r13 = 1
                    java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
                    if (r2 == 0) goto L_0x003f
                    r15 = 9
                    if (r2 == r15) goto L_0x003f
                    r15 = 12
                    if (r2 == r15) goto L_0x003d
                    r15 = 17
                    if (r2 == r15) goto L_0x003b
                    if (r2 == r12) goto L_0x003f
                    if (r2 == r5) goto L_0x0039
                    if (r2 == r9) goto L_0x0037
                    if (r2 == r8) goto L_0x003d
                    r2 = 0
                    goto L_0x0040
                L_0x0037:
                    r2 = 6
                    goto L_0x0040
                L_0x0039:
                    r2 = 5
                    goto L_0x0040
                L_0x003b:
                    r2 = 3
                    goto L_0x0040
                L_0x003d:
                    r2 = 2
                    goto L_0x0040
                L_0x003f:
                    r2 = 1
                L_0x0040:
                    if (r2 == 0) goto L_0x00a9
                    i00.b r15 = wa3.C102364c.vx0()
                    wa3.e r15 = r15.mo137946Rd()
                    if (r15 != 0) goto L_0x004d
                    goto L_0x00a9
                L_0x004d:
                    wa3.f r8 = r15.f301472i
                    java.lang.String r9 = r15.mo141945g()
                    java.lang.String r8 = r8.mo141954a(r9)
                    boolean r9 = r15.mo141944f()
                    wa3.f r15 = r15.f301472i
                    java.lang.String r15 = r15.f301479a
                    com.tencent.mm.autogen.mmdata.rpt.WeNoteMenuOperationStruct r12 = new com.tencent.mm.autogen.mmdata.rpt.WeNoteMenuOperationStruct
                    r12.<init>()
                    java.lang.String r5 = "sessionID"
                    java.lang.String r5 = r12.mo86045b(r5, r15, r13)
                    r12.f266556d = r5
                    java.lang.String r5 = "noteid"
                    java.lang.String r5 = r12.mo86045b(r5, r8, r13)
                    r12.f266557e = r5
                    r12.f266558f = r9
                    r12.f266559g = r2
                    r12.mo86054n()
                    int r2 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()
                    if (r2 > r13) goto L_0x00a9
                    java.lang.Object[] r2 = new java.lang.Object[r3]
                    r5 = 26791(0x68a7, float:3.7542E-41)
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    r2[r10] = r5
                    java.lang.String r5 = r12.mo1006q()
                    java.lang.String r8 = "struct.toShowString()"
                    gy3.C87412m.m108593f(r5, r8)
                    java.lang.String r8 = "\r\n"
                    java.lang.String r9 = " "
                    java.lang.String r5 = z04.C112551y.m153814n(r5, r8, r9, r10)
                    r2[r13] = r5
                    java.lang.String r5 = "MicroMsg.WNNoteReporter"
                    java.lang.String r8 = "report%s %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r2)
                L_0x00a9:
                    int r2 = r23.getItemId()
                    r5 = 2131840206(0x7f114cce, float:1.9313685E38)
                    java.lang.String r9 = ".ui.transmit.SelectConversationUI"
                    java.lang.String r12 = "mutil_select_is_ret"
                    java.lang.String r15 = "Select_Conv_Type"
                    java.lang.String r3 = ""
                    java.lang.String r8 = "MicroMsg.Note.NoteEditorUI"
                    r7 = 14790(0x39c6, float:2.0725E-41)
                    switch(r2) {
                        case 0: goto L_0x0634;
                        case 1: goto L_0x05e2;
                        case 2: goto L_0x05a8;
                        case 3: goto L_0x0580;
                        case 4: goto L_0x053d;
                        case 5: goto L_0x0479;
                        case 6: goto L_0x0455;
                        case 7: goto L_0x03aa;
                        case 8: goto L_0x02b7;
                        case 9: goto L_0x01e1;
                        case 10: goto L_0x018a;
                        case 11: goto L_0x00c0;
                        case 12: goto L_0x015d;
                        case 13: goto L_0x0104;
                        case 14: goto L_0x00f7;
                        case 15: goto L_0x00c0;
                        case 16: goto L_0x00c0;
                        case 17: goto L_0x00d5;
                        case 18: goto L_0x00c0;
                        case 19: goto L_0x00c2;
                        default: goto L_0x00c0;
                    }
                L_0x00c0:
                    goto L_0x066c
                L_0x00c2:
                    java.lang.String r1 = "onMMMenuItemSelected MENU_ID_TEST_AUTO_SAVE"
                    com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r1)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    com.tencent.mm.plugin.wenote.model.nativenote.manager.b r1 = r1.f283252j
                    if (r1 == 0) goto L_0x066c
                    r1.mo134903a()
                    goto L_0x066c
                L_0x00d5:
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    eb3.b r2 = r1.f283232U0
                    if (r2 == 0) goto L_0x066c
                    bb3.d r3 = r1.f283238X0
                    java.lang.String r1 = r1.getString(r5)
                    java.lang.String r1 = r3.mo126207q(r1)
                    java.lang.String r3 = "title"
                    gy3.C87412m.m108594g(r1, r3)
                    r2.f286421x = r1
                    r2.mo67897d()
                    r2.mo124068H(r13, r13)
                    goto L_0x066c
                L_0x00f7:
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    long r2 = r1.f283270x
                    pb1.a0$a r4 = r1.f270015g
                    com.tencent.p014mm.plugin.fav.p047ui.C93685p0.m118380b(r1, r2, r4)
                    goto L_0x066c
                L_0x0104:
                    android.content.Intent r1 = new android.content.Intent
                    r1.<init>()
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    java.lang.String r2 = r2.f283272y
                    java.lang.String r3 = "k_expose_msg_id"
                    r1.putExtra(r3, r2)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    java.lang.String[] r2 = r2.f283231U
                    if (r2 == 0) goto L_0x0128
                    int r3 = r2.length
                    if (r3 <= r13) goto L_0x0128
                    r2 = r2[r13]
                    java.lang.String r3 = "k_username"
                    r1.putExtra(r3, r2)
                L_0x0128:
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    boolean r2 = r2.f283235W
                    java.lang.String r3 = "showShare"
                    r1.putExtra(r3, r2)
                    java.lang.String r2 = com.tencent.p014mm.p136ui.C74928u.C45092d.f122306a
                    java.lang.Object[] r3 = new java.lang.Object[r13]
                    r4 = 33
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r3[r10] = r4
                    java.lang.String r2 = java.lang.String.format(r2, r3)
                    java.lang.String r3 = "rawUrl"
                    r1.putExtra(r3, r2)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    androidx.appcompat.app.AppCompatActivity r2 = r2.getContext()
                    java.lang.String r3 = "webview"
                    java.lang.String r4 = ".ui.tools.WebViewUI"
                    r5 = 0
                    ke3.C88144b.m109791i(r2, r3, r4, r1, r5)
                    goto L_0x066c
                L_0x015d:
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    java.lang.String r1 = r1.f283241Z
                    boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                    if (r1 == 0) goto L_0x0178
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    com.tencent.mm.sdk.platformtools.MMHandler r1 = r1.f283212E
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0$b$$f r2 = new com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0$b$$f
                    r2.<init>(r0)
                    r1.post(r2)
                    return
                L_0x0178:
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    pb1.a0$a r2 = r1.f270015g
                    int r3 = r2.f295028m
                    int r3 = r3 + r13
                    r2.f295028m = r3
                    java.lang.String r2 = r1.f283241Z
                    com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.m124140K7(r1, r2)
                    goto L_0x066c
                L_0x018a:
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    java.lang.String r2 = r2.f283272y
                    boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                    if (r4 == 0) goto L_0x01a7
                    java.lang.String r1 = "MicroMsg.WNNoteLogic"
                    java.lang.String r2 = "dofavnotelink , but localid is null or nil"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
                    goto L_0x066c
                L_0x01a7:
                    com.tencent.mm.autogen.events.DoFavoriteEvent r4 = new com.tencent.mm.autogen.events.DoFavoriteEvent
                    r4.<init>()
                    com.tencent.mm.autogen.events.SnsfillEventInfoEvent r5 = new com.tencent.mm.autogen.events.SnsfillEventInfoEvent
                    r5.<init>()
                    com.tencent.mm.autogen.events.SnsfillEventInfoEvent$a r6 = r5.f265220d
                    r6.f265224c = r2
                    r6.f265225d = r4
                    r6.f265222a = r3
                    r5.publish()
                    com.tencent.mm.autogen.events.SnsfillEventInfoEvent$b r2 = r5.f265221e
                    boolean r2 = r2.f265226a
                    if (r2 != 0) goto L_0x01d4
                    com.tencent.mm.autogen.events.DoFavoriteEvent$a r2 = r4.f264674d
                    int r3 = r2.f264687l
                    if (r3 != 0) goto L_0x01cd
                    r3 = 2131825665(0x7f111401, float:1.9284193E38)
                    r2.f264687l = r3
                L_0x01cd:
                    int r2 = r2.f264687l
                    nj3.C76879j.m92738i(r1, r2, r10)
                    goto L_0x066c
                L_0x01d4:
                    com.tencent.mm.autogen.events.DoFavoriteEvent$a r2 = r4.f264674d
                    r2.f264684i = r1
                    r1 = 28
                    r2.f264688m = r1
                    r4.publish()
                    goto L_0x066c
                L_0x01e1:
                    com.tencent.mm.autogen.events.FavoriteOperationEvent r2 = new com.tencent.mm.autogen.events.FavoriteOperationEvent
                    r2.<init>()
                    com.tencent.mm.autogen.events.FavoriteOperationEvent$a r3 = r2.f264833d
                    r4 = 32
                    r3.f264835a = r4
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r4 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r4 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    long r4 = r4.f283270x
                    r3.f264839e = r4
                    i00.b r4 = wa3.C102364c.vx0()
                    wa3.e r4 = r4.mo137946Rd()
                    te3.kd0 r4 = r4.f301475o
                    r3.f264838d = r4
                    r2.publish()
                    com.tencent.mm.autogen.events.FavoriteOperationEvent$b r2 = r2.f264834e
                    boolean r3 = r2.f264863i
                    int r4 = r2.f264855a
                    if (r4 == 0) goto L_0x020c
                    r10 = 1
                L_0x020c:
                    java.lang.String r2 = r2.f264857c
                    if (r2 != 0) goto L_0x022c
                    java.lang.String r1 = "[MENU_ID_SHEAR_TO_FRIEND_FROM_SNS] share from sns, path = null"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    r3 = 2131825764(0x7f111464, float:1.9284393E38)
                    java.lang.String r2 = r2.getString(r3)
                    nj3.C76879j.m92726T(r1, r2)
                    return
                L_0x022c:
                    if (r3 == 0) goto L_0x024a
                    java.lang.String r1 = "[MENU_ID_SHEAR_TO_FRIEND_FROM_SNS] share from sns, notDownload"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    r3 = 2131820553(0x7f110009, float:1.9273824E38)
                    java.lang.String r2 = r2.getString(r3)
                    nj3.C76879j.m92726T(r1, r2)
                    return
                L_0x024a:
                    if (r10 == 0) goto L_0x0268
                    java.lang.String r1 = "[MENU_ID_SHEAR_TO_FRIEND_FROM_SNS] share from sns, notUpload"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    r3 = 2131820554(0x7f11000a, float:1.9273826E38)
                    java.lang.String r2 = r2.getString(r3)
                    nj3.C76879j.m92726T(r1, r2)
                    return
                L_0x0268:
                    android.content.Intent r2 = new android.content.Intent
                    r2.<init>()
                    r3 = 3
                    r2.putExtra(r15, r3)
                    java.lang.String r3 = "scene_from"
                    r2.putExtra(r3, r13)
                    r2.putExtra(r12, r13)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r3 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r3 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    long r3 = r3.f283270x
                    java.lang.String r5 = "select_fav_local_id"
                    r2.putExtra(r5, r3)
                    i00.b r3 = wa3.C102364c.vx0()
                    wa3.e r3 = r3.mo137946Rd()
                    java.lang.String r3 = r3.mo141946h()
                    java.lang.String r4 = "Retr_fav_xml_str"
                    r2.putExtra(r4, r3)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r3 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r3 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    r4 = 4355(0x1103, float:6.103E-42)
                    ke3.C88144b.m109802t(r3, r9, r2, r4)
                    di3.d r1 = di3.C86312j.m106911c(r1)
                    oo.h r1 = (p215oo.C77032h) r1
                    r2 = 5
                    r1.setScene(r2)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    pb1.a0$a r1 = r1.f270015g
                    int r2 = r1.f295027l
                    int r2 = r2 + r13
                    r1.f295027l = r2
                    goto L_0x066c
                L_0x02b7:
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    androidx.appcompat.app.AppCompatActivity r16 = r1.getContext()
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    r3 = 2131840274(0x7f114d12, float:1.9313823E38)
                    java.lang.String r18 = r2.getString(r3)
                    r19 = 0
                    r20 = 1
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0$b$$d r2 = new com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0$b$$d
                    r2.<init>(r0)
                    java.lang.String r17 = ""
                    r21 = r2
                    qo3.i0 r2 = nj3.C76879j.m92723Q(r16, r17, r18, r19, r20, r21)
                    r1.f283249g1 = r2
                    com.tencent.mm.autogen.events.FavoriteOperationEvent r1 = new com.tencent.mm.autogen.events.FavoriteOperationEvent
                    r1.<init>()
                    com.tencent.mm.autogen.events.FavoriteOperationEvent$a r2 = r1.f264833d
                    r3 = 32
                    r2.f264835a = r3
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r3 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r3 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    long r3 = r3.f283270x
                    r2.f264839e = r3
                    i00.b r3 = wa3.C102364c.vx0()
                    wa3.e r3 = r3.mo137946Rd()
                    te3.kd0 r3 = r3.f301475o
                    r2.f264838d = r3
                    r1.publish()
                    com.tencent.mm.autogen.events.FavoriteOperationEvent$b r1 = r1.f264834e
                    boolean r2 = r1.f264863i
                    java.lang.String r1 = r1.f264857c
                    r3 = 14811(0x39db, float:2.0755E-41)
                    r4 = 2131833628(0x7f11331c, float:1.9300343E38)
                    if (r1 != 0) goto L_0x034e
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    r1.mo134921P7()
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    androidx.appcompat.app.AppCompatActivity r2 = r2.getContext()
                    java.lang.String r2 = r2.getString(r4)
                    android.widget.Toast r1 = p910lj.C76701a.makeText((android.content.Context) r1, (java.lang.CharSequence) r2, (int) r13)
                    r1.show()
                    com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r2 = 5
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r2[r10] = r11
                    r2[r13] = r11
                    r4 = 2
                    r2[r4] = r11
                    r4 = 3
                    r2[r4] = r6
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r4 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r4 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    boolean r4 = r4.f283239Y
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r5 = 4
                    r2[r5] = r4
                    r1.mo160131h(r3, r2)
                    return
                L_0x034e:
                    if (r2 == 0) goto L_0x0392
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    r1.mo134921P7()
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    androidx.appcompat.app.AppCompatActivity r2 = r2.getContext()
                    java.lang.String r2 = r2.getString(r4)
                    android.widget.Toast r1 = p910lj.C76701a.makeText((android.content.Context) r1, (java.lang.CharSequence) r2, (int) r13)
                    r1.show()
                    com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r2 = 5
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r2[r10] = r11
                    r2[r13] = r11
                    r4 = 2
                    r2[r4] = r11
                    r4 = 3
                    r2[r4] = r6
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r4 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r4 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    boolean r4 = r4.f283239Y
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r5 = 4
                    r2[r5] = r4
                    r1.mo160131h(r3, r2)
                    return
                L_0x0392:
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    com.tencent.mm.sdk.platformtools.MMHandler r1 = r1.f283212E
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0$b$$e r2 = new com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0$b$$e
                    r2.<init>(r0)
                    r1.post(r2)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    r2 = 5
                    r1.mo128401H7(r2)
                    goto L_0x066c
                L_0x03aa:
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    long r1 = r1.f283270x
                    r3 = -1
                    pb1.C100695a0.m131729d(r1, r10, r10, r3)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    boolean r2 = r1.f283274z
                    if (r2 != 0) goto L_0x03d9
                    boolean r2 = r1.f283209B
                    if (r2 == 0) goto L_0x03c1
                    goto L_0x03d9
                L_0x03c1:
                    boolean r2 = r1.f283208A
                    if (r2 == 0) goto L_0x03d7
                    bb3.d r1 = r1.f283238X0
                    java.lang.String r1 = r1.mo126205o()
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    java.lang.String r2 = r2.f283211D
                    boolean r1 = r1.equals(r2)
                    r1 = r1 ^ r13
                    goto L_0x03da
                L_0x03d7:
                    r1 = 0
                    goto L_0x03da
                L_0x03d9:
                    r1 = 1
                L_0x03da:
                    if (r1 == 0) goto L_0x03f2
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    com.tencent.mm.plugin.wenote.model.nativenote.manager.b r1 = r1.f283252j
                    r1.mo134903a()
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    r1.mo134922Q7()
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    r1.f283262p0 = r13
                L_0x03f2:
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    boolean r2 = r1.f283274z
                    if (r2 != 0) goto L_0x03fe
                    boolean r2 = r1.f283209B
                    if (r2 == 0) goto L_0x0404
                L_0x03fe:
                    r1.f283274z = r10
                    r1.f283209B = r10
                    r1.f283208A = r13
                L_0x0404:
                    com.tencent.mm.autogen.events.FavoriteOperationEvent r1 = new com.tencent.mm.autogen.events.FavoriteOperationEvent
                    r1.<init>()
                    com.tencent.mm.autogen.events.FavoriteOperationEvent$a r2 = r1.f264833d
                    r3 = 30
                    r2.f264835a = r3
                    r2.f264847m = r13
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r3 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r3 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    long r3 = r3.f283270x
                    r2.f264839e = r3
                    r1.publish()
                    com.tencent.mm.autogen.events.FavoriteOperationEvent$b r1 = r1.f264834e
                    java.lang.String r2 = r1.f264857c
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r3 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r3 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    java.lang.String r1 = r1.f264858d
                    r3.f283229T = r1
                    boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                    if (r1 == 0) goto L_0x043d
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    com.tencent.mm.sdk.platformtools.MMHandler r1 = r1.f283212E
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0$b$$c r2 = new com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0$b$$c
                    r2.<init>(r0)
                    r1.post(r2)
                    return
                L_0x043d:
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.m124140K7(r1, r2)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    pb1.a0$a r2 = r1.f270015g
                    int r3 = r2.f295028m
                    int r3 = r3 + r13
                    r2.f295028m = r3
                    r2 = 4
                    r1.mo128401H7(r2)
                    goto L_0x066c
                L_0x0455:
                    com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r2 = 2
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r2[r10] = r14
                    r2[r13] = r4
                    r1.mo160131h(r7, r2)
                    bb3.l r1 = bb3.C92238l.m115958b()
                    r2 = 0
                    r1.mo126234c(r2)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    r2 = 2131840201(0x7f114cc9, float:1.9313675E38)
                    java.lang.String r2 = r1.getString(r2)
                    com.tencent.p014mm.p136ui.widget.snackbar.C75026b.m89951a(r1, r2)
                    goto L_0x066c
                L_0x0479:
                    java.lang.Object[] r1 = new java.lang.Object[r13]
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    long r2 = r2.f283270x
                    java.lang.Long r2 = java.lang.Long.valueOf(r2)
                    r1[r10] = r2
                    java.lang.String r2 = "MENU_ID_SET_TOP click %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r1)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    com.tencent.mm.plugin.wenote.model.nativenote.manager.b r1 = r1.f283252j
                    r1.mo134903a()
                    xa3.r r1 = new xa3.r
                    r1.<init>()
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    int r3 = r2.f283233V
                    if (r3 != r13) goto L_0x04a4
                    r3 = 1
                    goto L_0x04a5
                L_0x04a4:
                    r3 = 0
                L_0x04a5:
                    r1.f302105d = r3
                    java.lang.String r3 = r2.f283221N
                    r1.f302110i = r3
                    bb3.d r3 = r2.f283238X0
                    java.lang.String r2 = r2.getString(r5)
                    java.lang.String r2 = r3.mo126207q(r2)
                    r1.f302109h = r2
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    int r3 = r2.f283222P
                    r1.f302111j = r3
                    int r3 = r2.f283223Q
                    r1.f302112n = r3
                    int r3 = r2.f283233V
                    if (r3 != r13) goto L_0x04f2
                    long r5 = r2.f283269w
                    r1.f302107f = r5
                    boolean r2 = r2.f283271x0
                    if (r2 == 0) goto L_0x04e3
                    r1.f302108g = r13
                    com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r3 = 2
                    java.lang.Object[] r3 = new java.lang.Object[r3]
                    r4 = 3
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r3[r10] = r4
                    r3[r13] = r14
                    r2.mo160131h(r7, r3)
                    goto L_0x0506
                L_0x04e3:
                    r3 = 2
                    r1.f302108g = r10
                    com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    java.lang.Object[] r3 = new java.lang.Object[r3]
                    r3[r10] = r4
                    r3[r13] = r14
                    r2.mo160131h(r7, r3)
                    goto L_0x0506
                L_0x04f2:
                    r3 = 2
                    com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    java.lang.Object[] r3 = new java.lang.Object[r3]
                    r3[r10] = r14
                    r3[r13] = r14
                    r2.mo160131h(r7, r3)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    long r2 = r2.f283270x
                    r1.f302106e = r2
                L_0x0506:
                    com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r3 = 18728(0x4928, float:2.6244E-41)
                    java.lang.Object[] r4 = new java.lang.Object[r13]
                    r4[r10] = r14
                    r2.mo160131h(r3, r4)
                    eb0.c r2 = eb0.C97625j3.m125812b()
                    com.tencent.mm.storage.v1 r2 = r2.mo105906u()
                    com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WENOTE_KEEP_TOP_DATA_LAST_REPORT_TIME_LONG_SYNC
                    long r4 = java.lang.System.currentTimeMillis()
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    r2.mo119677K(r3, r4)
                    bb3.l r2 = bb3.C92238l.m115958b()
                    r2.mo126234c(r1)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    r2 = 2131840207(0x7f114ccf, float:1.9313687E38)
                    java.lang.String r2 = r1.getString(r2)
                    com.tencent.p014mm.p136ui.widget.snackbar.C75026b.m89951a(r1, r2)
                    goto L_0x066c
                L_0x053d:
                    android.content.Intent r2 = new android.content.Intent
                    r2.<init>()
                    r3 = 3
                    r2.putExtra(r15, r3)
                    java.lang.String r3 = "select_is_ret"
                    r2.putExtra(r3, r13)
                    r2.putExtra(r12, r13)
                    java.lang.String r3 = "Retr_Msg_Type"
                    r4 = 2
                    r2.putExtra(r3, r4)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r3 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r3 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    long r3 = r3.f283269w
                    java.lang.String r5 = "Retr_Msg_Id"
                    r2.putExtra(r5, r3)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r3 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r3 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    r4 = 4096(0x1000, float:5.74E-42)
                    ke3.C88144b.m109802t(r3, r9, r2, r4)
                    di3.d r1 = di3.C86312j.m106911c(r1)
                    oo.h r1 = (p215oo.C77032h) r1
                    r2 = 5
                    r1.setScene(r2)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    pb1.a0$a r1 = r1.f270015g
                    int r2 = r1.f295027l
                    int r2 = r2 + r13
                    r1.f295027l = r2
                    goto L_0x066c
                L_0x0580:
                    com.tencent.mm.autogen.events.DoFavoriteEvent r1 = new com.tencent.mm.autogen.events.DoFavoriteEvent
                    r1.<init>()
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    long r2 = r2.f283269w
                    com.tencent.p014mm.pluginsdk.model.C96787m0.m124255i(r1, r2)
                    r1.publish()
                    com.tencent.mm.autogen.events.DoFavoriteEvent$b r1 = r1.f264675e
                    int r3 = r1.f9046a
                    r4 = 37
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r5 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    com.tencent.mm.ui.widget.snackbar.a$d r10 = r5.f283254k1
                    r7 = 0
                    r11 = 1
                    r2 = -1
                    r6 = 0
                    r8 = 0
                    r9 = 0
                    com.tencent.p014mm.plugin.fav.p047ui.C93693r.m118404e(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                    goto L_0x066c
                L_0x05a8:
                    java.lang.Object[] r1 = new java.lang.Object[r13]
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    long r4 = r2.f283270x
                    java.lang.Long r2 = java.lang.Long.valueOf(r4)
                    r1[r10] = r2
                    java.lang.String r2 = "menu click del, local id %d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r1)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    r4 = 2131821452(0x7f11038c, float:1.9275648E38)
                    java.lang.String r2 = r2.getString(r4)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0$b$$a r4 = new com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0$b$$a
                    r4.<init>(r0)
                    r5 = 0
                    nj3.C76879j.m92750u(r1, r2, r3, r4, r5)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    r2 = 6
                    r1.mo128401H7(r2)
                    goto L_0x066c
                L_0x05e2:
                    r5 = 0
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.e0 r1 = r1.f283263q
                    if (r1 == 0) goto L_0x05ee
                    r1.mo134989c(r5)
                L_0x05ee:
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    com.tencent.mm.plugin.wenote.model.nativenote.manager.b r1 = r1.f283252j
                    r1.mo134903a()
                    android.content.Intent r1 = new android.content.Intent
                    r1.<init>()
                    java.lang.String r2 = "key_fav_scene"
                    r3 = 2
                    r1.putExtra(r2, r3)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    long r2 = r2.f283270x
                    java.lang.String r4 = "key_fav_item_id"
                    r1.putExtra(r4, r2)
                    java.lang.Class<xq.e> r2 = p272xq.C102712e.class
                    di3.d r2 = di3.C86312j.m106911c(r2)
                    xq.e r2 = (p272xq.C102712e) r2
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r3 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r3 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    androidx.appcompat.app.AppCompatActivity r3 = r3.getContext()
                    java.lang.String r4 = ".ui.FavTagEditUI"
                    r2.F20(r3, r4, r1)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    pb1.a0$a r2 = r1.f270015g
                    int r3 = r2.f295030o
                    int r3 = r3 + r13
                    r2.f295030o = r3
                    r2 = 7
                    r1.mo128401H7(r2)
                    goto L_0x066c
                L_0x0634:
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.e0 r2 = r1.f283263q
                    if (r2 == 0) goto L_0x0640
                    r3 = 0
                    r2.mo134989c(r3)
                L_0x0640:
                    androidx.appcompat.app.AppCompatActivity r4 = r1.getContext()
                    r2 = 2131820555(0x7f11000b, float:1.9273828E38)
                    java.lang.String r6 = r1.getString(r2)
                    r7 = 0
                    r8 = 1
                    com.tencent.mm.plugin.wenote.ui.nativenote.n r9 = new com.tencent.mm.plugin.wenote.ui.nativenote.n
                    r9.<init>(r1)
                    java.lang.String r5 = ""
                    qo3.i0 r2 = nj3.C76879j.m92723Q(r4, r5, r6, r7, r8, r9)
                    r1.f283249g1 = r2
                    com.tencent.mm.plugin.wenote.ui.nativenote.a r2 = new com.tencent.mm.plugin.wenote.ui.nativenote.a
                    r2.<init>(r1)
                    java.lang.String r1 = "AddFavNoteSync"
                    com.tencent.p014mm.sdk.thread.ThreadPool.post(r2, r1)
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0 r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.this
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                    r2 = 3
                    r1.mo128401H7(r2)
                L_0x066c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96692d0.C96694b.onMMMenuItemSelected(android.view.MenuItem, int):void");
            }
        }

        /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0$c */
        public class C96695c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C77407n f283286d;

            public C96695c(C96692d0 d0Var, C77407n nVar) {
                this.f283286d = nVar;
            }

            public void run() {
                this.f283286d.mo107573q();
            }
        }

        public C96692d0() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C102365e Rd = C102364c.vx0().mo137946Rd();
            boolean z = true;
            if (Rd != null) {
                String a = Rd.f301472i.mo141954a(Rd.mo141945g());
                boolean f = Rd.mo141944f();
                String str = Rd.f301472i.f301479a;
                FavoriteNoteClickReportStruct favoriteNoteClickReportStruct = new FavoriteNoteClickReportStruct();
                favoriteNoteClickReportStruct.f265562d = (long) 16;
                favoriteNoteClickReportStruct.f265564f = favoriteNoteClickReportStruct.mo86045b("noteid", a, true);
                favoriteNoteClickReportStruct.f265565g = f ? 1 : 0;
                favoriteNoteClickReportStruct.f265563e = favoriteNoteClickReportStruct.mo86045b("sessionID", str, true);
                favoriteNoteClickReportStruct.mo86054n();
                if (Log.getLogLevel() <= 1) {
                    String q = favoriteNoteClickReportStruct.mo1006q();
                    C87412m.m108593f(q, "struct.toShowString()");
                    Log.m105925i("MicroMsg.WNNoteReporter", "report%s %s", 14547, C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
                }
            }
            C77407n nVar = new C77407n((Context) NoteEditorUI.this.getContext(), 1, false);
            nVar.f225771i = new C96693a();
            nVar.f225782p = new C96694b();
            NoteEditorUI noteEditorUI = NoteEditorUI.this;
            if (noteEditorUI.f283233V == 2) {
                C92221d dVar = noteEditorUI.f283238X0;
                if (dVar.f263950f < 1 && dVar.f263949e < 1) {
                    z = false;
                }
                if (!z) {
                    View findViewById = noteEditorUI.findViewById(C0966R.C0970id.f5421eo);
                    if (findViewById != null) {
                        findViewById.setTag(C0966R.C0970id.f359346ke3, "1");
                    }
                    return false;
                }
            }
            View findViewById2 = noteEditorUI.findViewById(C0966R.C0970id.f5421eo);
            if (findViewById2 != null) {
                findViewById2.setTag(C0966R.C0970id.f359346ke3, "0");
            }
            NoteEditorUI noteEditorUI2 = NoteEditorUI.this;
            if (noteEditorUI2.f283233V == 2) {
                noteEditorUI2.mo134927V7();
                C92232k kVar = NoteEditorUI.this.f283265s;
                if (kVar != null) {
                    kVar.f263993a.dismiss();
                }
                NoteEditorUI.this.f283264r.setVisibility(8);
                if (NoteEditorUI.this.f283224Q0) {
                    C92400k.m116191h().mo126377c();
                }
            }
            NoteEditorUI.this.f283212E.postDelayed(new C96695c(this, nVar), 100);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$e */
    public class C96696e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f283287d;

        public C96696e(boolean z) {
            this.f283287d = z;
        }

        public void run() {
            synchronized (NoteEditorUI.this.f283219L) {
                NoteEditorUI.this.mo134930Y7();
                NoteEditorUI.this.f283268v = true;
                Log.m105925i("MicroMsg.Note.NoteEditorUI", "postToMainThread,isInitDataList = true,canDismissLoadingDialog :%B,mHasFreshedDataByHtml:%B", Boolean.valueOf(this.f283287d), Boolean.valueOf(NoteEditorUI.this.f283218K));
                C89779i0 i0Var = NoteEditorUI.this.f283249g1;
                if (i0Var != null && this.f283287d) {
                    i0Var.dismiss();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$e0 */
    public class C96697e0 implements MenuItem.OnMenuItemClickListener {
        public C96697e0() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            boolean z;
            NoteEditorUI noteEditorUI = NoteEditorUI.this;
            int i = NoteEditorUI.f283207p1;
            C96728e0 e0Var = noteEditorUI.f283263q;
            if (e0Var == null || !e0Var.f283365m) {
                z = true;
            } else {
                noteEditorUI.mo134933b8();
                z = false;
            }
            if (!z) {
                return true;
            }
            NoteEditorUI.this.mo134920N7();
            NoteEditorUI noteEditorUI2 = NoteEditorUI.this;
            C97637b bVar = noteEditorUI2.f283232U0;
            if (bVar != null) {
                String q = noteEditorUI2.f283238X0.mo126207q(noteEditorUI2.getString(C0966R.string.lkn));
                boolean z2 = NoteEditorUI.this.f283236W0;
                C87412m.m108594g(q, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                NoteEditorUI noteEditorUI3 = bVar.f286418u;
                if (noteEditorUI3 != null) {
                    noteEditorUI3.hideVKB();
                }
                bVar.f286421x = q;
                bVar.mo67897d();
                if (bVar.mo67896U(1, z2)) {
                    return true;
                }
            }
            C102166c cVar = NoteEditorUI.this.f283230T0;
            if (cVar != null && cVar.mo64004y0(1)) {
                return true;
            }
            NoteEditorUI.this.mo134923R7(1);
            NoteEditorUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$f */
    public class C96698f implements Runnable {
        public C96698f() {
        }

        public void run() {
            NoteEditorUI noteEditorUI = NoteEditorUI.this;
            NoteLinearLayoutManager noteLinearLayoutManager = noteEditorUI.f283213F;
            if (noteLinearLayoutManager != null) {
                int i = noteEditorUI.f283225R;
                int i2 = noteEditorUI.f283227S;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i2));
                aVar.mo10233c(Integer.valueOf(i));
                C117292a.m165358d(noteLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$19", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                noteLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(noteLinearLayoutManager, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$19", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                NoteEditorUI noteEditorUI2 = NoteEditorUI.this;
                noteEditorUI2.f283222P = noteEditorUI2.f283225R;
                noteEditorUI2.f283223Q = noteEditorUI2.f283227S;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$g */
    public class C96699g implements View.OnClickListener {
        public C96699g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C92232k kVar = NoteEditorUI.this.f283265s;
            if (kVar != null) {
                kVar.f263993a.dismiss();
            }
            NoteEditorUI.this.f283264r.setVisibility(8);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$g0 */
    public class C96700g0 extends C98332a {
        public C96700g0() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
            r3 = (androidx.recyclerview.widget.LinearLayoutManager) r2.f283292d.f283257n.getLayoutManager();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r3, int r4) {
            /*
                r2 = this;
                super.onScrollStateChanged(r3, r4)
                androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r3.getLayoutManager()
                if (r3 == 0) goto L_0x002a
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r3 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                androidx.recyclerview.widget.RecyclerView r3 = r3.f283257n
                androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r3.getLayoutManager()
                androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3
                r4 = 0
                android.view.View r4 = r3.getChildAt(r4)
                if (r4 == 0) goto L_0x002a
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                int r1 = r4.getTop()
                r0.f283223Q = r1
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.this
                int r3 = r3.getPosition(r4)
                r0.f283222P = r3
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96700g0.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$h */
    public class C96701h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f283293d;

        /* renamed from: e */
        public final /* synthetic */ String f283294e;

        /* renamed from: f */
        public final /* synthetic */ String f283295f;

        /* renamed from: g */
        public final /* synthetic */ Dialog f283296g;

        /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$h$a */
        public class C96702a implements Runnable {
            public C96702a() {
            }

            public void run() {
                C96701h.this.f283296g.dismiss();
                NoteEditorUI noteEditorUI = NoteEditorUI.this;
                C75026b.m89951a(noteEditorUI, noteEditorUI.getString(C0966R.string.euo));
            }
        }

        public C96701h(C72963f4 f4Var, String str, String str2, Dialog dialog) {
            this.f283293d = f4Var;
            this.f283294e = str;
            this.f283295f = str2;
            this.f283296g = dialog;
        }

        public void run() {
            RecordOperationEvent recordOperationEvent = new RecordOperationEvent();
            RecordOperationEvent.C92551a aVar = recordOperationEvent.f265027d;
            aVar.f265029a = 4;
            aVar.f265039k = this.f283293d;
            aVar.f265033e = this.f283294e;
            aVar.f265034f = this.f283295f;
            recordOperationEvent.publish();
            MMHandlerThread.postToMainThread(new C96702a());
        }

        public String toString() {
            return super.toString() + "|onActivityResult";
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$i */
    public class C96703i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Dialog f283299d;

        public C96703i(Dialog dialog) {
            this.f283299d = dialog;
        }

        public void run() {
            this.f283299d.dismiss();
            NoteEditorUI noteEditorUI = NoteEditorUI.this;
            C75026b.m89951a(noteEditorUI, noteEditorUI.getString(C0966R.string.euo));
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$j */
    public class C96704j implements DialogInterface.OnCancelListener {
        public C96704j() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            ProgressDialog progressDialog = NoteEditorUI.this.f283215H;
            if (progressDialog != null) {
                progressDialog.dismiss();
                NoteEditorUI.this.f283215H = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$k */
    public class C96705k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f283302d;

        public C96705k(ArrayList arrayList) {
            this.f283302d = arrayList;
        }

        public void run() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            ArrayList arrayList = new ArrayList();
            int i6 = 0;
            for (int i7 = 0; i7 < this.f283302d.size(); i7++) {
                String str = (String) this.f283302d.get(i7);
                C102590f fVar = new C102590f();
                fVar.f302100q = true;
                fVar.f302099p = 2;
                fVar.f302098o = NoteEditorUI.this.f283238X0.mo126200j();
                fVar.f302070a = C102368h.m135071b(fVar.toString(), 18);
                NoteEditorUI.this.f283217J = new C101834rc0();
                NoteEditorUI.this.f283217J.mo141257m(fVar.f302070a);
                String c = C102368h.m135072c(NoteEditorUI.this.f283217J);
                C101611g<String, Integer> gVar = C98096c.f287564a;
                if (Util.isNullOrNil(c)) {
                    c = C11881t1.m11565c() + "/" + (C90193h.m112878f((str + System.currentTimeMillis()).getBytes()) + "_HD");
                }
                if (!C86013q1.m106450k(c)) {
                    BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str);
                    if (imageOptions == null || (i2 = imageOptions.outWidth) <= 0 || (i3 = imageOptions.outHeight) <= 0) {
                        Log.m105920e("MicroMsg.WNNoteUtil", "GetImageOptions Error");
                        c = null;
                    } else {
                        int i8 = 1280;
                        int i9 = i2 > 1280 ? 1280 : i2;
                        if (i3 <= 1280) {
                            i8 = i3;
                        }
                        if (i3 < i2) {
                            int i15 = i9;
                            i9 = i8;
                            i8 = i15;
                        }
                        if (LongBitmapHandler.isLongPicture(str) > 0) {
                            int i16 = imageOptions.outHeight;
                            i4 = imageOptions.outWidth;
                            i5 = i16;
                        } else {
                            i4 = i9;
                            i5 = i8;
                        }
                        BitmapUtil.createThumbNail(str, i5, i4, Bitmap.CompressFormat.JPEG, 95, c, true);
                    }
                }
                fVar.f302104s = c;
                fVar.f302101r = C98096c.m126708c(c, C102368h.m135074e(NoteEditorUI.this.f283217J));
                arrayList.add(fVar);
            }
            ProgressDialog progressDialog = NoteEditorUI.this.f283215H;
            if (progressDialog == null || !progressDialog.isShowing()) {
                Log.m105924i("MicroMsg.Note.NoteEditorUI", "user canceled");
                return;
            }
            NoteEditorUI noteEditorUI = NoteEditorUI.this;
            C92221d dVar = noteEditorUI.f283238X0;
            C96679b bVar = noteEditorUI.f283252j;
            dVar.getClass();
            WXRTEditText c2 = bVar.mo134905c();
            if (c2 != null) {
                i6 = c2.getPosInDataList();
                i = c2.f283163R0;
            } else {
                i = -1;
            }
            if (!dVar.mo126208r(arrayList, i6, i, c2)) {
                NoteEditorUI noteEditorUI2 = NoteEditorUI.this;
                noteEditorUI2.f283238X0.mo126210t(arrayList, noteEditorUI2.f283252j.mo134905c(), true, true, false, true, false);
            }
            NoteEditorUI.this.mo134937e8(true, 100);
            NoteEditorUI.this.mo134936d8(1, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$l */
    public class C96706l implements DialogInterface.OnCancelListener {
        public C96706l() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            ProgressDialog progressDialog = NoteEditorUI.this.f283215H;
            if (progressDialog != null) {
                progressDialog.dismiss();
                NoteEditorUI.this.f283215H = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$m */
    public class C96707m implements Runnable {
        public C96707m() {
        }

        public void run() {
            NoteEditorUI noteEditorUI = NoteEditorUI.this;
            C76701a.makeText((Context) noteEditorUI, (CharSequence) noteEditorUI.getString(C0966R.string.j6i), 0).show();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$n */
    public class C96708n implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Dialog f283306d;

        public C96708n(Dialog dialog) {
            this.f283306d = dialog;
        }

        public void run() {
            this.f283306d.dismiss();
            NoteEditorUI noteEditorUI = NoteEditorUI.this;
            C75026b.m89951a(noteEditorUI, noteEditorUI.getString(C0966R.string.euo));
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$o */
    public class C96709o implements C96679b.C96683d {
        public C96709o() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$q */
    public class C96710q implements Runnable {
        public C96710q() {
        }

        public void run() {
            WXRTEditText b = NoteEditorUI.this.f283252j.mo134904b();
            if (b != null) {
                b.clearFocus();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$r */
    public class C96711r implements Runnable {
        public C96711r(NoteEditorUI noteEditorUI) {
        }

        public void run() {
            PopupWindow popupWindow = C92400k.m116191h().f264441r;
            boolean z = true;
            C92400k.m116191h().mo126365A(popupWindow != null && popupWindow.isShowing());
            PopupWindow popupWindow2 = C92400k.m116191h().f264444u;
            if (popupWindow2 == null || !popupWindow2.isShowing()) {
                z = false;
            }
            C92400k.m116191h().mo126367C(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$s */
    public class C96712s implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f283310d;

        public C96712s(boolean z) {
            this.f283310d = z;
        }

        public void run() {
            Log.m105925i("MicroMsg.Note.NoteEditorUI", "onUpdateVKBVisibility 2 isVKBShow:%s", Boolean.valueOf(NoteEditorUI.this.f283216I));
            boolean z = this.f283310d;
            if (z) {
                NoteEditorUI noteEditorUI = NoteEditorUI.this;
                if (!noteEditorUI.f283216I) {
                    noteEditorUI.showVKB();
                    return;
                }
            }
            if (!z) {
                NoteEditorUI noteEditorUI2 = NoteEditorUI.this;
                if (noteEditorUI2.f283216I) {
                    noteEditorUI2.hideVKB();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$t */
    public class C96713t implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f283312d;

        public C96713t(int i) {
            this.f283312d = i;
        }

        public void run() {
            ImageButton imageButton = (ImageButton) NoteEditorUI.this.f283261p.findViewById(C0966R.C0970id.lpe);
            View findViewById = NoteEditorUI.this.f283261p.findViewById(C0966R.C0970id.lpf);
            int i = this.f283312d;
            if (i == 0) {
                NoteEditorUI.this.f283220M.setVisibility(8);
                NoteEditorUI noteEditorUI = NoteEditorUI.this;
                if (!noteEditorUI.f283263q.f283365m) {
                    noteEditorUI.f283261p.setVisibility(8);
                } else {
                    noteEditorUI.f283261p.setVisibility(0);
                }
            } else if (i == 1) {
                imageButton.setImageResource(C0966R.raw.note_style_unpress);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$35", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$35", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                NoteEditorUI.this.f283261p.setVisibility(0);
                NoteEditorUI.this.f283220M.setVisibility(8);
            } else if (i == 2) {
                NoteEditorUI.this.f283261p.setVisibility(0);
                NoteEditorUI.this.f283220M.setVisibility(8);
            } else if (i == 3) {
                imageButton.setImageResource(C0966R.raw.note_style_press);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = findViewById;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$35", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$35", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                NoteEditorUI.this.f283261p.setVisibility(0);
                NoteEditorUI.this.f283220M.setVisibility(0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$v */
    public class C96714v implements Runnable {
        public C96714v() {
        }

        public void run() {
            C76879j.m92748s(NoteEditorUI.this.getContext(), NoteEditorUI.this.getString(C0966R.string.ll5), (String) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$z */
    public class C96715z implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f283315d;

        /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$z$a */
        public class C96716a implements Runnable {
            public C96716a() {
            }

            public void run() {
                int i;
                int i2;
                NoteEditorUI noteEditorUI = NoteEditorUI.this;
                C102374m mVar = noteEditorUI.f283240Y0;
                AppCompatActivity context = noteEditorUI.getContext();
                C96715z zVar = C96715z.this;
                Bitmap bitmap = zVar.f283315d;
                boolean z = NoteEditorUI.this.f283239Y;
                mVar.getClass();
                String exportImagePath = AndroidMediaUtil.getExportImagePath("jpg");
                if (bitmap != null) {
                    try {
                        BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.JPEG, exportImagePath, true);
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.WNNoteLongPic", e, "", new Object[0]);
                        Log.m105920e("MicroMsg.WNNoteLongPic", "save image fail, saveBitmapToImage is null");
                        C115669n.INSTANCE.mo160131h(14811, 0, 0, 0, 3, Integer.valueOf(z));
                    }
                } else {
                    Log.m105920e("MicroMsg.WNNoteLongPic", "save image fail, bigBitmap is null");
                    C115669n.INSTANCE.mo160131h(14811, 0, 0, 0, 1, Integer.valueOf(z));
                    exportImagePath = "";
                }
                if (!Util.isNullOrNil(exportImagePath)) {
                    AndroidMediaUtil.refreshMediaScanner(exportImagePath, context);
                }
                C86009m1 m1Var = new C86009m1(exportImagePath);
                if (m1Var.mo119967g()) {
                    long r = m1Var.mo119980r() / 1024;
                    if (bitmap != null) {
                        i2 = bitmap.getWidth();
                        i = bitmap.getHeight();
                        bitmap.recycle();
                    } else {
                        i2 = 0;
                        i = 0;
                    }
                    C49544gd0 gd02 = new C49544gd0();
                    gd02.f133970d = C86013q1.m106456q(exportImagePath);
                    C97625j3.m125815e().mo123460f(new C53142b(0, 2, mVar.f301505a, (LinkedList<C49544gd0>) null, gd02));
                    C115669n.INSTANCE.mo160131h(14811, Integer.valueOf(i2), Integer.valueOf(i), Long.valueOf(r), 0, Integer.valueOf(z ? 1 : 0));
                }
                C76701a.makeText((Context) NoteEditorUI.this.getContext(), (CharSequence) NoteEditorUI.this.getContext().getString(C0966R.string.bwc, new Object[]{AndroidMediaUtil.getToastSysCameraPath()}), 1).show();
            }
        }

        /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$z$b */
        public class C96717b implements Runnable {
            public C96717b() {
            }

            public void run() {
                Log.m105920e("MicroMsg.Note.NoteEditorUI", "save image fail, no sdcard privilege.");
                C115669n.INSTANCE.mo160131h(14811, 0, 0, 0, 1, Integer.valueOf(NoteEditorUI.this.f283239Y ? 1 : 0));
            }
        }

        public C96715z(Bitmap bitmap) {
            this.f283315d = bitmap;
        }

        public void run() {
            ((C98250h) C86312j.m106911c(C98250h.class)).mo137341Iy(NoteEditorUI.this, new C96716a(), new C96717b());
        }
    }

    /* renamed from: K7 */
    public static void m124140K7(NoteEditorUI noteEditorUI, String str) {
        noteEditorUI.getClass();
        Intent intent = new Intent();
        intent.putExtra("Ksnsupload_type", 15);
        intent.putExtra("need_result", true);
        String q = noteEditorUI.f283238X0.mo126207q(noteEditorUI.getString(C0966R.string.lkn));
        intent.putExtra("fav_note_xml", str);
        intent.putExtra("Ksnsupload_title", q);
        intent.putExtra("Ksnsupload_link", C74928u.C30869h.f82898a);
        intent.putExtra("fav_note_link_description", "note description");
        intent.putExtra("Ksnsupload_imgbuf", C86013q1.m106433O(noteEditorUI.f283229T, 0, -1));
        C88144b.m109795m(noteEditorUI, "sns", ".ui.SnsUploadUI", intent, 4354);
        Log.m105925i("MicroMsg.Note.NoteEditorUI", "startSnsActivity() called notelinktitle:%s", q);
    }

    /* renamed from: L7 */
    public static void m124141L7(NoteEditorUI noteEditorUI, C76874e0 e0Var) {
        noteEditorUI.getClass();
        if (noteEditorUI.mo134925T7(C92238l.m115958b().mo126233a())) {
            e0Var.mo107142f(6, noteEditorUI.getString(C0966R.string.lkh));
        } else {
            e0Var.mo107142f(5, noteEditorUI.getString(C0966R.string.lkm));
        }
    }

    /* renamed from: O7 */
    public static void m124142O7() {
        Class cls = C14088e.class;
        Log.m105924i("MicroMsg.Note.NoteEditorUI", "dealExpose()");
        if (((C14088e) C86312j.m106911c(cls)).mo13530uu("wxalited4df4810a40b1d9ddc0cbea44d263fd9")) {
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
            bundle.putString(SearchIntents.EXTRA_QUERY, "{\"scene\":57}");
            bundle.putBundle("extraData", bundle2);
            Log.m105924i("MicroMsg.Note.NoteEditorUI", "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
            ((C14088e) C86312j.m106911c(cls)).mo13510OP(MMApplicationContext.getContext(), bundle, true, true, new C44467a0());
        } else {
            Intent intent = new Intent();
            intent.putExtra("showShare", false);
            intent.putExtra("rawUrl", String.format(C74928u.C45092d.f122306a, new Object[]{57}));
            C88144b.m109791i(MMApplicationContext.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
        C102365e Rd = C102364c.vx0().mo137946Rd();
        if (Rd != null) {
            String a = Rd.f301472i.mo141954a(Rd.mo141945g());
            boolean f = Rd.mo141944f();
            String str = Rd.f301472i.f301479a;
            WeNoteMenuOperationStruct weNoteMenuOperationStruct = new WeNoteMenuOperationStruct();
            weNoteMenuOperationStruct.f266556d = weNoteMenuOperationStruct.mo86045b("sessionID", str, true);
            weNoteMenuOperationStruct.f266557e = weNoteMenuOperationStruct.mo86045b("noteid", a, true);
            weNoteMenuOperationStruct.f266558f = f ? 1 : 0;
            weNoteMenuOperationStruct.f266559g = 7;
            weNoteMenuOperationStruct.mo86054n();
            C97855a.f287023a.mo137182b(weNoteMenuOperationStruct);
        }
    }

    /* renamed from: M7 */
    public final boolean mo134919M7(String str) {
        String a = C98095b.m126704a(Pattern.compile("<object[^>]*>", 2).matcher(str).replaceAll("#WNNoteNode#<ThisisNoteNodeObj>#WNNoteNode#"));
        if (!Util.isNullOrNil(a) && a.length() != 0) {
            a = Pattern.compile("\\s*|\t|\r|\n").matcher(a).replaceAll("");
        }
        return Util.isNullOrNil(a);
    }

    /* renamed from: N7 */
    public final void mo134920N7() {
        int F = this.f283238X0.mo126186F();
        int childCount = this.f283257n.getChildCount();
        if (F == childCount) {
            float f = 0.0f;
            for (int i = childCount - 1; i >= 0; i--) {
                View childAt = this.f283257n.getChildAt(i);
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                float translationY = childAt.getTranslationY();
                if (f <= ((float) childAt.getBottom()) + translationY) {
                    f = ((float) childAt.getBottom()) + translationY;
                }
            }
            if (f < ((float) KeyBoardUtil.getScreenWH(getApplicationContext())[1]) && f > 0.0f) {
                this.f283236W0 = true;
            }
        }
    }

    /* renamed from: P7 */
    public final void mo134921P7() {
        C89779i0 i0Var = this.f283249g1;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f283249g1 = null;
        }
    }

    /* renamed from: Q7 */
    public void mo134922Q7() {
        Log.m105925i("MicroMsg.Note.NoteEditorUI", "finishWNNoteFavitem() called isDeleteAndFinish:%s isNeedSave:%s isEditStatus:%s isUpdateStatus:%s", Boolean.valueOf(this.f283234V0), Boolean.valueOf(this.f283209B), Boolean.valueOf(this.f283274z), Boolean.valueOf(this.f283208A));
        if (!this.f283234V0) {
            this.f283263q.mo134989c(this);
            String o = this.f283238X0.mo126205o();
            if (mo134919M7(o)) {
                FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
                FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
                aVar.f264835a = 12;
                aVar.f264854t = 22;
                aVar.f264839e = this.f283270x;
                favoriteOperationEvent.publish();
            } else if (this.f283209B || this.f283274z) {
                Log.m105925i("MicroMsg.Note.NoteEditorUI", "leave noteeditorui, do savewnnotefavitem %s", Long.valueOf(this.f283270x));
                C96679b bVar = this.f283252j;
                ThreadPool.post(new C96723c(this, o, bVar.f283194j, bVar.f283195k, bVar.f283196l, this.f283238X0.mo126203m(o)), "AddFavNoteSync");
            } else if (this.f283208A) {
                Log.m105925i("MicroMsg.Note.NoteEditorUI", "leave noteeditorui, do updateWNNoteFavitem %s", Long.valueOf(this.f283270x));
                C96679b bVar2 = this.f283252j;
                ThreadPool.post(new C96725d(this, o, bVar2.f283194j, bVar2.f283195k, bVar2.f283196l, this.f283238X0.mo126203m(o)), "AddFavNoteSync");
            }
        }
    }

    /* renamed from: R7 */
    public void mo134923R7(int i) {
        Log.m105925i("MicroMsg.Note.NoteEditorUI", "goback %s, localid:%s, hasDoGoBack:%s isUpdateStatus:%s, isEditStatus:%s", Integer.valueOf(hashCode()), Long.valueOf(this.f283270x), Boolean.valueOf(this.f283245c1), Boolean.valueOf(this.f283208A), Boolean.valueOf(this.f283274z));
        if (i != 1 || !this.f283245c1) {
            if (i == 1) {
                this.f283245c1 = true;
            }
            try {
                if (this.f283233V == 2) {
                    if (this.f283252j.f283198n) {
                        if (!this.f283208A && !this.f283274z) {
                            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
                            FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
                            aVar.f264835a = 19;
                            aVar.f264839e = this.f283270x;
                            aVar.f264847m = -1;
                            favoriteOperationEvent.publish();
                            if (!favoriteOperationEvent.f264834e.f264863i) {
                                mo134941i8();
                                Log.m105924i("MicroMsg.Note.NoteEditorUI", "directly return for nothing changed");
                                Log.m105925i("MicroMsg.Note.NoteEditorUI", "goback %s finally", Integer.valueOf(hashCode()));
                                C97855a.f287023a.mo137181a();
                                if (this.f283224Q0) {
                                    C92400k.m116191h().mo126393t();
                                }
                                C96679b bVar = this.f283252j;
                                if (bVar != null) {
                                    bVar.mo134906d();
                                }
                                this.f283242Z0.mo135020c();
                                C102378p pVar = C102378p.f301520q;
                                if (pVar != null) {
                                    pVar.getClass();
                                    C102378p.f301520q = null;
                                }
                                this.f283238X0.mo126211u();
                                if (C102364c.vx0().mo137946Rd() != null) {
                                    C102364c.vx0().mo137946Rd().mo141952n();
                                }
                                C101994r.f300318d = null;
                                return;
                            }
                            Log.m105924i("MicroMsg.Note.NoteEditorUI", "htmlData is null, try to save favitem");
                            this.f283208A = true;
                            this.f283210C = true;
                        }
                        mo134922Q7();
                        mo134941i8();
                        Log.m105925i("MicroMsg.Note.NoteEditorUI", "goback %s finally", Integer.valueOf(hashCode()));
                        C97855a.f287023a.mo137181a();
                        if (this.f283224Q0) {
                            C92400k.m116191h().mo126393t();
                        }
                        C96679b bVar2 = this.f283252j;
                        if (bVar2 != null) {
                            bVar2.mo134906d();
                        }
                        this.f283242Z0.mo135020c();
                        C102378p pVar2 = C102378p.f301520q;
                        if (pVar2 != null) {
                            pVar2.getClass();
                            C102378p.f301520q = null;
                        }
                        this.f283238X0.mo126211u();
                        if (C102364c.vx0().mo137946Rd() != null) {
                            C102364c.vx0().mo137946Rd().mo141952n();
                        }
                        C101994r.f300318d = null;
                        return;
                    }
                }
                mo134941i8();
            } finally {
                Log.m105925i("MicroMsg.Note.NoteEditorUI", "goback %s finally", Integer.valueOf(hashCode()));
                C97855a.f287023a.mo137181a();
                if (this.f283224Q0) {
                    C92400k.m116191h().mo126393t();
                }
                C96679b bVar3 = this.f283252j;
                if (bVar3 != null) {
                    bVar3.mo134906d();
                }
                this.f283242Z0.mo135020c();
                C102378p pVar3 = C102378p.f301520q;
                if (pVar3 != null) {
                    pVar3.getClass();
                    C102378p.f301520q = null;
                }
                this.f283238X0.mo126211u();
                if (C102364c.vx0().mo137946Rd() != null) {
                    C102364c.vx0().mo137946Rd().mo141952n();
                }
                C101994r.f300318d = null;
            }
        }
    }

    /* renamed from: S7 */
    public void mo134924S7() {
        if (!this.f283274z && !this.f283208A) {
            this.f283211D = this.f283238X0.mo126205o();
            this.f283208A = true;
        }
    }

    /* renamed from: T7 */
    public final boolean mo134925T7(C102602r rVar) {
        if (rVar == null) {
            return false;
        }
        boolean z = rVar.f302105d;
        int i = this.f283233V;
        if (z == (i == 1)) {
            return (i == 1 && rVar.f302107f == this.f283269w) || (i == 2 && rVar.f302106e == this.f283270x);
        }
        return false;
    }

    /* renamed from: U7 */
    public void mo134926U7(boolean z) {
        C102607w wVar;
        boolean z2 = false;
        Log.m105925i("MicroMsg.Note.NoteEditorUI", "notifyNoteDataListFresh,force:%B", Boolean.valueOf(z));
        if (this.f283268v || C102364c.vx0().mo137946Rd() == null) {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(this.f283268v);
            if (C102364c.vx0().mo137946Rd() == null) {
                z2 = true;
            }
            objArr[1] = Boolean.valueOf(z2);
            Log.m105921e("MicroMsg.Note.NoteEditorUI", "notifyNoteDataListFresh,isInitDataList:%B,SubCoreWNNoteMsg.getCore().getWnNoteBase() == null :%B", objArr);
            return;
        }
        if (this.f283233V != 1) {
            Log.m105924i("MicroMsg.Note.NoteEditorUI", "notifyNoteDataListFresh,open from fav");
            if (C102364c.vx0().mo137946Rd().f301468e == null) {
                Log.m105920e("MicroMsg.Note.NoteEditorUI", "notifyNoteDataListFresh,SubCoreWNNoteMsg.getCore().getWnNoteBase().mClickedFavItemInfo == null ");
                return;
            }
            wVar = C102364c.vx0().mo137946Rd().f301469f.get(Long.toString(C102364c.vx0().mo137946Rd().f301468e.field_localId));
        } else {
            Log.m105924i("MicroMsg.Note.NoteEditorUI", "notifyNoteDataListFresh,open from Session");
            if (C102364c.vx0().mo137946Rd().f301467d == null) {
                Log.m105920e("MicroMsg.Note.NoteEditorUI", "notifyNoteDataListFresh,SubCoreWNNoteMsg.getCore().getWnNoteBase().mWNNoteData == null ");
                return;
            }
            wVar = C102364c.vx0().mo137946Rd().f301469f.get(Long.toString(C102364c.vx0().mo137946Rd().f301467d.f302093d));
        }
        if (wVar != null && !this.f283274z) {
            boolean z3 = wVar.f302138c;
            this.f283218K = z3;
            if (!z3) {
                this.f283268v = true;
                mo134939g8(wVar.f302137b, true);
                return;
            }
            mo134939g8(wVar.f302137b, false);
        }
    }

    /* renamed from: V7 */
    public void mo134927V7() {
        int i;
        if (this.f283233V == 2 && this.f283252j.f283198n) {
            C92221d dVar = this.f283238X0;
            synchronized (dVar) {
                if (dVar.f263945a != null) {
                    i = 0;
                    while (true) {
                        if (i >= dVar.f263945a.size()) {
                            break;
                        } else if (dVar.f263945a.get(i).f302071b) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                i = -1;
            }
            C102587c k = this.f283238X0.mo126201k(i);
            if (k != null) {
                k.f302071b = false;
                k.f302077h = false;
                mo134940h2(i, 0);
            }
            this.f283212E.post(new C96710q());
            mo134937e8(false, 0);
            mo134936d8(0, 0);
        }
    }

    /* renamed from: W7 */
    public void mo134928W7(WXRTEditText wXRTEditText, boolean z, int i) {
        if (this.f283233V == 2 && this.f283252j.f283198n) {
            ((NoteLinearLayoutManager) this.f283257n.getLayoutManager()).f283332y = z;
            if (this.f283214G) {
                ((NoteLinearLayoutManager) this.f283257n.getLayoutManager()).f283332y = false;
            }
            if (z) {
                mo134924S7();
                if (wXRTEditText == null || wXRTEditText.getEditTextType() != 1) {
                    this.f283238X0.mo126183C(i, false);
                } else {
                    this.f283238X0.mo126183C(i, true);
                }
            } else {
                this.f283238X0.mo126184D(-1, false, true);
            }
        }
    }

    /* renamed from: X7 */
    public void mo134929X7() {
        C76879j.m92709C(this, getString(C0966R.string.f361130hi2), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.auj), false, new C6635x(), new C6636y(this));
    }

    /* renamed from: Y7 */
    public void mo134930Y7() {
        C97637b bVar;
        try {
            this.f283259o.notifyDataSetChanged();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Note.NoteEditorUI", e, "", new Object[0]);
            Log.m105924i("MicroMsg.Note.NoteEditorUI", "onNotifyDataChanged error");
        }
        if (C85875k4.m106163T() && (bVar = this.f283232U0) != null) {
            int i = C102364c.vx0().mo137946Rd().f301477q;
            String str = C102364c.vx0().mo137946Rd().f301476p;
            String q = this.f283238X0.mo126207q(getString(C0966R.string.lkn));
            bVar.getClass();
            C87412m.m108594g(str, "jsonData");
            C87412m.m108594g(q, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            bVar.f286419v = i;
            bVar.f286420w = str;
            bVar.f286421x = q;
        }
    }

    /* renamed from: Z7 */
    public void mo134931Z7(int i, int i2) {
        try {
            this.f283259o.notifyItemRangeChanged(i, i2);
        } catch (Exception unused) {
            Log.m105921e("MicroMsg.Note.NoteEditorUI", "onNotifyItemRangeChanged error,positionStart:%d,count:%d", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* renamed from: a8 */
    public void mo134932a8() {
        if (this.f283274z || this.f283208A) {
            mo134927V7();
            if (this.f283224Q0) {
                C92400k.m116191h().mo126377c();
            }
            this.f283212E.postDelayed(new C96714v(), 100);
        }
    }

    /* renamed from: b8 */
    public void mo134933b8() {
        C76879j.m92748s(getContext(), getString(C0966R.string.h_n), (String) null);
    }

    /* renamed from: c8 */
    public void mo134934c8() {
        Log.m105925i("MicroMsg.Note.NoteEditorUI", "onOperateWindowDelete %s", Long.valueOf(this.f283270x));
        C102593i iVar = new C102593i();
        iVar.f302126s = "";
        iVar.f302071b = true;
        iVar.f302077h = false;
        iVar.f302072c = 0;
        this.f283238X0.mo126197g(false);
        this.f283238X0.mo126192b(iVar, false);
        mo134930Y7();
        mo134937e8(true, 50);
        mo134936d8(1, 0);
    }

    /* renamed from: d5 */
    public void mo134935d5(int i) {
        try {
            this.f283259o.notifyItemRemoved(i);
        } catch (Exception unused) {
            Log.m105921e("MicroMsg.Note.NoteEditorUI", "onNotifyItemRemoved error,positionStart:%d", Integer.valueOf(i));
        }
    }

    /* renamed from: d8 */
    public void mo134936d8(int i, long j) {
        Log.m105925i("MicroMsg.Note.NoteEditorUI", "onUpdateToolBarVisibility, style:%s, delay:%s", Integer.valueOf(i), Long.valueOf(j));
        if (this.f283233V == 2 && this.f283252j.f283198n) {
            this.f283212E.postDelayed(new C96713t(i), j);
        }
    }

    /* renamed from: e8 */
    public void mo134937e8(boolean z, long j) {
        Log.m105925i("MicroMsg.Note.NoteEditorUI", "onUpdateVKBVisibility setShow:%s, delay:%s", Boolean.valueOf(z), Long.valueOf(j));
        if (this.f283233V == 2 && this.f283252j.f283198n) {
            this.f283212E.postDelayed(new C96712s(z), j);
        }
    }

    /* renamed from: f8 */
    public void mo134938f8(String str, boolean z, boolean z2, int i, String str2, long j, C101801kd0 kd02) {
        Log.m105925i("MicroMsg.Note.NoteEditorUI", "setEditorExportLogic, localId:%s, htmlLength: %s, isInsert:%s, htmlstr:%s", Long.valueOf(this.f283270x), Integer.valueOf(str.length()), Boolean.valueOf(z), str);
        if (!z && str.equals(this.f283211D)) {
            Log.m105924i("MicroMsg.Note.NoteEditorUI", "not insert and same with last html");
            if (!this.f283262p0 && i > 0 && !Util.isNullOrNil(str2) && j > 0) {
                Log.m105924i("MicroMsg.Note.NoteEditorUI", "try repair");
                FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
                FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
                aVar.f264835a = 19;
                aVar.f264847m = -3;
                aVar.f264839e = this.f283270x;
                Intent intent = new Intent();
                intent.putExtra("fav_note_item_status", i);
                intent.putExtra("fav_note_xml", str2);
                intent.putExtra("fav_note_item_updatetime", j);
                favoriteOperationEvent.f264833d.f264841g = intent;
                favoriteOperationEvent.publish();
            }
        } else if (kd02 == null) {
            Log.m105920e("MicroMsg.Note.NoteEditorUI", "protoitem is null,return");
        } else {
            if (z) {
                FavoriteOperationEvent favoriteOperationEvent2 = new FavoriteOperationEvent();
                FavoriteOperationEvent.C92515a aVar2 = favoriteOperationEvent2.f264833d;
                aVar2.f264835a = 19;
                aVar2.f264838d = kd02;
                aVar2.f264836b = str;
                aVar2.f264839e = this.f283270x;
                aVar2.f264837c = "fav_add_new_note";
                favoriteOperationEvent2.publish();
            } else {
                FavoriteOperationEvent favoriteOperationEvent3 = new FavoriteOperationEvent();
                FavoriteOperationEvent.C92515a aVar3 = favoriteOperationEvent3.f264833d;
                aVar3.f264835a = 19;
                aVar3.f264838d = kd02;
                aVar3.f264836b = str;
                aVar3.f264839e = this.f283270x;
                aVar3.f264837c = "";
                if (this.f283210C) {
                    aVar3.f264847m = -2;
                }
                favoriteOperationEvent3.publish();
            }
            Log.m105925i("MicroMsg.Note.NoteEditorUI", "write html to file suc localId:%s", Long.valueOf(this.f283270x));
            int i2 = 20;
            if (!z) {
                while (true) {
                    C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(this.f283270x);
                    if (!C100734q.m131841c0(Yt)) {
                        Thread.sleep(1000);
                        if (!z2) {
                            break;
                        }
                        int i3 = i2 - 1;
                        if (i2 <= 0) {
                            break;
                        }
                        i2 = i3;
                    } else {
                        Log.m105925i("MicroMsg.Note.NoteEditorUI", "hasUploadToServer: update, %s", Integer.valueOf(Yt.field_itemStatus));
                        break;
                    }
                }
            } else {
                while (true) {
                    FavoriteOperationEvent favoriteOperationEvent4 = new FavoriteOperationEvent();
                    FavoriteOperationEvent.C92515a aVar4 = favoriteOperationEvent4.f264833d;
                    aVar4.f264835a = 30;
                    aVar4.f264847m = 6;
                    aVar4.f264839e = this.f283270x;
                    favoriteOperationEvent4.publish();
                    if (favoriteOperationEvent4.f264834e.f264855a == 1) {
                        this.f283274z = false;
                        this.f283209B = false;
                        this.f283208A = true;
                        Log.m105924i("MicroMsg.Note.NoteEditorUI", "hasUploadToServer: insert");
                        break;
                    }
                    try {
                        Thread.sleep(1000);
                        if (!z2) {
                            break;
                        }
                        int i4 = i2 - 1;
                        if (i2 <= 0) {
                            break;
                        }
                        i2 = i4;
                    } catch (InterruptedException unused) {
                    }
                }
            }
            this.f283211D = str;
            Log.m105924i("MicroMsg.Note.NoteEditorUI", "setEditorExportLogic end");
        }
    }

    public void finish() {
        Log.m105925i("MicroMsg.Note.NoteEditorUI", "finish, %s, isFinish:%s", Integer.valueOf(hashCode()), Boolean.valueOf(this.f283256m1));
        this.f283256m1 = true;
        C102166c cVar = this.f283230T0;
        if (cVar != null) {
            cVar.mo149068c0();
        }
        super.finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01a2, code lost:
        com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(new com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96696e(r11, r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ac, code lost:
        if (r11.f283225R > 0) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01b0, code lost:
        if (r11.f283227S == 0) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01b2, code lost:
        r11.f283212E.postDelayed(new com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.C96698f(r11), 100);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01be, code lost:
        r11.f283238X0.mo126200j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01c4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.Note.NoteEditorUI", "notifyNoteDataListFresh,setUpNoteData finish %s", java.lang.Long.valueOf(r11.f283270x));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0196, code lost:
        if (r13 != false) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0198, code lost:
        r12 = r11.f283238X0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x019a, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        r12.f263953i = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x019d, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014c  */
    /* renamed from: g8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo134939g8(java.lang.Object r12, boolean r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.lang.String r0 = "MicroMsg.Note.NoteEditorUI"
            java.lang.String r1 = "notifyNoteDataListFresh,setUpNoteData,canDismissLoadingDialog:%B"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x01c8 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x01c8 }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x01c8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)     // Catch:{ all -> 0x01c8 }
            java.lang.Object r0 = r11.f283219L     // Catch:{ all -> 0x01c8 }
            monitor-enter(r0)     // Catch:{ all -> 0x01c8 }
            bb3.d r1 = r11.f283238X0     // Catch:{ all -> 0x01c5 }
            r1.mo126197g(r5)     // Catch:{ all -> 0x01c5 }
            wa3.l$a r12 = (wa3.C102372l.C102373a) r12     // Catch:{ all -> 0x01c5 }
            java.util.List<xa3.o> r1 = r12.f301503a     // Catch:{ all -> 0x01c5 }
            if (r1 != 0) goto L_0x0024
            monitor-exit(r0)     // Catch:{ all -> 0x01c5 }
            monitor-exit(r11)
            return
        L_0x0024:
            java.lang.String r3 = "MicroMsg.Note.NoteEditorUI"
            java.lang.String r4 = "notifyNoteDataListFresh,setUpNoteData start %s"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x01c5 }
            r6[r5] = r12     // Catch:{ all -> 0x01c5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r6)     // Catch:{ all -> 0x01c5 }
            int r3 = r11.f283233V     // Catch:{ all -> 0x01c5 }
            r4 = 2
            if (r3 != r4) goto L_0x0058
            boolean r3 = r11.f283239Y     // Catch:{ all -> 0x01c5 }
            if (r3 != 0) goto L_0x0058
            i00.b r3 = wa3.C102364c.vx0()     // Catch:{ all -> 0x01c5 }
            wa3.e r3 = r3.mo137946Rd()     // Catch:{ all -> 0x01c5 }
            xa3.m r3 = r3.f301467d     // Catch:{ all -> 0x01c5 }
            if (r3 != 0) goto L_0x0048
            monitor-exit(r0)     // Catch:{ all -> 0x01c5 }
            monitor-exit(r11)
            return
        L_0x0048:
            xa3.e r4 = new xa3.e     // Catch:{ all -> 0x01c5 }
            long r6 = r3.f302094e     // Catch:{ all -> 0x01c5 }
            r4.<init>(r6)     // Catch:{ all -> 0x01c5 }
            r4.f302071b = r5     // Catch:{ all -> 0x01c5 }
            r4.f302077h = r5     // Catch:{ all -> 0x01c5 }
            bb3.d r3 = r11.f283238X0     // Catch:{ all -> 0x01c5 }
            r3.mo126192b(r4, r5)     // Catch:{ all -> 0x01c5 }
        L_0x0058:
            r3 = 20
            if (r13 == 0) goto L_0x00ac
            r4 = 0
        L_0x005d:
            int r6 = r1.size()     // Catch:{ all -> 0x01c5 }
            if (r4 >= r6) goto L_0x00ac
            java.lang.Object r6 = r1.get(r4)     // Catch:{ all -> 0x01c5 }
            xa3.o r6 = (xa3.C102599o) r6     // Catch:{ all -> 0x01c5 }
            int r7 = r6.mo142212c()     // Catch:{ all -> 0x01c5 }
            if (r7 != r3) goto L_0x00a9
            xa3.b r6 = (xa3.C102586b) r6     // Catch:{ all -> 0x01c5 }
            boolean r7 = r11.f283239Y     // Catch:{ all -> 0x01c5 }
            if (r7 == 0) goto L_0x0079
            boolean r7 = r6.f302069A     // Catch:{ all -> 0x01c5 }
            if (r7 != 0) goto L_0x00a9
        L_0x0079:
            xa3.i r7 = new xa3.i     // Catch:{ all -> 0x01c5 }
            r7.<init>()     // Catch:{ all -> 0x01c5 }
            java.lang.String r8 = r6.f302098o     // Catch:{ all -> 0x01c5 }
            r7.f302098o = r8     // Catch:{ all -> 0x01c5 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c5 }
            r8.<init>()     // Catch:{ all -> 0x01c5 }
            r9 = 2131821732(0x7f1104a4, float:1.9276215E38)
            java.lang.String r9 = r11.getString(r9)     // Catch:{ all -> 0x01c5 }
            r8.append(r9)     // Catch:{ all -> 0x01c5 }
            java.lang.String r9 = " "
            r8.append(r9)     // Catch:{ all -> 0x01c5 }
            java.lang.String r6 = r6.f302133v     // Catch:{ all -> 0x01c5 }
            r8.append(r6)     // Catch:{ all -> 0x01c5 }
            java.lang.String r6 = "\n"
            r8.append(r6)     // Catch:{ all -> 0x01c5 }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x01c5 }
            r7.f302126s = r6     // Catch:{ all -> 0x01c5 }
            r1.set(r4, r7)     // Catch:{ all -> 0x01c5 }
        L_0x00a9:
            int r4 = r4 + 1
            goto L_0x005d
        L_0x00ac:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x01c5 }
        L_0x00b0:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x01c5 }
            if (r4 == 0) goto L_0x017a
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x01c5 }
            xa3.o r4 = (xa3.C102599o) r4     // Catch:{ all -> 0x01c5 }
            int r6 = r4.f302099p     // Catch:{ all -> 0x01c5 }
            r7 = -3
            if (r6 == r7) goto L_0x00b0
            r7 = -2
            if (r6 == r7) goto L_0x00b0
            r7 = -1
            if (r6 == r7) goto L_0x0171
            if (r6 == r3) goto L_0x0160
            switch(r6) {
                case 1: goto L_0x00f4;
                case 2: goto L_0x00ec;
                case 3: goto L_0x00e4;
                case 4: goto L_0x00dc;
                case 5: goto L_0x0168;
                case 6: goto L_0x00d4;
                default: goto L_0x00cc;
            }     // Catch:{ all -> 0x01c5 }
        L_0x00cc:
            xa3.j r4 = (xa3.C102594j) r4     // Catch:{ all -> 0x01c5 }
            bb3.d r6 = r11.f283238X0     // Catch:{ all -> 0x01c5 }
            r6.mo126192b(r4, r5)     // Catch:{ all -> 0x01c5 }
            goto L_0x00b0
        L_0x00d4:
            xa3.k r4 = (xa3.C102595k) r4     // Catch:{ all -> 0x01c5 }
            bb3.d r6 = r11.f283238X0     // Catch:{ all -> 0x01c5 }
            r6.mo126192b(r4, r5)     // Catch:{ all -> 0x01c5 }
            goto L_0x00b0
        L_0x00dc:
            xa3.l r4 = (xa3.C102596l) r4     // Catch:{ all -> 0x01c5 }
            bb3.d r6 = r11.f283238X0     // Catch:{ all -> 0x01c5 }
            r6.mo126192b(r4, r5)     // Catch:{ all -> 0x01c5 }
            goto L_0x00b0
        L_0x00e4:
            xa3.g r4 = (xa3.C102591g) r4     // Catch:{ all -> 0x01c5 }
            bb3.d r6 = r11.f283238X0     // Catch:{ all -> 0x01c5 }
            r6.mo126192b(r4, r5)     // Catch:{ all -> 0x01c5 }
            goto L_0x00b0
        L_0x00ec:
            xa3.f r4 = (xa3.C102590f) r4     // Catch:{ all -> 0x01c5 }
            bb3.d r6 = r11.f283238X0     // Catch:{ all -> 0x01c5 }
            r6.mo126192b(r4, r5)     // Catch:{ all -> 0x01c5 }
            goto L_0x00b0
        L_0x00f4:
            xa3.i r4 = (xa3.C102593i) r4     // Catch:{ all -> 0x01c5 }
            java.lang.String r6 = r4.f302126s     // Catch:{ all -> 0x01c5 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ all -> 0x01c5 }
            if (r6 == 0) goto L_0x0102
            java.lang.String r6 = ""
            r4.f302126s = r6     // Catch:{ all -> 0x01c5 }
        L_0x0102:
            java.lang.String r6 = r4.f302126s     // Catch:{ all -> 0x01c5 }
            java.lang.String r6 = bb3.C92220c.m115910a(r6)     // Catch:{ all -> 0x01c5 }
            r4.f302126s = r6     // Catch:{ all -> 0x01c5 }
            int r6 = r6.length()     // Catch:{ all -> 0x01c5 }
            r7 = 100
            if (r6 <= r7) goto L_0x0118
            java.lang.String r6 = r4.f302126s     // Catch:{ all -> 0x01c5 }
            za3.C102988a.m136184a(r6)     // Catch:{ all -> 0x01c5 }
            goto L_0x0159
        L_0x0118:
            java.lang.String r6 = r4.f302126s     // Catch:{ all -> 0x01c5 }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ all -> 0x01c5 }
            r8 = 5
            if (r7 != 0) goto L_0x0149
            int r7 = r6.length()     // Catch:{ all -> 0x01c5 }
            if (r7 >= r8) goto L_0x0128
            goto L_0x0149
        L_0x0128:
            r7 = 0
        L_0x0129:
            int r9 = r6.length()     // Catch:{ all -> 0x01c5 }
            if (r7 >= r9) goto L_0x0147
            int r9 = r7 + 5
            int r10 = r6.length()     // Catch:{ all -> 0x01c5 }
            if (r9 <= r10) goto L_0x0138
            goto L_0x0149
        L_0x0138:
            java.lang.String r7 = r6.substring(r7, r9)     // Catch:{ all -> 0x01c5 }
            java.lang.String r10 = "<br/>"
            boolean r7 = r10.equalsIgnoreCase(r7)     // Catch:{ all -> 0x01c5 }
            if (r7 != 0) goto L_0x0145
            goto L_0x0149
        L_0x0145:
            r7 = r9
            goto L_0x0129
        L_0x0147:
            r6 = 1
            goto L_0x014a
        L_0x0149:
            r6 = 0
        L_0x014a:
            if (r6 == 0) goto L_0x0159
            java.lang.String r6 = r4.f302126s     // Catch:{ all -> 0x01c5 }
            int r7 = r6.length()     // Catch:{ all -> 0x01c5 }
            int r7 = r7 - r8
            java.lang.String r6 = r6.substring(r5, r7)     // Catch:{ all -> 0x01c5 }
            r4.f302126s = r6     // Catch:{ all -> 0x01c5 }
        L_0x0159:
            bb3.d r6 = r11.f283238X0     // Catch:{ all -> 0x01c5 }
            r6.mo126192b(r4, r5)     // Catch:{ all -> 0x01c5 }
            goto L_0x00b0
        L_0x0160:
            r6 = r4
            xa3.b r6 = (xa3.C102586b) r6     // Catch:{ all -> 0x01c5 }
            bb3.d r7 = r11.f283238X0     // Catch:{ all -> 0x01c5 }
            r7.mo126192b(r6, r5)     // Catch:{ all -> 0x01c5 }
        L_0x0168:
            xa3.d r4 = (xa3.C102588d) r4     // Catch:{ all -> 0x01c5 }
            bb3.d r6 = r11.f283238X0     // Catch:{ all -> 0x01c5 }
            r6.mo126192b(r4, r5)     // Catch:{ all -> 0x01c5 }
            goto L_0x00b0
        L_0x0171:
            xa3.h r4 = (xa3.C102592h) r4     // Catch:{ all -> 0x01c5 }
            bb3.d r6 = r11.f283238X0     // Catch:{ all -> 0x01c5 }
            r6.mo126192b(r4, r5)     // Catch:{ all -> 0x01c5 }
            goto L_0x00b0
        L_0x017a:
            boolean r12 = r12.f301504b     // Catch:{ all -> 0x01c5 }
            if (r12 == 0) goto L_0x0183
            bb3.d r12 = r11.f283238X0     // Catch:{ all -> 0x01c5 }
            r12.mo126187G()     // Catch:{ all -> 0x01c5 }
        L_0x0183:
            monitor-exit(r0)     // Catch:{ all -> 0x01c5 }
            java.lang.String r12 = "MicroMsg.Note.NoteEditorUI"
            java.lang.String r0 = "notifyNoteDataListFresh,setUpNoteData finish %s"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x01c8 }
            long r3 = r11.f283270x     // Catch:{ all -> 0x01c8 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x01c8 }
            r1[r5] = r3     // Catch:{ all -> 0x01c8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r1)     // Catch:{ all -> 0x01c8 }
            if (r13 != 0) goto L_0x01a2
            bb3.d r12 = r11.f283238X0     // Catch:{ all -> 0x01c8 }
            monitor-enter(r12)     // Catch:{ all -> 0x01c8 }
            r12.f263953i = r2     // Catch:{ all -> 0x019f }
            monitor-exit(r12)     // Catch:{ all -> 0x019f }
            goto L_0x01a2
        L_0x019f:
            r13 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x019f }
            throw r13     // Catch:{ all -> 0x01c8 }
        L_0x01a2:
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$e r12 = new com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$e     // Catch:{ all -> 0x01c8 }
            r12.<init>(r13)     // Catch:{ all -> 0x01c8 }
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r12)     // Catch:{ all -> 0x01c8 }
            int r12 = r11.f283225R     // Catch:{ all -> 0x01c8 }
            if (r12 > 0) goto L_0x01b2
            int r12 = r11.f283227S     // Catch:{ all -> 0x01c8 }
            if (r12 == 0) goto L_0x01be
        L_0x01b2:
            com.tencent.mm.sdk.platformtools.MMHandler r12 = r11.f283212E     // Catch:{ all -> 0x01c8 }
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$f r13 = new com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$f     // Catch:{ all -> 0x01c8 }
            r13.<init>()     // Catch:{ all -> 0x01c8 }
            r0 = 100
            r12.postDelayed(r13, r0)     // Catch:{ all -> 0x01c8 }
        L_0x01be:
            bb3.d r12 = r11.f283238X0     // Catch:{ all -> 0x01c8 }
            r12.mo126200j()     // Catch:{ all -> 0x01c8 }
            monitor-exit(r11)
            return
        L_0x01c5:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01c5 }
            throw r12     // Catch:{ all -> 0x01c8 }
        L_0x01c8:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.mo134939g8(java.lang.Object, boolean):void");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bl_;
    }

    /* renamed from: h2 */
    public void mo134940h2(int i, long j) {
        Handler handler = getWindow().getDecorView().getHandler();
        if (handler != null) {
            handler.postDelayed(new C96691d(i), j);
        }
    }

    /* renamed from: i8 */
    public final void mo134941i8() {
        C102166c cVar = this.f283230T0;
        if (cVar != null) {
            cVar.mo67998q0(this.f283238X0.mo126207q(getString(C0966R.string.lkn)));
        }
    }

    /* renamed from: n4 */
    public void mo134942n4(int i, int i2) {
        try {
            this.f283259o.notifyItemRangeInserted(i, i2);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Note.NoteEditorUI", e, "", new Object[0]);
            Log.m105921e("MicroMsg.Note.NoteEditorUI", "onNotifyitemRangeInsert error,positionStart:%d,count:%d", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x02ab, code lost:
        r9 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r27, int r28, android.content.Intent r29) {
        /*
            r26 = this;
            r6 = r26
            r0 = r27
            r1 = r29
            java.lang.Class<pb1.j1> r2 = pb1.C100718j1.class
            super.onActivityResult(r27, r28, r29)
            java.lang.String r3 = "MicroMsg.Note.NoteEditorUI"
            r7 = 0
            r8 = 1
            if (r0 != r8) goto L_0x0046
            if (r1 == 0) goto L_0x0046
            java.lang.String r4 = "KEY_VIEW_PIC_CNT"
            int r4 = r1.getIntExtra(r4, r7)
            i00.b r5 = wa3.C102364c.vx0()
            wa3.e r5 = r5.mo137946Rd()
            if (r5 == 0) goto L_0x0038
            i00.b r5 = wa3.C102364c.vx0()
            wa3.e r5 = r5.mo137946Rd()
            wa3.f r5 = r5.f301472i
            if (r4 >= 0) goto L_0x0033
            r5.getClass()
            goto L_0x0038
        L_0x0033:
            int r9 = r5.f301481c
            int r9 = r9 + r4
            r5.f301481c = r9
        L_0x0038:
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r7] = r4
            java.lang.String r4 = "onActivityResult picViewCnt:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r5)
        L_0x0046:
            r9 = 2
            java.lang.Object[] r4 = new java.lang.Object[r9]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r27)
            r4[r7] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r28)
            r4[r8] = r5
            java.lang.String r5 = "onActivityResult reqCode: %d, retCod: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r4)
            r6.f283251i1 = r0
            r4 = -1
            r5 = r28
            if (r5 == r4) goto L_0x0065
            r6.f283250h1 = r7
            return
        L_0x0065:
            r6.f283250h1 = r8
            di3.d r4 = di3.C86312j.m106911c(r2)
            pb1.j1 r4 = (pb1.C100718j1) r4
            long r4 = r4.mo128210aN(r8)
            di3.d r2 = di3.C86312j.m106911c(r2)
            pb1.j1 r2 = (pb1.C100718j1) r2
            int r10 = r2.mo128211cX(r8)
            r2 = 4101(0x1005, float:5.747E-42)
            java.lang.String r12 = "want to send record msg, but toUser is null"
            java.lang.String r14 = "custom_send_text"
            java.lang.String r9 = "Select_Conv_User"
            if (r0 == r2) goto L_0x05b2
            r2 = 30764(0x782c, float:4.311E-41)
            java.lang.String r13 = ""
            if (r0 == r2) goto L_0x0577
            r2 = 4354(0x1102, float:6.101E-42)
            if (r0 == r2) goto L_0x056b
            r2 = 4355(0x1103, float:6.103E-42)
            if (r0 == r2) goto L_0x0501
            java.lang.String r15 = "sessionID"
            java.lang.String r2 = "noteid"
            switch(r0) {
                case 4096: goto L_0x0498;
                case 4097: goto L_0x02ae;
                case 4098: goto L_0x01aa;
                case 4099: goto L_0x009f;
                default: goto L_0x009d;
            }
        L_0x009d:
            goto L_0x0609
        L_0x009f:
            i00.b r0 = wa3.C102364c.vx0()
            wa3.e r0 = r0.mo137946Rd()
            r3 = 5
            if (r0 != 0) goto L_0x00ab
            goto L_0x00df
        L_0x00ab:
            wa3.f r9 = r0.f301472i
            java.lang.String r12 = r0.mo141945g()
            java.lang.String r9 = r9.mo141954a(r12)
            boolean r12 = r0.mo141944f()
            wa3.f r0 = r0.f301472i
            java.lang.String r0 = r0.f301479a
            com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct r13 = new com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct
            r13.<init>()
            r27 = r12
            long r11 = (long) r3
            r13.f265562d = r11
            java.lang.String r2 = r13.mo86045b(r2, r9, r8)
            r13.f265564f = r2
            r2 = r27
            r13.f265565g = r2
            java.lang.String r0 = r13.mo86045b(r15, r0, r8)
            r13.f265563e = r0
            r13.mo86054n()
            fb3.a r0 = fb3.C97855a.f287023a
            r0.mo137182b(r13)
        L_0x00df:
            java.lang.String r0 = "choosed_file_path"
            java.lang.String r0 = r1.getStringExtra(r0)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00eb:
            r9 = 1
            goto L_0x060a
        L_0x00ee:
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            r1.<init>((java.lang.String) r0)
            boolean r2 = r1.mo119967g()
            if (r2 != 0) goto L_0x00fa
            goto L_0x00eb
        L_0x00fa:
            long r11 = r1.mo119980r()
            int r2 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x0105
            r9 = 3
            goto L_0x060a
        L_0x0105:
            bb3.d r2 = r6.f283238X0
            boolean r2 = r2.mo126195e(r7, r8)
            if (r2 == 0) goto L_0x0112
            r26.mo134932a8()
            goto L_0x0609
        L_0x0112:
            android.app.ProgressDialog r2 = r6.f283215H
            if (r2 == 0) goto L_0x011c
            r2.dismiss()
            r2 = 0
            r6.f283215H = r2
        L_0x011c:
            androidx.appcompat.app.AppCompatActivity r19 = r26.getContext()
            r2 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r20 = r6.getString(r2)
            r2 = 2131821739(0x7f1104ab, float:1.927623E38)
            java.lang.String r21 = r6.getString(r2)
            r22 = 1
            r23 = 1
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$l r2 = new com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$l
            r2.<init>()
            r24 = r2
            qo3.i0 r2 = nj3.C76879j.m92723Q(r19, r20, r21, r22, r23, r24)
            r6.f283215H = r2
            xa3.d r2 = new xa3.d
            r2.<init>()
            java.lang.String r4 = r1.getName()
            r2.f302127s = r4
            long r4 = r1.mo119980r()
            float r1 = (float) r4
            java.lang.String r1 = wa3.C102368h.m135073d(r1)
            r2.f302128t = r1
            bb3.d r1 = r6.f283238X0
            java.lang.String r1 = r1.mo126200j()
            r2.f302098o = r1
            r2.f302099p = r3
            r2.f302100q = r8
            java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106454o(r0)
            r2.f302129u = r1
            java.lang.String r1 = r2.toString()
            r3 = 18
            java.lang.String r1 = wa3.C102368h.m135071b(r1, r3)
            r2.f302070a = r1
            te3.rc0 r1 = new te3.rc0
            r1.<init>()
            r6.f283217J = r1
            java.lang.String r3 = r2.f302070a
            r1.mo141257m(r3)
            te3.rc0 r1 = r6.f283217J
            java.lang.String r3 = r2.f302129u
            r1.mo141261q(r3)
            te3.rc0 r1 = r6.f283217J
            java.lang.String r1 = wa3.C102368h.m135072c(r1)
            r2.f302101r = r1
            com.tencent.p014mm.vfs.C86013q1.m106442c(r0, r1)
            bb3.d r0 = r6.f283238X0
            com.tencent.mm.plugin.wenote.model.nativenote.manager.b r1 = r6.f283252j
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r19 = r1.mo134905c()
            r20 = 1
            r21 = 1
            r22 = 0
            r24 = 0
            r17 = r0
            r18 = r2
            r17.mo126209s(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0609
        L_0x01aa:
            r0 = 4
            i00.b r3 = wa3.C102364c.vx0()
            wa3.e r3 = r3.mo137946Rd()
            if (r3 != 0) goto L_0x01b6
            goto L_0x01e6
        L_0x01b6:
            wa3.f r4 = r3.f301472i
            java.lang.String r5 = r3.mo141945g()
            java.lang.String r4 = r4.mo141954a(r5)
            boolean r5 = r3.mo141944f()
            wa3.f r3 = r3.f301472i
            java.lang.String r3 = r3.f301479a
            com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct r9 = new com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct
            r9.<init>()
            long r11 = (long) r0
            r9.f265562d = r11
            java.lang.String r0 = r9.mo86045b(r2, r4, r8)
            r9.f265564f = r0
            r9.f265565g = r5
            java.lang.String r0 = r9.mo86045b(r15, r3, r8)
            r9.f265563e = r0
            r9.mo86054n()
            fb3.a r0 = fb3.C97855a.f287023a
            r0.mo137182b(r9)
        L_0x01e6:
            bb3.d r0 = r6.f283238X0
            boolean r0 = r0.mo126195e(r7, r8)
            if (r0 == 0) goto L_0x01f3
            r26.mo134932a8()
            goto L_0x02ab
        L_0x01f3:
            xa3.g r0 = new xa3.g
            r0.<init>()
            java.lang.String r2 = "kwebmap_slat"
            r3 = 0
            double r11 = r1.getDoubleExtra(r2, r3)
            float r2 = (float) r11
            double r11 = (double) r2
            r0.f302119t = r11
            java.lang.String r2 = "kwebmap_lng"
            double r2 = r1.getDoubleExtra(r2, r3)
            float r2 = (float) r2
            double r2 = (double) r2
            r0.f302120u = r2
            java.lang.String r2 = "kwebmap_scale"
            int r2 = r1.getIntExtra(r2, r7)
            double r2 = (double) r2
            r0.f302121v = r2
            java.lang.String r2 = "Kwebmap_locaion"
            java.lang.String r2 = r1.getStringExtra(r2)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r13)
            r0.f302122w = r2
            java.lang.String r2 = "kPoiName"
            java.lang.String r2 = r1.getStringExtra(r2)
            r0.f302118s = r2
            bb3.d r2 = r6.f283238X0
            java.lang.String r2 = r2.mo126200j()
            r0.f302098o = r2
            r2 = 3
            r0.f302099p = r2
            r0.f302100q = r8
            r0.f302101r = r13
            java.lang.String r2 = "kPoiid"
            java.lang.String r2 = r1.getStringExtra(r2)
            r0.f302123x = r2
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0256
            java.lang.String r2 = "kNearByPoiid"
            java.lang.String r2 = r1.getStringExtra(r2)
            r0.f302123x = r2
        L_0x0256:
            java.lang.String r2 = "KIsFromPoiList"
            boolean r2 = r1.getBooleanExtra(r2, r7)
            r0.f302124y = r2
            java.lang.String r2 = "KPoiCategoryTips"
            java.lang.String r2 = r1.getStringExtra(r2)
            r0.f302125z = r2
            java.lang.String r2 = "kPoiBusinessHour"
            java.lang.String r2 = r1.getStringExtra(r2)
            r0.f302113A = r2
            java.lang.String r2 = "KPoiPhone"
            java.lang.String r2 = r1.getStringExtra(r2)
            r0.f302114B = r2
            r2 = 0
            java.lang.String r3 = "KPoiPriceTips"
            float r2 = r1.getFloatExtra(r3, r2)
            r0.f302115C = r2
            java.lang.String r2 = "kBuildingID"
            java.lang.String r2 = r1.getStringExtra(r2)
            r0.f302116D = r2
            java.lang.String r2 = "kFloorName"
            java.lang.String r1 = r1.getStringExtra(r2)
            r0.f302117E = r1
            bb3.d r1 = r6.f283238X0
            com.tencent.mm.plugin.wenote.model.nativenote.manager.b r2 = r6.f283252j
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r19 = r2.mo134905c()
            r20 = 1
            r21 = 1
            r22 = 0
            r23 = 0
            r24 = 0
            r17 = r1
            r18 = r0
            r17.mo126209s(r18, r19, r20, r21, r22, r23, r24)
        L_0x02ab:
            r9 = 0
            goto L_0x060a
        L_0x02ae:
            java.lang.String r0 = "onActivityResult back from gallery"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            java.lang.String r0 = "key_req_result"
            android.os.Parcelable r0 = r1.getParcelableExtra(r0)
            if (r0 != 0) goto L_0x02bf
            r9 = 2
            goto L_0x02c0
        L_0x02bf:
            r9 = 1
        L_0x02c0:
            java.lang.String r0 = "CropImage_OutputPath_List"
            java.util.ArrayList r0 = r1.getStringArrayListExtra(r0)
            if (r0 == 0) goto L_0x034d
            int r4 = r0.size()
            if (r4 <= 0) goto L_0x034d
            i00.b r4 = wa3.C102364c.vx0()
            wa3.e r4 = r4.mo137946Rd()
            if (r4 != 0) goto L_0x02db
            r19 = r13
            goto L_0x030d
        L_0x02db:
            wa3.f r5 = r4.f301472i
            java.lang.String r11 = r4.mo141945g()
            java.lang.String r5 = r5.mo141954a(r11)
            boolean r11 = r4.mo141944f()
            wa3.f r4 = r4.f301472i
            java.lang.String r4 = r4.f301479a
            com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct r12 = new com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct
            r12.<init>()
            r19 = r13
            long r13 = (long) r9
            r12.f265562d = r13
            java.lang.String r5 = r12.mo86045b(r2, r5, r8)
            r12.f265564f = r5
            r12.f265565g = r11
            java.lang.String r4 = r12.mo86045b(r15, r4, r8)
            r12.f265563e = r4
            r12.mo86054n()
            fb3.a r4 = fb3.C97855a.f287023a
            r4.mo137182b(r12)
        L_0x030d:
            bb3.d r4 = r6.f283238X0
            int r5 = r0.size()
            boolean r4 = r4.mo126195e(r7, r5)
            if (r4 == 0) goto L_0x031d
            r26.mo134932a8()
            goto L_0x02ab
        L_0x031d:
            androidx.appcompat.app.AppCompatActivity r20 = r26.getContext()
            r4 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r21 = r6.getString(r4)
            r4 = 2131821739(0x7f1104ab, float:1.927623E38)
            java.lang.String r22 = r6.getString(r4)
            r23 = 1
            r24 = 1
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$j r4 = new com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$j
            r4.<init>()
            r25 = r4
            qo3.i0 r4 = nj3.C76879j.m92723Q(r20, r21, r22, r23, r24, r25)
            r6.f283215H = r4
            com.tencent.mm.sdk.platformtools.MMHandlerThread r4 = f40.C86709a0.m107525e()
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$k r5 = new com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$k
            r5.<init>(r0)
            r4.postToWorker(r5)
            goto L_0x0355
        L_0x034d:
            r19 = r13
            java.lang.String r0 = "no pic selected"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
        L_0x0355:
            java.lang.String r0 = "key_select_video_list"
            java.util.ArrayList r0 = r1.getStringArrayListExtra(r0)
            java.lang.String r4 = "K_SEGMENTVIDEOPATH"
            java.lang.String r1 = r1.getStringExtra(r4)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r4 != 0) goto L_0x0372
            if (r0 != 0) goto L_0x0372
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
        L_0x0372:
            if (r0 == 0) goto L_0x0490
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x0490
            i00.b r1 = wa3.C102364c.vx0()
            wa3.e r1 = r1.mo137946Rd()
            if (r1 != 0) goto L_0x0385
            goto L_0x03b5
        L_0x0385:
            wa3.f r4 = r1.f301472i
            java.lang.String r5 = r1.mo141945g()
            java.lang.String r4 = r4.mo141954a(r5)
            boolean r5 = r1.mo141944f()
            wa3.f r1 = r1.f301472i
            java.lang.String r1 = r1.f301479a
            com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct r11 = new com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct
            r11.<init>()
            long r12 = (long) r9
            r11.f265562d = r12
            java.lang.String r2 = r11.mo86045b(r2, r4, r8)
            r11.f265564f = r2
            r11.f265565g = r5
            java.lang.String r1 = r11.mo86045b(r15, r1, r8)
            r11.f265563e = r1
            r11.mo86054n()
            fb3.a r1 = fb3.C97855a.f287023a
            r1.mo137182b(r11)
        L_0x03b5:
            bb3.d r1 = r6.f283238X0
            int r2 = r0.size()
            boolean r1 = r1.mo126195e(r7, r2)
            if (r1 == 0) goto L_0x03c6
            r26.mo134932a8()
            goto L_0x02ab
        L_0x03c6:
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class<dy.f> r1 = p500dy.C97560f.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            dy.f r1 = (p500dy.C97560f) r1
            com.tencent.mm.plugin.sight.base.a r1 = r1.Z40(r0)
            if (r1 != 0) goto L_0x03ea
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r1[r7] = r0
            java.lang.String r0 = "mediaInfo is null, videoPath is %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r1)
            goto L_0x02ab
        L_0x03ea:
            int r1 = r1.mo130041a()
            xa3.k r2 = new xa3.k
            r2.<init>()
            r2.f302100q = r8
            r4 = r19
            r2.f302084s = r4
            r2.f302101r = r4
            r2.f302085t = r1
            r1 = 6
            r2.f302099p = r1
            bb3.d r1 = r6.f283238X0
            java.lang.String r1 = r1.mo126200j()
            r2.f302098o = r1
            java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106454o(r0)
            r2.f302086u = r1
            java.lang.String r1 = r2.toString()
            r4 = 18
            java.lang.String r1 = wa3.C102368h.m135071b(r1, r4)
            r2.f302070a = r1
            te3.rc0 r1 = new te3.rc0
            r1.<init>()
            r6.f283217J = r1
            java.lang.String r4 = r2.f302070a
            r1.mo141257m(r4)
            te3.rc0 r1 = r6.f283217J
            java.lang.String r4 = r2.f302086u
            r1.mo141261q(r4)
            te3.rc0 r1 = r6.f283217J
            java.lang.String r13 = wa3.C102368h.m135074e(r1)
            te3.rc0 r1 = r6.f283217J
            java.lang.String r14 = wa3.C102368h.m135072c(r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x0488
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r7] = r0
            java.lang.String r4 = "compressNoteVideo path: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r3, r4, r1)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r12.add(r0)
            bb3.g r0 = new bb3.g
            com.tencent.mm.plugin.wenote.ui.nativenote.f r1 = new com.tencent.mm.plugin.wenote.ui.nativenote.f
            r1.<init>(r6)
            r11 = r0
            r15 = r2
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            androidx.appcompat.app.AppCompatActivity r19 = r26.getContext()
            r1 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r20 = r6.getString(r1)
            r1 = 2131821739(0x7f1104ab, float:1.927623E38)
            java.lang.String r21 = r6.getString(r1)
            r22 = 1
            r23 = 1
            com.tencent.mm.plugin.wenote.ui.nativenote.g r1 = new com.tencent.mm.plugin.wenote.ui.nativenote.g
            r1.<init>(r6, r0, r2)
            r24 = r1
            qo3.i0 r1 = nj3.C76879j.m92723Q(r19, r20, r21, r22, r23, r24)
            r6.f283215H = r1
            java.lang.String r1 = "NoteEditor_importVideo"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r0, r1)
            goto L_0x02ab
        L_0x0488:
            java.lang.String r0 = "video is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            goto L_0x02ab
        L_0x0490:
            java.lang.String r0 = "no video selected"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x02ab
        L_0x0498:
            r2 = 0
            if (r1 != 0) goto L_0x049d
            r4 = r2
            goto L_0x04a2
        L_0x049d:
            java.lang.String r0 = r1.getStringExtra(r9)
            r4 = r0
        L_0x04a2:
            if (r1 != 0) goto L_0x04a6
            r5 = r2
            goto L_0x04ab
        L_0x04a6:
            java.lang.String r0 = r1.getStringExtra(r14)
            r5 = r0
        L_0x04ab:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r0 == 0) goto L_0x04b5
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r12)
            return
        L_0x04b5:
            eb0.c r0 = eb0.C97625j3.m125812b()
            g62.l r0 = r0.mo105911z()
            long r1 = r6.f283269w
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            com.tencent.mm.storage.f4 r2 = r0.b00(r1)
            long r0 = r2.getMsgId()
            long r11 = r6.f283269w
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x04d6
            java.lang.String r0 = "want to send record msg, but message info is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            return
        L_0x04d6:
            androidx.appcompat.app.AppCompatActivity r17 = r26.getContext()
            r0 = 2131825678(0x7f11140e, float:1.9284219E38)
            java.lang.String r19 = r6.getString(r0)
            r20 = 1
            r21 = 0
            r22 = 0
            java.lang.String r18 = ""
            qo3.i0 r9 = nj3.C76879j.m92723Q(r17, r18, r19, r20, r21, r22)
            com.tencent.mm.sdk.platformtools.MMHandlerThread r11 = f40.C86709a0.m107525e()
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$h r12 = new com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$h
            r0 = r12
            r1 = r26
            r3 = r4
            r4 = r5
            r5 = r9
            r0.<init>(r2, r3, r4, r5)
            r11.postToWorker(r12)
            goto L_0x0609
        L_0x0501:
            r2 = 0
            if (r1 != 0) goto L_0x0506
            r0 = r2
            goto L_0x050a
        L_0x0506:
            java.lang.String r0 = r1.getStringExtra(r9)
        L_0x050a:
            if (r1 != 0) goto L_0x050e
            r11 = r2
            goto L_0x0512
        L_0x050e:
            java.lang.String r11 = r1.getStringExtra(r14)
        L_0x0512:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x051f
            java.lang.String r0 = "want to send note from sns, but toUser is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            return
        L_0x051f:
            androidx.appcompat.app.AppCompatActivity r17 = r26.getContext()
            r1 = 2131825678(0x7f11140e, float:1.9284219E38)
            java.lang.String r19 = r6.getString(r1)
            r20 = 1
            r21 = 0
            r22 = 0
            java.lang.String r18 = ""
            qo3.i0 r1 = nj3.C76879j.m92723Q(r17, r18, r19, r20, r21, r22)
            com.tencent.mm.autogen.events.FavoriteOperationEvent r2 = new com.tencent.mm.autogen.events.FavoriteOperationEvent
            r2.<init>()
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r3 = r2.f264833d
            r4 = 13
            r3.f264835a = r4
            androidx.appcompat.app.AppCompatActivity r4 = r26.getContext()
            r3.f264842h = r4
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r3 = r2.f264833d
            r3.f264845k = r0
            r3.f264846l = r11
            long r4 = r6.f283270x
            r3.f264839e = r4
            i00.b r0 = wa3.C102364c.vx0()
            wa3.e r0 = r0.mo137946Rd()
            te3.kd0 r0 = r0.f301475o
            r3.f264838d = r0
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r0 = r2.f264833d
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$n r3 = new com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$n
            r3.<init>(r1)
            r0.f264844j = r3
            r2.publish()
            goto L_0x0609
        L_0x056b:
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r6.f283212E
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$m r1 = new com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$m
            r1.<init>()
            r0.post(r1)
            goto L_0x0609
        L_0x0577:
            r4 = r13
            java.lang.String r0 = "result_data"
            android.os.Bundle r0 = r1.getBundleExtra(r0)
            if (r0 == 0) goto L_0x0609
            java.lang.String r1 = "go_next"
            java.lang.String r0 = r0.getString(r1, r4)
            java.lang.String r1 = "gdpr_auth_location"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0609
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.mo119677K(r1, r2)
            java.lang.Class<aw.d> r0 = p447aw.C103918d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            aw.d r0 = (p447aw.C103918d) r0
            androidx.appcompat.app.AppCompatActivity r1 = r26.getContext()
            r2 = 64
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            r0.mo125790zt(r1, r3, r2)
            goto L_0x0609
        L_0x05b2:
            r2 = 0
            if (r1 != 0) goto L_0x05b7
            r0 = r2
            goto L_0x05bb
        L_0x05b7:
            java.lang.String r0 = r1.getStringExtra(r9)
        L_0x05bb:
            if (r1 != 0) goto L_0x05bf
            r11 = r2
            goto L_0x05c3
        L_0x05bf:
            java.lang.String r11 = r1.getStringExtra(r14)
        L_0x05c3:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x05cd
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r12)
            return
        L_0x05cd:
            androidx.appcompat.app.AppCompatActivity r17 = r26.getContext()
            r1 = 2131825678(0x7f11140e, float:1.9284219E38)
            java.lang.String r19 = r6.getString(r1)
            r20 = 1
            r21 = 0
            r22 = 0
            java.lang.String r18 = ""
            qo3.i0 r1 = nj3.C76879j.m92723Q(r17, r18, r19, r20, r21, r22)
            com.tencent.mm.autogen.events.FavoriteOperationEvent r2 = new com.tencent.mm.autogen.events.FavoriteOperationEvent
            r2.<init>()
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r3 = r2.f264833d
            r4 = 13
            r3.f264835a = r4
            androidx.appcompat.app.AppCompatActivity r4 = r26.getContext()
            r3.f264842h = r4
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r3 = r2.f264833d
            r3.f264845k = r0
            r3.f264846l = r11
            long r4 = r6.f283270x
            r3.f264839e = r4
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$i r0 = new com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$i
            r0.<init>(r1)
            r3.f264844j = r0
            r2.publish()
        L_0x0609:
            r9 = 2
        L_0x060a:
            if (r9 != 0) goto L_0x060d
            goto L_0x063b
        L_0x060d:
            if (r8 != r9) goto L_0x061e
            androidx.appcompat.app.AppCompatActivity r0 = r26.getContext()
            r1 = 2131825656(0x7f1113f8, float:1.9284174E38)
            java.lang.String r1 = r6.getString(r1)
            nj3.C76879j.m92726T(r0, r1)
            goto L_0x063b
        L_0x061e:
            r0 = 3
            if (r0 != r9) goto L_0x063b
            androidx.appcompat.app.AppCompatActivity r0 = r26.getContext()
            r1 = 2131825811(0x7f111493, float:1.9284489E38)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r2[r7] = r3
            java.lang.String r1 = r6.getString(r1, r2)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r8)
            r0.show()
        L_0x063b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        boolean z;
        C96728e0 e0Var = this.f283263q;
        if (e0Var == null || !e0Var.f283365m) {
            z = true;
        } else {
            mo134933b8();
            z = false;
        }
        if (z) {
            mo134920N7();
            C97637b bVar = this.f283232U0;
            if (bVar != null) {
                String q = this.f283238X0.mo126207q(getString(C0966R.string.lkn));
                boolean z2 = this.f283236W0;
                C87412m.m108594g(q, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                NoteEditorUI noteEditorUI = bVar.f286418u;
                if (noteEditorUI != null) {
                    noteEditorUI.hideVKB();
                }
                bVar.f286421x = q;
                bVar.mo67897d();
                if (bVar.mo67896U(2, z2)) {
                    return;
                }
            }
            C102166c cVar = this.f283230T0;
            if (cVar == null || !cVar.mo64004y0(2)) {
                mo134923R7(1);
                super.onBackPressed();
            }
        }
    }

    public void onCancel() {
        super.onCancel();
        if (this.f283224Q0) {
            C92400k.m116191h().mo126365A(false);
            C92400k.m116191h().mo126367C(false);
        }
    }

    public void onCreate(Bundle bundle) {
        Log.m105925i("MicroMsg.Note.NoteEditorUI", "onCreate %s", Integer.valueOf(hashCode()));
        customfixStatusbar(true);
        C101994r.f300318d = this.f283238X0;
        this.f283233V = getIntent().getIntExtra("note_open_from_scene", 2);
        this.f283269w = getIntent().getLongExtra("note_msgid", -1);
        this.f283271x0 = getIntent().getBooleanExtra("record_show_share", false);
        this.f283270x = getIntent().getLongExtra("note_fav_localid", -1);
        this.f283272y = getIntent().getStringExtra("note_link_sns_localid");
        this.f283274z = getIntent().getBooleanExtra("edit_status", false);
        boolean booleanExtra = getIntent().getBooleanExtra("need_save", false);
        this.f283209B = booleanExtra;
        this.f283208A = booleanExtra;
        this.f283221N = getIntent().getStringExtra("fav_note_xml");
        this.f283225R = getIntent().getIntExtra("fav_note_scroll_to_position", 0);
        this.f283227S = getIntent().getIntExtra("fav_note_scroll_to_offset", 0);
        this.f283229T = getIntent().getStringExtra("fav_note_thumbpath");
        this.f283235W = getIntent().getBooleanExtra("show_share", true);
        this.f283241Z = getIntent().getStringExtra("fav_note_link_sns_xml");
        String stringExtra = getIntent().getStringExtra("fav_note_link_source_info");
        this.f283273y0 = getIntent().getBooleanExtra("fav_note_out_of_date", false);
        if (!Util.isNullOrNil(stringExtra)) {
            this.f283231U = stringExtra.split(";");
        }
        if (getIntent().getIntExtra("note_fav_post_scene", 0) == 6) {
            this.f283239Y = true;
        }
        C102365e.f301466t = false;
        if (this.f283231U == null && this.f283270x > 0) {
            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
            FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
            aVar.f264835a = 30;
            aVar.f264847m = 3;
            aVar.f264839e = this.f283270x;
            favoriteOperationEvent.publish();
            this.f283231U = Util.isNullOrNil(favoriteOperationEvent.f264834e.f264857c) ? null : favoriteOperationEvent.f264834e.f264857c.split(";");
        }
        String[] strArr = this.f283231U;
        if (strArr == null || strArr.length >= 3) {
            this.f283212E = new MMHandler();
            C92221d dVar = this.f283238X0;
            int i = this.f283233V;
            long j = (long) i;
            long j2 = i == 1 ? this.f283269w : this.f283270x;
            dVar.getClass();
            dVar.f263945a = new ArrayList<>();
            dVar.f263946b = this;
            dVar.f263947c = new C101834rc0();
            dVar.f263948d = 0;
            dVar.f263949e = 0;
            dVar.f263950f = 0;
            dVar.f263951g = j;
            dVar.f263952h = j2;
            Log.m105925i("MicroMsg.Note.NoteEditorUI", "OnCreate MainActivity, before setContentView msgId:%s localId:%s mSnsLocalId:%s", Long.valueOf(this.f283269w), Long.valueOf(this.f283270x), this.f283272y);
            supportRequestWindowFeature(109);
            super.onCreate(bundle);
            this.f283266t = getContentView();
            if (!(C102364c.vx0().mo137946Rd() == null || C102364c.vx0().mo137946Rd().f301476p == null)) {
                this.f283230T0 = new C102166c(this, new C102165b(this));
                if (Util.isNullOrNil(this.f283272y)) {
                    C102166c cVar = this.f283230T0;
                    cVar.mo35648A(3, "" + this.f283270x + "_" + this.f283269w);
                } else {
                    C102166c cVar2 = this.f283230T0;
                    cVar2.mo35648A(3, "fav_" + this.f283272y);
                }
                C102166c cVar3 = this.f283230T0;
                cVar3.getReportInfo().f311718g = "" + this.f283270x;
                cVar3.mo68414O();
                this.f283230T0.mo149079t0("eventData", C102364c.vx0().mo137946Rd().f301476p);
                C102166c cVar4 = this.f283230T0;
                int i2 = C102364c.vx0().mo137946Rd().f301477q;
                BallInfo ballInfo = cVar4.f311726d;
                if (ballInfo != null && (!ballInfo.mo149047j("eventType") || cVar4.f311726d.mo149044g("eventType", i2) != i2)) {
                    Log.m105925i("MicroMsg.FloatBallHelper", "updateIntExtra, %s:%s", "eventType", Integer.valueOf(i2));
                    cVar4.f311726d.mo149048m("eventType", i2);
                    cVar4.mo68414O();
                }
                this.f283232U0 = new C97637b(this, new C97638c(this));
                if (Util.isNullOrNil(this.f283272y)) {
                    C97637b bVar = this.f283232U0;
                    bVar.mo35809D(3, "" + this.f283270x + "_" + this.f283269w);
                } else {
                    C97637b bVar2 = this.f283232U0;
                    bVar2.mo35809D(3, "fav_" + this.f283272y);
                }
            }
            C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(this.f283270x);
            if (Yt != null) {
                mo128399J7(Yt);
            }
            Log.m105924i("MicroMsg.Note.NoteEditorUI", "OnCreate MainActivity, after setContentView");
            C102593i iVar = new C102593i();
            iVar.f302126s = "";
            iVar.f302071b = true;
            iVar.f302077h = false;
            if (this.f283274z) {
                this.f283238X0.mo126192b(iVar, false);
                this.f283239Y = true;
            }
            this.f283257n = (RecyclerView) findViewById(C0966R.C0970id.lph);
            LinearLayout linearLayout = (LinearLayout) this.f283266t.findViewById(C0966R.C0970id.cau);
            this.f283261p = linearLayout;
            linearLayout.setVisibility(8);
            LinearLayout linearLayout2 = (LinearLayout) this.f283261p.findViewById(C0966R.C0970id.hja);
            this.f283220M = linearLayout2;
            linearLayout2.setVisibility(8);
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(C0966R.C0970id.lp7);
            this.f283264r = relativeLayout;
            relativeLayout.setOnClickListener(new C96699g());
            C92232k kVar = new C92232k(this, this.f283264r);
            this.f283265s = kVar;
            kVar.f263995c = this;
            NoteLinearLayoutManager noteLinearLayoutManager = new NoteLinearLayoutManager(this);
            this.f283213F = noteLinearLayoutManager;
            noteLinearLayoutManager.f283331x = KeyBoardUtil.getScreenWH(this)[1];
            this.f283257n.setLayoutManager(this.f283213F);
            this.f283257n.setHasFixedSize(true);
            this.f283257n.mo17043c(new C96700g0());
            C96679b bVar3 = new C96679b(this);
            this.f283252j = bVar3;
            long j3 = this.f283270x;
            bVar3.f283191g = j3;
            bVar3.f283197m = this.f283233V;
            bVar3.f283185a = this.f283271x0;
            bVar3.f283186b = this.f283269w;
            bVar3.f283198n = this.f283239Y;
            if (this.f283209B && bVar3.f283189e < 0 && j3 > 0) {
                bVar3.f283201q.startTimer(60000);
                bVar3.f283189e = Util.currentTicks();
                bVar3.f283190f = "";
            }
            C96679b bVar4 = this.f283252j;
            if (bVar4 != null) {
                bVar4.f283199o = new C96709o();
            }
            C98333b bVar5 = new C98333b(bVar4, this.f283238X0, this.f283242Z0);
            this.f283259o = bVar5;
            this.f283257n.setAdapter(bVar5);
            if (this.f283233V == 2) {
                this.f283257n.setOnTouchListener(this.f283248f1);
            }
            this.f283257n.getItemAnimator().f44807c = 0;
            this.f283257n.getItemAnimator().f44810f = 0;
            this.f283257n.getItemAnimator().f44809e = 0;
            this.f283257n.getItemAnimator().f44808d = 120;
            ((C67092e0) this.f283257n.getItemAnimator()).f192682g = false;
            int i3 = this.f283233V;
            if (i3 == 1 || i3 == 4) {
                TextView textView = (TextView) findViewById(C0966R.C0970id.hig);
                this.f283267u = textView;
                textView.setOnClickListener(new C44470u(this));
            }
            this.f283226R0 = C76577a.m92151b(this, 48);
            if (this.f283224Q0) {
                Log.m105924i("MicroMsg.Note.NoteEditorUI", "use multiselect");
                boolean z = this.f283233V == 2 && this.f283239Y;
                int color = getResources().getColor(C0966R.color.a7i);
                C92400k h = C92400k.m116191h();
                h.getClass();
                Log.m105924i("NoteSelectManager", "onInit start");
                h.f264424a = z;
                h.f264427d = 14;
                h.f264428e = 32;
                h.f264429f = C76577a.m92151b(this, 21) - h.f264428e;
                h.f264430g = C76577a.m92151b(this, 40) + (h.f264428e * 2);
                h.f264431h = C76577a.m92151b(this, 240) + (h.f264428e * 2);
                h.f264425b = C76577a.m92151b(this, 22);
                h.f264426c = C76577a.m92151b(this, 1);
                h.f264433j = getResources().getDisplayMetrics().heightPixels;
                h.f264434k = getResources().getDisplayMetrics().widthPixels;
                h.f264437n = new int[]{-1, -1};
                h.f264438o = new int[]{-1, -1};
                h.f264439p = new int[]{-1, -1};
                h.f264440q = new int[]{-1, -1};
                C92389a aVar2 = r0;
                C92400k kVar2 = h;
                C92389a aVar3 = new C92389a(this, 2, h.f264425b, h.f264426c, color, h);
                C92389a aVar4 = aVar2;
                PopupWindow popupWindow = new PopupWindow(aVar4, aVar2.getViewWidth(), aVar2.getViewHeight(), false);
                C92400k kVar3 = kVar2;
                kVar3.f264441r = popupWindow;
                popupWindow.setClippingEnabled(false);
                kVar3.f264441r.setAnimationStyle(C0966R.style.a6k);
                kVar3.f264435l = aVar4.getOffsetForCursorMid();
                kVar3.f264436m = C76577a.m92151b(this, 6);
                C92389a aVar5 = r0;
                C92389a aVar6 = aVar4;
                C92400k kVar4 = kVar2;
                C92389a aVar7 = new C92389a(this, 3, kVar3.f264425b, kVar3.f264426c, color, kVar4);
                PopupWindow popupWindow2 = new PopupWindow(aVar5, aVar5.getViewWidth(), aVar6.getViewHeight(), false);
                kVar4.f264442s = popupWindow2;
                popupWindow2.setClippingEnabled(false);
                kVar4.f264442s.setAnimationStyle(C0966R.style.a6j);
                C92389a aVar8 = r0;
                int i4 = color;
                C92400k kVar5 = kVar4;
                C92389a aVar9 = new C92389a(this, 4, kVar4.f264425b, kVar4.f264426c, i4, kVar4);
                PopupWindow popupWindow3 = new PopupWindow(aVar8, aVar8.getViewWidth(), aVar6.getViewHeight(), false);
                kVar5.f264443t = popupWindow3;
                popupWindow3.setClippingEnabled(false);
                kVar5.f264443t.setAnimationStyle(C0966R.style.a6l);
                View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.blc, (ViewGroup) null);
                inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                PopupWindow popupWindow4 = new PopupWindow(inflate, -2, -2, false);
                kVar5.f264444u = popupWindow4;
                popupWindow4.setBackgroundDrawable(getResources().getDrawable(C0966R.C0969drawable.ccr));
                kVar5.f264444u.setClippingEnabled(false);
                kVar5.f264444u.setAnimationStyle(C0966R.style.a6n);
                kVar5.f264414C = (TextView) inflate.findViewById(C0966R.C0970id.hi_);
                kVar5.f264415D = (TextView) inflate.findViewById(C0966R.C0970id.f358871hj3);
                kVar5.f264416E = (TextView) inflate.findViewById(C0966R.C0970id.f358868hj0);
                kVar5.f264417F = (TextView) inflate.findViewById(C0966R.C0970id.hiz);
                kVar5.f264418G = (TextView) inflate.findViewById(C0966R.C0970id.hij);
                kVar5.f264419H = (TextView) inflate.findViewById(C0966R.C0970id.hii);
                kVar5.f264420I = (TextView) inflate.findViewById(C0966R.C0970id.hih);
                kVar5.f264421J = (TextView) inflate.findViewById(C0966R.C0970id.hiv);
                kVar5.f264422K = (TextView) inflate.findViewById(C0966R.C0970id.ng6);
                kVar5.f264423L = (TextView) inflate.findViewById(C0966R.C0970id.ng5);
                kVar5.mo126399z(kVar5.f264414C, kVar5.f264427d);
                kVar5.mo126399z(kVar5.f264415D, kVar5.f264427d);
                kVar5.mo126399z(kVar5.f264416E, kVar5.f264427d);
                kVar5.mo126399z(kVar5.f264417F, kVar5.f264427d);
                kVar5.mo126399z(kVar5.f264418G, kVar5.f264427d);
                kVar5.mo126399z(kVar5.f264419H, kVar5.f264427d);
                kVar5.mo126399z(kVar5.f264420I, kVar5.f264427d);
                kVar5.mo126399z(kVar5.f264421J, kVar5.f264427d);
                kVar5.mo126399z(kVar5.f264422K, kVar5.f264427d);
                kVar5.mo126399z(kVar5.f264423L, kVar5.f264427d);
                kVar5.f264414C.setOnClickListener(new C92406p(kVar5));
                kVar5.f264415D.setOnClickListener(new C92407q(kVar5));
                kVar5.f264416E.setOnClickListener(new C92408r(kVar5));
                kVar5.f264417F.setOnClickListener(new C92409s(kVar5));
                kVar5.f264418G.setOnClickListener(new C92394e(kVar5));
                kVar5.f264419H.setOnClickListener(new C92395f(kVar5));
                kVar5.f264420I.setOnClickListener(new C92396g(kVar5));
                kVar5.f264421J.setOnClickListener(new C92397h(kVar5));
                kVar5.f264423L.setOnClickListener(new C92398i(kVar5));
                kVar5.f264422K.setOnClickListener(new C92399j(kVar5));
                kVar5.f264432i = aVar6.getViewPadding();
                kVar5.f264445v = this;
                kVar5.f264446w = new C92393d(this);
                kVar5.f264447x = new C92391b();
                kVar5.f264412A = new MMHandler();
                C92400k.f264411N = true;
                Log.m105924i("NoteSelectManager", "onInit end");
                C96721b bVar6 = new C96721b(this);
                this.f283228S0 = bVar6;
                this.f283257n.mo17043c(bVar6);
            }
            C89779i0 i0Var = this.f283249g1;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f283249g1 = null;
            }
            if (!this.f283274z && !this.f283273y0) {
                this.f283249g1 = C76879j.m92722P(getContext(), "", 3, getString(C0966R.string.lma), false, true, new C96688b0());
            }
            if (this.f283273y0) {
                Log.m105924i("MicroMsg.Note.NoteEditorUI", "open msg note,  out of date");
                C76879j.m92748s(getContext(), getContext().getString(C0966R.string.h_h), (String) null);
            }
            if (this.f283235W) {
                if (C85875k4.m106197n0() && (C85875k4.m106208w() || C85985z2.m106332d(getTaskId()))) {
                    boolean x = C85875k4.m106209x(getTaskId());
                    if (C85875k4.m106199o0()) {
                        x = C85861e4.m106115b(this);
                    }
                    addIconOptionMenu(0, x ? C0966R.string.bfn : C0966R.string.f361404jm3, x ? C0966R.raw.icons_outlined_merge : C0966R.raw.icons_outlined_sperated, (MenuItem.OnMenuItemClickListener) new C44468c0());
                }
                addIconOptionMenu(1, (int) C0966R.string.k3h, (int) C0966R.raw.actionbar_icon_dark_more, (MenuItem.OnMenuItemClickListener) new C96692d0());
            }
            if (this.f283239Y) {
                setMMTitle(getString(C0966R.string.csb));
            } else {
                setMMTitle(getString(C0966R.string.csc));
            }
            setBackBtnVisible(true);
            setBackBtn(new C96697e0(), C0966R.raw.actionbar_icon_dark_back);
            C78538u.m94868d(this);
            if (this.f283274z) {
                mo134937e8(true, 300);
                mo134936d8(1, 0);
            }
            if (this.f283233V != 2 || !this.f283239Y) {
                this.f283261p.setVisibility(8);
            } else {
                C96728e0 e0Var = new C96728e0(this);
                this.f283263q = e0Var;
                LinearLayout linearLayout3 = this.f283261p;
                e0Var.f283353a = linearLayout3;
                C96679b.f283182r.f283192h = e0Var;
                e0Var.f283355c = (LinearLayout) linearLayout3.findViewById(C0966R.C0970id.hja);
                e0Var.f283354b = (ImageButton) linearLayout3.findViewById(C0966R.C0970id.lpe);
                e0Var.f283356d = (ImageButton) linearLayout3.findViewById(C0966R.C0970id.lpa);
                e0Var.f283357e = (ImageButton) linearLayout3.findViewById(C0966R.C0970id.lpc);
                e0Var.f283358f = (ImageButton) linearLayout3.findViewById(C0966R.C0970id.lpb);
                e0Var.f283359g = (ImageButton) linearLayout3.findViewById(C0966R.C0970id.lpd);
                e0Var.f283360h = (LinearLayout) e0Var.f283355c.findViewById(C0966R.C0970id.lra);
                e0Var.f283361i = (LinearLayout) e0Var.f283355c.findViewById(C0966R.C0970id.lrd);
                e0Var.f283362j = (LinearLayout) e0Var.f283355c.findViewById(C0966R.C0970id.lrb);
                e0Var.f283363k = (LinearLayout) e0Var.f283355c.findViewById(C0966R.C0970id.lrc);
                e0Var.f283364l = (LinearLayout) e0Var.f283355c.findViewById(C0966R.C0970id.gz7);
                e0Var.f283354b.setOnClickListener(new C96745v(e0Var, this));
                e0Var.f283358f.setOnClickListener(new C6638w(e0Var, this));
                e0Var.f283359g.setOnClickListener(new C96752x(e0Var, this, this));
                e0Var.f283356d.setOnClickListener(new C6639y(e0Var, this));
                e0Var.f283357e.setOnClickListener(new C6641z(e0Var, this));
                e0Var.f283364l.setOnClickListener(new C96720a0(e0Var, this));
                e0Var.f283360h.setOnClickListener(new C96722b0(e0Var, this));
                e0Var.f283361i.setOnClickListener(new C96724c0(e0Var, this));
                e0Var.f283362j.setOnClickListener(new C96726d0(e0Var, this));
                e0Var.f283363k.setOnClickListener(new C96741r(e0Var, this));
                getWindow().setSoftInputMode(18);
            }
            this.f283257n.getViewTreeObserver().addOnGlobalLayoutListener(this.f283243a1);
            if (this.f283267u != null) {
                this.f283257n.getViewTreeObserver().addOnGlobalLayoutListener(this.f283244b1);
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f283237X = currentTimeMillis;
            Log.m105925i("MicroMsg.Note.NoteEditorUI", "startnoteeditorui, oncreate , currenttime is %d", Long.valueOf(currentTimeMillis));
            C97625j3.m125815e().mo123455a(921, this);
            ActionBar actionBar = this.mController.f348065F;
            if (!(actionBar == null || actionBar.mo91099j() == null)) {
                this.mController.f348065F.mo91099j().postDelayed(new C44469f0(), 100);
            }
            Log.m105924i("MicroMsg.Note.NoteEditorUI", "startPreMinuteUpload upload = " + this.f283260o1);
            if (this.f283260o1 && this.f283258n1 == null) {
                Log.m105924i("MicroMsg.Note.NoteEditorUI", "startPreMinuteUpload");
                this.f283258n1 = ((C119157j) C119157j.f356862d).mo183872c(new C96736m(this), 60000, 60000);
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        Class cls = C61212e.class;
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        View findViewById = findViewById(C0966R.C0970id.f5422ep);
        if (findViewById != null) {
            ((C61212e) C86312j.m106911c(cls)).o30(findViewById, "split_view_icon");
            ((C61212e) C86312j.m106911c(cls)).mo86175pO(findViewById, 40, 26430);
        }
        return onCreateOptionsMenu;
    }

    public void onDestroy() {
        RecyclerView recyclerView;
        super.onDestroy();
        Log.m105924i("MicroMsg.Note.NoteEditorUI", "cancelPreMinuteUpload upload = " + this.f283260o1);
        if (this.f283258n1 != null) {
            Log.m105924i("MicroMsg.Note.NoteEditorUI", "cancelPreMinuteUpload");
            this.f283258n1.cancel(false);
            this.f283258n1 = null;
        }
        if (!C85875k4.m106208w() && !C85985z2.m106332d(getTaskId())) {
            mo134923R7(1);
        }
        Log.m105925i("MicroMsg.Note.NoteEditorUI", "onDestroy %s %s", Integer.valueOf(hashCode()), Long.valueOf(this.f283270x));
        this.f283256m1 = true;
        C102166c cVar = this.f283230T0;
        if (cVar != null) {
            cVar.mo67996A0();
        }
        C97637b bVar = this.f283232U0;
        if (bVar != null) {
            bVar.getClass();
        }
        if (this.f283224Q0 && (recyclerView = this.f283257n) != null) {
            recyclerView.mo17098m1(this.f283228S0);
            this.f283257n.getViewTreeObserver().removeOnGlobalLayoutListener(this.f283244b1);
        }
        C97625j3.m125815e().mo123470p(921, this);
        this.f283259o.getClass();
    }

    public void onDrag() {
        super.onDrag();
        if (this.f283224Q0) {
            C92400k.m116191h().mo126387n();
            C92400k.m116191h().mo126389p();
        }
        if (this.f283216I) {
            Log.m105924i("MicroMsg.Note.NoteEditorUI", "onSwipeBack close vkb");
            hideVKB();
        }
    }

    public void onKeyboardStateChanged() {
        super.onKeyboardStateChanged();
        boolean z = keyboardState() == 1;
        this.f283216I = z;
        if (z) {
            mo134936d8(1, 0);
        }
        if (this.f283224Q0) {
            this.f283212E.postDelayed(new C96711r(this), 200);
        }
    }

    public void onPause() {
        super.onPause();
        Log.m105918d("MicroMsg.Note.NoteEditorUI", "onPause() called");
        C96679b bVar = this.f283252j;
        if (bVar != null) {
            bVar.mo134903a();
        }
        C102166c cVar = this.f283230T0;
        if (cVar != null) {
            cVar.mo64001C();
        }
        C97637b bVar2 = this.f283232U0;
        if (bVar2 != null) {
            bVar2.mo74189F();
        }
        C96728e0 e0Var = this.f283263q;
        if (e0Var != null) {
            e0Var.mo134989c(this);
        }
        if (this.f283242Z0.mo135022e()) {
            this.f283242Z0.mo135024g();
        }
        this.f283253j1 = this.f283216I;
        mo134937e8(false, 0);
        C102602r a = C92238l.m115958b().mo126233a();
        if (mo134925T7(a)) {
            a.f302109h = this.f283238X0.mo126207q(getString(C0966R.string.lkn));
            a.f302111j = this.f283222P;
            a.f302112n = this.f283223Q;
            C92238l.m115958b().mo126234c(a);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.Note.NoteEditorUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.Note.NoteEditorUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i != 64) {
            if (i == 80 && iArr[0] != 0) {
                mo134929X7();
            }
        } else if (C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null)) && iArr[0] != 0) {
            C76879j.m92709C(getContext(), getString(C0966R.string.f361129hi0), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.auj), false, new C6634w(), (DialogInterface.OnClickListener) null);
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        boolean z;
        C101801kd0 kd02;
        Log.m105924i("MicroMsg.Note.NoteEditorUI", "onRestoreInstanceState() called with: savedInstanceState = [" + bundle + "]");
        try {
            C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(this.f283270x);
            if (Yt == null || (kd02 = Yt.field_favProto) == null || kd02.f298618f.size() <= 1) {
                z = false;
            } else {
                C101834rc0 rc02 = Yt.field_favProto.f298618f.get(0);
                Log.m105925i("MicroMsg.Note.NoteEditorUI", "CheckHtmlCdnUrlNull:%s", Boolean.valueOf(Util.isNullOrNil(rc02.f299325s)));
                z = Util.isNullOrNil(rc02.f299325s);
            }
            C117407d dVar = C117407d.INSTANCE;
            dVar.idkeyStat(1945, 0, 1, false);
            if (z) {
                dVar.idkeyStat(1945, 1, 1, false);
            }
            Log.m105925i("MicroMsg.Note.NoteEditorUI", "onRestoreInstanceState inMagicWindowMode:%s", Boolean.valueOf(C85875k4.m106208w()));
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.Note.NoteEditorUI", th, "report err", new Object[0]);
        }
        super.onRestoreInstanceState(bundle);
    }

    public void onResume() {
        super.onResume();
        Log.m105925i("MicroMsg.Note.NoteEditorUI", "onResume %s", Integer.valueOf(hashCode()));
        C102166c cVar = this.f283230T0;
        if (cVar != null) {
            cVar.mo64003o();
        }
        C97637b bVar = this.f283232U0;
        if (bVar != null) {
            bVar.mo74188E();
        }
        if (this.f283233V == 2) {
            int i = this.f283251i1;
            if (i != -1) {
                switch (i) {
                    case 4097:
                        if (!this.f283250h1) {
                            mo134937e8(true, 100);
                            mo134936d8(1, 0);
                            break;
                        }
                        break;
                    case 4098:
                    case 4099:
                        mo134937e8(true, 100);
                        mo134936d8(1, 0);
                        break;
                }
            } else if (this.f283253j1) {
                mo134937e8(true, 100);
                mo134936d8(1, 0);
            }
        }
        this.f283251i1 = -1;
        this.f283250h1 = false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:41|42|43|44|45|46|47|48|(1:50)(1:51)|52|53|154) */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0286, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.Note.NoteEditorUI", "genlongpic fail,error msg Exception");
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.Note.NoteEditorUI", r0, "", new java.lang.Object[0]);
        mo134921P7();
        p910lj.C76701a.makeText((android.content.Context) getContext(), (java.lang.CharSequence) getContext().getString(com.tencent.p014mm.C0966R.string.h_m), 1).show();
        r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE;
        r4 = new java.lang.Object[5];
        r4[0] = 0;
        r4[1] = 0;
        r4[2] = 0;
        r4[3] = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02cd, code lost:
        if (r1.f283239Y != false) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02cf, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02d1, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02d2, code lost:
        r4[4] = java.lang.Integer.valueOf(r6);
        r0.mo160131h(14811, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02df, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.Note.NoteEditorUI", "genlongpic fail,Throwable error msg throw");
        mo134921P7();
        p910lj.C76701a.makeText((android.content.Context) getContext(), (java.lang.CharSequence) getContext().getString(com.tencent.p014mm.C0966R.string.h_m), 1).show();
        r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE;
        r4 = new java.lang.Object[5];
        r4[0] = 0;
        r4[1] = 0;
        r4[2] = 0;
        r4[3] = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x031d, code lost:
        if (r1.f283239Y != false) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x031f, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0321, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0322, code lost:
        r4[4] = java.lang.Integer.valueOf(r5);
        r0.mo160131h(14811, r4);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00f3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x021a */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[ExcHandler: all (unused java.lang.Throwable), SYNTHETIC, Splitter:B:47:0x00f3] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012b A[Catch:{ Exception -> 0x0330, all -> 0x02e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012d A[Catch:{ Exception -> 0x0330, all -> 0x02e0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onSceneEnd(int r20, int r21, java.lang.String r22, ob0.C117747y r23) {
        /*
            r19 = this;
            r1 = r19
            r0 = r23
            monitor-enter(r19)
            int r2 = r23.getType()     // Catch:{ all -> 0x0429 }
            r3 = 921(0x399, float:1.29E-42)
            if (r2 == r3) goto L_0x000f
            monitor-exit(r19)
            return
        L_0x000f:
            boolean r2 = r0 instanceof wa3.C53142b     // Catch:{ all -> 0x0429 }
            if (r2 != 0) goto L_0x0015
            monitor-exit(r19)
            return
        L_0x0015:
            r2 = r0
            wa3.b r2 = (wa3.C53142b) r2     // Catch:{ all -> 0x0429 }
            int r0 = r2.f148273f     // Catch:{ all -> 0x0429 }
            r3 = 1
            if (r0 == r3) goto L_0x001f
            monitor-exit(r19)
            return
        L_0x001f:
            r4 = 3
            r5 = 5
            r6 = 14811(0x39db, float:2.0755E-41)
            r7 = 2131833628(0x7f11331c, float:1.9300343E38)
            r8 = 4
            r9 = 2
            r10 = 0
            if (r21 != 0) goto L_0x03c8
            java.lang.String r0 = "MicroMsg.Note.NoteEditorUI"
            java.lang.String r11 = "genlong pic , allow"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)     // Catch:{ all -> 0x0429 }
            androidx.recyclerview.widget.RecyclerView r0 = r1.f283257n     // Catch:{ all -> 0x0429 }
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()     // Catch:{ all -> 0x0429 }
            if (r0 == 0) goto L_0x0380
            int r11 = r0.getItemCount()     // Catch:{ all -> 0x0429 }
            if (r11 > 0) goto L_0x0083
            r19.mo134921P7()     // Catch:{ all -> 0x0429 }
            androidx.appcompat.app.AppCompatActivity r0 = r19.getContext()     // Catch:{ all -> 0x0429 }
            androidx.appcompat.app.AppCompatActivity r2 = r19.getContext()     // Catch:{ all -> 0x0429 }
            java.lang.String r2 = r2.getString(r7)     // Catch:{ all -> 0x0429 }
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r2, (int) r3)     // Catch:{ all -> 0x0429 }
            r0.show()     // Catch:{ all -> 0x0429 }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0429 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x0429 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0429 }
            r2[r10] = r5     // Catch:{ all -> 0x0429 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0429 }
            r2[r3] = r5     // Catch:{ all -> 0x0429 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0429 }
            r2[r9] = r5     // Catch:{ all -> 0x0429 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0429 }
            r2[r4] = r5     // Catch:{ all -> 0x0429 }
            boolean r4 = r1.f283239Y     // Catch:{ all -> 0x0429 }
            if (r4 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r3 = 0
        L_0x0078:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0429 }
            r2[r8] = r3     // Catch:{ all -> 0x0429 }
            r0.mo160131h(r6, r2)     // Catch:{ all -> 0x0429 }
            monitor-exit(r19)
            return
        L_0x0083:
            java.lang.Runtime r12 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            long r12 = r12.maxMemory()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r14 = 1024(0x400, double:5.06E-321)
            long r12 = r12 / r14
            int r13 = (int) r12     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r12 = 8
            int r13 = r13 / r12
            o90.b r14 = new o90.b     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            java.lang.Class r15 = r19.getClass()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r14.<init>(r13, r15)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r13 = 0
            r15 = 0
        L_0x009d:
            if (r13 >= r11) goto L_0x0189
            androidx.recyclerview.widget.RecyclerView r12 = r1.f283257n     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            int r6 = r0.getItemViewType(r13)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            androidx.recyclerview.widget.RecyclerView$z r6 = r0.createViewHolder(r12, r6)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r0.onBindViewHolder(r6, r13)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            android.view.View r12 = r6.f44854d     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            androidx.recyclerview.widget.RecyclerView r8 = r1.f283257n     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            int r8 = r8.getWidth()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r4 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r4)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r10)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r12.measure(r4, r8)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            android.view.View r4 = r6.f44854d     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            int r8 = r4.getMeasuredWidth()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            android.view.View r12 = r6.f44854d     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            int r12 = r12.getMeasuredHeight()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r4.layout(r10, r10, r8, r12)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            android.view.View r4 = r6.f44854d     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            int r4 = r4.getWidth()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            android.view.View r8 = r6.f44854d     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            int r8 = r8.getHeight()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            if (r4 <= 0) goto L_0x017e
            if (r8 > 0) goto L_0x00e2
            goto L_0x017e
        L_0x00e2:
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x014a }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r8, r12)     // Catch:{ all -> 0x014a }
            android.graphics.Canvas r8 = new android.graphics.Canvas     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r8.<init>(r4)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            android.view.View r12 = r6.f44854d     // Catch:{ Exception -> 0x00f3, all -> 0x02e0 }
            r12.draw(r8)     // Catch:{ Exception -> 0x00f3, all -> 0x02e0 }
            goto L_0x013b
        L_0x00f3:
            r19.mo134921P7()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            androidx.appcompat.app.AppCompatActivity r8 = r19.getContext()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            androidx.appcompat.app.AppCompatActivity r12 = r19.getContext()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            java.lang.String r12 = r12.getString(r7)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            android.widget.Toast r8 = p910lj.C76701a.makeText((android.content.Context) r8, (java.lang.CharSequence) r12, (int) r3)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r8.show()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r12[r10] = r17     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r12[r3] = r17     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r12[r9] = r17     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r16 = 3
            r12[r16] = r17     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            boolean r9 = r1.f283239Y     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            if (r9 == 0) goto L_0x012d
            r9 = 1
            goto L_0x012e
        L_0x012d:
            r9 = 0
        L_0x012e:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r18 = 4
            r12[r18] = r9     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r9 = 14811(0x39db, float:2.0755E-41)
            r8.mo160131h(r9, r12)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
        L_0x013b:
            java.lang.String r8 = java.lang.String.valueOf(r13)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r14.put(r8, r4)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            android.view.View r4 = r6.f44854d     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            int r4 = r4.getMeasuredHeight()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            int r15 = r15 + r4
            goto L_0x017e
        L_0x014a:
            r0 = 0
        L_0x014c:
            if (r0 >= r13) goto L_0x0166
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            java.lang.Object r4 = r14.get(r4)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            if (r4 == 0) goto L_0x0163
            boolean r6 = r4.isRecycled()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            if (r6 != 0) goto L_0x0163
            r4.recycle()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
        L_0x0163:
            int r0 = r0 + 1
            goto L_0x014c
        L_0x0166:
            r19.mo134921P7()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            androidx.appcompat.app.AppCompatActivity r0 = r19.getContext()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            androidx.appcompat.app.AppCompatActivity r4 = r19.getContext()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            java.lang.String r4 = r4.getString(r7)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r4, (int) r3)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r0.show()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            monitor-exit(r19)
            return
        L_0x017e:
            int r13 = r13 + 1
            r4 = 3
            r6 = 14811(0x39db, float:2.0755E-41)
            r8 = 4
            r9 = 2
            r12 = 8
            goto L_0x009d
        L_0x0189:
            androidx.appcompat.app.AppCompatActivity r0 = r19.getContext()     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            r4 = 14
            int r0 = kg3.C76577a.m92151b(r0, r4)     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            androidx.recyclerview.widget.RecyclerView r4 = r1.f283257n     // Catch:{ all -> 0x01a3 }
            int r4 = r4.getMeasuredWidth()     // Catch:{ all -> 0x01a3 }
            int r4 = r4 + r10
            int r6 = r15 + r0
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x01a3 }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r4, r6, r8)     // Catch:{ all -> 0x01a3 }
            goto L_0x01b8
        L_0x01a3:
            java.lang.String r4 = "MicroMsg.Note.NoteEditorUI"
            java.lang.String r6 = "favorite, note, gen long pic ,rgb 888  error,errormsg "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r6)     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            androidx.recyclerview.widget.RecyclerView r4 = r1.f283257n     // Catch:{ all -> 0x021a }
            int r4 = r4.getMeasuredWidth()     // Catch:{ all -> 0x021a }
            int r4 = r4 + r10
            int r15 = r15 + r0
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ all -> 0x021a }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r4, r15, r0)     // Catch:{ all -> 0x021a }
        L_0x01b8:
            android.graphics.Canvas r4 = new android.graphics.Canvas     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            r6 = -1
            r4.drawColor(r6)     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            androidx.appcompat.app.AppCompatActivity r6 = r19.getContext()     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            r8 = 8
            int r6 = kg3.C76577a.m92151b(r6, r8)     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            r8 = 0
        L_0x01cc:
            if (r8 >= r11) goto L_0x01f2
            java.lang.String r9 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            java.lang.Object r9 = r14.get(r9)     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            if (r9 != 0) goto L_0x01db
            goto L_0x01ef
        L_0x01db:
            float r12 = (float) r10     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            float r13 = (float) r6     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            r15 = 0
            r4.drawBitmap(r9, r12, r13, r15)     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            int r12 = r9.getHeight()     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            int r6 = r6 + r12
            boolean r12 = r9.isRecycled()     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            if (r12 != 0) goto L_0x01ef
            r9.recycle()     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
        L_0x01ef:
            int r8 = r8 + 1
            goto L_0x01cc
        L_0x01f2:
            qo3.i0 r4 = r1.f283249g1     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            if (r4 == 0) goto L_0x020d
            boolean r4 = r4.isShowing()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            if (r4 == 0) goto L_0x020d
            r19.mo134921P7()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            com.tencent.mm.sdk.platformtools.MMHandlerThread r4 = f40.C86709a0.m107525e()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$z r6 = new com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$z     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r4.postToWorker(r6)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            goto L_0x0417
        L_0x020d:
            if (r0 == 0) goto L_0x0417
            boolean r4 = r0.isRecycled()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            if (r4 != 0) goto L_0x0417
            r0.recycle()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            goto L_0x0417
        L_0x021a:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            r4[r10] = r6     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            r4[r3] = r6     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            r8 = 2
            r4[r8] = r6     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            r8 = 3
            r4[r8] = r6     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            boolean r6 = r1.f283239Y     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            if (r6 == 0) goto L_0x023e
            r6 = 1
            goto L_0x023f
        L_0x023e:
            r6 = 0
        L_0x023f:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            r8 = 4
            r4[r8] = r6     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            r6 = 14811(0x39db, float:2.0755E-41)
            r0.mo160131h(r6, r4)     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            java.lang.String r0 = "MicroMsg.Note.NoteEditorUI"
            java.lang.String r4 = "favorite, note, gen long pic , 565 error,errormsg is er:"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            r19.mo134921P7()     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            androidx.appcompat.app.AppCompatActivity r0 = r19.getContext()     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            androidx.appcompat.app.AppCompatActivity r4 = r19.getContext()     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            java.lang.String r4 = r4.getString(r7)     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r4, (int) r3)     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            r0.show()     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            r0 = 0
        L_0x0269:
            if (r0 >= r11) goto L_0x0284
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            java.lang.Object r4 = r14.get(r4)     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            if (r4 != 0) goto L_0x0278
            goto L_0x0281
        L_0x0278:
            boolean r6 = r4.isRecycled()     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
            if (r6 != 0) goto L_0x0281
            r4.recycle()     // Catch:{ Exception -> 0x0286, all -> 0x02e0 }
        L_0x0281:
            int r0 = r0 + 1
            goto L_0x0269
        L_0x0284:
            monitor-exit(r19)
            return
        L_0x0286:
            r0 = move-exception
            java.lang.String r4 = "MicroMsg.Note.NoteEditorUI"
            java.lang.String r6 = "genlongpic fail,error msg Exception"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r6)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            java.lang.String r4 = "MicroMsg.Note.NoteEditorUI"
            java.lang.String r6 = ""
            java.lang.Object[] r8 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r6, r8)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r19.mo134921P7()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            androidx.appcompat.app.AppCompatActivity r0 = r19.getContext()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            androidx.appcompat.app.AppCompatActivity r4 = r19.getContext()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            java.lang.String r4 = r4.getString(r7)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r4, (int) r3)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r0.show()     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r4[r10] = r6     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r4[r3] = r6     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r8 = 2
            r4[r8] = r6     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r8 = 3
            r4[r8] = r6     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            boolean r6 = r1.f283239Y     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            if (r6 == 0) goto L_0x02d1
            r6 = 1
            goto L_0x02d2
        L_0x02d1:
            r6 = 0
        L_0x02d2:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r8 = 4
            r4[r8] = r6     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            r6 = 14811(0x39db, float:2.0755E-41)
            r0.mo160131h(r6, r4)     // Catch:{ Exception -> 0x0330, all -> 0x02e0 }
            monitor-exit(r19)
            return
        L_0x02e0:
            java.lang.String r0 = "MicroMsg.Note.NoteEditorUI"
            java.lang.String r4 = "genlongpic fail,Throwable error msg throw"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)     // Catch:{ all -> 0x0429 }
            r19.mo134921P7()     // Catch:{ all -> 0x0429 }
            androidx.appcompat.app.AppCompatActivity r0 = r19.getContext()     // Catch:{ all -> 0x0429 }
            androidx.appcompat.app.AppCompatActivity r4 = r19.getContext()     // Catch:{ all -> 0x0429 }
            java.lang.String r4 = r4.getString(r7)     // Catch:{ all -> 0x0429 }
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r4, (int) r3)     // Catch:{ all -> 0x0429 }
            r0.show()     // Catch:{ all -> 0x0429 }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0429 }
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ all -> 0x0429 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0429 }
            r4[r10] = r5     // Catch:{ all -> 0x0429 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0429 }
            r4[r3] = r5     // Catch:{ all -> 0x0429 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0429 }
            r6 = 2
            r4[r6] = r5     // Catch:{ all -> 0x0429 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0429 }
            r6 = 3
            r4[r6] = r5     // Catch:{ all -> 0x0429 }
            boolean r5 = r1.f283239Y     // Catch:{ all -> 0x0429 }
            if (r5 == 0) goto L_0x0321
            r5 = 1
            goto L_0x0322
        L_0x0321:
            r5 = 0
        L_0x0322:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0429 }
            r6 = 4
            r4[r6] = r5     // Catch:{ all -> 0x0429 }
            r5 = 14811(0x39db, float:2.0755E-41)
            r0.mo160131h(r5, r4)     // Catch:{ all -> 0x0429 }
            goto L_0x0417
        L_0x0330:
            java.lang.String r0 = "MicroMsg.Note.NoteEditorUI"
            java.lang.String r4 = "genlongpic fail,Exception error msg a"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)     // Catch:{ all -> 0x0429 }
            r19.mo134921P7()     // Catch:{ all -> 0x0429 }
            androidx.appcompat.app.AppCompatActivity r0 = r19.getContext()     // Catch:{ all -> 0x0429 }
            androidx.appcompat.app.AppCompatActivity r4 = r19.getContext()     // Catch:{ all -> 0x0429 }
            java.lang.String r4 = r4.getString(r7)     // Catch:{ all -> 0x0429 }
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r4, (int) r3)     // Catch:{ all -> 0x0429 }
            r0.show()     // Catch:{ all -> 0x0429 }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0429 }
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ all -> 0x0429 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0429 }
            r4[r10] = r5     // Catch:{ all -> 0x0429 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0429 }
            r4[r3] = r5     // Catch:{ all -> 0x0429 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0429 }
            r6 = 2
            r4[r6] = r5     // Catch:{ all -> 0x0429 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0429 }
            r6 = 3
            r4[r6] = r5     // Catch:{ all -> 0x0429 }
            boolean r5 = r1.f283239Y     // Catch:{ all -> 0x0429 }
            if (r5 == 0) goto L_0x0371
            r5 = 1
            goto L_0x0372
        L_0x0371:
            r5 = 0
        L_0x0372:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0429 }
            r6 = 4
            r4[r6] = r5     // Catch:{ all -> 0x0429 }
            r5 = 14811(0x39db, float:2.0755E-41)
            r0.mo160131h(r5, r4)     // Catch:{ all -> 0x0429 }
            goto L_0x0417
        L_0x0380:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0429 }
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ all -> 0x0429 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0429 }
            r4[r10] = r5     // Catch:{ all -> 0x0429 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0429 }
            r4[r3] = r5     // Catch:{ all -> 0x0429 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0429 }
            r6 = 2
            r4[r6] = r5     // Catch:{ all -> 0x0429 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0429 }
            r6 = 3
            r4[r6] = r5     // Catch:{ all -> 0x0429 }
            boolean r5 = r1.f283239Y     // Catch:{ all -> 0x0429 }
            if (r5 == 0) goto L_0x03a4
            r5 = 1
            goto L_0x03a5
        L_0x03a4:
            r5 = 0
        L_0x03a5:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0429 }
            r6 = 4
            r4[r6] = r5     // Catch:{ all -> 0x0429 }
            r5 = 14811(0x39db, float:2.0755E-41)
            r0.mo160131h(r5, r4)     // Catch:{ all -> 0x0429 }
            r19.mo134921P7()     // Catch:{ all -> 0x0429 }
            androidx.appcompat.app.AppCompatActivity r0 = r19.getContext()     // Catch:{ all -> 0x0429 }
            androidx.appcompat.app.AppCompatActivity r4 = r19.getContext()     // Catch:{ all -> 0x0429 }
            java.lang.String r4 = r4.getString(r7)     // Catch:{ all -> 0x0429 }
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r4, (int) r3)     // Catch:{ all -> 0x0429 }
            r0.show()     // Catch:{ all -> 0x0429 }
            goto L_0x0417
        L_0x03c8:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0429 }
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ all -> 0x0429 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0429 }
            r4[r10] = r5     // Catch:{ all -> 0x0429 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0429 }
            r4[r3] = r5     // Catch:{ all -> 0x0429 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0429 }
            r6 = 2
            r4[r6] = r5     // Catch:{ all -> 0x0429 }
            r5 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0429 }
            r5 = 3
            r4[r5] = r6     // Catch:{ all -> 0x0429 }
            boolean r5 = r1.f283239Y     // Catch:{ all -> 0x0429 }
            if (r5 == 0) goto L_0x03ed
            r5 = 1
            goto L_0x03ee
        L_0x03ed:
            r5 = 0
        L_0x03ee:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0429 }
            r6 = 4
            r4[r6] = r5     // Catch:{ all -> 0x0429 }
            r5 = 14811(0x39db, float:2.0755E-41)
            r0.mo160131h(r5, r4)     // Catch:{ all -> 0x0429 }
            java.lang.String r0 = "MicroMsg.Note.NoteEditorUI"
            java.lang.String r4 = "genlong pic , not allow"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)     // Catch:{ all -> 0x0429 }
            r19.mo134921P7()     // Catch:{ all -> 0x0429 }
            androidx.appcompat.app.AppCompatActivity r0 = r19.getContext()     // Catch:{ all -> 0x0429 }
            androidx.appcompat.app.AppCompatActivity r4 = r19.getContext()     // Catch:{ all -> 0x0429 }
            java.lang.String r4 = r4.getString(r7)     // Catch:{ all -> 0x0429 }
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r4, (int) r3)     // Catch:{ all -> 0x0429 }
            r0.show()     // Catch:{ all -> 0x0429 }
        L_0x0417:
            com.tencent.mm.plugin.wenote.model.nativenote.manager.b r0 = r1.f283252j     // Catch:{ all -> 0x0429 }
            int r2 = r2.f148277j     // Catch:{ all -> 0x0429 }
            r0.f283197m = r2     // Catch:{ all -> 0x0429 }
            bb3.d r0 = r1.f283238X0     // Catch:{ all -> 0x0429 }
            int r2 = r0.mo126186F()     // Catch:{ all -> 0x0429 }
            int r2 = r2 - r3
            r0.mo126215y(r2, r10)     // Catch:{ all -> 0x0429 }
            monitor-exit(r19)
            return
        L_0x0429:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    public void onStart() {
        super.onStart();
        Log.m105925i("MicroMsg.Note.NoteEditorUI", "onStart %s", Integer.valueOf(hashCode()));
        this.f283255l1.alive();
    }

    public void onStop() {
        super.onStop();
        Log.m105925i("MicroMsg.Note.NoteEditorUI", "onStop %s", Integer.valueOf(hashCode()));
        this.f283255l1.dead();
    }

    /* renamed from: r3 */
    public void mo134943r3(int i) {
        try {
            this.f283259o.notifyItemInserted(i);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Note.NoteEditorUI", e, "", new Object[0]);
            Log.m105921e("MicroMsg.Note.NoteEditorUI", "onNotifyItemInserted error,positionStart:%d", Integer.valueOf(i));
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C8006b.class);
        hashSet.add(C27075b.class);
    }
}
