package com.tencent.p014mm.plugin.game.media;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import c30.C26827e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.plugin.game.chatroom.view.flow.FlowView;
import com.tencent.p014mm.plugin.game.commlib.util.C41874g;
import com.tencent.p014mm.plugin.game.media.preview.GameVideoView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import hc0.C20937c;
import ic0.C21070h;
import ic0.C98661k;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.Metadata;
import ly1.C99770r0;
import ly1.C99772s0;
import org.json.JSONObject;
import p192l4.C10462b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import ux1.C102114b;
import vw1.C53012e0;
import vw1.C53014f0;
import vw1.C53016g0;
import vw1.C53020i0;
import vw1.C53021j;
import vw1.C53022k;
import vw1.C53028s;
import vw1.C53031v;
import w10.C15032a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/media/GameRecommendVideoFragment;", "Landroidx/fragment/app/Fragment;", "plugin-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.game.media.GameRecommendVideoFragment */
public final class GameRecommendVideoFragment extends HellAndroidXFragment {

    /* renamed from: n */
    public static final /* synthetic */ int f271734n = 0;

    /* renamed from: d */
    public final C53012e0 f271735d;

    /* renamed from: e */
    public final int f271736e;

    /* renamed from: f */
    public final int f271737f;

    /* renamed from: g */
    public final String f271738g = "MicroMsg.GameHaoWanGalleryView.GameRecommendVideoFragment";

    /* renamed from: h */
    public C102114b f271739h;

    /* renamed from: i */
    public boolean f271740i;

    /* renamed from: j */
    public final C13601g f271741j = C36568h.m40985a(C94095a.f271742d);

    /* renamed from: com.tencent.mm.plugin.game.media.GameRecommendVideoFragment$c */
    public static final class C42019c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ GameRecommendVideoFragment f113187d;

