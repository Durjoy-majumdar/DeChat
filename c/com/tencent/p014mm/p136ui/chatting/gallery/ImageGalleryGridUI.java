package com.tencent.p014mm.p136ui.chatting.gallery;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.GalleryPhotoInfoEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.chatting.C73304a;
import com.tencent.p014mm.p136ui.chatting.C73313b1;
import com.tencent.p014mm.p136ui.chatting.C73871v0;
import com.tencent.p014mm.p136ui.chatting.gallery.C73708v;
import com.tencent.p014mm.p136ui.gridviewheaders.C74763a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C96789p0;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C97625j3;
import gc0.C20828a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C76912y0;
import nj3.C88989a;
import s90.C77632o;
import te3.C64878zd0;

@C88989a(19)
/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI */
public class ImageGalleryGridUI extends MMActivity implements AdapterView.OnItemClickListener, ViewTreeObserver.OnPreDrawListener, MenuItem.OnMenuItemClickListener, View.OnClickListener, C73708v.C73711c, C77632o {

    /* renamed from: E */
    public static final /* synthetic */ int f216364E = 0;

    /* renamed from: A */
    public View f216365A;

    /* renamed from: B */
    public View f216366B;

    /* renamed from: C */
    public View f216367C;

    /* renamed from: D */
    public View f216368D;

    /* renamed from: d */
    public String f216369d;

    /* renamed from: e */
    public long f216370e;

    /* renamed from: f */
    public boolean f216371f;

    /* renamed from: g */
    public int f216372g;

    /* renamed from: h */
    public GridView f216373h;

    /* renamed from: i */
    public C73706n f216374i;

    /* renamed from: j */
    public MMHandler f216375j;

    /* renamed from: n */
    public Boolean f216376n;

    /* renamed from: o */
    public TextView f216377o;

    /* renamed from: p */
    public TextView f216378p;

    /* renamed from: q */
    public Runnable f216379q = new C73695b();

