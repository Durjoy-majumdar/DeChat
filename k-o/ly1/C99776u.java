package ly1;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C112968x;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GamePBCacheEvent;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.plugin.game.media.GamePublishGalleryUI;
import com.tencent.p014mm.plugin.game.media.GameRecommendVideoFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import ly1.C99723d;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONArray;
import pe3.C47465a;
import qo3.C89779i0;
import vw1.C102299l;
import vw1.C53012e0;
import vw1.C53024o;
import w10.C15032a;
import xw1.C53454b;
import zp3.C79406f;

/* renamed from: ly1.u */
public class C99776u extends FrameLayout implements C11385n {

    /* renamed from: d */
    public View f292420d;

    /* renamed from: e */
    public View f292421e;

    /* renamed from: f */
    public View f292422f;

    /* renamed from: g */
    public View f292423g;

    /* renamed from: h */
    public C99765p f292424h;

    /* renamed from: i */
    public boolean f292425i;

    /* renamed from: j */
    public View f292426j;

    /* renamed from: n */
    public View f292427n;

    /* renamed from: o */
    public C99723d f292428o;

    /* renamed from: p */
    public C89779i0 f292429p;

    /* renamed from: q */
    public boolean f292430q;

    /* renamed from: r */
    public boolean f292431r = false;

    /* renamed from: s */
    public boolean f292432s = false;

    /* renamed from: t */
    public int f292433t = 0;

    /* renamed from: u */
    public C102299l f292434u;

    /* renamed from: v */
    public MTimerHandler f292435v;

    /* renamed from: w */
    public boolean f292436w;

    /* renamed from: x */
    public Context f292437x;

    /* renamed from: y */
    public ViewPager f292438y;

    /* renamed from: z */
    public TextView f292439z;

    /* renamed from: ly1.u$a */
    public class C10667a implements MTimerHandler.CallBack {
        public C10667a() {
        }

        public boolean onTimerExpired() {
            C99776u.this.f292429p.dismiss();
            C99776u uVar = C99776u.this;
            uVar.mo139134c();
            View view = uVar.f292422f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "showWeakNetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "showWeakNetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return false;
        }
    }

    /* renamed from: ly1.u$b */
    public class C99777b implements C99723d.C99725b {

        /* renamed from: ly1.u$b$a */
        public class C99778a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ LinkedList f292441d;

            /* renamed from: e */
            public final /* synthetic */ boolean f292442e;

            public C99778a(LinkedList linkedList, boolean z) {
                this.f292441d = linkedList;
                this.f292442e = z;
            }

            public void run() {
                if (!((Activity) C99776u.this.getContext()).isFinishing() && !((Activity) C99776u.this.getContext()).isDestroyed()) {
                    C99776u.this.mo139138g(this.f292441d, this.f292442e, false);
                    C99776u.this.f292436w = true;
                }
            }
        }

        public C99777b() {
        }

