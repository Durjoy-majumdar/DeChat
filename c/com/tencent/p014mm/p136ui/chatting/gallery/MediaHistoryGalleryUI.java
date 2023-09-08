package com.tencent.p014mm.p136ui.chatting.gallery;

import a14.C53930o0;
import a14.C53973z1;
import a70.C112760b;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.chatting.gallery.C73708v;
import com.tencent.p014mm.p136ui.chatting.presenter.C73797e;
import com.tencent.p014mm.p136ui.chatting.presenter.MediaHistoryGalleryPresenter;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dk3.C97482c;
import dk3.C97483d;
import fk3.C59140g;
import fk3.C59141h;
import fk3.C8100l;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import l31.C61212e;
import nj3.C76879j;
import o31.C11345b;
import p1029rf.C89940c;
import p248ug.C65347o0;
import p606mm.C99933h;
import p761yd.C91441c;
import p910lj.C76701a;
import p995kf.C88146a;
import qh0.C62619a;
import qo3.C89779i0;
import rx3.C13598b0;
import uj3.C102039f;
import wc3.C78538u;
import xi3.C118882n;

/* renamed from: com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI */
public class MediaHistoryGalleryUI extends MMActivity implements C97483d, View.OnClickListener {

    /* renamed from: D */
    public static final /* synthetic */ int f284608D = 0;

    /* renamed from: A */
    public View f284609A;

    /* renamed from: B */
    public View f284610B;

    /* renamed from: C */
    public View f284611C;

    /* renamed from: d */
    public C97482c f284612d;

    /* renamed from: e */
    public C102039f f284613e;

    /* renamed from: f */
    public RecyclerView f284614f;

    /* renamed from: g */
    public TextView f284615g;

    /* renamed from: h */
    public String f284616h;

    /* renamed from: i */
    public long f284617i;

    /* renamed from: j */
    public TextView f284618j;

    /* renamed from: n */
    public ProgressDialog f284619n;

    /* renamed from: o */
    public boolean f284620o = false;

    /* renamed from: p */
    public int f284621p = -1;

    /* renamed from: q */
    public boolean f284622q;

    /* renamed from: r */
    public int f284623r;

    /* renamed from: s */
    public boolean f284624s = true;

    /* renamed from: t */
    public C59141h f284625t;

    /* renamed from: u */
    public int f284626u;

    /* renamed from: v */
    public long f284627v = 0;

    /* renamed from: w */
    public long f284628w = 0;

    /* renamed from: x */
    public int f284629x;

    /* renamed from: y */
    public View f284630y;

    /* renamed from: z */
    public View f284631z;