    /* renamed from: r */
    public IListener f216380r = new IListener<GalleryPhotoInfoEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1036677180;
        }

        public boolean callback(IEvent iEvent) {
            View childAt;
            GalleryPhotoInfoEvent galleryPhotoInfoEvent = (GalleryPhotoInfoEvent) iEvent;
            int i = galleryPhotoInfoEvent.f264882d.f264885b;
            ImageGalleryGridUI imageGalleryGridUI = ImageGalleryGridUI.this;
            GridView gridView = imageGalleryGridUI.f216373h;
            if (gridView != null) {
                int firstVisiblePosition = gridView.getFirstVisiblePosition();
                int lastVisiblePosition = imageGalleryGridUI.f216373h.getLastVisiblePosition();
                if (i >= firstVisiblePosition && i <= lastVisiblePosition && (childAt = imageGalleryGridUI.f216373h.getChildAt(i - firstVisiblePosition)) != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    GalleryPhotoInfoEvent.C92523b bVar = galleryPhotoInfoEvent.f264883e;
                    bVar.f264888a = iArr[0];
                    bVar.f264889b = iArr[1];
                    bVar.f264890c = childAt.getWidth();
                    galleryPhotoInfoEvent.f264883e.f264891d = childAt.getHeight();
                }
            }
            return false;
        }
    };

    /* renamed from: s */
    public boolean f216381s = false;

    /* renamed from: t */
    public boolean f216382t = false;

    /* renamed from: u */
    public long f216383u = 0;

    /* renamed from: v */
    public Runnable f216384v = new C6781e();

    /* renamed from: w */
    public View f216385w = null;

    /* renamed from: x */
    public View f216386x;

    /* renamed from: y */
    public int f216387y = -1;

    /* renamed from: z */
    public Animation f216388z;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI$e */
    public class C6781e implements Runnable {
        public C6781e() {
        }

        public void run() {
            View view = ImageGalleryGridUI.this.f216385w;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ImageGalleryGridUI.this.f216385w = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI$a */
    public class C73694a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ List f216389d;

        public C73694a(List list) {
            this.f216389d = list;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C97056h.m124956j(ImageGalleryGridUI.this.getContext(), this.f216389d);
            ImageGalleryGridUI.this.mo102747i();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI$b */
    public class C73695b implements Runnable {
        public C73695b() {
        }

        public void run() {
            GridView gridView = ImageGalleryGridUI.this.f216373h;
            if (gridView != null && gridView.getVisibility() != 0) {
                ImageGalleryGridUI.this.f216373h.setVisibility(0);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI$c */
    public class C73696c implements MenuItem.OnMenuItemClickListener {
        public C73696c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ImageGalleryGridUI.this.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI$d */
    public class C73697d implements AbsListView.OnScrollListener {

        /* renamed from: d */
        public Runnable f216393d = new C73698a();

        /* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI$d$a */
        public class C73698a implements Runnable {
            public C73698a() {
            }

            public void run() {
                ImageGalleryGridUI.this.f216377o.startAnimation(AnimationUtils.loadAnimation(ImageGalleryGridUI.this.getContext(), C0966R.C0968anim.f2394bx));
                ImageGalleryGridUI.this.f216377o.setVisibility(8);
            }
        }

        public C73697d() {
        }

        /* renamed from: a */
        public void mo102755a(boolean z) {
            if (z) {
                ImageGalleryGridUI.this.f216377o.removeCallbacks(this.f216393d);
                if (ImageGalleryGridUI.this.f216377o.getVisibility() != 0) {
                    ImageGalleryGridUI.this.f216377o.clearAnimation();
                    Animation loadAnimation = AnimationUtils.loadAnimation(ImageGalleryGridUI.this.getContext(), C0966R.C0968anim.f2393bw);
                    ImageGalleryGridUI.this.f216377o.setVisibility(0);
                    ImageGalleryGridUI.this.f216377o.startAnimation(loadAnimation);
                    return;
                }
                return;
            }
            ImageGalleryGridUI.this.f216377o.removeCallbacks(this.f216393d);
            ImageGalleryGridUI.this.f216377o.postDelayed(this.f216393d, 256);
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI$5", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            ImageGalleryGridUI imageGalleryGridUI = ImageGalleryGridUI.this;
            C72963f4 f4Var = (C72963f4) imageGalleryGridUI.f216374i.getItem(i);
            if (f4Var == null) {
                str = null;
            } else {
                str = C74763a.m89510e().mo103936d(new Date(f4Var.getCreateTime()), imageGalleryGridUI);
            }
            ImageGalleryGridUI.this.f216377o.setText(str);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI$5", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (1 == i) {
                mo102755a(true);
            } else if (i == 0) {
                mo102755a(false);
            }
            C20828a.m22825b().mo32525n(i);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI$f */
    public class C73699f implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Set f216396d;

        public C73699f(Set set) {
            this.f216396d = set;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.GalleryGridUI", "delete message");
            ImageGalleryGridUI imageGalleryGridUI = ImageGalleryGridUI.this;
            C73871v0.m87560a(imageGalleryGridUI, this.f216396d, imageGalleryGridUI);
            ImageGalleryGridUI.this.mo102747i();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI$g */
    public class C73700g implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ DoFavoriteEvent f216398d;

        /* renamed from: e */
        public final /* synthetic */ List f216399e;

        public C73700g(DoFavoriteEvent doFavoriteEvent, List list) {
            this.f216398d = doFavoriteEvent;
            this.f216399e = list;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            DoFavoriteEvent.C92474a aVar = this.f216398d.f264674d;
            if (aVar.f264678c == 14 && aVar.f264676a.f298618f.size() == 0) {
                ImageGalleryGridUI.this.mo102747i();
                return;
            }
            ImageGalleryGridUI imageGalleryGridUI = ImageGalleryGridUI.this;
            DoFavoriteEvent doFavoriteEvent = this.f216398d;
            int i2 = ImageGalleryGridUI.f216364E;
            imageGalleryGridUI.mo102738I7(doFavoriteEvent);
            ImageGalleryGridUI imageGalleryGridUI2 = ImageGalleryGridUI.this;
            List<C72963f4> list = this.f216399e;
            imageGalleryGridUI2.getClass();
            for (C72963f4 c : list) {
                C73304a.m86447c(C73304a.C73306b.Fav, C73304a.C73307c.Samll, c, 0);
            }
        }
    }

    /* renamed from: F0 */
    public void mo102736F0(C72963f4 f4Var, boolean z) {
        C73706n nVar = this.f216374i;
        setMMTitle(getString(C0966R.string.f6p, new Object[]{Integer.valueOf(C73708v.C73710b.f216437a.mo102782f())}));
        mo102737H7();
    }

    /* renamed from: H7 */
    public final void mo102737H7() {
        C73708v vVar = C73708v.C73710b.f216437a;
        if (!vVar.f216434a.isEmpty() && vVar.f216435b) {
            this.f216365A.setEnabled(true);
            this.f216366B.setEnabled(true);
            this.f216367C.setEnabled(true);
            this.f216368D.setEnabled(true);
            return;
        }
        this.f216365A.setEnabled(false);
        this.f216366B.setEnabled(false);
        this.f216367C.setEnabled(false);
        this.f216368D.setEnabled(false);
    }

    /* renamed from: I7 */
    public final void mo102738I7(DoFavoriteEvent doFavoriteEvent) {
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        aVar.f264684i = this;
        aVar.f264688m = 45;
        doFavoriteEvent.publish();
        int i = doFavoriteEvent.f264675e.f9046a;
        if (i != -2 && i <= 0 && i <= 0) {
            mo102747i();
            DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
            if (14 != aVar2.f264678c) {
                Log.m105918d("MicroMsg.GalleryGridUI", "not record type, do not report");
                return;
            }
            C64878zd0 zd02 = aVar2.f264677b;
            if (zd02 == null) {
                Log.m105920e("MicroMsg.GalleryGridUI", "want to report record fav, but type count is null");
                return;
            }
            C115669n.INSTANCE.mo160131h(11142, Integer.valueOf(zd02.f186671d), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186672e), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186673f), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186674g), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186675h), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186676i), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186677j), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186678n), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186679o), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186680p), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186681q), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186682r), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186683s), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186684t), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186685u));
        }
    }

    /* renamed from: J7 */
    public final void mo102739J7(C72963f4 f4Var) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f216383u = currentTimeMillis;
        if (this.f216383u + 30000 < currentTimeMillis) {
            this.f216382t = C97625j3.m125812b().mo105883I();
        }
        if (!this.f216382t) {
            C76912y0.m92771j(getContext(), (View) null);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(getContext(), "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
        intent.putExtra("app_msg_id", f4Var.getMsgId());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "enterAppMsgShow", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "enterAppMsgShow", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: K7 */
    public final void mo102740K7(View view, int i) {
        int i2;
        int i3;
        if (this.f216374i != null) {
            Log.m105924i("MicroMsg.GalleryGridUI", "[ImageGalleryUI] enter");
            Intent intent = new Intent(this, ImageGalleryUI.class);
            intent.putExtra("key_biz_chat_id", this.f216370e);
            intent.putExtra("key_is_biz_chat", this.f216371f);
            intent.putExtra("intent.key.with.footer", true);
            C72963f4 f4Var = (C72963f4) this.f216374i.getItem(i);
            if (f4Var != null) {
                int i4 = getResources().getConfiguration().orientation;
                int[] iArr = new int[2];
                if (view != null) {
                    i3 = view.getWidth();
                    i2 = view.getHeight();
                    view.getLocationInWindow(iArr);
                } else {
                    i3 = 0;
                    i2 = 0;
                }
                intent.addFlags(536870912);
                intent.putExtra("img_gallery_msg_id", f4Var.getMsgId()).putExtra("img_gallery_msg_svr_id", f4Var.mo108774y2()).putExtra("img_gallery_talker", f4Var.mo108768t()).putExtra("img_gallery_chatroom_name", f4Var.mo108768t()).putExtra("img_gallery_orientation", i4);
                if (view != null) {
                    intent.putExtra("img_gallery_width", i3).putExtra("img_gallery_height", i2).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]).putExtra("img_gallery_enter_from_grid", true);
                } else {
                    intent.putExtra("img_gallery_back_from_grid", true);
                }
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "enterGallery", "(Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "enterGallery", "(Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                overridePendingTransition(0, 0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r5 = ((p763ym.C79138l) di3.C86312j.m106911c(p763ym.C79138l.class)).getAppInfo(r5);
     */
    /* renamed from: L7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.pm.PackageInfo mo102741L7(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            if (r5 == 0) goto L_0x001c
            int r1 = r5.length()
            if (r1 != 0) goto L_0x000a
            goto L_0x001c
        L_0x000a:
            java.lang.Class<ym.l> r1 = p763ym.C79138l.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ym.l r1 = (p763ym.C79138l) r1
            com.tencent.mm.pluginsdk.model.app.j r5 = r1.getAppInfo(r5)
            if (r5 != 0) goto L_0x0019
            goto L_0x001c
        L_0x0019:
            java.lang.String r5 = r5.field_packageName
            goto L_0x001d
        L_0x001c:
            r5 = r0
        L_0x001d:
            if (r5 != 0) goto L_0x0020
            return r0
        L_0x0020:
            r1 = 0
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x002a }
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r1)     // Catch:{ NameNotFoundException -> 0x002a }
            return r4
        L_0x002a:
            r4 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r1 = "MicroMsg.GalleryGridUI"
            java.lang.String r2 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r4, r2, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryGridUI.mo102741L7(android.content.Context, java.lang.String):android.content.pm.PackageInfo");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r3 = eb0.C75604z3.m90847s(r3.getContent());
     */
    /* renamed from: M7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo102742M7(com.tencent.p014mm.storage.C72963f4 r3) {
        /*
            r2 = this;
            java.lang.String r0 = r2.f216369d
            java.lang.String r1 = ""
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r1)
            java.lang.String r1 = r2.f216369d
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85820U5(r1)
            if (r1 != 0) goto L_0x0011
            return r0
        L_0x0011:
            if (r1 == 0) goto L_0x0024
            java.lang.String r3 = r3.getContent()
            java.lang.String r3 = eb0.C75604z3.m90847s(r3)
            if (r3 == 0) goto L_0x0024
            int r1 = r3.length()
            if (r1 <= 0) goto L_0x0024
            r0 = r3
        L_0x0024:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryGridUI.mo102742M7(com.tencent.mm.storage.f4):java.lang.String");
    }

    /* renamed from: N */
    public boolean mo22497N() {
        return false;
    }

    /* renamed from: N7 */
    public void mo102743N7(int i) {
        Intent intent = getIntent();
        boolean z = true;
        if (intent.getIntExtra("kintent_intent_source", 0) != 1) {
            z = false;
        }
        this.f216376n = Boolean.valueOf(z);
        this.f216369d = intent.getStringExtra("kintent_talker");
        this.f216372g = intent.getIntExtra("kintent_image_index", 0);
        this.f216371f = intent.getBooleanExtra("key_is_biz_chat", false);
        this.f216370e = getIntent().getLongExtra("key_biz_chat_id", -1);
        setMMTitle(getString(C0966R.string.f7553jg));
        setBackBtn(new C73696c());
        this.f216386x = findViewById(C0966R.C0970id.gz4);
        View findViewById = findViewById(C0966R.C0970id.cud);
        this.f216365A = findViewById;
        findViewById.setOnClickListener(this);
        View findViewById2 = findViewById(C0966R.C0970id.kth);
        this.f216366B = findViewById2;
        findViewById2.setOnClickListener(this);
        View findViewById3 = findViewById(C0966R.C0970id.j0m);
        this.f216367C = findViewById3;
        findViewById3.setOnClickListener(this);
        View findViewById4 = findViewById(C0966R.C0970id.c0a);
        this.f216368D = findViewById4;
        findViewById4.setOnClickListener(this);
        this.f216377o = (TextView) findViewById(C0966R.C0970id.f5770o6);
        this.f216378p = (TextView) findViewById(C0966R.C0970id.f5742nd);
        if (i == 0) {
            GridView gridView = (GridView) findViewById(C0966R.C0970id.f4e);
            this.f216373h = gridView;
            gridView.setOnItemClickListener(this);
            this.f216373h.setNumColumns(3);
            C72963f4 f4Var = new C72963f4();
            if (this.f216371f) {
                f4Var.mo108728H2(this.f216370e);
            }
            C73706n nVar = new C73706n(this, f4Var, this.f216369d);
            this.f216374i = nVar;
            if (nVar.getCount() == 0) {
                this.f216378p.setVisibility(0);
                return;
            }
            this.f216378p.setVisibility(8);
            this.f216373h.setAdapter(this.f216374i);
            int firstVisiblePosition = this.f216373h.getFirstVisiblePosition();
            int lastVisiblePosition = this.f216373h.getLastVisiblePosition();
            int i2 = this.f216372g;
            if (i2 < firstVisiblePosition || i2 > lastVisiblePosition) {
                this.f216373h.setSelection(i2);
            }
        } else {
            C73706n nVar2 = this.f216374i;
            if (nVar2 != null) {
                nVar2.notifyDataSetChanged();
                int firstVisiblePosition2 = this.f216373h.getFirstVisiblePosition();
                int lastVisiblePosition2 = this.f216373h.getLastVisiblePosition();
                int i3 = this.f216372g;
                if (i3 < firstVisiblePosition2 || i3 > lastVisiblePosition2) {
                    this.f216373h.setSelection(i3);
                }
            }
        }
        this.f216373h.setOnScrollListener(new C73697d());
    }

    /* renamed from: O7 */
    public void mo102744O7() {
        C73708v vVar = C73708v.C73710b.f216437a;
        setMMTitle(getString(C0966R.string.f6p, new Object[]{Integer.valueOf(vVar.mo102782f())}));
        vVar.f216435b = true;
        if (this.f216374i != null) {
            if (this.f216388z == null) {
                this.f216388z = AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2471dv);
            }
            C73706n nVar = this.f216374i;
            nVar.f216423v = false;
            nVar.notifyDataSetChanged();
            View view = this.f216386x;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "toSelectedMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "toSelectedMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f216386x.startAnimation(this.f216388z);
            this.f216365A.setEnabled(false);
            this.f216366B.setEnabled(false);
            this.f216367C.setEnabled(false);
            this.f216368D.setEnabled(false);
            this.f216387y = this.f216373h.getPaddingBottom();
            GridView gridView = this.f216373h;
            gridView.setPadding(gridView.getPaddingLeft(), this.f216373h.getPaddingTop(), this.f216373h.getPaddingRight(), C76577a.m92157h(getContext(), C0966R.dimen.f3955ld));
            C115669n.INSTANCE.mo160131h(11627, 2);
            removeOptionMenu(0);
            addTextOptionMenu(0, getString(C0966R.string.f5_), this);
        }
    }

    public void clear() {
        C73706n nVar = this.f216374i;
        mo102737H7();
    }

    /* renamed from: e0 */
    public boolean mo22498e0() {
        return false;
    }

    public void finish() {
        super.finish();
        C73708v vVar = C73708v.C73710b.f216437a;
        vVar.f216436c.clear();
        vVar.mo102778b();
        vVar.f216435b = false;
    }

    public boolean fromFullScreenActivity() {
        return true;
    }

    /* renamed from: g0 */
    public void mo22499g0(Bundle bundle) {
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b05;
    }

    /* renamed from: i */
    public void mo102747i() {
        C73708v.C73710b.f216437a.f216435b = false;
        setMMTitle(getString(C0966R.string.f7553jg));
        C73706n nVar = this.f216374i;
        if (nVar != null) {
            nVar.notifyDataSetChanged();
            if (this.f216387y >= 0) {
                GridView gridView = this.f216373h;
                gridView.setPadding(gridView.getPaddingLeft(), this.f216373h.getPaddingTop(), this.f216373h.getPaddingRight(), this.f216387y);
            }
            View view = this.f216386x;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "toNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "toNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            removeOptionMenu(0);
            addTextOptionMenu(0, getString(C0966R.string.f5a), this);
        }
    }

    /* renamed from: m6 */
    public void mo22500m6(C77632o.C77633a aVar) {
    }

    public void onBackPressed() {
        if (C73708v.C73710b.f216437a.f216435b) {
            mo102747i();
        } else if (this.f216376n.booleanValue()) {
            super.onBackPressed();
        } else {
            int i = this.f216372g;
            if (i >= 0) {
                mo102740K7((View) null, i);
            }
            finish();
        }
    }

    public void onClick(View view) {
        int i;
        AppCompatActivity appCompatActivity;
        int i2;
        AppCompatActivity appCompatActivity2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C73708v vVar = C73708v.C73710b.f216437a;
        if (vVar.f216434a.isEmpty()) {
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean U5 = C72996z1.m85820U5(this.f216369d);
        ArrayList<C72963f4> arrayList2 = vVar.f216434a;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getId() == C0966R.C0970id.c0a) {
            C115669n.INSTANCE.mo160131h(11627, 5);
            TreeSet treeSet = new TreeSet();
            Iterator<C72963f4> it = arrayList2.iterator();
            while (it.hasNext()) {
                treeSet.add(Long.valueOf(it.next().getMsgId()));
            }
            C76879j.m92707A(this, getString(C0966R.string.bj6), "", getString(C0966R.string.byd), getString(C0966R.string.f7926wf), new C73699f(treeSet), (DialogInterface.OnClickListener) null);
        } else if (view.getId() == C0966R.C0970id.cud) {
            C115669n.INSTANCE.idkeyStat(219, 18, 1, true);
            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
            if (C96789p0.m124273f(getContext(), doFavoriteEvent, this.f216369d, arrayList2, false, false)) {
                mo102738I7(doFavoriteEvent);
                Iterator<C72963f4> it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    C73304a.m86447c(C73304a.C73306b.Fav, C73304a.C73307c.Samll, it4.next(), 0);
                }
            } else if (arrayList2.size() > 1) {
                AppCompatActivity context = getContext();
                if (doFavoriteEvent.f264674d.f264687l >= 0) {
                    appCompatActivity = getContext();
                    i = C0966R.string.coe;
                } else {
                    appCompatActivity = getContext();
                    i = C0966R.string.cod;
                }
                String string = appCompatActivity.getString(i);
                if (doFavoriteEvent.f264674d.f264687l >= 0) {
                    appCompatActivity2 = getContext();
                    i2 = C0966R.string.bjb;
                } else {
                    appCompatActivity2 = getContext();
                    i2 = C0966R.string.f361137hk2;
                }
                C76879j.m92707A(context, string, "", appCompatActivity2.getString(i2), getContext().getString(C0966R.string.bj_), new C73700g(doFavoriteEvent, arrayList2), (DialogInterface.OnClickListener) null);
            } else {
                C76879j.m92738i(getContext(), doFavoriteEvent.f264674d.f264687l, 0);
            }
        } else if (view.getId() == C0966R.C0970id.kth) {
            C115669n.INSTANCE.idkeyStat(219, 19, 1, true);
            C73313b1.m86457c(this, arrayList2, U5, this.f216369d, this);
            mo102747i();
        } else {
            C115669n.INSTANCE.mo160131h(11627, 3);
            ArrayList arrayList3 = new ArrayList();
            Iterator<C72963f4> it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                C72963f4 next = it5.next();
                if (!C97056h.m124954I(next) && !C97056h.m124951E(next)) {
                    if (!(next == null ? false : next.mo100983V3())) {
                        arrayList3.add(next);
                    }
                }
            }
            C68070l.C68072b bVar = null;
            if (arrayList3.size() != arrayList2.size()) {
                C76879j.m92743n(getContext(), C0966R.string.f67, C0966R.string.a3h, new C73694a(arrayList3), (DialogInterface.OnClickListener) null);
            } else {
                C72963f4 f4Var = (C72963f4) arrayList3.get(0);
                if (arrayList2.size() != 1 || f4Var == null || !f4Var.mo101020w3()) {
                    C97056h.m124956j(this, arrayList2);
                    mo102747i();
                } else {
                    String content = f4Var.getContent();
                    if (content != null) {
                        bVar = C68070l.C68072b.m80422u(content, f4Var.mo108775z2());
                    }
                    if (bVar != null && bVar.f195582i == 6) {
                        mo102739J7(f4Var);
                    }
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f216381s = true;
        this.f216375j = new MMHandler();
        mo102743N7(0);
        this.f216380r.alive();
    }

    public void onDestroy() {
        this.f216375j.removeCallbacks(this.f216379q);
        this.f216375j = null;
        C20828a.m22825b().mo32525n(0);
        this.f216380r.dead();
        super.onDestroy();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0452, code lost:
        if (r2 != false) goto L_0x048c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x05f3  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x05fa  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x05fd A[SYNTHETIC, Splitter:B:165:0x05fd] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView<?> r47, android.view.View r48, int r49, long r50) {
        /*
            r46 = this;
            r9 = r46
            r0 = r48
            r7 = r49
            java.lang.Class<ym.l> r8 = p763ym.C79138l.class
            java.lang.Class<ym.p> r10 = p763ym.C79139p.class
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r47
            r1.add(r2)
            r1.add(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r49)
            r1.add(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r50)
            r1.add(r2)
            java.lang.Object[] r6 = r1.toArray()
            r1.clear()
            java.lang.String r1 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI"
            java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
            java.lang.String r3 = "onItemClick"
            java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            r5 = r46
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.ui.chatting.gallery.n r1 = r9.f216374i
            java.lang.Object r1 = r1.getItem(r7)
            r11 = r1
            com.tencent.mm.storage.f4 r11 = (com.tencent.p014mm.storage.C72963f4) r11
            java.lang.String r1 = r11.getContent()
            if (r1 == 0) goto L_0x0051
            java.lang.String r2 = r11.mo108775z2()
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r2)
            goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            java.lang.String r13 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            java.lang.String r14 = "onItemClick"
            java.lang.String r15 = "android/widget/AdapterView$OnItemClickListener"
            java.lang.String r6 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI"
            r2 = 6
            if (r1 == 0) goto L_0x006a
            int r3 = r1.f195582i
            if (r3 != r2) goto L_0x006a
            r9.mo102739J7(r11)
            r4 = r6
            r1 = r13
            r2 = r14
            r3 = r15
            goto L_0x0b27
        L_0x006a:
            java.lang.String r3 = "pre_username"
            java.lang.String r4 = "KAppId"
            java.lang.String r5 = "KPublisherId"
            java.lang.String r2 = "msg_id"
            java.lang.String r12 = "version_code"
            r51 = r6
            java.lang.String r6 = "version_name"
            java.lang.String r0 = "message"
            java.lang.String r7 = "msg_"
            r16 = r13
            java.lang.String r13 = ".ui.tools.WebViewUI"
            r17 = r14
            java.lang.String r14 = "webview"
            r18 = r15
            java.lang.String r15 = "geta8key_username"
            r19 = r8
            java.lang.String r8 = "rawUrl"
            r20 = r13
            java.lang.String r13 = "MicroMsg.GalleryGridUI"
            r21 = r13
            java.lang.String r13 = "preMsgIndex"
            r22 = r14
            java.lang.String r14 = "preChatTYPE"
            r23 = r13
            java.lang.String r13 = "preChatName"
            r24 = r14
            java.lang.String r14 = "preUsername"
            r25 = r13
            java.lang.String r13 = "prePublishId"
            r26 = r14
            if (r1 == 0) goto L_0x01b4
            int r14 = r1.f195582i
            r28 = r13
            r13 = 3
            if (r14 != r13) goto L_0x01ab
            di3.d r13 = di3.C86312j.m106911c(r10)
            ym.p r13 = (p763ym.C79139p) r13
            java.lang.String r14 = r1.f195586j
            java.lang.String r13 = r13.mo108862K3(r14, r0)
            di3.d r10 = di3.C86312j.m106911c(r10)
            ym.p r10 = (p763ym.C79139p) r10
            java.lang.String r14 = r1.f195590k
            java.lang.String r0 = r10.mo108862K3(r14, r0)
            androidx.appcompat.app.AppCompatActivity r10 = r46.getContext()
            java.lang.String r14 = r1.f195562d
            android.content.pm.PackageInfo r10 = r9.mo102741L7(r10, r14)
            if (r10 != 0) goto L_0x00d8
            r14 = 0
            goto L_0x00da
        L_0x00d8:
            java.lang.String r14 = r10.versionName
        L_0x00da:
            if (r10 != 0) goto L_0x00de
            r10 = 0
            goto L_0x00e0
        L_0x00de:
            int r10 = r10.versionCode
        L_0x00e0:
            java.lang.String r1 = r1.f195562d
            r29 = r3
            r30 = r4
            long r3 = r11.getMsgId()
            long r31 = r11.mo108774y2()
            if (r13 == 0) goto L_0x00f6
            int r19 = r13.length()
            if (r19 != 0) goto L_0x0100
        L_0x00f6:
            if (r0 == 0) goto L_0x01a1
            int r19 = r0.length()
            if (r19 != 0) goto L_0x0100
            goto L_0x01a1
        L_0x0100:
            androidx.appcompat.app.AppCompatActivity r19 = r46.getContext()
            boolean r19 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isMobile(r19)
            if (r19 == 0) goto L_0x0113
            if (r0 == 0) goto L_0x011d
            int r19 = r0.length()
            if (r19 <= 0) goto L_0x011d
            goto L_0x011c
        L_0x0113:
            if (r13 == 0) goto L_0x011c
            int r19 = r13.length()
            if (r19 <= 0) goto L_0x011c
            goto L_0x011d
        L_0x011c:
            r13 = r0
        L_0x011d:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.putExtra(r2, r3)
            r0.putExtra(r8, r13)
            r0.putExtra(r6, r14)
            r0.putExtra(r12, r10)
            java.lang.String r2 = "usePlugin"
            r3 = 1
            r0.putExtra(r2, r3)
            java.lang.String r2 = r9.f216369d
            r0.putExtra(r15, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r3 = java.lang.Long.toString(r31)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.putExtra(r5, r2)
            r3 = r30
            r0.putExtra(r3, r1)
            java.lang.String r1 = r9.mo102742M7(r11)
            r4 = r29
            r0.putExtra(r4, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r3 = java.lang.Long.toString(r31)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r13 = r28
            r0.putExtra(r13, r2)
            r14 = r26
            r0.putExtra(r14, r1)
            java.lang.String r2 = r9.f216369d
            r3 = r25
            r0.putExtra(r3, r2)
            java.lang.String r2 = r9.f216369d
            int r1 = eb0.C45629t0.m50815b(r1, r2)
            r2 = r24
            r0.putExtra(r2, r1)
            r1 = r23
            r2 = 0
            r0.putExtra(r1, r2)
            androidx.appcompat.app.AppCompatActivity r1 = r46.getContext()
            r2 = r20
            r3 = r22
            r4 = 0
            ke3.C88144b.m109791i(r1, r3, r2, r0, r4)
            goto L_0x0312
        L_0x01a1:
            java.lang.String r0 = "url, lowUrl both are empty"
            r1 = r21
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x0312
        L_0x01ab:
            r34 = r21
            r33 = r22
            r14 = r26
            r13 = r28
            goto L_0x01ba
        L_0x01b4:
            r34 = r21
            r33 = r22
            r14 = r26
        L_0x01ba:
            r21 = r20
            r20 = r0
            r45 = r4
            r4 = r3
            r3 = r45
            java.lang.String r0 = "shortUrl"
            r26 = r14
            java.lang.String r14 = "webpageTitle"
            r28 = r13
            java.lang.String r13 = ""
            r29 = r4
            java.lang.String r4 = "wx751a1acca5688ba3"
            java.lang.String r22 = "groupmessage"
            java.lang.String r30 = "singlemessage"
            r31 = r15
            r15 = 5
            if (r1 == 0) goto L_0x032f
            r32 = r3
            int r3 = r1.f195582i
            if (r3 != r15) goto L_0x031c
            java.lang.String r3 = r1.f195586j
            if (r3 == 0) goto L_0x0312
            boolean r3 = r3.equals(r13)
            if (r3 != 0) goto L_0x0312
            di3.d r3 = di3.C86312j.m106911c(r10)
            ym.p r3 = (p763ym.C79139p) r3
            java.lang.String r10 = r1.f195586j
            java.lang.String r13 = r9.f216369d
            boolean r13 = com.tencent.p014mm.storage.C72996z1.m85820U5(r13)
            if (r13 == 0) goto L_0x01ff
            r13 = r22
            goto L_0x0201
        L_0x01ff:
            r13 = r30
        L_0x0201:
            java.lang.String r3 = r3.mo108862K3(r10, r13)
            java.lang.String r10 = r1.f195586j
            androidx.appcompat.app.AppCompatActivity r13 = r46.getContext()
            java.lang.String r15 = r1.f195562d
            android.content.pm.PackageInfo r13 = r9.mo102741L7(r13, r15)
            android.content.Intent r15 = new android.content.Intent
            r15.<init>()
            r15.putExtra(r8, r3)
            java.lang.String r3 = r1.f195570f
            r15.putExtra(r14, r3)
            java.lang.String r3 = r1.f195562d
            if (r3 == 0) goto L_0x024f
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x023e
            java.lang.String r3 = r1.f195562d
            java.lang.String r4 = "wxfbc915ff7c30e335"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x023e
            java.lang.String r3 = r1.f195562d
            java.lang.String r4 = "wx482a4001c37e2b74"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x024f
        L_0x023e:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = r1.f195562d
            java.lang.String r8 = "jsapi_args_appid"
            r3.putString(r8, r4)
            java.lang.String r4 = "jsapiargs"
            r15.putExtra(r4, r3)
        L_0x024f:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r3 != 0) goto L_0x0259
            r15.putExtra(r0, r10)
            goto L_0x025e
        L_0x0259:
            java.lang.String r3 = r1.f195586j
            r15.putExtra(r0, r3)
        L_0x025e:
            if (r13 != 0) goto L_0x0262
            r0 = 0
            goto L_0x0264
        L_0x0262:
            java.lang.String r0 = r13.versionName
        L_0x0264:
            r15.putExtra(r6, r0)
            if (r13 != 0) goto L_0x026b
            r0 = 0
            goto L_0x026d
        L_0x026b:
            int r0 = r13.versionCode
        L_0x026d:
            r15.putExtra(r12, r0)
            java.lang.String r0 = r1.f195634v
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0288
            java.lang.String r0 = r1.f195634v
            java.lang.String r3 = "srcUsername"
            r15.putExtra(r3, r0)
            java.lang.String r0 = r1.f195638w
            java.lang.String r3 = "srcDisplayname"
            r15.putExtra(r3, r0)
        L_0x0288:
            long r3 = r11.getMsgId()
            r15.putExtra(r2, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            long r2 = r11.mo108774y2()
            java.lang.String r2 = java.lang.Long.toString(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r15.putExtra(r5, r0)
            java.lang.String r0 = r1.f195562d
            r3 = r32
            r15.putExtra(r3, r0)
            java.lang.String r0 = r1.f195570f
            r15.putExtra(r14, r0)
            java.lang.String r0 = r1.f195646y
            java.lang.String r1 = "thumbUrl"
            r15.putExtra(r1, r0)
            java.lang.String r0 = r9.f216369d
            r1 = r31
            r15.putExtra(r1, r0)
            java.lang.String r0 = r9.mo102742M7(r11)
            r1 = r29
            r15.putExtra(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            long r2 = r11.mo108774y2()
            java.lang.String r2 = java.lang.Long.toString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r28
            r15.putExtra(r2, r1)
            r1 = r26
            r15.putExtra(r1, r0)
            java.lang.String r1 = r9.f216369d
            r2 = r25
            r15.putExtra(r2, r1)
            java.lang.String r1 = r9.f216369d
            int r0 = eb0.C45629t0.m50815b(r0, r1)
            r1 = r24
            r15.putExtra(r1, r0)
            r0 = r23
            r1 = 0
            r15.putExtra(r0, r1)
            androidx.appcompat.app.AppCompatActivity r0 = r46.getContext()
            r1 = r21
            r2 = r33
            r3 = 0
            ke3.C88144b.m109791i(r0, r2, r1, r15, r3)
        L_0x0312:
            r4 = r51
        L_0x0314:
            r1 = r16
            r2 = r17
            r3 = r18
            goto L_0x0b27
        L_0x031c:
            r36 = r21
            r39 = r23
            r40 = r24
            r41 = r25
            r42 = r26
            r43 = r28
            r35 = r29
            r38 = r31
            r3 = r32
            goto L_0x033f
        L_0x032f:
            r36 = r21
            r39 = r23
            r40 = r24
            r41 = r25
            r42 = r26
            r43 = r28
            r35 = r29
            r38 = r31
        L_0x033f:
            r37 = r33
            if (r1 == 0) goto L_0x036d
            int r15 = r1.f195582i
            r32 = r3
            r3 = 19
            if (r15 != r3) goto L_0x036f
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            long r2 = r11.getMsgId()
            java.lang.String r4 = "message_id"
            r0.putExtra(r4, r2)
            java.lang.String r1 = r1.f195571f0
            java.lang.String r2 = "record_xml"
            r0.putExtra(r2, r1)
            androidx.appcompat.app.AppCompatActivity r1 = r46.getContext()
            java.lang.String r2 = "record"
            java.lang.String r3 = ".ui.RecordMsgDetailUI"
            r4 = 0
            ke3.C88144b.m109791i(r1, r2, r3, r0, r4)
            goto L_0x0312
        L_0x036d:
            r32 = r3
        L_0x036f:
            if (r1 == 0) goto L_0x0397
            int r3 = r1.f195582i
            r15 = 24
            if (r3 != r15) goto L_0x0397
            com.tencent.mm.autogen.events.OpenNoteFromSessionEvent r0 = new com.tencent.mm.autogen.events.OpenNoteFromSessionEvent
            r0.<init>()
            com.tencent.mm.autogen.events.OpenNoteFromSessionEvent$a r2 = r0.f193796d
            androidx.appcompat.app.AppCompatActivity r3 = r46.getContext()
            r2.f193799c = r3
            com.tencent.mm.autogen.events.OpenNoteFromSessionEvent$a r2 = r0.f193796d
            long r3 = r11.getMsgId()
            r2.f193797a = r3
            com.tencent.mm.autogen.events.OpenNoteFromSessionEvent$a r2 = r0.f193796d
            java.lang.String r1 = r1.f195571f0
            r2.f193798b = r1
            r0.publish()
            goto L_0x0312
        L_0x0397:
            if (r1 == 0) goto L_0x0720
            int r3 = r1.f195582i
            r15 = 7
            if (r3 != r15) goto L_0x0720
            di3.d r0 = di3.C86312j.m106911c(r19)
            ym.l r0 = (p763ym.C79138l) r0
            java.lang.String r2 = r1.f195562d
            r3 = 0
            com.tencent.mm.pluginsdk.model.app.j r0 = r0.mo73990GW(r2, r3)
            if (r0 == 0) goto L_0x0312
            java.lang.String r2 = r9.f216369d
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85820U5(r2)
            if (r3 == 0) goto L_0x03bd
            java.lang.String r2 = r11.getContent()
            java.lang.String r2 = eb0.C75604z3.m90847s(r2)
        L_0x03bd:
            long r3 = r11.mo108774y2()
            androidx.appcompat.app.AppCompatActivity r5 = r46.getContext()
            java.lang.String r6 = r0.field_packageName
            boolean r5 = com.tencent.p014mm.pluginsdk.model.app.C72688j0.m85020f(r5, r6)
            if (r5 == 0) goto L_0x03cf
            r5 = 3
            goto L_0x03d0
        L_0x03cf:
            r5 = 6
        L_0x03d0:
            int r6 = r1.f195582i
            r7 = 2
            if (r6 != r7) goto L_0x03d7
            r5 = 4
            goto L_0x03db
        L_0x03d7:
            r7 = 5
            if (r6 != r7) goto L_0x03db
            r5 = 1
        L_0x03db:
            com.tencent.mm.autogen.events.ReportMsgClickEvent r6 = new com.tencent.mm.autogen.events.ReportMsgClickEvent
            r6.<init>()
            com.tencent.mm.autogen.events.ReportMsgClickEvent$a r7 = r6.f193900d
            androidx.appcompat.app.AppCompatActivity r12 = r46.getContext()
            r7.f193901a = r12
            com.tencent.mm.autogen.events.ReportMsgClickEvent$a r7 = r6.f193900d
            r12 = 1
            r7.f193907g = r12
            java.lang.String r12 = r1.f195562d
            r7.f193902b = r12
            java.lang.String r12 = r0.field_packageName
            r7.f193903c = r12
            int r12 = r1.f195582i
            r7.f193905e = r12
            r7.f193904d = r2
            r7.f193908h = r5
            java.lang.String r2 = r1.f195536V
            r7.f193906f = r2
            r7.f193909i = r3
            r7.f193910j = r13
            java.lang.String r2 = r9.f216369d
            r7.f193911k = r2
            r6.publish()
            sw1.m r28 = sw1.C48477m.C13789a.m13091a()
            di3.d r2 = di3.C86312j.m106911c(r19)
            ym.l r2 = (p763ym.C79138l) r2
            androidx.appcompat.app.AppCompatActivity r3 = r46.getContext()
            boolean r2 = r2.mo74016tz(r3, r0)
            if (r2 != 0) goto L_0x0489
            if (r28 == 0) goto L_0x0489
            java.lang.String r2 = r0.f149247P
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0455
            java.lang.Class<gw.f> r2 = p159gw.C45962f.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            gw.f r2 = (p159gw.C45962f) r2
            androidx.appcompat.app.AppCompatActivity r3 = r46.getContext()
            java.lang.String r4 = r0.f149247P
            boolean r2 = r2.Qt0(r3, r4)
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r3 = r0.f149247P
            r5 = 0
            r4[r5] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r5 = 1
            r4[r5] = r3
            java.lang.String r3 = "oversea game info and gpdownload url is not empty, jump to google play directy:[%s], jump result: [%b]"
            r15 = r34
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r3, r4)
            if (r2 == 0) goto L_0x0458
            goto L_0x048c
        L_0x0455:
            r15 = r34
            r5 = 1
        L_0x0458:
            com.tencent.mm.autogen.events.GameCenterOperationEvent r2 = new com.tencent.mm.autogen.events.GameCenterOperationEvent
            r2.<init>()
            com.tencent.mm.autogen.events.GameCenterOperationEvent$a r3 = r2.f107543d
            r4 = 2
            r3.f107544a = r4
            r3.f107549f = r5
            java.lang.String r4 = r0.field_appId
            r3.f107546c = r4
            androidx.appcompat.app.AppCompatActivity r4 = r46.getContext()
            r3.f107545b = r4
            r2.publish()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            androidx.appcompat.app.AppCompatActivity r29 = r46.getContext()
            java.lang.String r0 = r0.field_appId
            r31 = 1
            r33 = 1
            r30 = r0
            r32 = r33
            r28.dn0(r29, r30, r31, r32, r33)
            r5 = 1
            goto L_0x048c
        L_0x0489:
            r15 = r34
            r5 = 0
        L_0x048c:
            if (r5 == 0) goto L_0x0490
            goto L_0x0312
        L_0x0490:
            java.lang.String r0 = r1.f195606o
            if (r0 == 0) goto L_0x04c7
            int r0 = r0.length()
            if (r0 != 0) goto L_0x049b
            goto L_0x04c7
        L_0x049b:
            boolean r0 = r9.f216382t
            if (r0 != 0) goto L_0x04a9
            androidx.appcompat.app.AppCompatActivity r0 = r46.getContext()
            r1 = 0
            nj3.C76912y0.m92771j(r0, r1)
            goto L_0x0312
        L_0x04a9:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            androidx.appcompat.app.AppCompatActivity r1 = r46.getContext()
            java.lang.String r2 = "com.tencent.mm.ui.chatting.AppAttachDownloadUI"
            r0.setClassName(r1, r2)
            long r1 = r11.getMsgId()
            java.lang.String r3 = "app_msg_id"
            r0.putExtra(r3, r1)
            r1 = 210(0xd2, float:2.94E-43)
            r9.startActivityForResult((android.content.Intent) r0, (int) r1)
            goto L_0x0312
        L_0x04c7:
            java.lang.String r0 = r11.getContent()
            int r1 = r11.mo108769t2()
            if (r1 != 0) goto L_0x04e9
            int r1 = r11.mo108769t2()
            boolean r2 = r9.f216371f
            if (r2 != 0) goto L_0x04e9
            java.lang.String r2 = r9.f216369d
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85820U5(r2)
            if (r2 == 0) goto L_0x04e9
            if (r0 == 0) goto L_0x04e9
            if (r1 != 0) goto L_0x04e9
            java.lang.String r0 = eb0.C75604z3.m90849u(r0)
        L_0x04e9:
            r1 = 0
            com.tencent.mm.message.l$b r12 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r1)
            di3.d r0 = di3.C86312j.m106911c(r19)
            ym.l r0 = (p763ym.C79138l) r0
            java.lang.String r1 = r12.f195562d
            com.tencent.mm.pluginsdk.model.app.j r14 = r0.getAppInfo(r1)
            if (r14 == 0) goto L_0x06f5
            androidx.appcompat.app.AppCompatActivity r0 = r46.getContext()
            java.lang.String r1 = r14.field_packageName
            boolean r0 = com.tencent.p014mm.pluginsdk.model.app.C72688j0.m85020f(r0, r1)
            if (r0 == 0) goto L_0x06f5
            int r0 = r14.field_status
            r1 = 3
            if (r0 != r1) goto L_0x0525
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "requestAppShow fail, app is in blacklist, packageName = "
            r0.append(r1)
            java.lang.String r1 = r14.field_packageName
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            goto L_0x0312
        L_0x0525:
            di3.d r0 = di3.C86312j.m106911c(r10)
            ym.p r0 = (p763ym.C79139p) r0
            androidx.appcompat.app.AppCompatActivity r1 = r46.getContext()
            boolean r0 = r0.mo108864OB(r1, r14)
            if (r0 != 0) goto L_0x0568
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = r14.field_appName
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = "The app %s signature is incorrect."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r2, r0)
            androidx.appcompat.app.AppCompatActivity r0 = r46.getContext()
            r2 = 2131830801(0x7f112811, float:1.929461E38)
            java.lang.Object[] r4 = new java.lang.Object[r1]
            di3.d r5 = di3.C86312j.m106911c(r19)
            ym.l r5 = (p763ym.C79138l) r5
            androidx.appcompat.app.AppCompatActivity r6 = r46.getContext()
            java.lang.String r5 = r5.mo74011hv(r6, r14)
            r4[r3] = r5
            java.lang.String r2 = r9.getString(r2, r4)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r2, (int) r1)
            r0.show()
            goto L_0x0312
        L_0x0568:
            java.lang.String r1 = "utf-8"
            java.lang.String r0 = r11.mo108768t()
            java.lang.String r2 = "@qqim"
            boolean r0 = r0.endsWith(r2)
            if (r0 == 0) goto L_0x067e
            java.lang.String r0 = r14.field_packageName
            java.lang.String r2 = "com.tencent.mobileqq"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0583
            goto L_0x067e
        L_0x0583:
            java.lang.String r0 = "jacks open QQ"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r0)
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.MAIN"
            r4 = 0
            r3.<init>(r0, r4)
            java.lang.String r4 = "android.intent.category.LAUNCHER"
            r3.addCategory(r4)
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r5)
            androidx.appcompat.app.AppCompatActivity r5 = r46.getContext()
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            r6 = 0
            android.content.pm.PackageInfo r7 = r5.getPackageInfo(r2, r6)     // Catch:{ Exception -> 0x05cb }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ Exception -> 0x05cb }
            r8 = 0
            r6.<init>(r0, r8)     // Catch:{ Exception -> 0x05cb }
            r6.addCategory(r4)     // Catch:{ Exception -> 0x05cb }
            java.lang.String r0 = r7.packageName     // Catch:{ Exception -> 0x05cb }
            r6.setPackage(r0)     // Catch:{ Exception -> 0x05cb }
            r4 = 0
            java.util.List r0 = r5.queryIntentActivities(r6, r4)     // Catch:{ Exception -> 0x05cb }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x05cb }
            java.lang.Object r0 = r0.next()     // Catch:{ Exception -> 0x05cb }
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch:{ Exception -> 0x05cb }
            if (r0 == 0) goto L_0x05d2
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch:{ Exception -> 0x05cb }
            java.lang.String r0 = r0.name     // Catch:{ Exception -> 0x05cb }
            goto L_0x05d3
        L_0x05cb:
            r0 = move-exception
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r13, r5)
        L_0x05d2:
            r0 = 0
        L_0x05d3:
            r3.setClassName(r2, r0)
            java.lang.String r0 = "platformId"
            java.lang.String r2 = "wechat"
            r3.putExtra(r0, r2)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r2 = 9
            r4 = 0
            java.lang.Object r0 = r0.mo119684e(r2, r4)
            if (r0 == 0) goto L_0x05fa
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto L_0x05fa
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x05fb
        L_0x05fa:
            r0 = 0
        L_0x05fb:
            if (r0 == 0) goto L_0x063b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0634 }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0634 }
            r2.append(r13)     // Catch:{ UnsupportedEncodingException -> 0x0634 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0634 }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x0634 }
            byte[] r0 = r0.getBytes(r1)     // Catch:{ UnsupportedEncodingException -> 0x0634 }
            java.lang.String r2 = "asdfghjkl;'"
            byte[] r1 = r2.getBytes(r1)     // Catch:{ UnsupportedEncodingException -> 0x0634 }
            int r2 = r1.length     // Catch:{ UnsupportedEncodingException -> 0x0634 }
            r4 = 0
            r5 = 0
        L_0x0619:
            if (r4 >= r2) goto L_0x062d
            byte r6 = r1[r4]     // Catch:{ UnsupportedEncodingException -> 0x0634 }
            int r7 = r0.length     // Catch:{ UnsupportedEncodingException -> 0x0634 }
            if (r5 < r7) goto L_0x0621
            goto L_0x062d
        L_0x0621:
            int r7 = r5 + 1
            byte r8 = r0[r5]     // Catch:{ UnsupportedEncodingException -> 0x0634 }
            r6 = r6 ^ r8
            byte r6 = (byte) r6     // Catch:{ UnsupportedEncodingException -> 0x0634 }
            r0[r5] = r6     // Catch:{ UnsupportedEncodingException -> 0x0634 }
            int r4 = r4 + 1
            r5 = r7
            goto L_0x0619
        L_0x062d:
            java.lang.String r1 = "tencent_gif"
            r3.putExtra(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x0634 }
            goto L_0x063b
        L_0x0634:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r13, r2)
        L_0x063b:
            k20.a r0 = new k20.a     // Catch:{ Exception -> 0x0678 }
            r0.<init>()     // Catch:{ Exception -> 0x0678 }
            r0.mo10233c(r3)     // Catch:{ Exception -> 0x0678 }
            java.lang.Object[] r2 = r0.mo10232b()     // Catch:{ Exception -> 0x0678 }
            java.lang.String r3 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI"
            java.lang.String r4 = "dealOpenQQ"
            java.lang.String r5 = "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/pluginsdk/model/app/AppInfo;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r46
            r13 = r51
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x067a }
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)     // Catch:{ Exception -> 0x067a }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ Exception -> 0x067a }
            r9.startActivity(r0)     // Catch:{ Exception -> 0x067a }
            java.lang.String r2 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI"
            java.lang.String r3 = "dealOpenQQ"
            java.lang.String r4 = "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/pluginsdk/model/app/AppInfo;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r46
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x067a }
            goto L_0x067b
        L_0x0678:
            r13 = r51
        L_0x067a:
        L_0x067b:
            r27 = 1
            goto L_0x0682
        L_0x067e:
            r13 = r51
            r27 = 0
        L_0x0682:
            if (r27 == 0) goto L_0x0686
            goto L_0x071d
        L_0x0686:
            com.tencent.mm.opensdk.modelmsg.WXAppExtendObject r0 = new com.tencent.mm.opensdk.modelmsg.WXAppExtendObject
            r0.<init>()
            java.lang.String r1 = r12.f195614q
            r0.extInfo = r1
            java.lang.String r1 = r12.f195606o
            if (r1 == 0) goto L_0x06ab
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x06ab
            com.tencent.mm.pluginsdk.model.app.e r1 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
            java.lang.String r2 = r12.f195606o
            com.tencent.mm.pluginsdk.model.app.d r1 = r1.mo100154qq(r2)
            if (r1 != 0) goto L_0x06a7
            r1 = 0
            goto L_0x06a9
        L_0x06a7:
            java.lang.String r1 = r1.field_fileFullPath
        L_0x06a9:
            r0.filePath = r1
        L_0x06ab:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r4 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage
            r4.<init>()
            r1 = 638064131(0x26081603, float:4.721431E-16)
            r4.sdkVer = r1
            r4.mediaObject = r0
            java.lang.String r0 = r12.f195570f
            r4.title = r0
            java.lang.String r0 = r12.f195574g
            r4.description = r0
            java.lang.String r0 = r12.f195539W
            r4.messageAction = r0
            java.lang.String r0 = r12.f195542X
            r4.messageExt = r0
            java.lang.Class<gt.k> r0 = p158gt.C98201k.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            java.lang.String r1 = r11.mo108765s2()
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            java.lang.String r0 = r0.mo127161CZ(r1)
            r1 = -1
            r2 = 0
            byte[] r0 = com.tencent.p014mm.vfs.C86013q1.m106433O(r0, r2, r1)
            r4.thumbData = r0
            com.tencent.mm.ui.chatting.d5 r2 = new com.tencent.mm.ui.chatting.d5
            r2.<init>(r9)
            java.lang.String r3 = r14.field_packageName
            java.lang.String r5 = r14.field_appId
            java.lang.String r6 = r14.field_openId
            r7 = 0
            r2.mo102719b(r3, r4, r5, r6, r7)
            goto L_0x071d
        L_0x06f5:
            r13 = r51
            di3.d r0 = di3.C86312j.m106911c(r10)
            ym.p r0 = (p763ym.C79139p) r0
            androidx.appcompat.app.AppCompatActivity r1 = r46.getContext()
            java.lang.String r2 = r12.f195562d
            r3 = r20
            java.lang.String r0 = r0.I90(r1, r2, r3)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r1.putExtra(r8, r0)
            androidx.appcompat.app.AppCompatActivity r0 = r46.getContext()
            r3 = r36
            r2 = r37
            r4 = 0
            ke3.C88144b.m109791i(r0, r2, r3, r1, r4)
        L_0x071d:
            r4 = r13
            goto L_0x0314
        L_0x0720:
            r44 = r51
            r47 = r5
            r15 = r34
            r3 = r36
            r5 = r37
            boolean r19 = r11.mo100994f4()
            if (r19 != 0) goto L_0x0a13
            boolean r19 = r11.mo100979R3()
            if (r19 != 0) goto L_0x0a13
            boolean r19 = r11.mo100989b4()
            if (r19 != 0) goto L_0x0a13
            boolean r19 = r11.mo100961A3()
            if (r19 == 0) goto L_0x0744
            goto L_0x0a13
        L_0x0744:
            r51 = r7
            java.lang.String r7 = "emoji"
            if (r1 == 0) goto L_0x07d1
            r19 = r2
            int r2 = r1.f195582i
            r20 = r12
            r12 = 15
            if (r2 != r12) goto L_0x07d5
            java.lang.String r0 = r1.f195583i0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x0770
            java.lang.Class<z51.g> r0 = z51.C39315g.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            z51.g r0 = (z51.C39315g) r0
            zc3.a r0 = r0.mo58035cm()
            java.lang.String r2 = r1.f195586j
            i61.h r0 = (i61.C98602h) r0
            java.lang.String r0 = r0.mo138003J(r2)
        L_0x0770:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x0793
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r2 = eb0.C75592q0.m90789s()
            r12 = r38
            r0.putExtra(r12, r2)
            java.lang.String r1 = r1.f195586j
            r0.putExtra(r8, r1)
            androidx.appcompat.app.AppCompatActivity r1 = r46.getContext()
            r2 = 0
            ke3.C88144b.m109791i(r1, r5, r3, r0, r2)
            goto L_0x0a09
        L_0x0793:
            java.lang.String r1 = "start emoji detail from brandcontact"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r1)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "extra_id"
            r1.putExtra(r2, r0)
            r2 = 123(0x7b, float:1.72E-43)
            java.lang.String r3 = "preceding_scence"
            r1.putExtra(r3, r2)
            r2 = 23
            java.lang.String r3 = "download_entrance_scene"
            r1.putExtra(r3, r2)
            androidx.appcompat.app.AppCompatActivity r2 = r46.getContext()
            java.lang.String r3 = ".ui.EmojiStoreDetailUI"
            r4 = 0
            ke3.C88144b.m109791i(r2, r7, r3, r1, r4)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 10993(0x2af1, float:1.5404E-41)
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r4[r5] = r3
            r3 = 1
            r4[r3] = r0
            r1.mo160131h(r2, r4)
            goto L_0x0a09
        L_0x07d1:
            r19 = r2
            r20 = r12
        L_0x07d5:
            r12 = r38
            if (r1 == 0) goto L_0x0837
            int r2 = r1.f195582i
            r21 = r3
            r3 = 26
            if (r2 != r3) goto L_0x0839
            int r0 = r1.f195511M1
            java.lang.String r2 = r1.f195514N1
            java.lang.String r3 = r1.f195517O1
            java.lang.String r4 = r1.f195520P1
            java.lang.String r5 = r1.f195523Q1
            if (r0 == 0) goto L_0x082f
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            java.lang.String r10 = r9.mo102742M7(r11)
            r6.putExtra(r12, r10)
            java.lang.String r1 = r1.f195642x
            r6.putExtra(r8, r1)
            java.lang.String r1 = "topic_id"
            r6.putExtra(r1, r0)
            java.lang.String r0 = "topic_name"
            r6.putExtra(r0, r2)
            java.lang.String r0 = "topic_desc"
            r6.putExtra(r0, r3)
            java.lang.String r0 = "topic_icon_url"
            r6.putExtra(r0, r4)
            java.lang.String r0 = "topic_ad_url"
            r6.putExtra(r0, r5)
            r0 = 23
            java.lang.String r1 = "extra_scence"
            r6.putExtra(r1, r0)
            androidx.appcompat.app.AppCompatActivity r0 = r46.getContext()
            java.lang.String r1 = ".ui.EmojiStoreTopicUI"
            r2 = 0
            ke3.C88144b.m109791i(r0, r7, r1, r6, r2)
            goto L_0x0a09
        L_0x082f:
            java.lang.String r0 = "topic id is zero."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            goto L_0x0a09
        L_0x0837:
            r21 = r3
        L_0x0839:
            if (r1 == 0) goto L_0x0892
            int r2 = r1.f195582i
            r3 = 27
            if (r2 != r3) goto L_0x0892
            int r0 = r1.f195511M1
            java.lang.String r2 = r1.f195514N1
            java.lang.String r3 = r1.f195517O1
            java.lang.String r4 = r1.f195520P1
            java.lang.String r5 = r1.f195523Q1
            int r6 = r1.f195526R1
            if (r0 == 0) goto L_0x088a
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            java.lang.String r11 = r9.mo102742M7(r11)
            r10.putExtra(r12, r11)
            java.lang.String r1 = r1.f195642x
            r10.putExtra(r8, r1)
            java.lang.String r1 = "set_id"
            r10.putExtra(r1, r0)
            java.lang.String r0 = "set_title"
            r10.putExtra(r0, r2)
            java.lang.String r0 = "set_iconURL"
            r10.putExtra(r0, r4)
            java.lang.String r0 = "set_desc"
            r10.putExtra(r0, r3)
            java.lang.String r0 = "headurl"
            r10.putExtra(r0, r5)
            java.lang.String r0 = "pageType"
            r10.putExtra(r0, r6)
            androidx.appcompat.app.AppCompatActivity r0 = r46.getContext()
            java.lang.String r1 = ".ui.v2.EmojiStoreV2SingleProductUI"
            r2 = 0
            ke3.C88144b.m109791i(r0, r7, r1, r10, r2)
            goto L_0x0a09
        L_0x088a:
            java.lang.String r0 = "topic id is zero."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            goto L_0x0a09
        L_0x0892:
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r11.mo108768t()
            r7 = 0
            r2[r7] = r3
            long r25 = r11.getMsgId()
            java.lang.Long r3 = java.lang.Long.valueOf(r25)
            r7 = 1
            r2[r7] = r3
            int r3 = r11.getType()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7 = 2
            r2[r7] = r3
            java.lang.String r3 = r11.getContent()
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r3)
            r7 = 3
            r2[r7] = r3
            java.lang.String r3 = "talker:%s, msgId:%s, msgType:%s, msgContent:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r3, r2)
            java.lang.String r2 = r1.f195586j
            if (r2 == 0) goto L_0x0a09
            boolean r2 = r2.equals(r13)
            if (r2 != 0) goto L_0x0a09
            java.lang.String r2 = r1.f195586j
            if (r2 == 0) goto L_0x0a09
            boolean r2 = r2.equals(r13)
            if (r2 != 0) goto L_0x0a09
            di3.d r2 = di3.C86312j.m106911c(r10)
            ym.p r2 = (p763ym.C79139p) r2
            java.lang.String r3 = r1.f195586j
            java.lang.String r7 = r9.f216369d
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85820U5(r7)
            if (r7 == 0) goto L_0x08ea
            r7 = r22
            goto L_0x08ec
        L_0x08ea:
            r7 = r30
        L_0x08ec:
            java.lang.String r2 = r2.mo108862K3(r3, r7)
            java.lang.String r3 = r1.f195586j
            androidx.appcompat.app.AppCompatActivity r7 = r46.getContext()
            java.lang.String r10 = r1.f195562d
            android.content.pm.PackageInfo r7 = r9.mo102741L7(r7, r10)
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            r10.putExtra(r8, r2)
            java.lang.String r2 = r1.f195570f
            r10.putExtra(r14, r2)
            java.lang.String r2 = r1.f195562d
            if (r2 == 0) goto L_0x093a
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0929
            java.lang.String r2 = r1.f195562d
            java.lang.String r4 = "wxfbc915ff7c30e335"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0929
            java.lang.String r2 = r1.f195562d
            java.lang.String r4 = "wx482a4001c37e2b74"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x093a
        L_0x0929:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r4 = r1.f195562d
            java.lang.String r8 = "jsapi_args_appid"
            r2.putString(r8, r4)
            java.lang.String r4 = "jsapiargs"
            r10.putExtra(r4, r2)
        L_0x093a:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r2 != 0) goto L_0x0944
            r10.putExtra(r0, r3)
            goto L_0x0949
        L_0x0944:
            java.lang.String r2 = r1.f195586j
            r10.putExtra(r0, r2)
        L_0x0949:
            if (r7 != 0) goto L_0x094d
            r0 = 0
            goto L_0x094f
        L_0x094d:
            java.lang.String r0 = r7.versionName
        L_0x094f:
            r10.putExtra(r6, r0)
            if (r7 != 0) goto L_0x0958
            r2 = r20
            r0 = 0
            goto L_0x095c
        L_0x0958:
            int r0 = r7.versionCode
            r2 = r20
        L_0x095c:
            r10.putExtra(r2, r0)
            java.lang.String r0 = r1.f195634v
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0977
            java.lang.String r0 = r1.f195634v
            java.lang.String r2 = "srcUsername"
            r10.putExtra(r2, r0)
            java.lang.String r0 = r1.f195638w
            java.lang.String r2 = "srcDisplayname"
            r10.putExtra(r2, r0)
        L_0x0977:
            long r2 = r11.getMsgId()
            r0 = r19
            r10.putExtra(r0, r2)
            java.lang.String r0 = r1.f195570f
            r10.putExtra(r14, r0)
            java.lang.String r0 = r1.f195646y
            java.lang.String r2 = "thumbUrl"
            r10.putExtra(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = r51
            r0.append(r2)
            long r3 = r11.mo108774y2()
            java.lang.String r3 = java.lang.Long.toString(r3)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r3 = r47
            r10.putExtra(r3, r0)
            java.lang.String r0 = r1.f195562d
            r1 = r32
            r10.putExtra(r1, r0)
            java.lang.String r0 = eb0.C75592q0.m90789s()
            r10.putExtra(r12, r0)
            java.lang.String r0 = r9.mo102742M7(r11)
            r1 = r35
            r10.putExtra(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            long r1 = r11.mo108774y2()
            java.lang.String r1 = java.lang.Long.toString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r43
            r10.putExtra(r1, r0)
            java.lang.String r0 = r9.mo102742M7(r11)
            java.lang.String r1 = eb0.C75592q0.m90789s()
            r2 = r42
            r10.putExtra(r2, r0)
            r2 = r41
            r10.putExtra(r2, r1)
            int r0 = eb0.C45629t0.m50815b(r0, r1)
            r1 = r40
            r10.putExtra(r1, r0)
            r0 = r39
            r1 = 0
            r10.putExtra(r0, r1)
            androidx.appcompat.app.AppCompatActivity r0 = r46.getContext()
            r1 = r21
            r2 = 0
            ke3.C88144b.m109791i(r0, r5, r1, r10, r2)
        L_0x0a09:
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r44
            goto L_0x0b27
        L_0x0a13:
            r2 = 4
            r7 = 3
            if (r1 == 0) goto L_0x0b08
            java.lang.String r0 = r1.f195541W1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0a21
            goto L_0x0b08
        L_0x0a21:
            java.lang.String r0 = r11.mo108765s2()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r4 = "KFromTimeLine"
            r5 = 0
            r3.putExtra(r4, r5)
            java.lang.String r4 = r1.f195541W1
            java.lang.String r5 = "KStremVideoUrl"
            r3.putExtra(r5, r4)
            java.lang.String r4 = r1.f195557b2
            java.lang.String r5 = "KThumUrl"
            r3.putExtra(r5, r4)
            java.lang.String r4 = "KThumbPath"
            r3.putExtra(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "fakeid_"
            r0.append(r4)
            long r4 = r11.getMsgId()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "KMediaId"
            r3.putExtra(r4, r0)
            int r0 = r1.f195544X1
            java.lang.String r4 = "KMediaVideoTime"
            r3.putExtra(r4, r0)
            java.lang.String r0 = r1.f195553a2
            java.lang.String r4 = "StremWebUrl"
            r3.putExtra(r4, r0)
            java.lang.String r0 = r1.f195550Z1
            java.lang.String r4 = "StreamWording"
            r3.putExtra(r4, r0)
            java.lang.String r0 = r1.f195570f
            java.lang.String r4 = "KMediaTitle"
            r3.putExtra(r4, r0)
            java.lang.String r0 = r11.mo108768t()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85820U5(r0)
            if (r4 == 0) goto L_0x0a8c
            java.lang.String r5 = r11.getContent()
            java.lang.String r5 = eb0.C75604z3.m90847s(r5)
            goto L_0x0a8d
        L_0x0a8c:
            r5 = r0
        L_0x0a8d:
            java.lang.String r6 = r1.f195561c2
            java.lang.String r8 = "KSta_StremVideoAduxInfo"
            r3.putExtra(r8, r6)
            java.lang.String r6 = r1.f195565d2
            java.lang.String r8 = "KSta_StremVideoPublishId"
            r3.putExtra(r8, r6)
            java.lang.String r6 = "KSta_SourceType"
            r8 = 1
            r3.putExtra(r6, r8)
            if (r4 == 0) goto L_0x0aa5
            r14 = 4
            goto L_0x0aa6
        L_0x0aa5:
            r14 = 3
        L_0x0aa6:
            java.lang.String r2 = "KSta_Scene"
            r3.putExtra(r2, r14)
            java.lang.String r2 = "KSta_FromUserName"
            r3.putExtra(r2, r5)
            java.lang.String r2 = "KSta_ChatName"
            r3.putExtra(r2, r0)
            long r5 = r11.mo108774y2()
            java.lang.String r2 = "KSta_MsgId"
            r3.putExtra(r2, r5)
            java.lang.String r1 = r1.f195535U1
            java.lang.String r2 = "KSta_SnsStatExtStr"
            r3.putExtra(r2, r1)
            if (r4 == 0) goto L_0x0ad8
            java.lang.Class<wo.b> r1 = p740wo.C53193b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            wo.b r1 = (p740wo.C53193b) r1
            int r0 = r1.mo73729p1(r0)
            java.lang.String r1 = "KSta_ChatroomMembercount"
            r3.putExtra(r1, r0)
        L_0x0ad8:
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_ad_landing_page_new_stream_video
            r2 = 1
            int r0 = r0.mo58779Qe(r1, r2)
            java.lang.String r1 = "sns"
            if (r0 <= 0) goto L_0x0afc
            androidx.appcompat.app.AppCompatActivity r0 = r46.getContext()
            java.lang.String r4 = ".ui.SnsAdStreamVideoPlayUI"
            r5 = 0
            ke3.C88144b.m109791i(r0, r1, r4, r3, r5)
            java.lang.String r0 = "use new stream video play UI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            goto L_0x0b06
        L_0x0afc:
            r5 = 0
            androidx.appcompat.app.AppCompatActivity r0 = r46.getContext()
            java.lang.String r4 = ".ui.VideoAdPlayerUI"
            ke3.C88144b.m109791i(r0, r1, r4, r3, r5)
        L_0x0b06:
            r14 = 1
            goto L_0x0b0a
        L_0x0b08:
            r5 = 0
            r14 = 0
        L_0x0b0a:
            if (r14 == 0) goto L_0x0b18
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r44
            j20.C117292a.m165361g(r9, r4, r3, r2, r1)
            return
        L_0x0b18:
            r0 = r48
            r5 = r49
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r44
            r9.mo102740K7(r0, r5)
        L_0x0b27:
            j20.C117292a.m165361g(r9, r4, r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryGridUI.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getTitle().equals(getString(C0966R.string.f5a))) {
            C73708v.C73710b.f216437a.mo102778b();
            mo102744O7();
            return false;
        }
        mo102747i();
        return false;
    }

    public void onNewIntent(Intent intent) {
        setIntent(intent);
        super.onNewIntent(intent);
        mo102743N7(1);
    }

    public void onPause() {
        C73708v.C73710b.f216437a.f216436c.remove(this);
        super.onPause();
    }

    public boolean onPreDraw() {
        throw null;
    }

    public void onResume() {
        C73708v vVar = C73708v.C73710b.f216437a;
        vVar.f216436c.remove(this);
        vVar.f216436c.add(this);
        if (this.f216381s) {
            if (vVar.f216435b) {
                mo102744O7();
            } else {
                mo102747i();
            }
        }
        this.f216375j.postDelayed(this.f216379q, 300);
        super.onResume();
        C73706n nVar = this.f216374i;
        if (nVar != null) {
            nVar.notifyDataSetChanged();
            if (vVar.f216435b) {
                setMMTitle(getString(C0966R.string.f6p, new Object[]{Integer.valueOf(vVar.mo102782f())}));
            }
        }
        this.f216381s = false;
        mo102737H7();
    }

    /* renamed from: r7 */
    public void mo22502r7(C77632o.C77633a aVar) {
        if (aVar == C77632o.C77633a.del) {
            this.f216374i.mo1333o();
            this.f216374i.notifyDataSetChanged();
        }
        mo102747i();
    }

    /* renamed from: s0 */
    public boolean mo22503s0() {
        return true;
    }

    /* renamed from: z1 */
    public void mo22504z1(C77632o.C77633a aVar) {
    }
}
