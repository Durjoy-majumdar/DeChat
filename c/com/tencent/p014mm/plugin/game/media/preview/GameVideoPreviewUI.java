package com.tencent.p014mm.plugin.game.media.preview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.C54259z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aw0.C103928o;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.game.media.GameVideoTagContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import ly1.C99722c;
import ly1.C99723d;
import ly1.C99772s0;
import nj3.C88989a;
import ny1.C100233a;
import ny1.C100240b;
import ny1.C100241c;
import ny1.C100242d;
import ny1.C100244f;
import ny1.C100247i;
import p625nu.C100196e;
import qo3.C77407n;
import sw1.C101703s;
import uy1.C52642c;
import vw1.C102299l;
import vw1.C65898m;
import w10.C15032a;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI */
public class GameVideoPreviewUI extends MMActivity {

    /* renamed from: x */
    public static final /* synthetic */ int f271819x = 0;

    /* renamed from: d */
    public Context f271820d;

    /* renamed from: e */
    public RecyclerView f271821e;

    /* renamed from: f */
    public C94126h f271822f;

    /* renamed from: g */
    public TextView f271823g;

    /* renamed from: h */
    public TextView f271824h;

    /* renamed from: i */
    public GameVideoTagContainer f271825i;

    /* renamed from: j */
    public View f271826j;

    /* renamed from: n */
    public View f271827n;

    /* renamed from: o */
    public View f271828o;

    /* renamed from: p */
    public View f271829p;

    /* renamed from: q */
    public int f271830q = 0;

    /* renamed from: r */
    public int f271831r = 0;

    /* renamed from: s */
    public C100247i f271832s;

    /* renamed from: t */
    public boolean f271833t = true;

    /* renamed from: u */
    public boolean f271834u = false;

    /* renamed from: v */
    public int f271835v = 0;

    /* renamed from: w */
    public RecyclerView.C0130p f271836w = new C94119a();

    /* renamed from: com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI$a */
    public class C94119a extends RecyclerView.C0130p {
        public C94119a() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$10", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                int C = ((LinearLayoutManager) recyclerView.getLayoutManager()).mo16957C();
                Log.m105925i("MicroMsg.Haowan.GameVideoPreviewUI", "scroll position:%d", Integer.valueOf(C));
                GameVideoPreviewUI.this.f271830q = C;
                GameVideoPreviewUI.m118956H7(GameVideoPreviewUI.this, ((C94126h) recyclerView.getAdapter()).mo129189F4(C));
                GameVideoPreviewUI.m118957I7(GameVideoPreviewUI.this, C);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$10", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$10", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$10", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI$b */
    public class C94120b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ List f271838d;

        public C94120b(List list) {
            this.f271838d = list;
        }

