package com.tencent.p014mm.plugin.component.editor;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.C67092e0;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.component.editor.C93062a;
import com.tencent.p014mm.plugin.component.editor.C93065b;
import com.tencent.p014mm.plugin.component.editor.adapter.EditorLinearLayoutManager;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText;
import com.tencent.p014mm.plugin.component.editor.widget.voiceview.C93093a;
import com.tencent.p014mm.plugin.fav.p047ui.C93693r;
import com.tencent.p014mm.plugin.mmsight.SightCaptureResult;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LongBitmapHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kg3.C76577a;
import m21.C99784a;
import m21.C99785b;
import nc0.C76850a;
import nj3.C76879j;
import o21.C100273b;
import o21.C100275d;
import p21.C100616a;
import p21.C100618c;
import p21.C100620e;
import p21.C100621f;
import p21.C100622g;
import p21.C100626k;
import p21.C100627l;
import p21.C100628m;
import p21.C100630o;
import p21.C100631p;
import p447aw.C103918d;
import p500dy.C97560f;
import p561im.C98769b;
import p629ny.C76979h;
import p645pj.C77092c;
import p663qo.C101211h;
import p663qo.C101213l;
import p823sg.C101611g;
import p823sg.C90193h;
import pb1.C100734q;
import pb1.C100755z;
import pb1.C11881t1;
import r21.C101336a;
import s21.C101496a;
import t21.C101712a;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C101871zc0;
import u21.C101941c;
import u21.C101943d;
import u21.C101953f;
import v21.C102123a;
import v21.C102125b;
import v21.C102127d;
import v21.C102128e;
import v21.C102129f;
import v21.C102130g;
import v21.C102131h;
import v21.C102132i;
import v21.C102138n;
import v21.C102139o;
import v21.C102140p;
import v21.C102141q;
import x21.C102538a;

/* renamed from: com.tencent.mm.plugin.component.editor.EditorUI */
public abstract class EditorUI extends MMSecDataActivity implements C101712a, C101336a, C101943d.C101948e {

    /* renamed from: J */
    public static final /* synthetic */ int f268032J = 0;

    /* renamed from: A */
    public HashMap<String, C101953f> f268033A = new HashMap<>();

    /* renamed from: B */
    public float f268034B;

    /* renamed from: C */
    public float f268035C;

    /* renamed from: D */
    public View.OnTouchListener f268036D = new C93051g();

    /* renamed from: E */
    public Runnable f268037E = null;

    /* renamed from: F */
    public C100755z f268038F;

    /* renamed from: G */
    public LinkedList<C101834rc0> f268039G = new LinkedList<>();

    /* renamed from: H */
    public ConcurrentHashMap<String, C93062a> f268040H = new ConcurrentHashMap<>();

    /* renamed from: I */
    public C93065b.C93067b f268041I = new C93054i();

    /* renamed from: d */
    public RecyclerView f268042d;

    /* renamed from: e */
    public C99785b f268043e;

    /* renamed from: f */
    public LinearLayout f268044f;

    /* renamed from: g */
    public C102538a f268045g;

    /* renamed from: h */
    public RelativeLayout f268046h;

    /* renamed from: i */
    public C101943d f268047i;

    /* renamed from: j */
    public C93083b f268048j;

    /* renamed from: n */
    public boolean f268049n = true;

    /* renamed from: o */
    public int f268050o;

    /* renamed from: p */
    public RecyclerView.C0130p f268051p;

    /* renamed from: q */
    public MMHandler f268052q = new MMHandler();

    /* renamed from: r */
    public boolean f268053r;

    /* renamed from: s */
    public boolean f268054s;

    /* renamed from: t */
    public boolean f268055t;

    /* renamed from: u */
    public String f268056u;

    /* renamed from: v */
    public boolean f268057v;

    /* renamed from: w */
    public int f268058w = -1;

    /* renamed from: x */
    public boolean f268059x;

    /* renamed from: y */
    public ProgressDialog f268060y;

    /* renamed from: z */
    public C101834rc0 f268061z;

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorUI$a */
    public class C93044a implements Runnable {
        public C93044a() {
        }