    /* renamed from: B6 */
    public void mo135858B6() {
        mo135868i();
        this.f284622q = false;
        mo135861I7(false, "");
        int indexOf = C112760b.m154240l().indexOf(C112760b.m154218Z());
        C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.baw, new Object[]{indexOf >= 0 ? C112760b.m154240l().substring(indexOf) : C112760b.m154240l()}), 1).show();
    }

    /* renamed from: H */
    public void mo135859H(int i) {
        setMMTitle(getString(C0966R.string.f6p, new Object[]{Integer.valueOf(i)}));
        mo135860H7(i);
    }

    /* renamed from: H7 */
    public final void mo135860H7(int i) {
        if (!this.f284612d.mo136072m() || i <= 0) {
            this.f284630y.setEnabled(false);
            this.f284631z.setEnabled(false);
            this.f284609A.setEnabled(false);
            this.f284610B.setEnabled(false);
            return;
        }
        this.f284630y.setEnabled(true);
        this.f284631z.setEnabled(true);
        this.f284609A.setEnabled(true);
        this.f284610B.setEnabled(true);
    }

    /* renamed from: I7 */
    public final void mo135861I7(boolean z, String str) {
        Log.m105925i("MicroMsg.MediaHistoryGalleryUI", "[setProgress] isVisible:%s", Boolean.valueOf(z));
        if (z) {
            if (str == null) {
                str = getString(C0966R.string.gas);
            }
            this.f284619n = C89779i0.m112248e(this, str, true, 0, (DialogInterface.OnCancelListener) null);
            return;
        }
        ProgressDialog progressDialog = this.f284619n;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f284619n.dismiss();
            this.f284619n = null;
        }
    }

    /* renamed from: J7 */
    public void mo135862J7() {
        this.f284612d.mo136071l();
        setMMTitle(getString(C0966R.string.f6p, new Object[]{Integer.valueOf(this.f284612d.mo136063Q())}));
        View view = this.f284611C;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "toSelectedMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "toSelectedMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f284611C.startAnimation(AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2471dv));
        mo135860H7(this.f284612d.mo136063Q());
        removeOptionMenu(0);
        addTextOptionMenu(0, getString(C0966R.string.f5_), new MediaHistoryGalleryUI$$e(this));
        ((C65347o0) C86312j.m106911c(C65347o0.class)).mo89074NX(3);
    }

    /* renamed from: O */
    public void mo135863O() {
        mo135868i();
        this.f284622q = false;
        mo135861I7(false, "");
    }

    /* renamed from: X0 */
    public boolean mo135864X0() {
        return this.f284622q;
    }

    /* renamed from: f */
    public void mo135865f(boolean z) {
        if (z) {
            mo135861I7(true, (String) null);
        } else {
            this.f284629x = ((GridLayoutManager) this.f284614f.getLayoutManager()).mo16959E();
        }
        Log.m105925i("MicroMsg.MediaHistoryGalleryUI", "onDataLoading mLastVisibleItemPosition:%s", Integer.valueOf(this.f284629x));
    }

    public View getChildAt(int i) {
        return this.f284614f.getChildAt(i);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bbe;
    }

    /* renamed from: h6 */
    public void mo135867h6() {
        this.f284622q = true;
        mo135861I7(true, getString(C0966R.string.fn5));
    }

    /* renamed from: i */
    public void mo135868i() {
        this.f284612d.mo136068i();
        setMMTitle(this.f284612d.mo136066c());
        View view = this.f284611C;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "toNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "toNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f284611C.startAnimation(AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2469dt));
        removeOptionMenu(0);
        addTextOptionMenu(0, getString(C0966R.string.f5a), new MediaHistoryGalleryUI$$f(this));
    }

    public void initView() {
        super.initView();
        this.f284611C = findViewById(C0966R.C0970id.gz4);
        this.f284631z = findViewById(C0966R.C0970id.kth);
        this.f284610B = findViewById(C0966R.C0970id.c0a);
        this.f284609A = findViewById(C0966R.C0970id.j0m);
        View findViewById = findViewById(C0966R.C0970id.cud);
        this.f284630y = findViewById;
        findViewById.setTag(1);
        this.f284631z.setTag(0);
        this.f284609A.setTag(3);
        this.f284610B.setTag(2);
        this.f284630y.setOnClickListener(this);
        this.f284631z.setOnClickListener(this);
        this.f284609A.setOnClickListener(this);
        this.f284610B.setOnClickListener(this);
        this.f284615g = (TextView) findViewById(C0966R.C0970id.f5770o6);
        this.f284618j = (TextView) findViewById(C0966R.C0970id.j6m);
        RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.ewn);
        this.f284614f = recyclerView;
        recyclerView.setBackgroundColor(getResources().getColor(C0966R.color.f3039cz));
        findViewById(C0966R.C0970id.bru).setBackgroundColor(getResources().getColor(C0966R.color.f3039cz));
        this.f284614f.setLayoutManager(this.f284612d.mo136065b(this));
        this.f284614f.mo17085h0(this.f284612d.mo136064a(this));
        C102039f P = this.f284612d.mo136062P(this.f284616h, this.f284617i);
        this.f284613e = P;
        this.f284614f.setAdapter(P);
        this.f284614f.setHasFixedSize(true);
        this.f284614f.setOnScrollListener(new MediaHistoryGalleryUI$$b(this));
        if (this.f284625t == null) {
            this.f284625t = new C59141h(this, this.f284616h, this.f284626u);
        }
        this.f284614f.mo17043c(new MediaHistoryGalleryUI$$c(this));
        setMMTitle(this.f284612d.mo136066c());
        setBackBtn(new MediaHistoryGalleryUI$$d(this));
    }

    /* renamed from: k */
    public void mo135869k(boolean z, int i) {
        Log.m105925i("MicroMsg.MediaHistoryGalleryUI", "[onDataLoaded] isFirst:%s addCount:%s mIntentPos:%s", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(this.f284621p));
        if (z) {
            mo135861I7(false, (String) null);
            this.f284614f.getAdapter().notifyDataSetChanged();
            int i2 = this.f284621p;
            if (i2 > 0) {
                if (i2 % 4 == 0) {
                    this.f284621p = i2 + 1;
                }
                int itemCount = this.f284614f.getAdapter().getItemCount();
                RecyclerView recyclerView = this.f284614f;
                int min = Math.min(itemCount - 1, this.f284621p);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(min));
                RecyclerView recyclerView2 = recyclerView;
                C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "onDataLoaded", "(ZI)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView2, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "onDataLoaded", "(ZI)V", "Undefined", "scrollToPosition", "(I)V");
            } else {
                int itemCount2 = this.f284614f.getAdapter().getItemCount();
                RecyclerView recyclerView3 = this.f284614f;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(itemCount2 - 1));
                RecyclerView recyclerView4 = recyclerView3;
                C117292a.m165358d(recyclerView4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "onDataLoaded", "(ZI)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView3.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView4, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "onDataLoaded", "(ZI)V", "Undefined", "scrollToPosition", "(I)V");
            }
            if (i <= 0) {
                this.f284618j.setVisibility(0);
                this.f284614f.setVisibility(8);
                this.f284618j.setTextColor(C76577a.m92153d(this, C0966R.color.al6));
                this.f284618j.setText(getString(C0966R.string.bav));
                return;
            }
            this.f284618j.setVisibility(8);
            this.f284614f.setVisibility(0);
        } else if (this.f284614f.mo17036W0()) {
            Log.m105928w("MicroMsg.MediaHistoryGalleryUI", "[onDataLoaded] isComputingLayout ");
        } else if (i > 0) {
            this.f284614f.getAdapter().notifyItemRangeInserted(0, i);
            this.f284614f.getAdapter().notifyItemRangeChanged(i, this.f284629x + i);
            Log.m105925i("MicroMsg.MediaHistoryGalleryUI", "onDataLoading notifyItemRangeChanged:%s", Integer.valueOf(this.f284629x + i));
        } else {
            this.f284614f.getAdapter().notifyItemChanged(0);
        }
    }

    public void onBackPressed() {
        C59141h hVar = this.f284625t;
        if (hVar != null) {
            hVar.mo84355b();
        }
        super.onBackPressed();
        Log.m105924i("MicroMsg.MediaHistoryGalleryUI", "[onBackPressed] ");
        if (this.f284622q) {
            this.f284612d.mo136061O();
        } else {
            finish();
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f284612d.mo136073n(((Integer) view.getTag()).intValue());
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(109);
        super.onCreate(bundle);
        this.f284620o = true;
        Intent intent = getIntent();
        boolean z = false;
        intent.getIntExtra("kintent_intent_source", 0);
        this.f284616h = intent.getStringExtra("kintent_talker");
        this.f284621p = intent.getIntExtra("kintent_image_index", -1);
        intent.getBooleanExtra("key_is_biz_chat", false);
        this.f284617i = getIntent().getLongExtra("key_biz_chat_id", -1);
        int intExtra = intent.getIntExtra("key_gallery_enter_scene", -1);
        this.f284626u = intExtra;
        if (intExtra == 3 || intExtra == 4) {
            z = true;
        }
        if (z) {
            C62619a aVar = new C62619a();
            aVar.f177833h = 4;
            ((C99933h) C86312j.m106911c(C99933h.class)).mo84399BM(18, "album_enter_from_scene", aVar, new MediaHistoryGalleryUI$$a());
        }
        MediaHistoryGalleryPresenter mediaHistoryGalleryPresenter = getIntent().getIntExtra("key_media_type", -1) != 1 ? new MediaHistoryGalleryPresenter(this) : new MediaHistoryGalleryPresenter(this);
        mediaHistoryGalleryPresenter.f285110d = this;
        mo82061t5(mediaHistoryGalleryPresenter);
        mediaHistoryGalleryPresenter.f285117n.alive();
        C73708v vVar = C73708v.C73710b.f216437a;
        vVar.f216436c.remove(mediaHistoryGalleryPresenter);
        vVar.f216436c.add(mediaHistoryGalleryPresenter);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.f3275lu));
        setNavigationbarColor(getContext().getResources().getColor(C0966R.color.f3275lu));
        initView();
        this.f284612d.mo136070k(true, this.f284621p);
        C78538u.m94868d(this);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.MediaHistoryGalleryUI);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f284612d.onDetach();
        C59141h hVar = this.f284625t;
        if (hVar != null) {
            hVar.getClass();
            Class cls = C65347o0.class;
            Log.m105924i("MicroMsg.MediaHistoryQueryHeaderUI", "destroy, " + hVar.f169149d + ", " + hVar.f169148c + ", " + hVar.f169154i);
            C53973z1 z1Var = hVar.f169156k;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            C53930o0.m60558e(hVar.f169155j, (CancellationException) null, 1, (Object) null);
            if (hVar.f169149d && !hVar.mo84354a() && hVar.f169157l) {
                ((C65347o0) C86312j.m106911c(cls)).A40();
            }
            ((C65347o0) C86312j.m106911c(cls)).mo89074NX(6);
            this.f284625t = null;
        }
    }

    public void onPause() {
        C89940c cVar;
        Class cls = C88146a.class;
        super.onPause();
        C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcMediaGalleryScrollEnable(), this.f284623r);
        this.f284623r = 0;
        if (!(!C91441c.m114729c() || C91441c.m114730d().mo125377a(cls) == null || (cVar = ((C88146a) C91441c.m114730d().mo125377a(cls)).f254918n) == null)) {
            this.f284627v = Math.max(0, ((long) ((int) cVar.f258449e)) - this.f284627v);
        }
        this.f284628w = Util.nowSecond() > this.f284628w ? Util.nowSecond() - this.f284628w : 1;
        C40318k.m43492a().reportFPS(703, C40318k.m43492a().getHcMediaGalleryScrollAction(), 1, this.f284627v, this.f284628w);
        this.f284627v = 0;
        this.f284628w = 0;
    }

    public void onResume() {
        C89940c cVar;
        Class cls = C88146a.class;
        this.f284628w = Util.nowSecond();
        if (!(!C91441c.m114729c() || C91441c.m114730d().mo125377a(cls) == null || (cVar = ((C88146a) C91441c.m114730d().mo125377a(cls)).f254918n) == null)) {
            this.f284627v = (long) ((int) cVar.f258449e);
        }
        super.onResume();
        this.f284612d.onResume();
        if (this.f284620o) {
            if (this.f284612d.mo136072m()) {
                mo135862J7();
            } else {
                mo135868i();
            }
        }
        C59141h hVar = this.f284625t;
        if (hVar != null && !this.f284620o) {
            hVar.getClass();
            Class cls2 = C65347o0.class;
            Log.m105924i("MicroMsg.MediaHistoryQueryHeaderUI", "onActivityResumeToUpdateSug");
            if (((C65347o0) C86312j.m106911c(cls2)).Iq0() && hVar.f169149d) {
                Log.m105924i("MicroMsg.MediaHistoryQueryHeaderUI", "onActivityResultToUpdateSug");
                ((C65347o0) C86312j.m106911c(cls2)).mo89077gs(hVar.f169147b);
                C8100l lVar = hVar.f169152g;
                if (lVar != null) {
                    lVar.mo9175a(new C59140g(hVar), (C32226l<? super ArrayList<Pair<String, ArrayList<String>>>, C13598b0>) null);
                }
            }
        }
        this.f284620o = false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C118882n.class);
    }

    /* renamed from: t5 */
    public void mo82061t5(C73797e eVar) {
        this.f284612d = (C97482c) eVar;
    }

    /* renamed from: u3 */
    public void mo135871u3(int i) {
        mo135868i();
        mo135861I7(false, "");
        if (i == 0) {
            i = C0966R.string.f6n;
        }
        if (this.f284622q) {
            C76879j.m92744o(this, i, C0966R.string.a3h, true, (DialogInterface.OnClickListener) null);
        }
        this.f284622q = false;
    }
}
