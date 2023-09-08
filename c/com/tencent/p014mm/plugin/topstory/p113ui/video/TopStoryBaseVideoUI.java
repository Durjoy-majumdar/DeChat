package com.tencent.p014mm.plugin.topstory.p113ui.video;

import a13.C16424b;
import a13.C66993d;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.C16681x;
import androidx.recyclerview.widget.C16682y;
import androidx.recyclerview.widget.C54234f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.HaoKanActionEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83031z;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.plugin.topstory.p113ui.video.C19367a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kj2.C117407d;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONException;
import org.json.JSONObject;
import p03.C21912d;
import p03.C21913e;
import p03.C21914h;
import p03.C21915i;
import p1042u.C111060j;
import p206nj.C11171e;
import p331dj.C107043a;
import p910lj.C76701a;
import qo3.C77407n;
import s03.C22291j;
import t03.C22426h;
import t03.C64200a;
import te3.nh4;
import te3.oh4;
import te3.uh4;
import te3.xh4;
import u03.C22577a;
import u03.C22578b;
import v03.C22713a;
import v03.C52734b;
import v73.C102158a;
import x03.C102531s;
import x03.C102532t;
import x03.C111991i;
import x03.C111992j;
import x03.C22947b;
import x03.C22949d;
import x03.C22950e;
import x03.C22951f;
import x03.C22953h;
import x03.C22958k;
import x03.C22964o;
import x03.C22967p;
import x03.C22974q;
import x03.C22982r;
import x03.C22983u;
import y03.C23204j;
import y03.C23207k;
import z03.C23449k;
import zn0.C91802b;
import zn0.C91803c;

/* renamed from: com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI */
public abstract class TopStoryBaseVideoUI extends MMSecDataActivity implements C22947b, C21913e {

    /* renamed from: X */
    public static final /* synthetic */ int f54577X = 0;

    /* renamed from: A */
    public boolean f54578A = true;

    /* renamed from: B */
    public int f54579B = 0;

    /* renamed from: C */
    public long f54580C = -1;

    /* renamed from: D */
    public long f54581D = -1;

    /* renamed from: E */
    public boolean f54582E = false;

    /* renamed from: F */
    public C19367a.C19368a f54583F = new C19362h();

    /* renamed from: G */
    public C22964o f54584G;

    /* renamed from: H */
    public C22982r f54585H;

    /* renamed from: I */
    public C22967p f54586I;

    /* renamed from: J */
    public C22983u f54587J;

    /* renamed from: K */
    public C22974q f54588K;

    /* renamed from: L */
    public boolean f54589L;

    /* renamed from: M */
    public C66993d f54590M;

    /* renamed from: N */
    public boolean f54591N;

    /* renamed from: P */
    public C16424b f54592P;

    /* renamed from: Q */
    public Point f54593Q;

    /* renamed from: R */
    public int f54594R;

    /* renamed from: S */
    public C16682y f54595S;

    /* renamed from: T */
    public C16682y f54596T;

    /* renamed from: U */
    public boolean f54597U;

    /* renamed from: V */
    public C22291j f54598V;

    /* renamed from: W */
    public C11385n f54599W = new C19357b();

    /* renamed from: d */
    public View f54600d;

    /* renamed from: e */
    public TextView f54601e;

    /* renamed from: f */
    public View f54602f;

    /* renamed from: g */
    public ImageView f54603g;

    /* renamed from: h */
    public View f54604h;

    /* renamed from: i */
    public ImageView f54605i;

    /* renamed from: j */
    public ImageButton f54606j;

    /* renamed from: n */
    public C19367a f54607n;

    /* renamed from: o */
    public uh4 f54608o;

    /* renamed from: p */
    public RecyclerView f54609p;

    /* renamed from: q */
    public LinearLayoutManager f54610q;

    /* renamed from: r */
    public C22950e f54611r;

    /* renamed from: s */
    public C22949d f54612s;

    /* renamed from: t */
    public RecyclerView f54613t;

    /* renamed from: u */
    public LinearLayoutManager f54614u;

    /* renamed from: v */
    public C22950e f54615v;

    /* renamed from: w */
    public C22949d f54616w;

    /* renamed from: x */
    public C22713a f54617x;

    /* renamed from: y */
    public C22577a f54618y;

