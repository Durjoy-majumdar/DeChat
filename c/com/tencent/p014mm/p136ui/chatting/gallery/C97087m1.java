package com.tencent.p014mm.p136ui.chatting.gallery;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.album.p836ui.c2c.gallery.C55068a;
import com.tencent.p014mm.modelcdntran.C92750b0;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.p136ui.chatting.C73304a;
import com.tencent.p014mm.p136ui.chatting.gallery.C97056h;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.thumbplayer.view.ThumbPlayerViewContainer;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96895y1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoTextureView;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import d20.C31050d;
import di3.C7335d;
import di3.C86312j;
import eb0.C75569c4;
import eb0.C75604z3;
import f40.C86709a0;
import fy3.C32224a;
import gj3.C59474h;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import hd0.C98408n0;
import hd0.C98410o0;
import hj3.C20945a;
import i40.C98597b;
import i40.C98598e;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import mh0.C99864d;
import nj3.C76879j;
import p1083jg.C98940b;
import p1086ro.C101415b;
import p159gw.C98250h;
import p181kg.C61089d;
import p434ig.C98672d;
import p500dy.C97560f;
import p606mm.C99933h;
import p682rz.C101488s;
import p682rz.C101491u;
import p682rz.C36594q;
import p740wo.C53193b;
import p849e3.C58521d;
import ph0.C100792a;
import qh0.C62619a;
import rx3.C13598b0;
import sf0.C77702q0;
import sn0.C90259e;
import sx3.C36907w;
import sx3.C64197v;
import te3.tc4;
import th0.C101888l;
import th0.C13924g;
import th0.C64929f;
import th0.C64931i;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.gallery.m1 */
public class C97087m1 {

    /* renamed from: A */
    public TextView f284818A;

    /* renamed from: B */
    public ImageView f284819B;

    /* renamed from: C */
    public MultiTouchImageView f284820C;

    /* renamed from: D */
    public WxImageView f284821D;

    /* renamed from: E */
    public FrameLayout f284822E;

    /* renamed from: F */
    public WxRecyclerView f284823F;

    /* renamed from: G */
    public C55068a f284824G;

    /* renamed from: H */
    public FrameLayout f284825H;

    /* renamed from: I */
    public FrameLayout f284826I;

    /* renamed from: J */
    public C58521d f284827J;

    /* renamed from: K */
    public int f284828K = 0;

    /* renamed from: L */
    public int f284829L = 0;

    /* renamed from: M */
    public int f284830M = 0;

    /* renamed from: N */
    public String f284831N = "";

    /* renamed from: O */
    public long f284832O;

    /* renamed from: P */
    public String f284833P;

    /* renamed from: a */
    public View f284834a;

    /* renamed from: b */
    public C97056h f284835b;

    /* renamed from: c */
    public int f284836c;

    /* renamed from: d */
    public HashMap<String, Boolean> f284837d = new HashMap<>();

    /* renamed from: e */
    public RelativeLayout f284838e;

    /* renamed from: f */
    public C96875r0 f284839f;

    /* renamed from: g */
    public ImageView f284840g;

    /* renamed from: h */
    public ImageView f284841h;

    /* renamed from: i */
    public MMPinProgressBtn f284842i;

    /* renamed from: j */
    public View f284843j;

    /* renamed from: k */
    public TextView f284844k;

    /* renamed from: l */
    public RelativeLayout f284845l;

    /* renamed from: m */
    public RelativeLayout f284846m;

    /* renamed from: n */
    public ImageView f284847n;

    /* renamed from: o */
    public ImageView f284848o;

    /* renamed from: p */
    public C96875r0 f284849p;

    /* renamed from: q */
    public MMPinProgressBtn f284850q;

    /* renamed from: r */
    public TextView f284851r;

    /* renamed from: s */
    public RelativeLayout f284852s;

    /* renamed from: t */
    public TextView f284853t;

    /* renamed from: u */
    public LinearLayout f284854u;

    /* renamed from: v */
    public TextView f284855v;

    /* renamed from: w */
    public TextView f284856w;

    /* renamed from: x */
    public ImageView f284857x;

    /* renamed from: y */
    public ProgressBar f284858y;

    /* renamed from: z */
    public LinearLayout f284859z;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.m1$f */
    public class C57679f implements View.OnClickListener {
        public C57679f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C97087m1.this.mo135965a(true);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.m1$g */
    public class C57680g implements View.OnClickListener {

        /* renamed from: com.tencent.mm.ui.chatting.gallery.m1$g$a */
        public class C57681a implements C32224a<C13598b0> {
            public C57681a() {
            }

            public Object invoke() {
                ((C119157j) C119157j.f356862d).mo183895z(new C57685n1(this));
                return null;
            }
        }