        public void run() {
            C76879j.m92748s(EditorUI.this.getContext(), EditorUI.this.getString(C0966R.string.jz4), (String) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorUI$b */
    public class C93045b implements DialogInterface.OnClickListener {
        public C93045b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(EditorUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorUI$c */
    public class C93046c implements DialogInterface.OnClickListener {
        public C93046c(EditorUI editorUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorUI$d */
    public class C93047d implements DialogInterface.OnClickListener {
        public C93047d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(EditorUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorUI$e */
    public class C93048e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f268065d;

        /* renamed from: com.tencent.mm.plugin.component.editor.EditorUI$e$a */
        public class C93049a implements Runnable {
            public C93049a() {
            }

            public void run() {
                View currentFocus = EditorUI.this.getCurrentFocus();
                if (currentFocus != null) {
                    currentFocus.clearFocus();
                    currentFocus.requestFocusFromTouch();
                }
            }
        }

        public C93048e(boolean z) {
            this.f268065d = z;
        }

        public void run() {
            boolean z = this.f268065d;
            if (z) {
                EditorUI editorUI = EditorUI.this;
                if (!editorUI.f268054s) {
                    editorUI.showVKB();
                    EditorUI.this.f268052q.postDelayed(new C93049a(), 100);
                }
            }
            if (!z) {
                EditorUI editorUI2 = EditorUI.this;
                if (editorUI2.f268054s) {
                    editorUI2.hideVKB();
                    EditorUI.this.f268052q.postDelayed(new C93049a(), 100);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorUI$f */
    public class C93050f implements Runnable {
        public C93050f() {
        }

        public void run() {
            WXRTEditText b = EditorUI.this.f268048j.mo127568b();
            if (b != null) {
                b.clearFocus();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorUI$g */
    public class C93051g implements View.OnTouchListener {

        /* renamed from: com.tencent.mm.plugin.component.editor.EditorUI$g$a */
        public class C93052a implements Runnable {
            public C93052a(C93051g gVar) {
            }

            public void run() {
                C102132i.m134538h().mo141675x(true);
                C102132i.m134538h().mo141677z(true);
            }
        }

        public C93051g() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/EditorUI$21", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                EditorUI.this.f268034B = motionEvent.getX();
                EditorUI.this.f268035C = motionEvent.getY();
            }
            if (motionEvent.getAction() == 1 && EditorUI.this.f268042d.mo17019D0(motionEvent.getX(), motionEvent.getY()) == null) {
                float abs = Math.abs(EditorUI.this.f268034B - motionEvent.getX());
                float abs2 = Math.abs(EditorUI.this.f268035C - motionEvent.getY());
                if (abs < 30.0f && abs2 < 30.0f) {
                    if (EditorUI.this.f268046h.getVisibility() != 8) {
                        C101943d dVar = EditorUI.this.f268047i;
                        if (dVar != null) {
                            dVar.f300124a.dismiss();
                        }
                        EditorUI.this.f268046h.setVisibility(8);
                    } else {
                        int B = C101941c.m134173q().mo141443B() - 1;
                        C100616a l = C101941c.m134173q().mo141456l(B);
                        if (l != null) {
                            boolean z = l.f294796b;
                            C101941c.m134173q().mo141453i();
                            l.f294796b = true;
                            l.f294801g = false;
                            l.f294797c = -1;
                            EditorUI.this.f268043e.notifyItemChanged(B);
                            EditorUI.this.mo127491Z7(true, 50);
                            EditorUI.this.mo127490Y7(1, 0);
                            EditorUI editorUI = EditorUI.this;
                            if (editorUI.f268049n && z) {
                                editorUI.f268052q.postDelayed(new C93052a(this), 100);
                            }
                        }
                    }
                }
            } else if (motionEvent.getAction() == 2) {
                float abs3 = Math.abs(EditorUI.this.f268034B - motionEvent.getX());
                float abs4 = Math.abs(EditorUI.this.f268035C - motionEvent.getY());
                if (abs3 > 120.0f || abs4 > 120.0f) {
                    EditorUI editorUI2 = EditorUI.this;
                    if (editorUI2.f268049n) {
                        if (C102132i.m134538h().mo141664m() == 1) {
                            EditorUI.this.mo127481O7();
                            C102132i.m134538h().mo141655c();
                        }
                    } else if (!editorUI2.f268053r) {
                        editorUI2.mo127481O7();
                    }
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/component/editor/EditorUI$21", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorUI$h */
    public class C93053h implements Runnable {
        public C93053h(EditorUI editorUI) {
        }

        public void run() {
            PopupWindow popupWindow = C102132i.m134538h().f300771r;
            boolean z = true;
            C102132i.m134538h().mo141675x(popupWindow != null && popupWindow.isShowing());
            PopupWindow popupWindow2 = C102132i.m134538h().f300774u;
            if (popupWindow2 == null || !popupWindow2.isShowing()) {
                z = false;
            }
            C102132i.m134538h().mo141677z(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorUI$i */
    public class C93054i implements C93065b.C93067b {

        /* renamed from: com.tencent.mm.plugin.component.editor.EditorUI$i$a */
        public class C93055a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C93062a f268071d;

            public C93055a(C93062a aVar) {
                this.f268071d = aVar;
            }

            public void run() {
                C93062a aVar = this.f268071d;
                if (aVar.f268090j) {
                    EditorUI.this.f268040H.remove(aVar.f268082b);
                    EditorUI editorUI = EditorUI.this;
                    if (editorUI.f268040H.isEmpty()) {
                        editorUI.f268038F.field_edittime = Util.nowSecond();
                        editorUI.f268038F.field_updateTime = Util.nowMilliSecond();
                        C100755z zVar = editorUI.f268038F;
                        zVar.field_favProto.mo141213k(zVar.field_edittime);
                        String w2 = C100755z.m131907w2(editorUI.f268038F);
                        Log.m105919d("MicroMsg.EditorActivityUI", "xmlStr res: %s.", w2);
                        String str = "";
                        boolean z = true;
                        for (int i = 0; i < C101941c.m134173q().mo141443B(); i++) {
                            if (i != 0 && !str.endsWith("\n")) {
                                str = str + "\n";
                            }
                            C100616a l = C101941c.m134173q().mo141456l(i);
                            str = str + C93088r.m117441k(C93088r.m117432b(editorUI, l));
                            if (l.mo140076b() != 1) {
                                z = false;
                            }
                        }
                        editorUI.mo94184P7(str, w2, z);
                        ProgressDialog progressDialog = editorUI.f268060y;
                        if (progressDialog != null) {
                            progressDialog.dismiss();
                            editorUI.f268060y = null;
                        }
                    }
                } else if (aVar.f268092l >= 0) {
                    RecyclerView.C16613e adapter = EditorUI.this.f268042d.getAdapter();
                    int i2 = this.f268071d.f268092l;
                    ((C99785b) EditorUI.this.f268042d.getAdapter()).getClass();
                    adapter.notifyItemChanged(i2 + 0);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.component.editor.EditorUI$i$b */
        public class C93056b implements Runnable {
            public C93056b() {
            }

            public void run() {
                C76879j.m92726T(EditorUI.this.getContext(), EditorUI.this.getString(C0966R.string.m96));
            }
        }

        public C93054i() {
        }

        /* renamed from: a */
        public void mo127454a(C93062a aVar, C93062a.C93064b bVar) {
            if (bVar == C93062a.C93064b.SUCC) {
                EditorUI.this.f268052q.post(new C93055a(aVar));
            }
            if (aVar.f268081a.f299308i1.equals("WeNoteHtmlFile")) {
                EditorUI editorUI = EditorUI.this;
                int i = EditorUI.f268032J;
                editorUI.mo127480N7();
            }
            if (bVar == C93062a.C93064b.ERR) {
                EditorUI.this.mo127476H7();
                ProgressDialog progressDialog = EditorUI.this.f268060y;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                    EditorUI.this.f268060y = null;
                }
                if (aVar.f268090j) {
                    EditorUI.this.f268052q.post(new C93056b());
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorUI$j */
    public class C93057j implements DialogInterface.OnCancelListener {
        public C93057j() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            ProgressDialog progressDialog = EditorUI.this.f268060y;
            if (progressDialog != null) {
                progressDialog.dismiss();
                EditorUI.this.f268060y = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorUI$k */
    public class C93058k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f268075d;

        public C93058k(ArrayList arrayList) {
            this.f268075d = arrayList;
        }

        public void run() {
            int i;
            int i2;
            int i3;
            int i4;
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < this.f268075d.size(); i5++) {
                String str = (String) this.f268075d.get(i5);
                C100626k kVar = new C100626k();
                kVar.f294812q = true;
                kVar.f294811p = 2;
                kVar.f294807l = C101941c.m134173q().mo141455k();
                kVar.f294795a = C100273b.m131073a(kVar.toString(), 18);
                EditorUI.this.f268061z = new C101834rc0();
                EditorUI.this.f268061z.mo141260p(2);
                EditorUI.this.f268061z.mo141257m(kVar.f294795a);
                C101834rc0 rc02 = EditorUI.this.f268061z;
                kVar.f294809n = rc02;
                String c = C100273b.m131075c(rc02);
                C101611g<String, Integer> gVar = C93088r.f268179a;
                if (Util.isNullOrNil(c)) {
                    c = C11881t1.m11565c() + "/" + (C90193h.m112878f((str + System.currentTimeMillis()).getBytes()) + "_HD");
                }
                if (!C86013q1.m106450k(c)) {
                    BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str);
                    if (imageOptions == null || (i = imageOptions.outWidth) <= 0 || (i2 = imageOptions.outHeight) <= 0) {
                        Log.m105920e("MicroMsg.EditorUtil", "GetImageOptions Error");
                        c = null;
                    } else {
                        int i6 = 1280;
                        int i7 = i > 1280 ? 1280 : i;
                        if (i2 <= 1280) {
                            i6 = i2;
                        }
                        if (i2 >= i) {
                            int i8 = i7;
                            i7 = i6;
                            i6 = i8;
                        }
                        if (LongBitmapHandler.isLongPicture(str) > 0) {
                            int i9 = imageOptions.outHeight;
                            i3 = imageOptions.outWidth;
                            i4 = i9;
                        } else {
                            i3 = i6;
                            i4 = i7;
                        }
                        BitmapUtil.createThumbNail(str, i4, i3, Bitmap.CompressFormat.JPEG, 95, c, true);
                    }
                }
                kVar.f294806s = c;
                kVar.f294813r = C93088r.m117433c(c, C100273b.m131077e(EditorUI.this.f268061z));
                kVar.f294810o = C86013q1.m106451l(kVar.f294806s);
                arrayList.add(kVar);
            }
            ProgressDialog progressDialog = EditorUI.this.f268060y;
            if (progressDialog == null || !progressDialog.isShowing()) {
                Log.m105924i("MicroMsg.EditorActivityUI", "user canceled");
                return;
            }
            if (!C101941c.m134173q().mo141449e(arrayList)) {
                C101941c.m134173q().mo141462s(arrayList, EditorUI.this.f268048j.mo127569c(), true, true, false, true, false);
            } else {
                EditorUI.this.mo127486U7();
            }
            EditorUI.this.mo127491Z7(true, 100);
            EditorUI.this.mo127490Y7(1, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorUI$l */
    public class C93059l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f268077d;

        public C93059l(int i) {
            this.f268077d = i;
        }

        public void run() {
            Log.m105925i("MicroMsg.EditorActivityUI", "huahuastart: onNotifyItemChanged,position is %d", Integer.valueOf(this.f268077d));
            EditorUI.this.f268043e.notifyItemChanged(this.f268077d);
            Log.m105925i("MicroMsg.EditorActivityUI", "huahuaend: onNotifyItemChanged,position is %d", Integer.valueOf(this.f268077d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorUI$m */
    public class C93060m implements Runnable {
        public C93060m() {
        }

        public void run() {
            EditorUI.this.f268043e.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorUI$n */
    public class C93061n extends C99784a {
        public C93061n() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
        }
    }

    /* renamed from: H7 */
    public boolean mo127476H7() {
        Class cls = C101213l.class;
        this.f268037E = null;
        C102538a aVar = this.f268045g;
        if (aVar != null && aVar.f301924o) {
            mo127488W7();
            return true;
        } else if (this.f268040H.size() <= 0) {
            return false;
        } else {
            for (C93062a next : this.f268040H.values()) {
                if (next.f268090j) {
                    ((C101213l) C86312j.m106911c(cls)).gn0(next.f268082b);
                    Log.m105925i("MicroMsg.EditorActivityUI", "cancelCurTask send: %s", next.f268082b);
                } else {
                    ((C101213l) C86312j.m106911c(cls)).Gm0(next.f268082b);
                    Log.m105925i("MicroMsg.EditorActivityUI", "cancelCurTask recv: %s", next.f268082b);
                }
            }
            this.f268040H.clear();
            return true;
        }
    }

    /* renamed from: I7 */
    public final void mo127477I7(ArrayList<String> arrayList) {
        if (C101941c.m134173q().mo141450f(0, arrayList.size())) {
            mo127486U7();
            return;
        }
        this.f268060y = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C93057j());
        C86709a0.m107525e().postToWorker(new C93058k(arrayList));
    }

    /* renamed from: J7 */
    public final void mo127478J7(String str) {
        C94554a Z40 = ((C97560f) C86312j.m106911c(C97560f.class)).Z40(str);
        if (Z40 == null) {
            Log.m105921e("MicroMsg.EditorActivityUI", "mediaInfo is null, videoPath is %s", Util.nullAsNil(str));
            return;
        }
        int a = Z40.mo130041a();
        C100630o oVar = new C100630o();
        oVar.f294812q = true;
        oVar.f294827s = "";
        oVar.f294813r = str;
        oVar.f294828t = a;
        oVar.f294811p = 6;
        oVar.f294807l = C101941c.m134173q().mo141455k();
        oVar.f294829u = C86013q1.m106454o(str);
        oVar.f294810o = C86013q1.m106451l(str);
        oVar.f294795a = C100273b.m131073a(oVar.toString(), 18);
        C101834rc0 rc02 = new C101834rc0();
        this.f268061z = rc02;
        rc02.mo141260p(4);
        this.f268061z.mo141257m(oVar.f294795a);
        this.f268061z.mo141261q(oVar.f294829u);
        C101834rc0 rc03 = this.f268061z;
        oVar.f294809n = rc03;
        String e = C100273b.m131077e(rc03);
        String c = C100273b.m131075c(this.f268061z);
        if (!Util.isNullOrNil(str)) {
            Log.m105927v("MicroMsg.EditorActivityUI", "compressNoteVideo path: %s", str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            C101953f Qg0 = ((C98769b) C86312j.m106911c(C98769b.class)).Qg0(arrayList, e, c, oVar, new C93086o(this));
            this.f268033A.put(oVar.f294795a, Qg0);
            ThreadPool.post(Qg0, "NoteEditor_importVideo");
            return;
        }
        Log.m105920e("MicroMsg.EditorActivityUI", "video is null");
    }

    /* renamed from: K7 */
    public abstract long mo94181K7();

    /* renamed from: L5 */
    public void mo94182L5(TextView textView) {
        ((C76979h) C86312j.m106911c(C76979h.class)).F10(textView);
    }

    /* renamed from: L7 */
    public abstract C101835rd0 mo94183L7(C100755z zVar);

    /* renamed from: M7 */
    public void mo127479M7() {
        C100628m mVar = new C100628m();
        mVar.f294819s = "";
        mVar.f294796b = true;
        mVar.f294801g = false;
        mVar.f294797c = 0;
        C101941c.m134173q().mo141452h(false);
        C101941c.m134173q().mo141446b(mVar, false);
        mo127484S7();
        mo127491Z7(true, 50);
        mo127490Y7(1, 0);
    }

    /* renamed from: N7 */
    public final void mo127480N7() {
        boolean z;
        Bitmap b;
        if (this.f268040H.isEmpty()) {
            Log.m105924i("MicroMsg.EditorActivityUI", "download finish, notifyUpdateUI.");
            ArrayList arrayList = new ArrayList();
            Iterator<C101834rc0> it = this.f268039G.iterator();
            ArrayList<String> arrayList2 = null;
            while (it.hasNext()) {
                C101834rc0 next = it.next();
                C100620e eVar = new C100620e();
                eVar.f294807l = next.f299308i1;
                if (next.f299258I == 1) {
                    eVar.f294807l = "-1";
                }
                if (Util.isNullOrNil(eVar.f294807l)) {
                    Log.m105920e("MicroMsg.EditorActivityUI", "noteItemData.localEditorId is null or nil.");
                } else if (eVar.f294807l.equals("WeNoteHtmlFile")) {
                    String c = C100273b.m131075c(next);
                    if (!Util.isNullOrNil(c) && C86013q1.m106450k(c)) {
                        try {
                            arrayList2 = C93088r.m117442l(C86013q1.m106432N(c));
                            Log.m105925i("MicroMsg.EditorActivityUI", "local html file exist, dataId: %s", next.f299280T);
                        } catch (Exception e) {
                            Log.printErrStackTrace("MicroMsg.EditorActivityUI", e, "", new Object[0]);
                        }
                    }
                    Log.m105925i("MicroMsg.EditorActivityUI", "dealWNNoteInfo,WeNoteHtmlFile, cdnurl is null :%B, cdnkey is null : %B ", Boolean.valueOf(Util.isNullOrNil(next.f299325s)), Boolean.valueOf(Util.isNullOrNil(next.f299329u)));
                } else {
                    eVar.f294795a = next.f299280T;
                    int i = next.f299258I;
                    if (i != 1) {
                        if (i == 2) {
                            C100626k kVar = new C100626k();
                            kVar.f294807l = eVar.f294807l;
                            kVar.f294811p = 2;
                            kVar.f294795a = eVar.f294795a;
                            kVar.f294808m = next;
                            kVar.f294810o = next.f299276R;
                            String c2 = C100273b.m131075c(next);
                            if (!Util.isNullOrNil(c2)) {
                                String e2 = C100273b.m131077e(next);
                                C86013q1.m106450k(e2);
                                if (C86013q1.m106450k(c2)) {
                                    kVar.f294812q = true;
                                    C93088r.m117433c(c2, e2);
                                }
                                kVar.f294813r = e2;
                                kVar.f294806s = c2;
                                arrayList.add(kVar);
                            }
                        } else if (i == 3) {
                            C100631p pVar = new C100631p();
                            pVar.f294807l = eVar.f294807l;
                            pVar.f294811p = 4;
                            pVar.f294795a = eVar.f294795a;
                            pVar.f294808m = next;
                            pVar.f294810o = next.f299276R;
                            String c3 = C100273b.m131075c(next);
                            float f = 1.0f;
                            if (!Util.isNullOrNil(c3) && C86013q1.m106450k(c3)) {
                                pVar.f294812q = true;
                                float f2 = ((float) ((long) next.f299338y)) / 1000.0f;
                                if (f2 < 1.0f) {
                                    f2 = 1.0f;
                                }
                                Math.round(f2);
                            }
                            pVar.f294813r = c3;
                            AppCompatActivity context = getContext();
                            float f3 = ((float) ((long) next.f299338y)) / 1000.0f;
                            if (f3 >= 1.0f) {
                                f = f3;
                            }
                            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
                            FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
                            aVar.f264835a = 21;
                            aVar.f264842h = context;
                            aVar.f264848n = (int) ((float) Math.round(f));
                            favoriteOperationEvent.publish();
                            String str = favoriteOperationEvent.f264834e.f264857c;
                            pVar.f294826v = next.f299338y;
                            FavoriteOperationEvent favoriteOperationEvent2 = new FavoriteOperationEvent();
                            FavoriteOperationEvent.C92515a aVar2 = favoriteOperationEvent2.f264833d;
                            aVar2.f264835a = 17;
                            aVar2.f264840f = next;
                            favoriteOperationEvent2.publish();
                            pVar.f294825u = favoriteOperationEvent2.f264834e.f264855a;
                            pVar.f294823s = next.f299262K;
                            arrayList.add(pVar);
                        } else if (i == 4) {
                            C100630o oVar = new C100630o();
                            oVar.f294807l = eVar.f294807l;
                            oVar.f294811p = 6;
                            oVar.f294795a = eVar.f294795a;
                            oVar.f294808m = next;
                            oVar.f294810o = next.f299276R;
                            oVar.f294828t = next.f299338y;
                            oVar.f294827s = C100273b.m131077e(next);
                            String c4 = C100273b.m131075c(next);
                            oVar.f294813r = c4;
                            if (!Util.isNullOrNil(oVar.f294827s) && !C86013q1.m106450k(oVar.f294827s) && C86013q1.m106450k(c4) && (b = C93693r.m118401b(c4)) != null) {
                                try {
                                    Log.m105924i("MicroMsg.EditorActivityUI", "add fav service: create thumbPath bitmap, saveBitmapToImage ");
                                    BitmapUtil.saveBitmapToImage(b, 60, Bitmap.CompressFormat.JPEG, oVar.f294827s, true);
                                } catch (Exception e3) {
                                    Log.printErrStackTrace("MicroMsg.EditorActivityUI", e3, "", new Object[0]);
                                }
                            }
                            if (!Util.isNullOrNil(c4) && C86013q1.m106450k(c4)) {
                                oVar.f294812q = true;
                            }
                            arrayList.add(oVar);
                        } else if (i == 6) {
                            C101871zc0 zc02 = next.f299296c1.f299406e;
                            if (zc02 == null) {
                                zc02 = new C101871zc0();
                                zc02.mo141339v("");
                                zc02.mo141322E("");
                                Log.m105920e("MicroMsg.EditorActivityUI", "locItem is null, dataItemId:" + next.f299280T);
                            }
                            C100621f fVar = new C100621f();
                            fVar.f294807l = eVar.f294807l;
                            fVar.f294811p = 3;
                            fVar.f294795a = eVar.f294795a;
                            fVar.f294808m = next;
                            fVar.f294812q = true;
                            fVar.f294814s = zc02.f299958o;
                            fVar.f294818w = zc02.f299956j;
                            fVar.f294815t = (double) ((float) zc02.f299952f);
                            fVar.f294816u = (double) ((float) zc02.f299950d);
                            fVar.f294817v = (double) zc02.f299954h;
                            fVar.f294813r = "";
                            arrayList.add(fVar);
                        } else if (i == 8) {
                            C100618c cVar = new C100618c();
                            cVar.f294807l = eVar.f294807l;
                            cVar.f294811p = 5;
                            cVar.f294795a = eVar.f294795a;
                            cVar.f294808m = next;
                            cVar.f294810o = next.f299276R;
                            String c5 = C100273b.m131075c(next);
                            if (Util.isNullOrNil(c5) || !C86013q1.m106450k(c5)) {
                                cVar.f294812q = false;
                            } else {
                                cVar.f294812q = true;
                                cVar.f294813r = c5;
                            }
                            cVar.f294820s = next.f299297d;
                            String str2 = next.f299301f;
                            cVar.f294821t = str2;
                            cVar.f294822u = next.f299262K;
                            if (Util.isNullOrNil(str2)) {
                                cVar.f294821t = C100273b.m131076d((float) next.f299276R);
                            }
                            arrayList.add(cVar);
                        }
                    } else if (!Util.isNullOrNil(next.f299301f)) {
                        if (arrayList.size() < 1 || arrayList.get(arrayList.size() - 1) == null || !((C100620e) arrayList.get(arrayList.size() - 1)).f294807l.equals("-1")) {
                            C100628m mVar = new C100628m();
                            mVar.f294807l = eVar.f294807l;
                            mVar.f294819s = next.f299301f;
                            arrayList.add(mVar);
                        } else {
                            C100622g gVar = (C100622g) arrayList.get(arrayList.size() - 1);
                            gVar.f294819s = gVar.f294819s.concat(next.f299301f);
                        }
                    }
                }
            }
            if (arrayList2 != null && arrayList2.size() > 0) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    C100616a aVar3 = (C100616a) it4.next();
                    if (aVar3.mo140076b() != 1) {
                        arrayList3.add(aVar3);
                    }
                }
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    String str3 = arrayList2.get(i2);
                    if (str3.trim().equals("<ThisisNoteNodeHrObj>")) {
                        C100627l lVar = new C100627l();
                        lVar.f294796b = false;
                        lVar.f294801g = false;
                        if (i2 < arrayList3.size()) {
                            arrayList3.add(i2, lVar);
                        } else {
                            arrayList3.add(lVar);
                        }
                    } else if (!str3.trim().equals("<ThisisNoteNodeObj>")) {
                        C100628m mVar2 = new C100628m();
                        mVar2.f294819s = str3;
                        mVar2.f294796b = false;
                        mVar2.f294801g = false;
                        mVar2.f294795a = C100273b.m131073a(mVar2.toString(), 18);
                        if (i2 < arrayList3.size()) {
                            arrayList3.add(i2, mVar2);
                        } else {
                            arrayList3.add(mVar2);
                        }
                    }
                }
                arrayList.clear();
                arrayList.addAll(arrayList3);
            }
            C101941c.m134173q().mo141452h(false);
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                C100620e eVar2 = (C100620e) it5.next();
                switch (eVar2.f294811p) {
                    case -1:
                        C101941c.m134173q().mo141446b((C100627l) eVar2, false);
                        break;
                    case 1:
                        C100628m mVar3 = (C100628m) eVar2;
                        if (Util.isNullOrNil(mVar3.f294819s)) {
                            mVar3.f294819s = "";
                        }
                        String replaceAll = mVar3.f294819s.replaceAll("<font", "<wx-font").replaceAll("<div", "<wx-div").replaceAll("<p", "<wx-p").replaceAll("</font>", "</wx-font>").replaceAll("<ul>", "<wx-ul>").replaceAll("</ul>", "</wx-ul>").replaceAll("<ol>", "<wx-ol>").replaceAll("</ol>", "</wx-ol>").replaceAll("<li>", "<wx-li>").replaceAll("</li>", "</wx-li>").replaceAll("<b>", "<wx-b>").replaceAll("</b>", "</wx-b>").replaceAll("</div>", "</wx-div>").replaceAll("</p>", "</wx-p>");
                        mVar3.f294819s = replaceAll;
                        if (replaceAll.length() > 100) {
                            C101496a.m133260a(mVar3.f294819s);
                        } else {
                            String str4 = mVar3.f294819s;
                            C101611g<String, Integer> gVar2 = C93088r.f268179a;
                            if (!Util.isNullOrNil(str4) && str4.length() >= 5) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 < str4.length()) {
                                        int i4 = i3 + 5;
                                        if (i4 <= str4.length() && "<br/>".equalsIgnoreCase(str4.substring(i3, i4))) {
                                            i3 = i4;
                                        }
                                    } else {
                                        z = true;
                                    }
                                }
                            }
                            z = false;
                            if (z) {
                                String str5 = mVar3.f294819s;
                                mVar3.f294819s = str5.substring(0, str5.length() - 5);
                            }
                        }
                        C101941c.m134173q().mo141446b(mVar3, false);
                        break;
                    case 2:
                        C101941c.m134173q().mo141446b((C100626k) eVar2, false);
                        break;
                    case 3:
                        C101941c.m134173q().mo141446b(eVar2, false);
                        break;
                    case 4:
                        C101941c.m134173q().mo141446b((C100631p) eVar2, false);
                        break;
                    case 5:
                        C101941c.m134173q().mo141446b(eVar2, false);
                        break;
                    case 6:
                        C101941c.m134173q().mo141446b((C100630o) eVar2, false);
                        break;
                }
            }
            mo127484S7();
            C101941c.m134173q().mo141455k();
        }
    }

    /* renamed from: O7 */
    public void mo127481O7() {
        int i;
        C101941c q = C101941c.m134173q();
        synchronized (q) {
            if (q.f300117a != null) {
                i = 0;
                while (true) {
                    if (i >= q.f300117a.size()) {
                        break;
                    } else if (q.f300117a.get(i).f294796b) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            i = -1;
        }
        C100616a l = C101941c.m134173q().mo141456l(i);
        if (l != null) {
            l.f294796b = false;
            l.f294801g = false;
            mo94191h2(i, 0);
        }
        this.f268052q.post(new C93050f());
        mo127491Z7(false, 0);
        mo127490Y7(0, 0);
    }

    /* renamed from: P7 */
    public abstract void mo94184P7(String str, String str2, boolean z);

    /* renamed from: Q7 */
    public void mo127482Q7(WXRTEditText wXRTEditText, boolean z, int i) {
        if (this.f268055t) {
            Log.m105919d("MicroMsg.EditorActivityUI", "onFocusChanged, poi: %s, focus: %s, editor: %s.", Integer.valueOf(i), Boolean.valueOf(z), wXRTEditText);
            EditorLinearLayoutManager editorLinearLayoutManager = (EditorLinearLayoutManager) this.f268042d.getLayoutManager();
            if (editorLinearLayoutManager != null) {
                if (this.f268053r) {
                    editorLinearLayoutManager.f268103x = false;
                } else {
                    editorLinearLayoutManager.f268103x = z;
                }
            }
            if (!z) {
                C101941c.m134173q().mo141469z(-1, false, true);
            } else if (wXRTEditText == null || wXRTEditText.getEditTextType() != 1) {
                C101941c.m134173q().mo141468y(i, false);
            } else {
                C101941c.m134173q().mo141468y(i, true);
            }
        }
    }

    /* renamed from: R7 */
    public int mo127483R7() {
        LinearLayout linearLayout = this.f268044f;
        boolean z = false;
        int i = (linearLayout == null || linearLayout.getVisibility() != 0) ? 0 : this.f268050o + 0;
        if (this.f268045g.f301918i.getVisibility() == 0) {
            z = true;
        }
        return z ? i + this.f268050o : i;
    }

    /* renamed from: S7 */
    public void mo127484S7() {
        this.f268052q.post(new C93060m());
    }

    /* renamed from: T7 */
    public void mo127485T7(int i, int i2) {
        try {
            this.f268043e.notifyItemRangeChanged(i, i2);
        } catch (Exception unused) {
            Log.m105921e("MicroMsg.EditorActivityUI", "onNotifyItemRangeChanged error,positionStart:%d,count:%d", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* renamed from: U7 */
    public void mo127486U7() {
        mo127481O7();
        if (this.f268049n) {
            C102132i.m134538h().mo141655c();
        }
        ProgressDialog progressDialog = this.f268060y;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f268060y = null;
        }
        this.f268052q.postDelayed(new C93044a(), 100);
    }

    /* renamed from: V7 */
    public void mo127487V7() {
        C76879j.m92709C(this, getString(C0966R.string.f361130hi2), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C93045b(), new C93046c(this));
    }

    /* renamed from: W7 */
    public void mo127488W7() {
        C76879j.m92748s(getContext(), getString(C0966R.string.htp), (String) null);
    }

    /* renamed from: X7 */
    public void mo127489X7(boolean z) {
        C93083b bVar = this.f268048j;
        this.f268055t = z;
        bVar.f268168d = z;
        C102132i.m134538h().f300754a = z;
        C100616a l = C101941c.m134173q().mo141456l(0);
        if (l != null) {
            C101941c.m134173q().mo141453i();
            l.f294796b = true;
            l.f294801g = false;
            l.f294797c = -1;
        } else {
            C100628m mVar = new C100628m();
            mVar.f294819s = "";
            mVar.f294796b = true;
            mVar.f294801g = false;
            C101941c.m134173q().mo141446b(mVar, false);
        }
        mo127491Z7(true, 300);
        mo127490Y7(1, 0);
        this.f268042d.setOnTouchListener(this.f268036D);
        mo127484S7();
    }

    /* renamed from: Y7 */
    public void mo127490Y7(int i, long j) {
        if (this.f268055t) {
            this.f268045g.mo142158c(i, j);
        }
    }

    /* renamed from: Z7 */
    public void mo127491Z7(boolean z, long j) {
        if (this.f268055t) {
            this.f268052q.postDelayed(new C93048e(z), j);
        }
    }

    /* renamed from: a8 */
    public final void mo127492a8(C101834rc0 rc02, C93062a.C93063a aVar) {
        Class cls = C101211h.class;
        if (Util.isNullOrNil(rc02.f299329u)) {
            String rN = ((C101211h) C86312j.m106911c(cls)).mo140293rN();
            rc02.mo141253f(rN);
            rc02.mo141255k(((C101211h) C86312j.m106911c(cls)).mo140293rN());
            Log.m105925i("MicroMsg.EditorActivityUI", "local not exist cdn data key, generate CDNkey:%s, thumbKey:%s", rN, rc02.f299309j);
        }
        C93062a aVar2 = new C93062a(rc02, true, aVar, 0);
        this.f268040H.put(aVar2.f268082b, aVar2);
        C93065b.f268104d.mo127511c(aVar2);
    }

    /* renamed from: d5 */
    public void mo94186d5(int i) {
        try {
            this.f268043e.notifyItemRemoved(i);
        } catch (Exception unused) {
            Log.m105921e("MicroMsg.EditorActivityUI", "onNotifyItemRemoved error,positionStart:%d", Integer.valueOf(i));
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cl7;
    }

    /* renamed from: h2 */
    public void mo94191h2(int i, long j) {
        this.f268052q.postDelayed(new C93059l(i), j);
    }

    /* renamed from: k6 */
    public void mo94192k6() {
    }

    /* renamed from: n4 */
    public void mo94193n4(int i, int i2) {
        try {
            this.f268043e.notifyItemRangeInserted(i, i2);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.EditorActivityUI", e, "", new Object[0]);
            Log.m105921e("MicroMsg.EditorActivityUI", "onNotifyItemRangeInserted error,positionStart:%d,count:%d", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105925i("MicroMsg.EditorActivityUI", "onActivityResult reqCode: %d, retCod: %d", Integer.valueOf(i), Integer.valueOf(i2));
        this.f268058w = i;
        if (i2 != -1) {
            this.f268057v = false;
            return;
        }
        this.f268057v = true;
        switch (i) {
            case 4096:
                Log.m105924i("MicroMsg.EditorActivityUI", "onActivityResult back from gallery");
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
                if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
                    Log.m105924i("MicroMsg.EditorActivityUI", "no pic selected");
                } else {
                    mo127477I7(stringArrayListExtra);
                }
                ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_select_video_list");
                String stringExtra = intent.getStringExtra("K_SEGMENTVIDEOPATH");
                if (!Util.isNullOrNil(stringExtra) && stringArrayListExtra2 == null) {
                    stringArrayListExtra2 = new ArrayList<>();
                    stringArrayListExtra2.add(stringExtra);
                }
                if (stringArrayListExtra2 == null || stringArrayListExtra2.size() <= 0) {
                    Log.m105924i("MicroMsg.EditorActivityUI", "no video selected");
                    return;
                } else if (C101941c.m134173q().mo141450f(0, stringArrayListExtra2.size())) {
                    mo127486U7();
                    return;
                } else {
                    mo127478J7(stringArrayListExtra2.get(0));
                    return;
                }
            case 4098:
                if (C101941c.m134173q().mo141450f(0, 1)) {
                    mo127486U7();
                    return;
                }
                C100621f fVar = new C100621f();
                fVar.f294815t = (double) ((float) intent.getDoubleExtra("kwebmap_slat", 0.0d));
                fVar.f294816u = (double) ((float) intent.getDoubleExtra("kwebmap_lng", 0.0d));
                fVar.f294817v = (double) intent.getIntExtra("kwebmap_scale", 0);
                fVar.f294818w = Util.nullAs(intent.getStringExtra("Kwebmap_locaion"), "");
                fVar.f294814s = intent.getStringExtra("kPoiName");
                fVar.f294807l = C101941c.m134173q().mo141455k();
                fVar.f294811p = 3;
                fVar.f294812q = true;
                fVar.f294813r = "";
                C101941c.m134173q().mo141461r(fVar, this.f268048j.mo127569c(), true, true, false, false, false);
                return;
            case 4099:
                ArrayList<String> stringArrayListExtra3 = intent.getStringArrayListExtra("selected_file_lst");
                ArrayList<String> stringArrayListExtra4 = intent.getStringArrayListExtra("selected_file_title_lst");
                if (!Util.isNullOrNil((List) stringArrayListExtra3) && stringArrayListExtra3.size() != 0) {
                    int i3 = 0;
                    while (i3 < stringArrayListExtra3.size()) {
                        String str = stringArrayListExtra3.get(i3);
                        C86009m1 m1Var = new C86009m1(str);
                        if (m1Var.mo119967g()) {
                            if (m1Var.mo119980r() >= C77092c.m93044f()) {
                                Log.m105920e("MicroMsg.EditorActivityUI", "exceed MaxFileSize");
                                mo127486U7();
                                return;
                            } else if (C101941c.m134173q().mo141450f(0, stringArrayListExtra3.size())) {
                                mo127486U7();
                                return;
                            } else {
                                String str2 = stringArrayListExtra4.get(i3);
                                if (this.f268060y == null) {
                                    this.f268060y = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C93079m(this));
                                }
                                C86709a0.m107525e().postToWorker(new C93085n(this, str, str2));
                                i3++;
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4100:
                CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel = (CaptureDataManager.CaptureVideoNormalModel) intent.getParcelableExtra("KSEGMENTMEDIAINFO");
                if (captureVideoNormalModel == null) {
                    Log.m105920e("MicroMsg.EditorActivityUI", "sight capture result is null!");
                    return;
                }
                String str3 = captureVideoNormalModel.f272894e;
                if (!Util.isNullOrNil(str3)) {
                    mo127478J7(str3);
                }
                if (captureVideoNormalModel.f272897h.booleanValue() && !Util.isNullOrNil(captureVideoNormalModel.f272895f)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(captureVideoNormalModel.f272895f);
                    mo127477I7(arrayList);
                    return;
                }
                return;
            case 4101:
                SightCaptureResult sightCaptureResult = (SightCaptureResult) intent.getParcelableExtra("key_req_result");
                if (sightCaptureResult == null) {
                    Log.m105920e("MicroMsg.EditorActivityUI", "sight capture result is null!");
                    return;
                }
                String str4 = sightCaptureResult.f201517g;
                if (!Util.isNullOrNil(str4)) {
                    mo127478J7(str4);
                }
                if (sightCaptureResult.f201515e && !Util.isNullOrNil(sightCaptureResult.f201523p)) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(sightCaptureResult.f201523p);
                    mo127477I7(arrayList2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onCancel() {
        super.onCancel();
        if (this.f268049n) {
            C102132i.m134538h().mo141675x(false);
            C102132i.m134538h().mo141677z(false);
        }
    }

    public void onCreate(Bundle bundle) {
        customfixStatusbar(true);
        super.onCreate(bundle);
        this.f268055t = getIntent().getBooleanExtra("KEY_EDITABLE", true);
        this.f268056u = getIntent().getStringExtra("KEY_CONTENT_XML");
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_CONTENT_PURE_TEXT", false);
        if (Util.isNullOrNil(this.f268056u)) {
            this.f268056u = "";
        }
        Log.m105925i("MicroMsg.EditorActivityUI", "mCollectEditable: %s, mCollectContentXml: %s, pureText:%b", Boolean.valueOf(this.f268055t), this.f268056u, Boolean.valueOf(booleanExtra));
        C101941c q = C101941c.m134173q();
        q.getClass();
        q.f300117a = new ArrayList<>();
        q.f300118b = this;
        q.f300119c = new C101834rc0();
        q.f300120d = 0;
        q.f300121e = 0;
        q.f300122f = 0;
        C93065b.f268104d.mo127510b(this.f268041I);
        getContentView().getRootView().setBackgroundColor(getContext().getResources().getColor(C0966R.color.al6));
        C93083b bVar = new C93083b(this);
        this.f268048j = bVar;
        bVar.f268168d = this.f268055t;
        this.f268042d = (RecyclerView) findViewById(C0966R.C0970id.lq5);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.bh5);
        this.f268044f = linearLayout;
        this.f268045g = new C102538a(this.f268048j, linearLayout, this, mo94181K7());
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C0966R.C0970id.ly6);
        this.f268046h = relativeLayout;
        relativeLayout.setOnClickListener(new C93075i(this));
        this.f268047i = new C101943d(this, this.f268046h, this);
        EditorLinearLayoutManager editorLinearLayoutManager = new EditorLinearLayoutManager(this);
        editorLinearLayoutManager.f268102w = KeyBoardUtil.getScreenWH(this)[1];
        this.f268042d.setLayoutManager(editorLinearLayoutManager);
        this.f268042d.setHasFixedSize(true);
        this.f268042d.mo17043c(new C93061n());
        C99785b bVar2 = new C99785b(this.f268048j);
        this.f268043e = bVar2;
        this.f268042d.setAdapter(bVar2);
        this.f268042d.getItemAnimator().f44807c = 0;
        this.f268042d.getItemAnimator().f44810f = 0;
        this.f268042d.getItemAnimator().f44809e = 0;
        this.f268042d.getItemAnimator().f44808d = 120;
        ((C67092e0) this.f268042d.getItemAnimator()).f192682g = false;
        this.f268050o = C76577a.m92151b(this, 48);
        if (this.f268049n) {
            Log.m105924i("MicroMsg.EditorActivityUI", "use multiselect");
            int color = getResources().getColor(C0966R.color.f3318nr);
            C102132i h = C102132i.m134538h();
            boolean z = this.f268055t;
            h.getClass();
            Log.m105924i("MicroMsg.Editor.EditorSelectManager", "onInit start");
            h.f300754a = z;
            h.f300757d = 14;
            h.f300758e = 32;
            h.f300759f = C76577a.m92151b(this, 21) - h.f300758e;
            h.f300760g = C76577a.m92151b(this, 40) + (h.f300758e * 2);
            h.f300761h = C76577a.m92151b(this, 240) + (h.f300758e * 2);
            h.f300755b = C76577a.m92151b(this, 22);
            h.f300756c = C76577a.m92151b(this, 2);
            h.f300763j = getResources().getDisplayMetrics().heightPixels;
            h.f300764k = getResources().getDisplayMetrics().widthPixels;
            h.f300767n = new int[]{-1, -1};
            h.f300768o = new int[]{-1, -1};
            h.f300769p = new int[]{-1, -1};
            h.f300770q = new int[]{-1, -1};
            int i = color;
            C102123a aVar = new C102123a(this, 2, h.f300755b, h.f300756c, i, h);
            PopupWindow popupWindow = new PopupWindow(aVar, aVar.getViewWidth(), aVar.getViewHeight(), false);
            h.f300771r = popupWindow;
            popupWindow.setClippingEnabled(false);
            h.f300771r.setAnimationStyle(C0966R.style.a5l);
            h.f300765l = aVar.getOffsetForCursorMid();
            h.f300766m = C76577a.m92151b(this, 6);
            C102123a aVar2 = r0;
            C102123a aVar3 = new C102123a(this, 3, h.f300755b, h.f300756c, i, h);
            PopupWindow popupWindow2 = new PopupWindow(aVar2, aVar2.getViewWidth(), aVar.getViewHeight(), false);
            h.f300772s = popupWindow2;
            popupWindow2.setClippingEnabled(false);
            h.f300772s.setAnimationStyle(C0966R.style.a5k);
            C102123a aVar4 = r0;
            C102123a aVar5 = new C102123a(this, 4, h.f300755b, h.f300756c, i, h);
            PopupWindow popupWindow3 = new PopupWindow(aVar4, aVar4.getViewWidth(), aVar.getViewHeight(), false);
            h.f300773t = popupWindow3;
            popupWindow3.setClippingEnabled(false);
            h.f300773t.setAnimationStyle(C0966R.style.a5m);
            View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.cl6, (ViewGroup) null);
            inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            PopupWindow popupWindow4 = new PopupWindow(inflate, -2, -2, false);
            h.f300774u = popupWindow4;
            popupWindow4.setBackgroundDrawable(getResources().getDrawable(C0966R.C0969drawable.ccr));
            h.f300774u.setClippingEnabled(false);
            h.f300774u.setAnimationStyle(C0966R.style.a5o);
            h.f300746B = (TextView) inflate.findViewById(C0966R.C0970id.hi_);
            h.f300747C = (TextView) inflate.findViewById(C0966R.C0970id.f358871hj3);
            h.f300748D = (TextView) inflate.findViewById(C0966R.C0970id.f358868hj0);
            h.f300749E = (TextView) inflate.findViewById(C0966R.C0970id.hiz);
            h.f300750F = (TextView) inflate.findViewById(C0966R.C0970id.hij);
            h.f300751G = (TextView) inflate.findViewById(C0966R.C0970id.hii);
            h.f300752H = (TextView) inflate.findViewById(C0966R.C0970id.hih);
            h.f300753I = (TextView) inflate.findViewById(C0966R.C0970id.hiv);
            h.mo141674w(h.f300746B, h.f300757d);
            h.mo141674w(h.f300747C, h.f300757d);
            h.mo141674w(h.f300748D, h.f300757d);
            h.mo141674w(h.f300749E, h.f300757d);
            h.mo141674w(h.f300750F, h.f300757d);
            h.mo141674w(h.f300751G, h.f300757d);
            h.mo141674w(h.f300752H, h.f300757d);
            h.mo141674w(h.f300753I, h.f300757d);
            h.f300746B.setOnClickListener(new C102138n(h));
            h.f300747C.setOnClickListener(new C102139o(h));
            h.f300748D.setOnClickListener(new C102140p(h));
            h.f300749E.setOnClickListener(new C102141q(h));
            h.f300750F.setOnClickListener(new C102128e(h));
            h.f300751G.setOnClickListener(new C102129f(h));
            h.f300752H.setOnClickListener(new C102130g(h));
            h.f300753I.setOnClickListener(new C102131h(h));
            h.f300762i = aVar.getViewPadding();
            h.f300775v = this;
            h.f300776w = new C102127d();
            h.f300777x = new C102125b();
            h.f300745A = new MMHandler();
            C102132i.f300744K = true;
            Log.m105924i("MicroMsg.Editor.EditorSelectManager", "onInit end");
            C93077k kVar = new C93077k(this);
            this.f268051p = kVar;
            this.f268042d.mo17043c(kVar);
        }
        if (isSupportNavigationSwipeBack()) {
            getSwipeBackLayout().setEnableGesture(false);
        }
        if (!booleanExtra && !this.f268056u.isEmpty()) {
            if (!this.f268056u.isEmpty()) {
                this.f268038F = C100734q.m131886z(this.f268056u, 18);
                this.f268039G.clear();
                this.f268039G.addAll(this.f268038F.field_favProto.f298618f);
                if (this.f268039G.size() != 0) {
                    this.f268040H.clear();
                    Iterator<C101834rc0> it = this.f268039G.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            mo127480N7();
                            break;
                        }
                        C101834rc0 next = it.next();
                        if ("WeNoteHtmlFile".equals(next.f299308i1)) {
                            String c = C100273b.m131075c(next);
                            if (!Util.isNullOrNil(c) && !C86013q1.m106450k(c)) {
                                C93065b.f268104d.mo127511c(new C93062a(this.f268039G.get(0), false, C93062a.C93063a.TYPE_FILE, -1));
                                break;
                            }
                        }
                    }
                } else {
                    Log.m105926v("MicroMsg.EditorActivityUI", "favItemInfo has no data!!!");
                }
            } else {
                Log.m105924i("MicroMsg.EditorActivityUI", "no need update ui by xml!!! xml is empty.");
            }
        } else if (!this.f268056u.isEmpty()) {
            C100628m mVar = new C100628m();
            mVar.f294819s = this.f268056u;
            mVar.f294796b = false;
            mVar.f294801g = false;
            C101941c.m134173q().mo141446b(mVar, false);
            mo127484S7();
        }
        if (this.f268055t) {
            mo127489X7(true);
        } else {
            this.f268044f.setVisibility(8);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f268049n) {
            RecyclerView recyclerView = this.f268042d;
            if (recyclerView != null) {
                recyclerView.mo17098m1(this.f268051p);
            }
            C102132i h = C102132i.m134538h();
            h.getClass();
            Log.m105924i("MicroMsg.Editor.EditorSelectManager", "onDestroy");
            C102132i.f300744K = false;
            MTimerHandler mTimerHandler = h.f300778y;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            MTimerHandler mTimerHandler2 = h.f300779z;
            if (mTimerHandler2 != null) {
                mTimerHandler2.stopTimer();
            }
            PopupWindow popupWindow = h.f300771r;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
            PopupWindow popupWindow2 = h.f300772s;
            if (popupWindow2 != null) {
                popupWindow2.dismiss();
            }
            PopupWindow popupWindow3 = h.f300773t;
            if (popupWindow3 != null) {
                popupWindow3.dismiss();
            }
            PopupWindow popupWindow4 = h.f300774u;
            if (popupWindow4 != null) {
                popupWindow4.dismiss();
            }
            C102132i.f300743J = null;
        }
        C93093a b = C93093a.m117459b();
        b.mo127598e();
        b.f268215o = null;
        b.f268212i = null;
        ((LinkedList) b.f268216p).clear();
        C93093a.f268206q = null;
        if (C100275d.f293766q != null) {
            C100275d.f293766q = null;
        }
        C101941c q = C101941c.m134173q();
        q.f300118b = null;
        ArrayList<C100616a> arrayList = q.f300117a;
        if (arrayList != null) {
            Iterator<C100616a> it = arrayList.iterator();
            while (it.hasNext()) {
                C100616a next = it.next();
                next.f294800f = null;
                next.f294798d = null;
                next.f294799e = null;
            }
        }
        C93065b bVar = C93065b.f268104d;
        ((ArrayList) bVar.f268105a).remove(this.f268041I);
        bVar.mo127512d();
        bVar.mo127512d();
        bVar.f268106b.clear();
        ((ArrayList) bVar.f268105a).clear();
    }

    public void onDrag() {
        super.onDrag();
        if (this.f268049n) {
            C102132i.m134538h().mo141665n();
            C102132i.m134538h().mo141667p();
        }
        if (this.f268054s) {
            Log.m105924i("MicroMsg.EditorActivityUI", "onSwipeBack close vkb");
            hideVKB();
        }
    }

    public void onKeyboardStateChanged() {
        super.onKeyboardStateChanged();
        boolean z = keyboardState() == 1;
        this.f268054s = z;
        if (z) {
            mo127490Y7(1, 0);
        }
        if (this.f268049n) {
            this.f268052q.postDelayed(new C93053h(this), 200);
        }
    }

    public void onPause() {
        super.onPause();
        C102538a aVar = this.f268045g;
        if (aVar != null) {
            aVar.mo142159d(this);
        }
        if (C93093a.m117459b().mo127596c()) {
            C93093a.m117459b().mo127598e();
        }
        this.f268059x = this.f268054s;
        mo127491Z7(false, 0);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr.length <= 0) {
            Log.m105925i("MicroMsg.EditorActivityUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.EditorActivityUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i != 64) {
            if (i == 80 && iArr[0] != 0) {
                mo127487V7();
            }
        } else if (C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null)) && iArr[0] != 0) {
            C76879j.m92709C(getContext(), getString(C0966R.string.f361129hi0), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C93047d(), (DialogInterface.OnClickListener) null);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f268055t) {
            int i = this.f268058w;
            if (i != -1) {
                if (i != 4096) {
                    switch (i) {
                        case 4098:
                        case 4099:
                            mo127491Z7(true, 100);
                            mo127490Y7(1, 0);
                            break;
                        case 4100:
                            break;
                    }
                }
                if (!this.f268057v) {
                    mo127491Z7(true, 100);
                    mo127490Y7(1, 0);
                }
            } else if (this.f268059x) {
                mo127491Z7(true, 100);
                mo127490Y7(1, 0);
            }
        }
        this.f268058w = -1;
        this.f268057v = false;
    }

    /* renamed from: q4 */
    public void mo94194q4(long j) {
    }

    /* renamed from: r3 */
    public void mo94195r3(int i) {
        try {
            this.f268043e.notifyItemInserted(i);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.EditorActivityUI", e, "", new Object[0]);
            Log.m105921e("MicroMsg.EditorActivityUI", "onNotifyItemInserted error,positionStart:%d", Integer.valueOf(i));
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C2193q.class);
    }
}