    /* renamed from: z */
    public RecyclerView.C0130p f54619z = new C19361g();

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI$a */
    public class C19356a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f54620d;

        /* renamed from: e */
        public final /* synthetic */ boolean f54621e;

        public C19356a(List list, boolean z) {
            this.f54620d = list;
            this.f54621e = z;
        }

        public void run() {
            TopStoryBaseVideoUI topStoryBaseVideoUI = TopStoryBaseVideoUI.this;
            if (topStoryBaseVideoUI.f54597U) {
                topStoryBaseVideoUI.f54615v.mo36131F4(this.f54620d, this.f54621e);
                TopStoryBaseVideoUI.this.f54611r.notifyDataSetChanged();
                return;
            }
            topStoryBaseVideoUI.f54611r.mo36131F4(this.f54620d, this.f54621e);
            TopStoryBaseVideoUI.this.f54615v.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI$b */
    public class C19357b implements C11385n {

        /* renamed from: com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI$b$a */
        public class C19358a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C22291j f54624d;

            public C19358a(C22291j jVar) {
                this.f54624d = jVar;
            }

            public void run() {
                C22953h u5 = TopStoryBaseVideoUI.this.mo24951K0().mo36135u5(this.f54624d.f63198g);
                if (u5 == null) {
                    return;
                }
                if (u5 instanceof C23449k) {
                    u5.mo36168F();
                } else if (u5 instanceof C23207k) {
                    ((C23204j) u5.mo36172y().getControlBar()).mo36654D(this.f54624d.f63198g);
                }
            }
        }

        public C19357b() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            String str2;
            C22291j jVar = (C22291j) yVar;
            nh4 nh4 = (nh4) jVar.f63196e.f127055a.f127080a;
            if (i == 0 && i2 == 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("docId", nh4.f64318d);
                    jSONObject.put("opType", "LIKE");
                    jSONObject.put("isLike", nh4.f64320f == 4);
                } catch (JSONException unused) {
                }
                xh4 xh4 = jVar.f63198g;
                if (xh4 != null) {
                    boolean z = nh4.f64320f == 4;
                    xh4.f64716R = z;
                    Log.m105925i("MicroMsg.TopStory.TopStoryBaseVideoUI", "setCmtListener onSceneEnd succ, thumb: %s count: %s", Boolean.valueOf(z), Integer.valueOf(jVar.f63198g.f64722X));
                    int i3 = nh4.f64320f;
                    View view = null;
                    if (i3 == 4) {
                        C22953h u5 = TopStoryBaseVideoUI.this.mo24951K0().mo36135u5(jVar.f63198g);
                        xh4 xh42 = TopStoryBaseVideoUI.this.f54587J.f66030d;
                        if (xh42 != null && (str2 = xh42.f64729h) != null && str2.equals(jVar.f63198g.f64729h) && ((u5 instanceof C23449k) || (u5 instanceof C23207k))) {
                            view = u5.mo36173z();
                        }
                        if (view != null) {
                            TopStoryBaseVideoUI.this.mo24965S7(jVar.f63198g, view, true);
                            if (u5 instanceof C23207k) {
                                u5.mo36172y().getControlBar().mo36668z();
                            }
                        }
                    } else {
                        if (((oh4) jVar.f63196e.f127056b.f127083a).f139187e) {
                            TopStoryBaseVideoUI topStoryBaseVideoUI = TopStoryBaseVideoUI.this;
                            C76879j.m92748s(topStoryBaseVideoUI, topStoryBaseVideoUI.getString(C0966R.string.f361472k52), "");
                        } else {
                            C76912y0.makeText((Context) TopStoryBaseVideoUI.this.getContext(), (int) C0966R.string.f361473k53, 0).show();
                        }
                        TopStoryBaseVideoUI.this.mo24965S7(jVar.f63198g, (View) null, false);
                    }
                }
                HaoKanActionEvent haoKanActionEvent = new HaoKanActionEvent();
                haoKanActionEvent.f9314d.f9315a = jSONObject.toString();
                haoKanActionEvent.f9314d.f9316b = "";
                haoKanActionEvent.publish();
            } else {
                Log.m105929w("MicroMsg.TopStory.TopStoryBaseVideoUI", "NetSceneTopStorySetComment response, errType:%s, errCode:%s, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
                C76912y0.makeText((Context) TopStoryBaseVideoUI.this.getContext(), (CharSequence) TopStoryBaseVideoUI.this.getString(C0966R.string.k47), 0).show();
                xh4 xh43 = jVar.f63198g;
                if (xh43 != null) {
                    xh43.f64716R = !xh43.f64716R;
                    Log.m105924i("MicroMsg.TopStory.TopStoryBaseVideoUI", "setCmtListener onSceneEnd error, thumb:" + jVar.f63198g.f64716R);
                }
            }
            TopStoryBaseVideoUI.this.runOnUiThread(new C19358a(jVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI$c */
    public class C19359c implements Runnable {
        public C19359c() {
        }

        public void run() {
            C22950e eVar = TopStoryBaseVideoUI.this.f54611r;
            int G4 = eVar.mo36132G4();
            int itemCount = eVar.getItemCount();
            C111060j<View> jVar = eVar.f65916e;
            int i = jVar.f332588g;
            Object[] objArr = jVar.f332587f;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            jVar.f332588g = 0;
            jVar.f332585d = false;
            eVar.notifyItemRangeRemoved(itemCount - G4, G4);
            C22950e eVar2 = TopStoryBaseVideoUI.this.f54615v;
            int G42 = eVar2.mo36132G4();
            int itemCount2 = eVar2.getItemCount();
            C111060j<View> jVar2 = eVar2.f65916e;
            int i3 = jVar2.f332588g;
            Object[] objArr2 = jVar2.f332587f;
            for (int i4 = 0; i4 < i3; i4++) {
                objArr2[i4] = null;
            }
            jVar2.f332588g = 0;
            jVar2.f332585d = false;
            eVar2.notifyItemRangeRemoved(itemCount2 - G42, G42);
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI$e */
    public class C19360e implements View.OnClickListener {
        public C19360e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TopStoryBaseVideoUI topStoryBaseVideoUI = TopStoryBaseVideoUI.this;
            topStoryBaseVideoUI.mo24971W7(!topStoryBaseVideoUI.f54608o.f64654x);
            topStoryBaseVideoUI.mo24943A();
            topStoryBaseVideoUI.mo24974Y();
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI$g */
    public class C19361g extends RecyclerView.C0130p {
        public C19361g() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            TopStoryBaseVideoUI topStoryBaseVideoUI = TopStoryBaseVideoUI.this;
            if (!topStoryBaseVideoUI.f54578A) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            if (i == 0) {
                if (topStoryBaseVideoUI.f54597U) {
                    topStoryBaseVideoUI.f54616w.mo36129c(topStoryBaseVideoUI);
                } else {
                    topStoryBaseVideoUI.f54612s.mo36129c(topStoryBaseVideoUI);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            TopStoryBaseVideoUI topStoryBaseVideoUI = TopStoryBaseVideoUI.this;
            if (!topStoryBaseVideoUI.f54578A || i2 == 0) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                return;
            }
            topStoryBaseVideoUI.mo24966T7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI$h */
    public class C19362h implements C19367a.C19368a {
        public C19362h() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI$i */
    public class C19363i implements C66993d.C66998e {

        /* renamed from: a */
        public final /* synthetic */ View f54630a;

        /* renamed from: b */
        public final /* synthetic */ int f54631b;

        public C19363i(View view, int i) {
            this.f54630a = view;
            this.f54631b = i;
        }

        /* renamed from: a */
        public void mo25000a(xh4 xh4) {
        }

        /* renamed from: b */
        public void mo25001b(xh4 xh4) {
            C102531s sVar = C102531s.f301890b;
            TopStoryBaseVideoUI topStoryBaseVideoUI = TopStoryBaseVideoUI.this;
            topStoryBaseVideoUI.getClass();
            sVar.mo142142a(topStoryBaseVideoUI, TopStoryBaseVideoUI.this.f54608o, xh4);
            TopStoryBaseVideoUI.this.f54590M.dismiss();
            C117407d.INSTANCE.mo160131h(17080, 65, 2);
        }

        /* renamed from: c */
        public void mo25002c(xh4 xh4) {
            if (xh4.f64718T != null) {
                TopStoryBaseVideoUI topStoryBaseVideoUI = TopStoryBaseVideoUI.this;
                View view = this.f54630a;
                int i = this.f54631b;
                topStoryBaseVideoUI.f54591N = true;
                xh4 d = topStoryBaseVideoUI.f54588K.mo36193d(i);
                C16424b bVar = new C16424b(topStoryBaseVideoUI.getContext(), d, new C22958k(topStoryBaseVideoUI, d, i));
                topStoryBaseVideoUI.f54592P = bVar;
                if (topStoryBaseVideoUI.f54597U) {
                    bVar.mo14882c(view, true, 0 - C76577a.m92151b(topStoryBaseVideoUI.getContext(), 40), C76577a.m92151b(topStoryBaseVideoUI.getContext(), 16));
                    try {
                        ((C23204j) topStoryBaseVideoUI.f54587J.f66029c.getControlBar()).mo36652B();
                    } catch (Exception unused) {
                    }
                } else {
                    bVar.mo14882c(view, false, 0, 0 - C76577a.m92151b(topStoryBaseVideoUI.getContext(), 10));
                }
            }
            TopStoryBaseVideoUI.this.f54590M.dismiss();
        }

        public void onDismiss() {
            Log.m105924i("MicroMsg.TopStory.TopStoryBaseVideoUI", "more popupWindow dismiss");
            TopStoryBaseVideoUI topStoryBaseVideoUI = TopStoryBaseVideoUI.this;
            if (topStoryBaseVideoUI.f54589L) {
                topStoryBaseVideoUI.f54589L = false;
                if (!topStoryBaseVideoUI.f54591N) {
                    topStoryBaseVideoUI.f54587J.mo36219k();
                    TopStoryBaseVideoUI topStoryBaseVideoUI2 = TopStoryBaseVideoUI.this;
                    if (topStoryBaseVideoUI2.f54597U) {
                        try {
                            ((C23204j) topStoryBaseVideoUI2.f54587J.f66029c.getControlBar()).mo36651A();
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI$j */
    public class C19364j extends C54234f {
        public C19364j(C19365d dVar) {
        }

        /* renamed from: A */
        public void mo25004A(RecyclerView.C16631z zVar) {
            TopStoryBaseVideoUI.this.mo24966T7();
            TopStoryBaseVideoUI topStoryBaseVideoUI = TopStoryBaseVideoUI.this;
            topStoryBaseVideoUI.f54612s.mo36129c(topStoryBaseVideoUI);
            Log.m105925i("MicroMsg.TopStory.TopStoryBaseVideoUI", "onRemoveFinished %d", Integer.valueOf(zVar.mo17363j()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI$d */
    public class C19365d implements View.OnClickListener {
        public C19365d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TopStoryBaseVideoUI.this.mo24961Q7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI$f */
    public class C19366f implements View.OnClickListener {
        public C19366f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TopStoryBaseVideoUI topStoryBaseVideoUI = TopStoryBaseVideoUI.this;
            int i = TopStoryBaseVideoUI.f54577X;
            C77407n nVar = new C77407n((Context) topStoryBaseVideoUI.getContext(), 1, false);
            nVar.f225771i = new C111991i(topStoryBaseVideoUI);
            nVar.f225782p = new C111992j(topStoryBaseVideoUI);
            nVar.mo107573q();
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: A */
    public void mo24943A() {
    }

    /* renamed from: C1 */
    public C16682y mo24944C1() {
        return this.f54597U ? this.f54596T : this.f54595S;
    }

    /* renamed from: C5 */
    public void mo24945C5() {
        runOnUiThread(new C19359c());
    }

    /* renamed from: C6 */
    public C22974q mo24946C6() {
        return this.f54588K;
    }

    /* renamed from: G6 */
    public Point mo24947G6() {
        if (this.f54593Q == null) {
            this.f54593Q = C85875k4.m106184h(this);
        }
        Log.m105925i("MicroMsg.TopStory.TopStoryBaseVideoUI", "lxl screenSize:%s, %s", Integer.valueOf(this.f54593Q.x), Integer.valueOf(this.f54593Q.y));
        return this.f54593Q;
    }

    /* renamed from: H7 */
    public abstract C22950e mo24948H7();

    /* renamed from: I7 */
    public abstract C22950e mo24949I7();

    /* renamed from: J7 */
    public abstract C22949d mo24950J7();

    /* renamed from: K0 */
    public C22950e mo24951K0() {
        return this.f54597U ? this.f54615v : this.f54611r;
    }

    /* renamed from: K6 */
    public boolean mo24952K6() {
        return this.f54608o.f64642i != 326;
    }

    /* renamed from: K7 */
    public abstract C22949d mo24953K7();

    /* renamed from: L7 */
    public void mo24954L7() {
        this.f54581D = Util.currentTicks();
    }

    /* renamed from: M */
    public void mo24955M(int i, int i2) {
        this.f54587J.mo36213e(i, i2);
    }

    /* renamed from: M7 */
    public final int mo24956M7() {
        return ((AudioManager) getApplicationContext().getSystemService("audio")).getStreamVolume(3);
    }

    /* renamed from: N7 */
    public final void mo24957N7() {
        getWindow().setFlags(201327616, 201327616);
        View decorView = getWindow().getDecorView();
        if (C11171e.m11044a(19)) {
            decorView.setSystemUiVisibility(2);
        } else {
            decorView.setSystemUiVisibility(4098);
        }
        getWindow().addFlags(128);
    }

    /* renamed from: O7 */
    public void mo24958O7() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo91112w(new ColorDrawable(0));
            getSupportActionBar().mo91104o();
        }
        mo24957N7();
        this.f54600d = findViewById(C0966R.C0970id.kof);
        this.f54601e = (TextView) findViewById(C0966R.C0970id.kpm);
        this.f54605i = (ImageView) findViewById(C0966R.C0970id.jyo);
        this.f54602f = findViewById(C0966R.C0970id.h7j);
        this.f54603g = (ImageView) findViewById(C0966R.C0970id.h7m);
        this.f54604h = findViewById(C0966R.C0970id.gzc);
        ImageButton imageButton = (ImageButton) findViewById(C0966R.C0970id.f357484a32);
        this.f54606j = imageButton;
        imageButton.getDrawable().setColorFilter(getResources().getColor(C0966R.color.f2975b6), PorterDuff.Mode.SRC_ATOP);
        this.f54606j.setOnClickListener(new C19365d());
        this.f54602f.setOnClickListener(new C19360e());
        View view = this.f54602f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.l7_);
        this.f54609p = recyclerView;
        recyclerView.mo17043c(this.f54619z);
        this.f54609p.setItemAnimator(new C19364j((C19365d) null));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.f54610q = linearLayoutManager;
        this.f54609p.setLayoutManager(linearLayoutManager);
        this.f54595S = new C16681x(this.f54610q);
        C22950e H7 = mo24948H7();
        this.f54611r = H7;
        this.f54609p.setAdapter(H7);
        RecyclerView recyclerView2 = (RecyclerView) findViewById(C0966R.C0970id.eg5);
        this.f54613t = recyclerView2;
        recyclerView2.mo17043c(this.f54619z);
        this.f54613t.setItemAnimator(new C19364j((C19365d) null));
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this);
        this.f54614u = linearLayoutManager2;
        this.f54613t.setLayoutManager(linearLayoutManager2);
        this.f54596T = new C16681x(this.f54614u);
        C22950e I7 = mo24949I7();
        this.f54615v = I7;
        this.f54613t.setAdapter(I7);
        this.f54613t.setVisibility(8);
        if (!this.f54582E && !mo24970W3()) {
            C19367a aVar2 = new C19367a(getApplicationContext());
            this.f54607n = aVar2;
            aVar2.enable();
            this.f54607n.f54640e = this.f54583F;
            this.f54582E = true;
        }
        boolean z = this.f54608o.f64654x;
        if (z) {
            mo24971W7(z);
        }
        this.f54584G.f65983b = this;
        this.f54604h.setOnClickListener(new C19366f());
    }

    /* renamed from: P7 */
    public void mo24959P7() {
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_context");
        uh4 uh4 = new uh4();
        this.f54608o = uh4;
        try {
            uh4.parseFrom(byteArrayExtra);
        } catch (Exception unused) {
            finish();
        }
        C22974q qVar = new C22974q();
        this.f54588K = qVar;
        qVar.f65999a = this;
        C22967p pVar = new C22967p();
        this.f54586I = pVar;
        pVar.mo36187c(this);
        C22982r rVar = new C22982r();
        this.f54585H = rVar;
        rVar.f66022c++;
        rVar.f66021b = this;
        C22983u uVar = new C22983u();
        this.f54587J = uVar;
        uVar.f66027a++;
        uVar.f66036j = this;
        this.f54584G = new C22964o();
        this.f54612s = mo24953K7();
        this.f54616w = mo24950J7();
        C22577a aVar = new C22577a(new C22578b(this));
        this.f54618y = aVar;
        aVar.mo35648A(8, this.f54608o.f64648r);
        this.f54618y.mo67998q0(getResources().getString(C0966R.string.f361469k43));
        C22713a aVar2 = new C22713a(new C52734b(this));
        this.f54617x = aVar2;
        aVar2.mo35809D(8, this.f54608o.f64648r);
        this.f54617x.mo160077O(getResources().getString(C0966R.string.f361469k43));
    }

    /* renamed from: Q5 */
    public int mo24960Q5() {
        return this.f54608o.f64656z;
    }

    /* renamed from: Q7 */
    public void mo24961Q7() {
    }

    /* renamed from: R1 */
    public void mo24962R1() {
        mo24957N7();
    }

    /* renamed from: R7 */
    public void mo24963R7(int i) {
    }

    /* renamed from: S2 */
    public int mo24964S2() {
        return C64200a.f181921a;
    }

    /* renamed from: S7 */
    public abstract void mo24965S7(xh4 xh4, View view, boolean z);

    /* renamed from: T7 */
    public void mo24966T7() {
        if (this.f54597U) {
            this.f54616w.mo36128b(this);
        } else {
            this.f54612s.mo36128b(this);
        }
        this.f54579B = ((LinearLayoutManager) mo24972X3()).mo16959E();
        int itemCount = mo24972X3().getItemCount();
        long j = this.f54580C;
        if (j <= 0 || Util.ticksToNow(j) >= 50) {
            this.f54580C = Util.currentTicks();
            C22974q qVar = this.f54588K;
            boolean z = true;
            boolean z2 = false;
            boolean z3 = qVar.f66001c == 1 ? !(itemCount - this.f54579B > 3 || qVar.f66000b || Util.ticksToNow(this.f54581D) < 50) : !(this.f54579B < itemCount - 1 || qVar.f66000b || Util.ticksToNow(this.f54581D) < 50);
            uh4 uh4 = this.f54608o;
            if (uh4.f64642i == 36 || uh4.f64636A) {
                z = false;
            }
            if (z) {
                z2 = z3;
            }
            if (z2) {
                mo24954L7();
            }
        }
    }

    /* renamed from: U2 */
    public C22982r mo24967U2() {
        return this.f54585H;
    }

    /* renamed from: U7 */
    public void mo24968U7(boolean z) {
        Log.m105925i("MicroMsg.TopStory.TopStoryBaseVideoUI", "setNeedScrollEvent %b", Boolean.valueOf(z));
        this.f54578A = z;
    }

    /* renamed from: V7 */
    public final void mo24969V7() {
        if (this.f54608o.f64654x) {
            this.f54603g.setBackgroundResource(C0966R.raw.top_story_volume_off);
        } else {
            this.f54603g.setBackgroundResource(C0966R.raw.top_story_volume_on);
        }
        C22983u uVar = this.f54587J;
        if (uVar.f66031e) {
            uVar.mo36220l(this.f54608o.f64654x);
        }
    }

    /* renamed from: W3 */
    public boolean mo24970W3() {
        return this.f54608o.f64641h == 100203;
    }

    /* renamed from: W7 */
    public void mo24971W7(boolean z) {
        if (z) {
            this.f54608o.f64654x = true;
        } else {
            this.f54608o.f64654x = false;
            if (mo24956M7() == 0) {
                C107043a.m144905c((AudioManager) getContext().getSystemService("audio"), 3, 1, 0);
            }
        }
        mo24969V7();
    }

    /* renamed from: X3 */
    public RecyclerView.LayoutManager mo24972X3() {
        return this.f54597U ? this.f54614u : this.f54610q;
    }

    /* renamed from: X4 */
    public C22964o mo24973X4() {
        return this.f54584G;
    }

    /* renamed from: Y */
    public void mo24974Y() {
    }

    /* renamed from: Z2 */
    public String mo24975Z2() {
        return C21914h.m25161i(this.f54608o.f64648r);
    }

    /* renamed from: a3 */
    public void mo24976a3(int i, String str) {
    }

    /* renamed from: a7 */
    public void mo24977a7(xh4 xh4) {
        if (!this.f54597U) {
            this.f54601e.setText(C0966R.string.htb);
            this.f54605i.setVisibility(8);
        }
        C22713a aVar = this.f54617x;
        if (aVar != null) {
            aVar.mo35810Z(this.f54608o, xh4);
        }
        C22577a aVar2 = this.f54618y;
        if (aVar2 != null) {
            aVar2.mo35649D0(this.f54608o, xh4);
        }
    }

    /* renamed from: b */
    public boolean mo24978b() {
        return this.f54608o.f64654x;
    }

    /* renamed from: d1 */
    public boolean mo24979d1() {
        return this.f54597U;
    }

    /* renamed from: d4 */
    public boolean mo24980d4() {
        return this.f54608o.f64642i != 36;
    }

    /* renamed from: e2 */
    public int mo24981e2() {
        return this.f54608o.f64652v;
    }

    public void finish() {
        C22577a aVar = this.f54618y;
        if (aVar != null) {
            aVar.mo149068c0();
        }
        super.finish();
    }

    public RecyclerView getRecyclerView() {
        return this.f54597U ? this.f54613t : this.f54609p;
    }

    public int getVideoHeight() {
        if (this.f54594R == 0) {
            if (!mo24970W3()) {
                this.f54594R = (getVideoWidth() * 280) / C83031z.CTRL_INDEX;
            } else {
                this.f54594R = 1280;
                int i = (mo24947G6().y * 3) / 5;
                if (this.f54594R > i) {
                    this.f54594R = i;
                }
                Log.m105925i("MicroMsg.TopStory.TopStoryBaseVideoUI", "getVideoHeight %d maxVideoHeight %d", Integer.valueOf(this.f54594R), Integer.valueOf(i));
            }
        }
        return this.f54594R;
    }

    public int getVideoWidth() {
        return Math.min(mo24947G6().x, mo24947G6().y);
    }

    /* renamed from: h7 */
    public void mo24985h7(xh4 xh4, View view) {
        if (xh4 == null) {
            return;
        }
        if (!NetStatusUtil.isConnected((Context) this)) {
            C76701a.makeText((Context) getContext(), (CharSequence) getString(C0966R.string.k47), 0).show();
            return;
        }
        if (this.f54598V != null) {
            C86709a0.m107524d().mo123458d(this.f54598V);
        }
        String str = xh4.f64706G;
        int i = xh4.f64716R ? 5 : 4;
        String str2 = "" + System.currentTimeMillis();
        uh4 uh4 = this.f54608o;
        this.f54598V = new C22291j(xh4, str, i, str2, uh4.f64642i, uh4.f64643j, mo24970W3() ? C91802b.CTRL_INDEX : C91803c.CTRL_INDEX, xh4.f64729h, xh4.f64717S, 1);
        C86709a0.m107524d().mo123460f(this.f54598V);
        boolean z = !xh4.f64716R;
        xh4.f64716R = z;
        if (z) {
            xh4.f64722X++;
        } else {
            xh4.f64722X--;
        }
        ((TextView) view.findViewById(C0966R.C0970id.lrh)).setText(C22426h.m26105g(xh4.f64722X));
        Log.m105924i("MicroMsg.TopStory.TopStoryBaseVideoUI", "onWowBtnClick thumb:" + xh4.f64716R);
    }

    /* renamed from: m5 */
    public void mo24986m5(List<xh4> list, boolean z) {
        MMHandlerThread.postToMainThread(new C19356a(list, z));
    }

    /* renamed from: n3 */
    public C22967p mo24987n3() {
        return this.f54586I;
    }

    public void onBackPressed() {
        mo24961Q7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo24959P7();
        mo24958O7();
        C86709a0.m107524d().mo123455a(2802, this.f54599W);
    }

    public void onDestroy() {
        C21915i.m25175g(this.f54608o, getActivityBrowseTimeMs(), this.f54588K.mo36193d(this.f54608o.f64652v));
        if (this.f54582E) {
            this.f54607n.disable();
            this.f54607n.f54640e = null;
            this.f54607n = null;
        }
        if (this.f54598V != null) {
            C86709a0.m107524d().mo123458d(this.f54598V);
        }
        C86709a0.m107524d().mo123470p(2802, this.f54599W);
        this.f54588K.mo36195i();
        ((C21912d) C86312j.m106911c(C21912d.class)).Ue0(this.f54608o);
        this.f54587J.mo36214f();
        C22964o oVar = this.f54584G;
        oVar.getClass();
        C86709a0.m107529k().mo121129d(oVar.f65985d);
        oVar.f65983b = null;
        oVar.f65984c = 0;
        oVar.f65982a = false;
        this.f54585H.mo36204b();
        this.f54586I.mo36188d();
        C102158a.m134600a(16);
        C22577a aVar = this.f54618y;
        if (aVar != null) {
            aVar.mo67996A0();
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = false;
        if (i == 25 && keyEvent.getAction() == 0) {
            Log.m105925i("MicroMsg.TopStory.TopStoryBaseVideoUI", "onKeyDown KEYCODE_VOLUME_DOWN %d", Integer.valueOf(mo24956M7()));
            uh4 uh4 = this.f54608o;
            if (mo24956M7() <= 1) {
                z = true;
            }
            uh4.f64654x = z;
            mo24969V7();
        } else if (i == 24 && keyEvent.getAction() == 0) {
            Log.m105925i("MicroMsg.TopStory.TopStoryBaseVideoUI", "onKeyDown KEYCODE_VOLUME_UP %d", Integer.valueOf(mo24956M7()));
            this.f54608o.f64654x = false;
            mo24969V7();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        try {
            C102532t tVar = this.f54587J.f66028b;
            if (tVar != null) {
                tVar.mo79614b();
            }
            ((C21912d) C86312j.m106911c(C21912d.class)).mo34962U6();
        } catch (Exception unused) {
        }
        C102158a.m134600a(15);
        C22713a aVar = this.f54617x;
        if (aVar != null) {
            aVar.mo74189F();
        }
        C22577a aVar2 = this.f54618y;
        if (aVar2 != null) {
            aVar2.mo64001C();
        }
    }

    public void onResume() {
        super.onResume();
        mo24957N7();
        mo24969V7();
        ((C21912d) C86312j.m106911c(C21912d.class)).Ne0();
        C22983u uVar = this.f54587J;
        C102532t tVar = uVar.f66028b;
        if (tVar != null) {
            tVar.mo79617f();
            C22951f fVar = uVar.f66029c;
            if (fVar != null) {
                fVar.mo36139c();
            }
        }
        C22964o oVar = this.f54584G;
        oVar.f65984c = oVar.mo36182a();
        C102158a.m134600a(14);
        C22713a aVar = this.f54617x;
        if (aVar != null) {
            aVar.mo74188E();
        }
        C22577a aVar2 = this.f54618y;
        if (aVar2 != null) {
            aVar2.mo64003o();
        }
    }

    /* renamed from: p2 */
    public String mo24988p2() {
        String str = this.f54608o.f64655y;
        return str == null ? "" : str;
    }

    /* renamed from: r4 */
    public uh4 mo24989r4() {
        return this.f54608o;
    }

    /* renamed from: t */
    public MMActivity mo24990t() {
        return this;
    }

    /* renamed from: w6 */
    public void mo24991w6(int i) {
        this.f54608o.f64656z = i;
    }

    /* renamed from: x1 */
    public void mo24992x1(int i) {
        this.f54608o.f64652v = i;
    }

    /* renamed from: x2 */
    public void mo24993x2(String str) {
        this.f54608o.f64655y = str;
    }

    /* renamed from: x5 */
    public void mo24994x5(View view, int i) {
        if (this.f54587J.mo36212d()) {
            this.f54587J.mo36216h();
            this.f54589L = true;
        }
        C66993d dVar = new C66993d(getContext(), this.f54588K.mo36193d(i), new C19363i(view, i));
        this.f54590M = dVar;
        if (this.f54597U) {
            dVar.mo90957c(view, true, 0 - C76577a.m92151b(getContext(), 40), C76577a.m92151b(getContext(), 16));
            try {
                ((C23204j) this.f54587J.f66029c.getControlBar()).mo36652B();
            } catch (Exception unused) {
            }
        } else {
            dVar.mo90957c(view, false, 0, 0);
        }
        C117407d.INSTANCE.mo160131h(17080, 65, 1);
    }

    /* renamed from: y5 */
    public C22983u mo24995y5() {
        return this.f54587J;
    }
}