        /* renamed from: a */
        public void mo129209a(LinkedList<C102299l> linkedList, boolean z) {
            C99776u.this.post(new C99778a(linkedList, z));
        }
    }

    /* renamed from: ly1.u$c */
    public class C99779c extends C112968x {

        /* renamed from: i */
        public LinkedList<C53012e0> f292444i;

        public C99779c(FragmentManager fragmentManager, LinkedList<C53012e0> linkedList) {
            super(fragmentManager, 0);
            this.f292444i = linkedList;
        }

        public int getCount() {
            return this.f292444i.size();
        }

        public Fragment getItem(int i) {
            return new GameRecommendVideoFragment(this.f292444i.get(i), i, C99776u.this.f292433t);
        }
    }

    public C99776u(Context context) {
        super(context);
        this.f292437x = context;
    }

    /* access modifiers changed from: private */
    public void getDataFromNet() {
        System.currentTimeMillis();
        this.f292428o.mo139078d(new C99777b());
    }

    /* renamed from: b */
    public final void mo139133b(View view, int i, int i2) {
        ((ViewGroup) this.f292420d.findViewById(C0966R.C0970id.ehj)).addView(view, i, i2);
    }

    /* renamed from: c */
    public final void mo139134c() {
        View view = this.f292423g;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: d */
    public void mo139135d() {
        if (!this.f292436w) {
            this.f292429p.show();
            getDataFromNet();
            MTimerHandler mTimerHandler = new MTimerHandler(new C10667a(), false);
            this.f292435v = mTimerHandler;
            mTimerHandler.startTimer(10000);
        }
    }

    /* renamed from: e */
    public final void mo139136e(C53024o oVar) {
        if (Util.isNullOrNil((List) oVar.f148008g)) {
            this.f292439z.setVisibility(8);
            this.f292438y.setVisibility(8);
            return;
        }
        this.f292438y.setAdapter(new C99779c(((FragmentActivity) this.f292437x).getSupportFragmentManager(), oVar.f148008g));
        this.f292438y.setOffscreenPageLimit(3);
        this.f292438y.setPageMargin(C79406f.m96347a(getContext(), 8.0f));
        ((LinearLayout.LayoutParams) this.f292438y.getLayoutParams()).height = ((int) (((float) (C74783i3.m89537a(getContext()).f24704a - C79406f.m96347a(getContext(), 40.0f))) * 0.5625f)) + C79406f.m96347a(getContext(), 73.0f);
        this.f292439z.setVisibility(0);
        this.f292438y.setVisibility(0);
    }

    /* renamed from: f */
    public final void mo139137f(int i, int i2, Map map) {
        if (map == null) {
            map = new HashMap();
        }
        C40314g.m43484c(MMApplicationContext.getContext(), 87, 8762, i, i2, this.f292433t, C15032a.m14200a(7, map));
    }

    /* renamed from: g */
    public final void mo139138g(LinkedList<C102299l> linkedList, boolean z, boolean z2) {
        LinkedList<C102299l> linkedList2 = linkedList;
        boolean z3 = z2;
        if (!z3) {
            this.f292429p.dismiss();
        }
        View view = this.f292422f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "hideWeakNetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "hideWeakNetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo139134c();
        MTimerHandler mTimerHandler = this.f292435v;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        if (!Util.isNullOrNil((List) linkedList)) {
            View view2 = this.f292421e;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "hideEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "hideEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f292425i) {
                Log.m105919d("MicroMsg.GameHaoWanGalleryView", "data not null, appid : %d", linkedList2.get(0).f301307s);
                MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(C99723d.m130164b("game_haowan_mmkv_key"));
                mmkv.putBoolean("game_publish_gallery_first_enter", false);
                mmkv.apply();
            }
        } else {
            View view4 = this.f292421e;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo139137f(502, 1, (Map) null);
            GamePublishGalleryUI gamePublishGalleryUI = (GamePublishGalleryUI) getContext();
            gamePublishGalleryUI.getClass();
            if (MultiProcessMMKV.getMMKV(C99723d.m130164b("game_haowan_mmkv_key")).getInt("game_last_choose_gallery", 0) == 0 && gamePublishGalleryUI.f271730f.getCurrentItem() % 2 == 0) {
                gamePublishGalleryUI.mo129152H7(1, false);
            }
        }
        this.f292424h.mo139126x1(linkedList2, z, z3);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f292428o.mo139076a();
        C86709a0.m107524d().mo123470p(9911, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105918d("MicroMsg.GameHaoWanGalleryView", "onSceneEnd === errType = " + i);
        if (yVar != null && yVar.getType() == 9911 && i == 0 && i2 == 0) {
            Object value = ((C53454b) yVar).f150356e.getValue();
            C87412m.m108593f(value, "<get-commReqResp>(...)");
            C47465a aVar = ((C47350c) value).f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.ugc.GetRecommendVideoListResponse");
            C53024o oVar = (C53024o) aVar;
            GamePBCacheEvent gamePBCacheEvent = new GamePBCacheEvent();
            GamePBCacheEvent.C40109a aVar2 = gamePBCacheEvent.f107561d;
            aVar2.f107562a = 2;
            aVar2.f107563b = "cache_video_recommend";
            try {
                aVar2.f107564c = oVar.toByteArray();
            } catch (IOException e) {
                Log.m105920e("MicroMsg.GameHaoWanGalleryView", e.getMessage());
            }
            gamePBCacheEvent.publish();
            mo139136e(oVar);
        }
    }

    public void setLocalAlbumInfos(JSONArray jSONArray) {
        C99723d dVar = new C99723d();
        this.f292428o = dVar;
        C99723d.f292267p = dVar;
        dVar.mo139081h(jSONArray);
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.awe, this, true);
        this.f292420d = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.ekj);
        this.f292427n = findViewById;
        if (!this.f292431r) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "initRootView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "initRootView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "initRootView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "initRootView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f292420d.findViewById(C0966R.C0970id.em_).setOnClickListener(new C10670x(this));
        this.f292436w = false;
        C99765p pVar = new C99765p(getContext(), 8762, this.f292433t);
        this.f292424h = pVar;
        pVar.setBackgroundColor(getResources().getColor(C0966R.color.al6));
        this.f292424h.mo17043c(new C99771s(this));
        Context context = this.f292437x;
        this.f292429p = C89779i0.m112246c(context, context.getString(C0966R.string.gat), false, 3, (DialogInterface.OnCancelListener) null);
        this.f292424h.setOnItemClickListener(new C99774t(this));
        mo139133b(this.f292424h, -1, -1);
        View inflate2 = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.au8, this, false);
        this.f292421e = inflate2;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        View view3 = inflate2;
        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "createEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "createEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo139133b(this.f292421e, -1, -1);
        View inflate3 = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.d_0, this, false);
        this.f292422f = inflate3;
        ((Button) inflate3.findViewById(C0966R.C0970id.oec)).setOnClickListener(new C10668v(this));
        View view4 = this.f292422f;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view5 = view4;
        C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "createWeakNetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "createWeakNetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo139133b(this.f292422f, -1, -1);
        boolean z = MultiProcessMMKV.getMMKV(C99723d.m130164b("game_haowan_mmkv_key")).getBoolean("game_publish_gallery_first_enter", true);
        this.f292425i = z;
        Log.m105919d("MicroMsg.GameHaoWanGalleryView", "first enter : %b", Boolean.valueOf(z));
        if (this.f292425i) {
            View inflate4 = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.au9, this.f292424h, false);
            this.f292426j = inflate4;
            ((ImageView) inflate4.findViewById(C0966R.C0970id.ekw)).setOnClickListener(new C10669w(this));
            C99765p pVar2 = this.f292424h;
            pVar2.f292389B1.f292398g.add(this.f292426j);
            mo139137f(503, 1, (Map) null);
        }
        View inflate5 = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f359818cr1, (ViewGroup) null);
        this.f292438y = (ViewPager) inflate5.findViewById(C0966R.C0970id.l89);
        this.f292439z = (TextView) inflate5.findViewById(C0966R.C0970id.mk7);
        this.f292424h.f292389B1.f292398g.add(inflate5);
        View inflate6 = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.au_, this, false);
        this.f292423g = inflate6;
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(8);
        View view6 = inflate6;
        C117292a.m165358d(view6, aVar5.mo10232b(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "createLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate6.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "createLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo139133b(this.f292423g, -1, -1);
        LinkedList<C102299l> c = this.f292428o.mo139077c();
        if (Util.isNullOrNil((List) c)) {
            View view7 = this.f292423g;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar6.mo10232b(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            mo139138g(c, false, true);
        }
        GamePBCacheEvent gamePBCacheEvent = new GamePBCacheEvent();
        GamePBCacheEvent.C40109a aVar7 = gamePBCacheEvent.f107561d;
        aVar7.f107562a = 1;
        aVar7.f107563b = "cache_video_recommend";
        gamePBCacheEvent.publish();
        byte[] bArr = gamePBCacheEvent.f107561d.f107564c;
        if (!Util.isNullOrNil(bArr)) {
            C53024o oVar = new C53024o();
            try {
                oVar.parseFrom(bArr);
                mo139136e(oVar);
            } catch (IOException e) {
                Log.m105920e("MicroMsg.GameHaoWanGalleryView", e.getMessage());
            }
        }
        C86709a0.m107524d().mo123455a(9911, this);
        C86709a0.m107524d().mo123460f(new C53454b());
        getDataFromNet();
    }
}