        public void onGlobalLayout() {
            GameVideoPreviewUI.this.f271821e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            GameVideoPreviewUI gameVideoPreviewUI = GameVideoPreviewUI.this;
            gameVideoPreviewUI.f271822f = new C94126h();
            GameVideoPreviewUI gameVideoPreviewUI2 = GameVideoPreviewUI.this;
            gameVideoPreviewUI2.f271821e.setAdapter(gameVideoPreviewUI2.f271822f);
            C94126h hVar = GameVideoPreviewUI.this.f271822f;
            List list = this.f271838d;
            hVar.getClass();
            if (!Util.isNullOrNil(list)) {
                hVar.f271844d.addAll(list);
                MMHandlerThread.postToMainThreadDelayed(new C94135b(hVar), 1000);
            }
            GameVideoPreviewUI.m118956H7(GameVideoPreviewUI.this, ((C94126h) GameVideoPreviewUI.this.f271821e.getAdapter()).mo129189F4(GameVideoPreviewUI.this.f271830q));
            GameVideoPreviewUI gameVideoPreviewUI3 = GameVideoPreviewUI.this;
            RecyclerView recyclerView = gameVideoPreviewUI3.f271821e;
            int i = gameVideoPreviewUI3.f271830q;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            RecyclerView recyclerView2 = recyclerView;
            C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$1", "onGlobalLayout", "()V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$1", "onGlobalLayout", "()V", "Undefined", "scrollToPosition", "(I)V");
            GameVideoPreviewUI gameVideoPreviewUI4 = GameVideoPreviewUI.this;
            GameVideoPreviewUI.m118957I7(gameVideoPreviewUI4, gameVideoPreviewUI4.f271830q);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI$c */
    public class C94121c implements View.OnClickListener {
        public C94121c() {
        }

        public void onClick(View view) {
            Class cls = C101703s.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            GameVideoPreviewUI gameVideoPreviewUI = GameVideoPreviewUI.this;
            C102299l F4 = gameVideoPreviewUI.f271822f.mo129189F4(gameVideoPreviewUI.f271830q);
            if (F4 != null) {
                GameVideoPreviewUI gameVideoPreviewUI2 = GameVideoPreviewUI.this;
                Bundle J7 = GameVideoPreviewUI.m118958J7(gameVideoPreviewUI2, gameVideoPreviewUI2.f271830q);
                J7.putBoolean("game_straight_to_publish", GameVideoPreviewUI.this.f271834u);
                if (C86013q1.m106450k(F4.f301310v)) {
                    GameVideoPreviewUI gameVideoPreviewUI3 = GameVideoPreviewUI.this;
                    ((C101703s) C86312j.m106911c(cls)).mo10937Qd(gameVideoPreviewUI3.f271820d, gameVideoPreviewUI3.f271831r, F4.f301307s, F4.f301310v, (String) null, (String) null, 19722, J7, gameVideoPreviewUI3.f271835v);
                } else {
                    GameVideoPreviewUI gameVideoPreviewUI4 = GameVideoPreviewUI.this;
                    ((C101703s) C86312j.m106911c(cls)).mo10937Qd(gameVideoPreviewUI4.f271820d, gameVideoPreviewUI4.f271831r, F4.f301307s, (String) null, F4.f301300i, F4.f301299h, 19722, J7, gameVideoPreviewUI4.f271835v);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI$d */
    public class C94122d implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI$d$a */
        public class C69018a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C104428a f198340d;

            public C69018a(C94122d dVar, C104428a aVar) {
                this.f198340d = aVar;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f198340d.cancel();
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C94122d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            GameVideoPreviewUI gameVideoPreviewUI = GameVideoPreviewUI.this;
            C40314g.m43484c(gameVideoPreviewUI.f271820d, 87, 8768, 0, 2, gameVideoPreviewUI.f271835v, C15032a.m14200a(gameVideoPreviewUI.f271831r, (Map) null));
            View inflate = LayoutInflater.from(GameVideoPreviewUI.this.getContext()).inflate(C0966R.C0971layout.avi, (ViewGroup) null, false);
            C104428a aVar = new C104428a(GameVideoPreviewUI.this.getContext(), 0);
            aVar.setContentView(inflate);
            ((Button) inflate.findViewById(C0966R.C0970id.elp)).setOnClickListener(new C69018a(this, aVar));
            aVar.show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI$e */
    public class C94123e implements View.OnClickListener {
        public C94123e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            GameVideoPreviewUI gameVideoPreviewUI = GameVideoPreviewUI.this;
            C102299l F4 = gameVideoPreviewUI.f271822f.mo129189F4(gameVideoPreviewUI.f271830q);
            if (F4 != null) {
                GameVideoPreviewUI gameVideoPreviewUI2 = GameVideoPreviewUI.this;
                C77407n nVar = new C77407n(gameVideoPreviewUI2.f271820d, 1, true);
                nVar.f225771i = new C100240b(gameVideoPreviewUI2);
                nVar.f225782p = new C100241c(gameVideoPreviewUI2, F4);
                nVar.f225761d = new C100242d(gameVideoPreviewUI2);
                nVar.mo107573q();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI$f */
    public class C94124f implements View.OnClickListener {
        public C94124f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            GameVideoPreviewUI gameVideoPreviewUI = GameVideoPreviewUI.this;
            int i = GameVideoPreviewUI.f271819x;
            C40314g.m43484c(gameVideoPreviewUI, 87, 8768, 0, 4, gameVideoPreviewUI.f271835v, C15032a.m14200a(gameVideoPreviewUI.f271831r, (Map) null));
            gameVideoPreviewUI.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI$g */
    public class C94125g implements Runnable {
        public C94125g(GameVideoPreviewUI gameVideoPreviewUI) {
        }

        public void run() {
            Iterator it = ((HashSet) GameVideoView.f271851A).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Log.m105925i("MicroMsg.Haowan.GameVideoView", "delete temp cache ret:%b, cachePath:%s", Boolean.valueOf(C86013q1.m106447h(str)), str);
            }
            ((HashSet) GameVideoView.f271851A).clear();
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI$h */
    public class C94126h extends RecyclerView.C16613e<C94127a> {

        /* renamed from: d */
        public ArrayList<C102299l> f271844d = new ArrayList<>();

        /* renamed from: com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI$h$a */
        public class C94127a extends RecyclerView.C16631z {

            /* renamed from: A */
            public GameVideoView f271846A;

            /* renamed from: B */
            public ImageView f271847B;

            /* renamed from: C */
            public ImageView f271848C;

            /* renamed from: D */
            public ProgressBar f271849D;

            /* renamed from: z */
            public View f271850z;

            public C94127a(C94126h hVar, View view) {
                super(view);
                this.f271850z = view;
                GameVideoView gameVideoView = (GameVideoView) view.findViewById(C0966R.C0970id.l7x);
                this.f271846A = gameVideoView;
                gameVideoView.setVideoFooterView(new C100244f(GameVideoPreviewUI.this.f271820d));
                this.f271847B = (ImageView) view.findViewById(C0966R.C0970id.kk5);
                this.f271848C = (ImageView) view.findViewById(C0966R.C0970id.l5a);
                this.f271849D = (ProgressBar) view.findViewById(C0966R.C0970id.l6a);
            }
        }

        public C94126h() {
        }

        /* renamed from: F4 */
        public C102299l mo129189F4(int i) {
            if (i >= getItemCount() || i < 0) {
                return null;
            }
            return this.f271844d.get(i);
        }

        public int getItemCount() {
            return this.f271844d.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C94127a aVar = (C94127a) zVar;
            Log.m105925i("MicroMsg.Haowan.GameVideoPreviewUI", "onBindViewHolder scroll position:%d", Integer.valueOf(i));
            C102299l lVar = this.f271844d.get(i);
            aVar.f271850z.setTag(lVar);
            if (lVar == null) {
                return;
            }
            if (lVar.f301295d) {
                C52642c.m58994l().postToWorker(new C94136c(this, lVar, aVar));
                return;
            }
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59351g = C99772s0.f292415a;
            bVar.f59346b = true;
            C20828a.m22825b().mo32520i(lVar.f301299h, aVar.f271847B, bVar.mo32666a(), new C94138d(this, aVar));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C94127a(this, LayoutInflater.from(GameVideoPreviewUI.this.f271820d).inflate(C0966R.C0971layout.ay4, viewGroup, false));
        }

        public void onViewAttachedToWindow(RecyclerView.C16631z zVar) {
            C102299l lVar;
            C94127a aVar = (C94127a) zVar;
            super.onViewAttachedToWindow(aVar);
            Log.m105924i("MicroMsg.Haowan.GameVideoPreviewUI", "onViewAttachedToWindow");
            if (aVar != null && (lVar = (C102299l) aVar.f271850z.getTag()) != null) {
                aVar.f271849D.setVisibility(0);
                aVar.f271846A.mo76636h(false, lVar.f301300i, (int) (lVar.f301305q / 1000));
                lVar.f301310v = aVar.f271846A.getLocalPath();
                aVar.f271846A.setVideoPreparedListener(new C94141f(this, aVar));
                aVar.f271846A.start();
            }
        }

        public void onViewDetachedFromWindow(RecyclerView.C16631z zVar) {
            C94127a aVar = (C94127a) zVar;
            super.onViewDetachedFromWindow(aVar);
            Log.m105924i("MicroMsg.Haowan.GameVideoPreviewUI", "onViewDetachedFromWindow");
            if (aVar != null) {
                aVar.f271846A.stop();
                aVar.f271847B.post(new C94142g(this, aVar));
            }
        }

        public void onViewRecycled(RecyclerView.C16631z zVar) {
            C94127a aVar = (C94127a) zVar;
            super.onViewRecycled(aVar);
            if (aVar != null) {
                Log.m105924i("MicroMsg.Haowan.GameVideoPreviewUI", "onViewRecycled");
                aVar.f271846A.stop();
            }
        }
    }

    /* renamed from: H7 */
    public static void m118956H7(GameVideoPreviewUI gameVideoPreviewUI, C102299l lVar) {
        if (lVar != null) {
            gameVideoPreviewUI.f271823g.setText(lVar.f301301j);
            gameVideoPreviewUI.f271824h.setText(lVar.f301308t);
            if (lVar.f301295d) {
                gameVideoPreviewUI.f271825i.setVisibility(8);
                View view = gameVideoPreviewUI.f271826j;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "resetBottomView", "(Lcom/tencent/mm/plugin/game/autogen/ugc/GameVideoItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "resetBottomView", "(Lcom/tencent/mm/plugin/game/autogen/ugc/GameVideoItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                gameVideoPreviewUI.f271825i.setData(lVar.f301303o);
                View view3 = gameVideoPreviewUI.f271826j;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "resetBottomView", "(Lcom/tencent/mm/plugin/game/autogen/ugc/GameVideoItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "resetBottomView", "(Lcom/tencent/mm/plugin/game/autogen/ugc/GameVideoItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            int i = gameVideoPreviewUI.f271830q + 1;
            if (i > 100) {
                i = 100;
            }
            C40314g.m43487f(gameVideoPreviewUI, 87, 8768, i, 1, lVar.f301307s, gameVideoPreviewUI.f271835v, C15032a.m14200a(gameVideoPreviewUI.f271831r, gameVideoPreviewUI.mo129182L7(lVar)));
            return;
        }
        gameVideoPreviewUI.getClass();
    }

    /* renamed from: I7 */
    public static void m118957I7(GameVideoPreviewUI gameVideoPreviewUI, int i) {
        if (i >= gameVideoPreviewUI.f271822f.getItemCount() - 2 && gameVideoPreviewUI.f271833t) {
            Log.m105924i("MicroMsg.Haowan.GameVideoPreviewUI", "pull next page");
            C94134a aVar = new C94134a(gameVideoPreviewUI);
            C99723d dVar = C99723d.f292267p;
            if (dVar == null) {
                aVar.mo129209a((LinkedList<C102299l>) null, false);
            } else {
                dVar.mo139078d(new C99722c(aVar));
            }
        }
    }

    /* renamed from: J7 */
    public static Bundle m118958J7(GameVideoPreviewUI gameVideoPreviewUI, int i) {
        gameVideoPreviewUI.getClass();
        Bundle bundle = new Bundle();
        GameVideoView K7 = gameVideoPreviewUI.mo129181K7(i);
        if (K7 != null) {
            bundle.putString("key_video_cache_path", K7.getFilePath());
            bundle.putString("key_video_media_id", K7.getMediaId());
        }
        return bundle;
    }

    /* renamed from: K7 */
    public final GameVideoView mo129181K7(int i) {
        RecyclerView.C16631z I0 = this.f271821e.mo17023I0(i);
        if (I0 instanceof C94126h.C94127a) {
            return ((C94126h.C94127a) I0).f271846A;
        }
        return null;
    }

    /* renamed from: L7 */
    public final Map mo129182L7(C102299l lVar) {
        HashMap hashMap = new HashMap();
        if (lVar == null) {
            return hashMap;
        }
        hashMap.put("videoid", lVar.f301312x);
        hashMap.put("origtime", Long.valueOf(lVar.f301305q));
        hashMap.put("origsize", Long.valueOf(lVar.f301306r));
        return hashMap;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359820ay2;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 19722) {
            return;
        }
        if (intent == null || i2 != -1) {
            GameVideoView K7 = mo129181K7(this.f271830q);
            if (K7 != null) {
                C100233a aVar = K7.f271866u;
                if (aVar != null) {
                    aVar.f293666f = true;
                }
                RecyclerView.C16631z I0 = this.f271821e.mo17023I0(this.f271830q);
                ImageView imageView = I0 instanceof C94126h.C94127a ? ((C94126h.C94127a) I0).f271847B : null;
                if (imageView != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    ImageView imageView2 = imageView;
                    C117292a.m165358d(imageView2, aVar2.mo10232b(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    imageView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(imageView2, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                return;
            }
            return;
        }
        C102299l F4 = this.f271822f.mo129189F4(this.f271830q);
        if (F4 != null) {
            intent.putExtra("key_game_video_appid", F4.f301307s);
            intent.putExtra("key_game_video_appname", F4.f301308t);
        }
        setResult(i2, intent);
        finish();
    }

    public void onBackPressed() {
        if (this.f271829p.getVisibility() == 0) {
            View view = this.f271829p;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onBackPressed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onBackPressed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f271832s.mo139532b();
            return;
        }
        super.onBackPressed();
        C40314g.m43484c(this, 87, 8768, 0, 4, this.f271835v, C15032a.m14200a(this.f271831r, (Map) null));
        finish();
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(2097280);
        getWindow().setFlags(201327616, 201327616);
        ((C100196e) C86312j.m106911c(C100196e.class)).il0(true);
        getWindow().setFormat(-3);
        this.f271820d = this;
        this.f271823g = (TextView) findViewById(C0966R.C0970id.kpm);
        this.f271824h = (TextView) findViewById(C0966R.C0970id.h_d);
        this.f271825i = (GameVideoTagContainer) findViewById(C0966R.C0970id.l7j);
        this.f271826j = findViewById(C0966R.C0970id.f357723bf3);
        this.f271827n = findViewById(C0966R.C0970id.ji9);
        this.f271828o = findViewById(C0966R.C0970id.f357756bl2);
        this.f271829p = findViewById(C0966R.C0970id.g3t);
        this.f271832s = new C100247i(this.f271820d, this.f271829p);
        this.f271821e = (RecyclerView) findViewById(C0966R.C0970id.eoa);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.mo16974W(0);
        this.f271821e.setLayoutManager(linearLayoutManager);
        new C54259z().mo75025b(this.f271821e);
        this.f271821e.mo17043c(this.f271836w);
        this.f271834u = getIntent().getBooleanExtra("game_straight_to_publish", false);
        this.f271835v = getIntent().getIntExtra("game_haowan_source_scene_id", 0);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("game_video_list");
        this.f271830q = getIntent().getIntExtra("game_video_list_current_index", 0);
        LinkedList linkedList = new LinkedList();
        if (!Util.isNullOrNil(byteArrayExtra)) {
            C65898m mVar = new C65898m();
            try {
                mVar.parseFrom(byteArrayExtra);
            } catch (IOException unused) {
            }
            linkedList.addAll(mVar.f189460d);
        }
        this.f271821e.getViewTreeObserver().addOnGlobalLayoutListener(new C94120b(linkedList));
        findViewById(C0966R.C0970id.f357756bl2).setOnClickListener(new C94121c());
        this.f271826j.setOnClickListener(new C94122d());
        this.f271827n.setOnClickListener(new C94123e());
        findViewById(C0966R.C0970id.eo9).setOnClickListener(new C94124f());
        if (((C99772s0.C99773a) getIntent().getSerializableExtra("game_video_preview_source")) == C99772s0.C99773a.FROM_PUBLISH_GALLERY) {
            this.f271831r = 7;
            View view = this.f271827n;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f271828o;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            this.f271831r = 6;
            View view5 = this.f271827n;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view7 = this.f271828o;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C40314g.m43484c(this, 87, 8768, 0, 1, this.f271835v, C15032a.m14200a(this.f271831r, (Map) null));
    }

    public void onDestroy() {
        super.onDestroy();
        this.f271821e.mo17098m1(this.f271836w);
        GameVideoView K7 = mo129181K7(this.f271830q);
        if (K7 != null) {
            K7.mo79616c();
        }
        this.f271832s.mo139532b();
        C52642c.m58994l().postToWorker(new C94125g(this));
    }

    public void onPause() {
        super.onPause();
        GameVideoView K7 = mo129181K7(this.f271830q);
        if (K7 != null) {
            K7.mo79614b();
        }
        C103928o.m138642b();
    }

    public void onResume() {
        super.onResume();
        GameVideoView K7 = mo129181K7(this.f271830q);
        if (K7 != null) {
            K7.mo79617f();
        }
        C103928o.m138641a(true, true, true);
    }
}