        public C42019c(GameRecommendVideoFragment gameRecommendVideoFragment) {
            this.f113187d = gameRecommendVideoFragment;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/media/GameRecommendVideoFragment$onViewCreated$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            GameRecommendVideoFragment gameRecommendVideoFragment = this.f113187d;
            C53012e0 e0Var = gameRecommendVideoFragment.f271735d;
            FragmentActivity activity = gameRecommendVideoFragment.getActivity();
            C87412m.m108594g(e0Var, "videoAlbumItem");
            if (activity != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("createTimeSec", e0Var.f147940e);
                C53014f0 f0Var = e0Var.f147942g;
                String str = null;
                if (f0Var != null) {
                    jSONObject.put("duration", f0Var.f147967i);
                    jSONObject.put("subTitle", f0Var.f147969n);
                    jSONObject.put("thumbUrl", f0Var.f147963e);
                    jSONObject.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, f0Var.f147966h);
                    jSONObject.put("videoUrl", f0Var.f147962d);
                    C53021j jVar = e0Var.f147944i;
                    jSONObject.put("transInfo", jVar != null ? jVar.f148000e : null);
                }
                Intent intent = new Intent();
                C53022k kVar = e0Var.f147941f;
                intent.putExtra("key_game_video_appid", kVar != null ? kVar.f148001d : null);
                C53022k kVar2 = e0Var.f147941f;
                intent.putExtra("key_game_video_appname", kVar2 != null ? kVar2.f148002e : null);
                intent.putExtra("key_game_video_page_type", 2);
                C53021j jVar2 = e0Var.f147944i;
                if (jVar2 != null) {
                    str = jVar2.f148000e;
                }
                intent.putExtra("key_game_trans_info", str);
                intent.putExtra("key_game_video_encode_json_array", true);
                C26827e eVar = new C26827e();
                eVar.mo53846q(jSONObject);
                C13598b0 b0Var = C13598b0.f38549a;
                intent.putExtra("key_video_info", eVar.toString());
                activity.setResult(-1, intent);
                activity.finish();
            }
            this.f113187d.mo129153K(true, 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/media/GameRecommendVideoFragment$onViewCreated$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.GameRecommendVideoFragment$d */
    public static final class C42020d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ GameRecommendVideoFragment f113188d;

        public C42020d(GameRecommendVideoFragment gameRecommendVideoFragment) {
            this.f113188d = gameRecommendVideoFragment;
        }

        public final void onClick(View view) {
            C53028s sVar;
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/media/GameRecommendVideoFragment$onViewCreated$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            GameRecommendVideoFragment gameRecommendVideoFragment = this.f113188d;
            C53016g0 g0Var = gameRecommendVideoFragment.f271735d.f147938C;
            if (!(g0Var == null || (sVar = g0Var.f147980e) == null || (str = sVar.f148023d) == null)) {
                C41874g.m45398b(gameRecommendVideoFragment.requireContext(), str, -1, false, "");
            }
            this.f113188d.mo129153K(true, 2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/media/GameRecommendVideoFragment$onViewCreated$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.GameRecommendVideoFragment$a */
    public static final class C94095a extends C87413o implements C32224a<Handler> {

        /* renamed from: d */
        public static final C94095a f271742d = new C94095a();

        public C94095a() {
            super(0);
        }

        public Object invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.GameRecommendVideoFragment$b */
    public static final class C94096b implements GameVideoView.C94133f {

        /* renamed from: a */
        public final /* synthetic */ GameRecommendVideoFragment f271743a;

        /* renamed from: b */
        public final /* synthetic */ GameVideoView f271744b;

        public C94096b(GameRecommendVideoFragment gameRecommendVideoFragment, GameVideoView gameVideoView) {
            this.f271743a = gameRecommendVideoFragment;
            this.f271744b = gameVideoView;
        }

        /* renamed from: a */
        public final void mo129154a(boolean z) {
            if (z) {
                if (this.f271743a.f271736e == 0) {
                    this.f271744b.setMute(true);
                }
                GameRecommendVideoFragment gameRecommendVideoFragment = this.f271743a;
                gameRecommendVideoFragment.f271740i = true;
                C102114b bVar = gameRecommendVideoFragment.f271739h;
                C87412m.m108591d(bVar);
                bVar.f300689b.setVisibility(8);
            } else {
                C102114b bVar2 = this.f271743a.f271739h;
                C87412m.m108591d(bVar2);
                bVar2.f300689b.setVisibility(0);
            }
            this.f271744b.setIsShowBasicControls(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.GameRecommendVideoFragment$e */
    public static final class C94097e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ GameRecommendVideoFragment f271745d;

        public C94097e(GameRecommendVideoFragment gameRecommendVideoFragment) {
            this.f271745d = gameRecommendVideoFragment;
        }

        public final void run() {
            GameVideoView gameVideoView;
            GameVideoView gameVideoView2;
            GameRecommendVideoFragment gameRecommendVideoFragment = this.f271745d;
            int i = GameRecommendVideoFragment.f271734n;
            if (!gameRecommendVideoFragment.f271740i) {
                C102114b bVar = gameRecommendVideoFragment.f271739h;
                if (!(bVar == null || (gameVideoView2 = bVar.f300690c) == null)) {
                    gameVideoView2.start();
                }
                C102114b bVar2 = gameRecommendVideoFragment.f271739h;
                if (bVar2 != null && (gameVideoView = bVar2.f300690c) != null) {
                    gameVideoView.play();
                }
            }
        }
    }

    public GameRecommendVideoFragment(C53012e0 e0Var, int i, int i2) {
        C87412m.m108594g(e0Var, "videoAlbumItem");
        this.f271735d = e0Var;
        this.f271736e = i;
        this.f271737f = i2;
    }

    /* renamed from: K */
    public final void mo129153K(boolean z, int i) {
        Context context = getContext();
        int i2 = this.f271736e + 504;
        int i3 = z ? 2 : 1;
        C53022k kVar = this.f271735d.f147941f;
        C40314g.m43485d(context, 87, 8762, i2, i3, i, kVar != null ? kVar.f148001d : null, this.f271737f, 0, (String) null, (String) null, C15032a.m14200a(7, new HashMap()));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C87412m.m108594g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0966R.C0971layout.cqr, viewGroup, false);
        int i = C0966R.C0970id.f357578f83;
        Button button = (Button) C10462b.m10395a(inflate, C0966R.C0970id.f357578f83);
        if (button != null) {
            i = C0966R.C0970id.m5n;
            ImageView imageView = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.m5n);
            if (imageView != null) {
                i = C0966R.C0970id.miy;
                GameVideoView gameVideoView = (GameVideoView) C10462b.m10395a(inflate, C0966R.C0970id.miy);
                if (gameVideoView != null) {
                    i = C0966R.C0970id.miz;
                    FixAspectRatioRelativeLayout fixAspectRatioRelativeLayout = (FixAspectRatioRelativeLayout) C10462b.m10395a(inflate, C0966R.C0970id.miz);
                    if (fixAspectRatioRelativeLayout != null) {
                        i = C0966R.C0970id.f359428ma1;
                        TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.f359428ma1);
                        if (textView != null) {
                            i = C0966R.C0970id.f359429kw2;
                            TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.f359429kw2);
                            if (textView2 != null) {
                                i = C0966R.C0970id.mkj;
                                FlowView flowView = (FlowView) C10462b.m10395a(inflate, C0966R.C0970id.mkj);
                                if (flowView != null) {
                                    RoundCornerRelativeLayout roundCornerRelativeLayout = (RoundCornerRelativeLayout) inflate;
                                    this.f271739h = new C102114b(roundCornerRelativeLayout, button, imageView, gameVideoView, fixAspectRatioRelativeLayout, textView, textView2, flowView);
                                    C87412m.m108593f(roundCornerRelativeLayout, "binding.root");
                                    return roundCornerRelativeLayout;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public void onDestroyView() {
        super.onDestroyView();
        C102114b bVar = this.f271739h;
        C87412m.m108591d(bVar);
        bVar.f300690c.mo79616c();
        ((Handler) ((C36570n) this.f271741j).getValue()).removeCallbacksAndMessages((Object) null);
        this.f271739h = null;
    }

    public void onPause() {
        super.onPause();
        C102114b bVar = this.f271739h;
        C87412m.m108591d(bVar);
        bVar.f300690c.mo79614b();
    }

    public void onResume() {
        super.onResume();
        C102114b bVar = this.f271739h;
        C87412m.m108591d(bVar);
        bVar.f300690c.mo79617f();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        C53031v vVar = this.f271735d.f147952t;
        LinkedList<C53020i0> linkedList = null;
        LinkedList<C53020i0> linkedList2 = vVar != null ? vVar.f148036d : null;
        if (!(linkedList2 == null || linkedList2.isEmpty())) {
            C99770r0 r0Var = new C99770r0();
            C53031v vVar2 = this.f271735d.f147952t;
            if (vVar2 != null) {
                linkedList = vVar2.f148036d;
            }
            r0Var.f292261d = linkedList;
            C102114b bVar = this.f271739h;
            C87412m.m108591d(bVar);
            bVar.f300693f.setAdapter(r0Var);
        } else {
            C102114b bVar2 = this.f271739h;
            C87412m.m108591d(bVar2);
            bVar2.f300693f.setVisibility(8);
        }
        C53014f0 f0Var = this.f271735d.f147942g;
        if (f0Var != null) {
            String str = this.f271738g;
            Log.m105924i(str, "videoInfo = " + f0Var + "  playUrl = " + f0Var.f147962d + "  duration  = " + f0Var.f147967i);
            C20937c.C20939b bVar3 = new C20937c.C20939b();
            bVar3.f59351g = C99772s0.f292415a;
            bVar3.f59346b = true;
            C20937c a = bVar3.mo32666a();
            C20828a b = C20828a.m22825b();
            String str2 = f0Var.f147963e;
            C102114b bVar4 = this.f271739h;
            C87412m.m108591d(bVar4);
            b.mo32522k(str2, bVar4.f300689b, a, (C98661k) null, (C21070h) null);
            C102114b bVar5 = this.f271739h;
            C87412m.m108591d(bVar5);
            GameVideoView gameVideoView = bVar5.f300690c;
            gameVideoView.setScaleType(C96814a.C96817e.FILL);
            gameVideoView.mo76636h(false, f0Var.f147962d, f0Var.f147967i);
            gameVideoView.setMute(true);
            gameVideoView.setLoop(false);
            gameVideoView.setIsShowBasicControls(false);
            gameVideoView.setPlayerListener(new C94096b(this, gameVideoView));
            C102114b bVar6 = this.f271739h;
            C87412m.m108591d(bVar6);
            bVar6.f300692e.setText(f0Var.f147966h);
        }
        C102114b bVar7 = this.f271739h;
        C87412m.m108591d(bVar7);
        bVar7.f300691d.setText(DateFormat.format(requireContext().getString(C0966R.string.f360810ez1), this.f271735d.f147940e * ((long) 1000)));
        C102114b bVar8 = this.f271739h;
        C87412m.m108591d(bVar8);
        bVar8.f300688a.setOnClickListener(new C42019c(this));
        C102114b bVar9 = this.f271739h;
        C87412m.m108591d(bVar9);
        bVar9.f300690c.setOnClickListener(new C42020d(this));
        mo129153K(false, 1);
        mo129153K(false, 2);
    }

    public void setUserVisibleHint(boolean z) {
        GameVideoView gameVideoView;
        C102114b bVar;
        GameVideoView gameVideoView2;
        GameVideoView gameVideoView3;
        GameVideoView gameVideoView4;
        super.setUserVisibleHint(z);
        if (z) {
            if (!this.f271740i) {
                C102114b bVar2 = this.f271739h;
                if (!(bVar2 == null || (gameVideoView4 = bVar2.f300690c) == null)) {
                    gameVideoView4.start();
                }
                C102114b bVar3 = this.f271739h;
                if (!(bVar3 == null || (gameVideoView3 = bVar3.f300690c) == null)) {
                    gameVideoView3.play();
                }
            }
            if (!(!this.f271740i || (bVar = this.f271739h) == null || (gameVideoView2 = bVar.f300690c) == null)) {
                gameVideoView2.play();
            }
            ((Handler) ((C36570n) this.f271741j).getValue()).postDelayed(new C94097e(this), 500);
            return;
        }
        C102114b bVar4 = this.f271739h;
        if (bVar4 != null && (gameVideoView = bVar4.f300690c) != null) {
            gameVideoView.pause();
        }
    }
}