        public C57680g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C55068a aVar = C97087m1.this.f284824G;
            if (aVar != null) {
                C57681a aVar2 = new C57681a();
                aVar.getClass();
                List data = aVar.getData();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = data.iterator();
                while (true) {
                    boolean z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    C61089d dVar = (C61089d) next;
                    if (dVar.f173954g && dVar.f173955h) {
                        z = true;
                    }
                    if (z) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList2, 10));
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((C61089d) it4.next()).f173953f);
                }
                List data2 = aVar.getData();
                ArrayList arrayList4 = new ArrayList();
                for (Object next2 : data2) {
                    C61089d dVar2 = (C61089d) next2;
                    if (dVar2.f173954g && dVar2.f173955h) {
                        arrayList4.add(next2);
                    }
                }
                ArrayList arrayList5 = new ArrayList(C36907w.m41090l(arrayList4, 10));
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(((C61089d) it5.next()).f173951d);
                }
                C101888l lVar = C101888l.f300029a;
                Context context = aVar.mo85797d6().getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                lVar.mo141365o((MMActivity) context, arrayList3, arrayList5, aVar2);
                try {
                    List data3 = aVar.getData();
                    ArrayList arrayList6 = new ArrayList();
                    for (Object next3 : data3) {
                        if (((C61089d) next3).mo75c() == -1) {
                            arrayList6.add(next3);
                        }
                    }
                    int size = arrayList6.size();
                    List data4 = aVar.getData();
                    ArrayList arrayList7 = new ArrayList();
                    for (Object next4 : data4) {
                        C61089d dVar3 = (C61089d) next4;
                        if (dVar3.f173954g && dVar3.f173955h) {
                            arrayList7.add(next4);
                        }
                    }
                    ArrayList arrayList8 = new ArrayList(C36907w.m41090l(arrayList7, 10));
                    Iterator it6 = arrayList7.iterator();
                    while (it6.hasNext()) {
                        arrayList8.add(Integer.valueOf(aVar.getData().indexOf((C61089d) it6.next()) - size));
                    }
                    C72963f4 f4Var = aVar.f154625G;
                    C101888l lVar2 = C101888l.f300029a;
                    ((C99933h) C86312j.m106911c(C99933h.class)).mo84406lr(18, "album_enter_from_scene", C62619a.class, new C98940b(57, f4Var, lVar2.mo141354c(aVar.f154626H).size(), lVar2.mo141355d(aVar.f154626H).size(), arrayList3, arrayList8));
                } catch (Exception unused) {
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.m1$h */
    public class C57682h implements View.OnClickListener {
        public C57682h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C55068a aVar = C97087m1.this.f284824G;
            if (aVar != null) {
                List data = aVar.getData();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = data.iterator();
                while (true) {
                    boolean z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    C61089d dVar = (C61089d) next;
                    if (dVar.f173954g && dVar.f173955h) {
                        z = true;
                    }
                    if (z) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList2, 10));
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((C61089d) it4.next()).f173953f);
                }
                List data2 = aVar.getData();
                ArrayList arrayList4 = new ArrayList();
                for (Object next2 : data2) {
                    C61089d dVar2 = (C61089d) next2;
                    if (dVar2.f173954g && dVar2.f173955h) {
                        arrayList4.add(next2);
                    }
                }
                ArrayList arrayList5 = new ArrayList(C36907w.m41090l(arrayList4, 10));
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(((C61089d) it5.next()).f173951d);
                }
                C101888l lVar = C101888l.f300029a;
                Context context = aVar.mo85797d6().getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                lVar.mo141353b((MMActivity) context, arrayList3, arrayList5);
                try {
                    List data3 = aVar.getData();
                    ArrayList arrayList6 = new ArrayList();
                    for (Object next3 : data3) {
                        if (((C61089d) next3).mo75c() == -1) {
                            arrayList6.add(next3);
                        }
                    }
                    int size = arrayList6.size();
                    List data4 = aVar.getData();
                    ArrayList arrayList7 = new ArrayList();
                    for (Object next4 : data4) {
                        C61089d dVar3 = (C61089d) next4;
                        if (dVar3.f173954g && dVar3.f173955h) {
                            arrayList7.add(next4);
                        }
                    }
                    ArrayList arrayList8 = new ArrayList(C36907w.m41090l(arrayList7, 10));
                    Iterator it6 = arrayList7.iterator();
                    while (it6.hasNext()) {
                        arrayList8.add(Integer.valueOf(aVar.getData().indexOf((C61089d) it6.next()) - size));
                    }
                    C72963f4 f4Var = aVar.f154625G;
                    C101888l lVar2 = C101888l.f300029a;
                    ((C99933h) C86312j.m106911c(C99933h.class)).mo84406lr(18, "album_enter_from_scene", C62619a.class, new C98940b(58, f4Var, lVar2.mo141354c(aVar.f154626H).size(), lVar2.mo141355d(aVar.f154626H).size(), arrayList3, arrayList8));
                } catch (Exception unused) {
                }
            }
            C97087m1.this.mo135965a(true);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.m1$i */
    public class C57683i implements View.OnClickListener {
        public C57683i() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C55068a aVar = C97087m1.this.f284824G;
            if (aVar != null) {
                Class cls = C98250h.class;
                List data = aVar.getData();
                ArrayList arrayList2 = new ArrayList();
                for (Object next : data) {
                    C61089d dVar = (C61089d) next;
                    if (dVar.f173954g && dVar.f173955h) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((C61089d) it.next()).f173953f);
                }
                List data2 = aVar.getData();
                ArrayList arrayList4 = new ArrayList();
                for (Object next2 : data2) {
                    C61089d dVar2 = (C61089d) next2;
                    if (dVar2.f173954g && dVar2.f173955h) {
                        arrayList4.add(next2);
                    }
                }
                ArrayList arrayList5 = new ArrayList(C36907w.m41090l(arrayList4, 10));
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(((C61089d) it4.next()).f173951d);
                }
                Context context = aVar.mo85797d6().getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                MMActivity mMActivity = (MMActivity) context;
                Iterator it5 = arrayList3.iterator();
                int i = 0;
                while (it5.hasNext()) {
                    Object next3 = it5.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        C98672d dVar3 = (C98672d) next3;
                        C72963f4 f4Var = i < arrayList5.size() ? (C72963f4) arrayList5.get(i) : null;
                        C100792a aVar2 = C100792a.f295260a;
                        String t = f4Var != null ? f4Var.mo108768t() : null;
                        if (t == null) {
                            t = "";
                        }
                        Iterator it6 = it5;
                        String e = aVar2.mo140234e(dVar3, t, f4Var != null ? f4Var.getMsgId() : 0);
                        if (f4Var != null) {
                            C98597b.C60245a aVar3 = C98597b.f289091e;
                            C7335d c = C86312j.m106911c(C99864d.class);
                            C87412m.m108593f(c, "getService(AlbumFeatureService::class.java)");
                            ((C101415b) aVar3.mo85231a((C98598e) c, C101415b.class)).mo140924g3(f4Var, dVar3, new C64931i(dVar3, e, mMActivity), (WeakReference<C92750b0>) null);
                        } else if (dVar3.mo55274P() == 4) {
                            ((C98250h) C86312j.m106911c(cls)).mo137342Lm(mMActivity, e, new C13924g(e, mMActivity));
                        } else {
                            ((C98250h) C86312j.m106911c(cls)).mo137346Zv(mMActivity, e, new C64929f(mMActivity));
                        }
                        i = i2;
                        it5 = it6;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                try {
                    List data3 = aVar.getData();
                    ArrayList arrayList6 = new ArrayList();
                    for (Object next4 : data3) {
                        if (((C61089d) next4).mo75c() == -1) {
                            arrayList6.add(next4);
                        }
                    }
                    int size = arrayList6.size();
                    List data4 = aVar.getData();
                    ArrayList arrayList7 = new ArrayList();
                    for (Object next5 : data4) {
                        C61089d dVar4 = (C61089d) next5;
                        if (dVar4.f173954g && dVar4.f173955h) {
                            arrayList7.add(next5);
                        }
                    }
                    ArrayList arrayList8 = new ArrayList(C36907w.m41090l(arrayList7, 10));
                    Iterator it7 = arrayList7.iterator();
                    while (it7.hasNext()) {
                        arrayList8.add(Integer.valueOf(aVar.getData().indexOf((C61089d) it7.next()) - size));
                    }
                    C72963f4 f4Var2 = aVar.f154625G;
                    C101888l lVar = C101888l.f300029a;
                    ((C99933h) C86312j.m106911c(C99933h.class)).mo84406lr(18, "album_enter_from_scene", C62619a.class, new C98940b(59, f4Var2, lVar.mo141354c(aVar.f154626H).size(), lVar.mo141355d(aVar.f154626H).size(), arrayList3, arrayList8));
                } catch (Exception unused) {
                }
            }
            C97087m1.this.mo135965a(true);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.m1$k */
    public class C57684k implements RecyclerView.C16622o {
        public C57684k() {
        }

        /* renamed from: c */
        public void mo126c(RecyclerView recyclerView, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$9", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$9", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
        }

        /* renamed from: d */
        public void mo127d(boolean z) {
        }

        /* renamed from: e */
        public boolean mo6022e(RecyclerView recyclerView, MotionEvent motionEvent) {
            C58521d dVar = C97087m1.this.f284827J;
            return dVar != null && dVar.mo83434a(motionEvent);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.m1$a */
    public class C97088a implements C96875r0.C96876a {

        /* renamed from: com.tencent.mm.ui.chatting.gallery.m1$a$a */
        public class C97089a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f284861d;

            public C97089a(String str) {
                this.f284861d = str;
            }

            public void run() {
                if (Util.isNullOrNil(this.f284861d)) {
                    C76879j.m92738i(C97087m1.this.f284835b.f284714g, C0966R.string.kae, C0966R.string.bam);
                    return;
                }
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                FileProviderHelper.setIntentDataAndType((Context) C97087m1.this.f284835b.f284714g, intent, new C86009m1(this.f284861d), "video/*", false);
                try {
                    ImageGalleryUI imageGalleryUI = C97087m1.this.f284835b.f284714g;
                    Intent createChooser = Intent.createChooser(intent, imageGalleryUI.getContext().getString(C0966R.string.cs8));
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(createChooser);
                    C117292a.m165358d(imageGalleryUI, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    imageGalleryUI.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(imageGalleryUI, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.ImageGalleryViewHolder", "startActivity fail, activity not found");
                    C76879j.m92738i(C97087m1.this.f284835b.f284714g, C0966R.string.cpc, C0966R.string.cpd);
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.gallery.m1$a$b */
        public class C97090b implements Runnable {
            public C97090b() {
            }

            public void run() {
                View view = C97087m1.this.f284843j;
                if (view != null && view.getVisibility() != 0) {
                    if (C97087m1.this.f284843j.getTag() != null && (C97087m1.this.f284843j.getTag() instanceof C98408n0)) {
                        C98408n0 n0Var = (C98408n0) C97087m1.this.f284843j.getTag();
                        tc4 tc4 = n0Var.f288535C;
                        if (tc4 == null || Util.isNullOrNil(tc4.f299537d)) {
                            tc4 tc42 = n0Var.f288535C;
                            if (tc42 != null && !Util.isNullOrNil(tc42.f299539f) && !Util.isNullOrNil(n0Var.f288535C.f299540g)) {
                                View view2 = C97087m1.this.f284843j;
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(8);
                                View view3 = view2;
                                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                return;
                            }
                        } else {
                            View view4 = C97087m1.this.f284843j;
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(8);
                            View view5 = view4;
                            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view5, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                    }
                    View view6 = C97087m1.this.f284843j;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view7 = view6;
                    C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view7, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view8 = C97087m1.this.f284843j;
                    view8.startAnimation(AnimationUtils.loadAnimation(view8.getContext(), C0966R.C0968anim.f2393bw));
                }
            }
        }

        public C97088a() {
        }

        /* renamed from: M0 */
        public int mo76207M0(int i, int i2) {
            return 0;
        }

        public void onCompletion() {
            C97087m1.this.f284839f.start();
            C97087m1.this.f284843j.post(new C97090b());
        }

        public void onError(int i, int i2) {
            C97087m1.this.f284839f.stop();
            String str = (String) ((View) C97087m1.this.f284839f).getTag();
            CrashReportFactory.reportRawMessage(Base64.encodeToString((((C97560f) C86312j.m106911c(C97560f.class)).mo136822Ww() + "[ImageGallery] on play sight error, what=" + i + ", extra=" + i2 + ", path=" + Util.nullAs(str, "")).getBytes(), 2), "FullScreenPlaySight");
            MMHandlerThread.postToMainThread(new C97089a(str));
            C97087m1.this.f284837d.put(str, Boolean.TRUE);
        }

        public void onPrepared() {
        }

        /* renamed from: p3 */
        public void mo76226p3(int i, int i2) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.m1$b */
    public class C97091b implements View.OnClickListener {
        public C97091b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C97087m1 m1Var = C97087m1.this;
            if (m1Var.f284835b != null) {
                Log.m105925i("MicroMsg.ImageGalleryViewHolder", "%d video wait play on click, play video %d", Integer.valueOf(m1Var.hashCode()), Integer.valueOf(C97087m1.this.f284836c));
                C97087m1 m1Var2 = C97087m1.this;
                m1Var2.f284835b.mo135921P(m1Var2.f284836c);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.m1$c */
    public class C97092c implements C96875r0.C96876a {

        /* renamed from: com.tencent.mm.ui.chatting.gallery.m1$c$a */
        public class C97093a implements Runnable {
            public C97093a() {
            }

            public void run() {
                C97087m1.this.f284835b.f284714g.mo135741R8(true);
                C97087m1 m1Var = C97087m1.this;
                C97056h hVar = m1Var.f284835b;
                hVar.f284720p.mo135850w(m1Var.f284836c);
                C97087m1.this.f284835b.f284714g.getClass();
                C97087m1.this.f284835b.f284720p.mo135846s();
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.gallery.m1$c$b */
        public class C97094b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f284867d;

            /* renamed from: e */
            public final /* synthetic */ int f284868e;

            public C97094b(int i, int i2) {
                this.f284867d = i;
                this.f284868e = i2;
            }

            public void run() {
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[8];
                objArr[0] = Integer.valueOf(C97087m1.this.f284829L);
                int i = this.f284867d;
                if (i <= 0) {
                    i = C97087m1.this.f284828K * 1000;
                }
                objArr[1] = Integer.valueOf(i);
                objArr[2] = Integer.valueOf(this.f284868e);
                objArr[3] = 1;
                C97087m1 m1Var = C97087m1.this;
                objArr[4] = m1Var.f284831N;
                objArr[5] = Integer.valueOf(m1Var.f284830M);
                C97087m1 m1Var2 = C97087m1.this;
                objArr[6] = m1Var2.f284833P;
                objArr[7] = Long.valueOf(m1Var2.f284832O);
                nVar.mo160131h(12084, objArr);
            }
        }

        public C97092c() {
        }

        /* renamed from: M0 */
        public int mo76207M0(int i, int i2) {
            Log.m105925i("MicroMsg.ImageGalleryViewHolder", "dkvideo onplaytime:%d total:%d,%d size:%d cnt:%d user:%s", Integer.valueOf(i), Integer.valueOf(C97087m1.this.f284828K), Integer.valueOf(i2), Integer.valueOf(C97087m1.this.f284829L), Integer.valueOf(C97087m1.this.f284830M), C97087m1.this.f284831N);
            C86709a0.m107525e().postToWorker(new C97094b(i2, i));
            return 0;
        }

        public void onCompletion() {
            C97056h hVar = C97087m1.this.f284835b;
            hVar.f284714g.f284478w.mo136024c(hVar.mo135935w(), 7);
            C97087m1.this.f284835b.f284714g.f284478w.f119454i = 4;
            MMHandlerThread.postToMainThread(new C97093a());
        }

        public void onError(int i, int i2) {
            Log.m105928w("MicroMsg.ImageGalleryViewHolder", "play video error what : " + i + " extra: " + i2);
            C97056h hVar = C97087m1.this.f284835b;
            if (hVar != null) {
                hVar.f284720p.mo135847t(i, i2);
            }
            C97123s sVar = C97087m1.this.f284835b.f284714g.f284478w;
            sVar.f119454i = 4;
            sVar.f119450e = "what : " + i + " extra: " + i2;
            C115669n nVar = C115669n.INSTANCE;
            C97087m1 m1Var = C97087m1.this;
            C97087m1 m1Var2 = C97087m1.this;
            nVar.mo160131h(12084, Integer.valueOf(C97087m1.this.f284829L), Integer.valueOf(C97087m1.this.f284828K * 1000), 0, 4, m1Var.f284831N, Integer.valueOf(m1Var.f284830M), m1Var2.f284833P, Long.valueOf(m1Var2.f284832O));
        }

        public void onPrepared() {
            C97056h hVar = C97087m1.this.f284835b;
            if (hVar != null) {
                hVar.f284720p.mo135848u();
            }
        }

        /* renamed from: p3 */
        public void mo76226p3(int i, int i2) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.m1$d */
    public class C97095d implements View.OnClickListener {

        /* renamed from: com.tencent.mm.ui.chatting.gallery.m1$d$a */
        public class C97096a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Intent f284871d;

            public C97096a(Intent intent) {
                this.f284871d = intent;
            }

            public void run() {
                C88144b.m109791i(C97087m1.this.f284835b.f284714g.getContext(), "webview", ".ui.tools.WebViewUI", this.f284871d, (Bundle) null);
            }
        }

        public C97095d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getTag() != null && (view.getTag() instanceof C72963f4)) {
                C72963f4 f4Var = (C72963f4) view.getTag();
                C73304a.C73305a aVar = C73304a.C73305a.EnterCompleteVideo;
                PString pString = new PString();
                PString pString2 = new PString();
                if (C73304a.m86446b(f4Var, pString, pString2)) {
                    C73304a.m86445a(aVar, f4Var, pString.value, pString2.value);
                }
                C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(f4Var.mo108765s2());
                tc4 tc4 = Zd.f288535C;
                if (tc4 != null && !C77702q0.m93719b(tc4.f299537d)) {
                    String r = ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137729r(f4Var.mo108765s2());
                    Intent intent = new Intent();
                    intent.putExtra("KFromTimeLine", false);
                    intent.putExtra("KStremVideoUrl", tc4.f299537d);
                    intent.putExtra("KThumUrl", tc4.f299542i);
                    intent.putExtra("KThumbPath", r);
                    intent.putExtra("KMediaId", "fakeid_" + f4Var.getMsgId());
                    intent.putExtra("KMediaVideoTime", tc4.f299538e);
                    intent.putExtra("KMediaTitle", tc4.f299541h);
                    intent.putExtra("StreamWording", tc4.f299539f);
                    intent.putExtra("StremWebUrl", tc4.f299540g);
                    String t = f4Var.mo108768t();
                    boolean U5 = C72996z1.m85820U5(t);
                    String s = U5 ? C75604z3.m90847s(f4Var.getContent()) : t;
                    intent.putExtra("KSta_StremVideoAduxInfo", tc4.f299543j);
                    intent.putExtra("KSta_StremVideoPublishId", tc4.f299544n);
                    intent.putExtra("KSta_SourceType", 1);
                    intent.putExtra("KSta_Scene", U5 ? 4 : 3);
                    intent.putExtra("KSta_FromUserName", s);
                    intent.putExtra("KSta_ChatName", t);
                    intent.putExtra("KSta_MsgId", f4Var.mo108774y2());
                    intent.putExtra("KSta_SnsStatExtStr", Zd.f288536D);
                    if (U5) {
                        intent.putExtra("KSta_ChatroomMembercount", ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(t));
                    }
                    if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_landing_page_new_stream_video, 1) > 0) {
                        C88144b.m109791i(C97087m1.this.f284835b.f284714g.getContext(), "sns", ".ui.SnsAdStreamVideoPlayUI", intent, (Bundle) null);
                        Log.m105924i("MicroMsg.ImageGalleryViewHolder", "use new stream video play UI");
                    } else {
                        C88144b.m109791i(C97087m1.this.f284835b.f284714g.getContext(), "sns", ".ui.VideoAdPlayerUI", intent, (Bundle) null);
                    }
                } else if (tc4 != null && !Util.isNullOrNil(tc4.f299539f) && !Util.isNullOrNil(tc4.f299540g)) {
                    Log.m105924i("MicroMsg.ImageGalleryViewHolder", "moreBtn click,opening " + tc4.f299540g);
                    Intent intent2 = new Intent();
                    Bundle bundle = new Bundle();
                    bundle.putString("key_snsad_statextstr", Zd.f288536D);
                    intent2.putExtra("jsapiargs", bundle);
                    intent2.putExtra("rawUrl", tc4.f299540g);
                    intent2.putExtra("useJs", true);
                    new MMHandler(Looper.getMainLooper()).post(new C97096a(intent2));
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.m1$e */
    public class C97097e implements C32224a<C13598b0> {
        public C97097e() {
        }

        public Object invoke() {
            C97056h hVar = C97087m1.this.f284835b;
            if (hVar == null) {
                return null;
            }
            ImageGalleryUI imageGalleryUI = hVar.f284714g;
            if (imageGalleryUI.f284434g2 || !imageGalleryUI.getIntent().getBooleanExtra("img_gallery_enter_use_share_element_anim", false)) {
                return null;
            }
            imageGalleryUI.f284434g2 = true;
            ((C59474h) imageGalleryUI.component(C59474h.class)).f169946d.mo84574b(new C97153x(imageGalleryUI), C20945a.f59387a);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.m1$j */
    public class C97098j implements GestureDetector.OnGestureListener {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f284874d;

        public C97098j(C72963f4 f4Var) {
            this.f284874d = f4Var;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
            C55068a aVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$8", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            C97087m1 m1Var = C97087m1.this;
            if (!(m1Var.f284835b == null || (aVar = m1Var.f284824G) == null || aVar.mo76188C6())) {
                if (!C101888l.f300029a.mo141352a(this.f284874d.mo108768t())) {
                    C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$8", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
                    return;
                }
                WxRecyclerView wxRecyclerView = C97087m1.this.f284823F;
                if (wxRecyclerView != null) {
                    wxRecyclerView.performHapticFeedback(0);
                }
                C97087m1.this.f284835b.f284714g.mo135751W8();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$8", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        public void onShowPress(MotionEvent motionEvent) {
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$8", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$8", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    public C97087m1(C97056h hVar, View view, C72963f4 f4Var) {
        this.f284834a = view;
        this.f284835b = hVar;
        this.f284820C = (MultiTouchImageView) view.findViewById(C0966R.C0970id.f39);
        this.f284821D = (WxImageView) view.findViewById(C0966R.C0970id.f359612lu3);
        this.f284858y = (ProgressBar) view.findViewById(C0966R.C0970id.f4a);
        WxImageView wxImageView = this.f284821D;
        if (wxImageView != null) {
            wxImageView.setForceTileFlag(C31050d.Tile);
        }
        if (f4Var != null && f4Var.getType() == 1124073521) {
            mo135966b(f4Var, C55068a.m62186B6(f4Var));
        }
    }

    /* renamed from: a */
    public void mo135965a(boolean z) {
        if (this.f284824G != null) {
            if (!z) {
                this.f284825H.setVisibility(0);
                this.f284826I.setVisibility(0);
                C55068a aVar = this.f284824G;
                for (C61089d dVar : aVar.getData()) {
                    dVar.f173954g = true;
                }
                aVar.notifyDataSetChanged();
                this.f284835b.f284714g.f284450n.setSingleMode(true);
                this.f284835b.f284714g.mo135719B8();
                this.f284835b.f284725u = false;
            } else {
                this.f284825H.setVisibility(8);
                this.f284826I.setVisibility(8);
                C55068a aVar2 = this.f284824G;
                for (C61089d dVar2 : aVar2.getData()) {
                    dVar2.f173954g = false;
                }
                aVar2.notifyDataSetChanged();
                this.f284835b.f284714g.f284450n.setSingleMode(false);
                this.f284835b.f284714g.mo135753X8(false);
                this.f284835b.f284725u = true;
            }
        }
        FrameLayout frameLayout = this.f284826I;
        if (frameLayout != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.bottomMargin = C75044y4.m89991c(this.f284834a.getContext());
            this.f284826I.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [android.content.Context] */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0045, code lost:
        r3 = r1.mo55348A();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.p136ui.chatting.gallery.C97087m1 mo135966b(com.tencent.p014mm.storage.C72963f4 r12, p434ig.C98674g r13) {
        /*
            r11 = this;
            android.widget.FrameLayout r0 = r11.f284822E
            if (r0 != 0) goto L_0x01dc
            android.view.View r0 = r11.f284834a
            r1 = 2131296861(0x7f09025d, float:1.821165E38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r0 = r0.inflate()
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r11.f284822E = r0
            r1 = 2131296860(0x7f09025c, float:1.8211649E38)
            android.view.View r0 = r0.findViewById(r1)
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r0
            r11.f284823F = r0
            com.tencent.mm.album.ui.c2c.gallery.a r0 = new com.tencent.mm.album.ui.c2c.gallery.a
            android.view.View r1 = r11.f284834a
            android.content.Context r1 = r1.getContext()
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r1 = (com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI) r1
            gj3.a r1 = r1.f284459p2
            r0.<init>(r12, r13, r1)
            r11.f284824G = r0
            com.tencent.mm.view.recyclerview.WxRecyclerView r13 = r11.f284823F
            r13.setAdapter(r0)
            com.tencent.mm.album.ui.c2c.gallery.a r13 = r11.f284824G
            com.tencent.mm.ui.chatting.gallery.h r0 = r11.f284835b
            com.tencent.mm.storage.f4 r0 = r0.mo135935w()
            ig.g r1 = r13.f154626H
            r2 = 0
            if (r1 == 0) goto L_0x0050
            java.util.List r3 = r1.mo55348A()
            if (r3 == 0) goto L_0x0050
            int r3 = r3.size()
            goto L_0x0051
        L_0x0050:
            r3 = 0
        L_0x0051:
            r4 = 5
            r5 = 2
            if (r3 >= r4) goto L_0x0067
            if (r1 == 0) goto L_0x0061
            java.util.List r1 = r1.mo55348A()
            if (r1 == 0) goto L_0x0061
            int r2 = r1.size()
        L_0x0061:
            if (r2 >= r5) goto L_0x0065
            r1 = 1
            goto L_0x0068
        L_0x0065:
            r1 = 2
            goto L_0x0068
        L_0x0067:
            r1 = 3
        L_0x0068:
            androidx.recyclerview.widget.GridLayoutManager r2 = new androidx.recyclerview.widget.GridLayoutManager
            androidx.recyclerview.widget.RecyclerView r3 = r13.mo85797d6()
            android.content.Context r3 = r3.getContext()
            r2.<init>(r3, r1)
            r13.f154631M = r2
            androidx.recyclerview.widget.RecyclerView r2 = r13.mo85797d6()
            androidx.recyclerview.widget.GridLayoutManager r3 = r13.f154631M
            r4 = 0
            if (r3 == 0) goto L_0x01d6
            r2.setLayoutManager(r3)
            androidx.recyclerview.widget.RecyclerView r2 = r13.mo85797d6()
            kg.g r3 = new kg.g
            androidx.recyclerview.widget.RecyclerView r6 = r13.mo85797d6()
            android.content.Context r6 = r6.getContext()
            java.lang.String r7 = "recyclerView.context"
            gy3.C87412m.m108593f(r6, r7)
            int r6 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r6, r5)
            androidx.recyclerview.widget.RecyclerView r8 = r13.mo85797d6()
            android.content.Context r8 = r8.getContext()
            gy3.C87412m.m108593f(r8, r7)
            int r5 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r8, r5)
            r3.<init>(r1, r6, r5)
            r2.mo17085h0(r3)
            kg.c r1 = new kg.c
            r1.<init>(r13)
            r13.f165746y = r1
            androidx.recyclerview.widget.RecyclerView r1 = r13.mo85797d6()
            android.content.Context r1 = r1.getContext()
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L_0x00c6
            r4 = r1
            android.app.Activity r4 = (android.app.Activity) r4
        L_0x00c6:
            java.lang.String r1 = "album_enter_from_scene"
            if (r4 == 0) goto L_0x00d4
            android.content.Intent r2 = r4.getIntent()
            if (r2 == 0) goto L_0x00d4
            r3 = -1
            r2.getIntExtra(r1, r3)
        L_0x00d4:
            com.tencent.mm.storage.f4 r2 = r13.f154625G
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            if (r0 == 0) goto L_0x010d
            com.tencent.mm.storage.f4 r5 = r13.f154625G
            th0.l r0 = th0.C101888l.f300029a
            ig.g r2 = r13.f154626H
            java.util.List r2 = r0.mo141354c(r2)
            int r6 = r2.size()
            ig.g r13 = r13.f154626H
            java.util.List r13 = r0.mo141355d(r13)
            int r7 = r13.size()
            r3 = 1
            r9 = 0
            r8 = 0
            java.lang.Class<mm.h> r13 = p606mm.C99933h.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            mm.h r13 = (p606mm.C99933h) r13
            java.lang.Class<qh0.a> r0 = qh0.C62619a.class
            jg.a r10 = new jg.a
            r2 = r10
            r2.<init>(r3, r5, r6, r7, r8, r9)
            r2 = 18
            r13.mo84406lr(r2, r1, r0, r10)
        L_0x010d:
            bl3.r r13 = bl3.C39818r.f106831a
            android.view.View r0 = r11.f284834a
            android.content.Context r0 = r0.getContext()
            bl3.r$a r13 = r13.mo62443b(r0)
            java.lang.Class<gj3.h> r0 = gj3.C59474h.class
            androidx.lifecycle.i0 r13 = r13.mo75002a(r0)
            gj3.h r13 = (gj3.C59474h) r13
            gj3.e r13 = r13.f169946d
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r11.f284823F
            com.tencent.mm.ui.chatting.gallery.m1$e r1 = new com.tencent.mm.ui.chatting.gallery.m1$e
            r1.<init>()
            r13.getClass()
            com.tencent.mm.ui.anim.transition.MMTransitionHelper r13 = com.tencent.p014mm.p136ui.anim.transition.MMTransitionHelper.f165034a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r2 = "monitorViewReady() called with: recyclerView = "
            r13.append(r2)
            r13.append(r0)
            java.lang.String r2 = ", callback = "
            r13.append(r2)
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            java.lang.String r2 = "MM.Transition"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r13)
            if (r0 != 0) goto L_0x0151
            goto L_0x0159
        L_0x0151:
            gj3.b r13 = new gj3.b
            r13.<init>(r1)
            p849e3.C58525r.m67941a(r0, r13)
        L_0x0159:
            android.widget.FrameLayout r13 = r11.f284822E
            r0 = 2131296893(0x7f09027d, float:1.8211716E38)
            android.view.View r13 = r13.findViewById(r0)
            android.widget.FrameLayout r13 = (android.widget.FrameLayout) r13
            r11.f284825H = r13
            android.widget.FrameLayout r13 = r11.f284822E
            r0 = 2131296782(0x7f09020e, float:1.821149E38)
            android.view.View r13 = r13.findViewById(r0)
            android.widget.FrameLayout r13 = (android.widget.FrameLayout) r13
            r11.f284826I = r13
            android.widget.FrameLayout r13 = r11.f284822E
            r0 = 2131296783(0x7f09020f, float:1.8211492E38)
            android.view.View r13 = r13.findViewById(r0)
            android.widget.TextView r13 = (android.widget.TextView) r13
            com.tencent.mm.ui.chatting.gallery.m1$f r0 = new com.tencent.mm.ui.chatting.gallery.m1$f
            r0.<init>()
            r13.setOnClickListener(r0)
            android.widget.FrameLayout r13 = r11.f284822E
            r0 = 2131305338(0x7f09237a, float:1.8228844E38)
            android.view.View r13 = r13.findViewById(r0)
            com.tencent.mm.ui.chatting.gallery.m1$g r0 = new com.tencent.mm.ui.chatting.gallery.m1$g
            r0.<init>()
            r13.setOnClickListener(r0)
            android.widget.FrameLayout r13 = r11.f284822E
            r0 = 2131305336(0x7f092378, float:1.822884E38)
            android.view.View r13 = r13.findViewById(r0)
            com.tencent.mm.ui.chatting.gallery.m1$h r0 = new com.tencent.mm.ui.chatting.gallery.m1$h
            r0.<init>()
            r13.setOnClickListener(r0)
            android.widget.FrameLayout r13 = r11.f284822E
            r0 = 2131305334(0x7f092376, float:1.8228836E38)
            android.view.View r13 = r13.findViewById(r0)
            com.tencent.mm.ui.chatting.gallery.m1$i r0 = new com.tencent.mm.ui.chatting.gallery.m1$i
            r0.<init>()
            r13.setOnClickListener(r0)
            e3.d r13 = new e3.d
            android.view.View r0 = r11.f284834a
            android.content.Context r0 = r0.getContext()
            com.tencent.mm.ui.chatting.gallery.m1$j r1 = new com.tencent.mm.ui.chatting.gallery.m1$j
            r1.<init>(r12)
            r13.<init>(r0, r1)
            r11.f284827J = r13
            com.tencent.mm.view.recyclerview.WxRecyclerView r12 = r11.f284823F
            com.tencent.mm.ui.chatting.gallery.m1$k r13 = new com.tencent.mm.ui.chatting.gallery.m1$k
            r13.<init>()
            r12.mo17092j0(r13)
            goto L_0x01dc
        L_0x01d6:
            java.lang.String r12 = "gridLM"
            gy3.C87412m.m108603p(r12)
            throw r4
        L_0x01dc:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97087m1.mo135966b(com.tencent.mm.storage.f4, ig.g):com.tencent.mm.ui.chatting.gallery.m1");
    }

    /* renamed from: c */
    public C97087m1 mo135967c() {
        if (this.f284854u == null) {
            LinearLayout linearLayout = (LinearLayout) ((ViewStub) this.f284834a.findViewById(C0966R.C0970id.f4d)).inflate();
            this.f284854u = linearLayout;
            ProgressBar progressBar = (ProgressBar) linearLayout.findViewById(C0966R.C0970id.c_q);
            this.f284855v = (TextView) this.f284854u.findViewById(C0966R.C0970id.c_r);
            this.f284856w = (TextView) this.f284854u.findViewById(C0966R.C0970id.c_p);
            this.f284857x = (ImageView) this.f284854u.findViewById(C0966R.C0970id.c_s);
        }
        return this;
    }

    /* renamed from: d */
    public C97087m1 mo135968d() {
        if (this.f284859z == null) {
            LinearLayout linearLayout = (LinearLayout) ((ViewStub) this.f284834a.findViewById(C0966R.C0970id.f4b)).inflate();
            this.f284859z = linearLayout;
            this.f284819B = (ImageView) linearLayout.findViewById(C0966R.C0970id.c9x);
            this.f284818A = (TextView) this.f284859z.findViewById(C0966R.C0970id.c9y);
        }
        return this;
    }

    /* renamed from: e */
    public C97087m1 mo135969e() {
        if (this.f284838e == null) {
            this.f284838e = (RelativeLayout) ((ViewStub) this.f284834a.findViewById(C0966R.C0970id.jl8)).inflate();
            this.f284839f = C96895y1.m124471a(this.f284834a.getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            this.f284838e.addView((View) this.f284839f, layoutParams);
            View view = (View) this.f284839f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder", "getSightView", "()Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder", "getSightView", "()Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById = this.f284838e.findViewById(C0966R.C0970id.knp);
            this.f284843j = findViewById;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder", "getSightView", "()Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder", "getSightView", "()Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f284844k = (TextView) this.f284838e.findViewById(C0966R.C0970id.jjx);
            MMPinProgressBtn mMPinProgressBtn = (MMPinProgressBtn) this.f284838e.findViewById(C0966R.C0970id.f359206jl2);
            this.f284842i = mMPinProgressBtn;
            mMPinProgressBtn.setVisibility(8);
            this.f284840g = (ImageView) this.f284838e.findViewById(C0966R.C0970id.f359207jl3);
            this.f284841h = (ImageView) this.f284838e.findViewById(C0966R.C0970id.f359494l81);
            this.f284839f.setVideoCallback(new C97088a());
            this.f284844k.setOnClickListener(new C97095d());
        }
        return this;
    }

    /* renamed from: f */
    public C97087m1 mo135970f() {
        if (this.f284845l == null) {
            WxImageView wxImageView = this.f284821D;
            if (wxImageView != null) {
                wxImageView.setVisibility(8);
            }
            MultiTouchImageView multiTouchImageView = this.f284820C;
            if (multiTouchImageView != null) {
                multiTouchImageView.setVisibility(8);
            }
            RelativeLayout relativeLayout = (RelativeLayout) ((ViewStub) this.f284834a.findViewById(C0966R.C0970id.l7c)).inflate();
            this.f284845l = relativeLayout;
            this.f284846m = (RelativeLayout) relativeLayout.findViewById(C0966R.C0970id.opi);
            this.f284847n = (ImageView) this.f284845l.findViewById(C0966R.C0970id.f359489l61);
            ImageView imageView = (ImageView) this.f284845l.findViewById(C0966R.C0970id.f359493l80);
            this.f284848o = imageView;
            imageView.setOnClickListener(new C97091b());
            if (C97136u0.f285023E) {
                Context context = this.f284834a.getContext();
                C87412m.m108594g(context, "context");
                this.f284849p = new ThumbPlayerViewContainer(context, (AttributeSet) null, 0, 6, (C8480h) null);
            } else if (((C36594q) C86312j.m106911c(C36594q.class)).mo60728Am()) {
                this.f284849p = new VideoPlayerTextureView(this.f284834a.getContext(), (AttributeSet) null);
                C115669n.INSTANCE.idkeyStat(354, 150, 1, false);
            } else {
                this.f284849p = new VideoTextureView(this.f284834a.getContext(), (AttributeSet) null);
                C115669n.INSTANCE.idkeyStat(354, 151, 1, false);
            }
            this.f284851r = (TextView) this.f284834a.findViewById(C0966R.C0970id.bzn);
            this.f284849p.setPlayProgressCallback(true);
            this.f284846m.addView((View) this.f284849p, 1, new RelativeLayout.LayoutParams(-1, -1));
            MMPinProgressBtn mMPinProgressBtn = (MMPinProgressBtn) this.f284845l.findViewById(C0966R.C0970id.l5i);
            this.f284850q = mMPinProgressBtn;
            mMPinProgressBtn.setVisibility(8);
            View view = (View) this.f284849p;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder", "getVideoView", "()Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder", "getVideoView", "()Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f284852s = (RelativeLayout) this.f284834a.findViewById(C0966R.C0970id.l5s);
            this.f284853t = (TextView) this.f284834a.findViewById(C0966R.C0970id.l5t);
            this.f284849p.setVideoCallback(new C97092c());
        }
        return this;
    }

    /* renamed from: g */
    public void mo135971g(int i, C97056h.C97067g gVar, C72963f4 f4Var) {
        this.f284836c = i;
        mo135972h(this.f284834a, 0);
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            mo135972h(this.f284834a, 8);
            mo135972h(this.f284845l, 8);
            mo135972h(this.f284838e, 8);
        } else if (ordinal == 1) {
            mo135972h(this.f284845l, 8);
            mo135972h(this.f284838e, 8);
        } else if (ordinal == 2) {
            mo135970f();
            float f = !C75569c4.m90663I(f4Var) ? 1.0f : C75569c4.f222003f;
            this.f284847n.setScaleX(f);
            this.f284847n.setScaleY(f);
            ((View) this.f284849p).setScaleX(f);
            ((View) this.f284849p).setScaleY(f);
            mo135972h(this.f284845l, 0);
            mo135972h(this.f284838e, 8);
            if (this.f284838e != null) {
                mo135972h(this.f284840g, 8);
            }
        } else if (ordinal == 3) {
            mo135969e();
            mo135972h(this.f284845l, 8);
            mo135972h(this.f284838e, 0);
        }
        mo135972h(this.f284820C, 8);
        mo135972h(this.f284821D, 8);
        mo135972h(this.f284854u, 8);
        mo135972h(this.f284859z, 8);
        mo135972h(this.f284858y, 8);
    }

    /* renamed from: h */
    public void mo135972h(View view, int i) {
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder", "setVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder", "setVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: i */
    public void mo135973i(boolean z, float f) {
        Log.m105925i("MicroMsg.ImageGalleryViewHolder", "%d switch video model isVideoPlay[%b] alpha[%f]", Integer.valueOf(hashCode()), Boolean.valueOf(z), Float.valueOf(f));
        if (z) {
            mo135970f();
            View view = (View) this.f284849p;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(f));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder", "switchVideoModel", "(ZF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder", "switchVideoModel", "(ZF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo135972h(view, 0);
            if (((double) f) >= 1.0d) {
                mo135970f();
                mo135972h(this.f284847n, 8);
                mo135970f();
                mo135972h(this.f284848o, 8);
                return;
            }
            return;
        }
        mo135970f();
        mo135972h((View) this.f284849p, 8);
        mo135970f();
        mo135972h(this.f284847n, 0);
        mo135970f();
        mo135972h(this.f284848o, 0);
    }
}
