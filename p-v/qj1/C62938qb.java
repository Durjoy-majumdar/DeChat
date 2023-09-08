package qj1;

import ak1.C54116w;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bl3.C39818r;
import cj1.C54795n5;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.blur.BlurView;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d60.C58124b;
import di3.C86312j;
import dj1.C45395w;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import l60.C99344b;
import o40.C61926c;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C49712hj1;
import te3.C49760hw0;
import te3.C51922x41;
import tj3.C111011i;
import up1.C27696y;
import zc1.C66785b;

/* renamed from: qj1.qb */
public final class C62938qb extends C62660c implements View.OnClickListener {

    /* renamed from: A */
    public final View f178588A;

    /* renamed from: B */
    public final View f178589B;

    /* renamed from: C */
    public int f178590C;

    /* renamed from: p */
    public final C58124b f178591p;

    /* renamed from: q */
    public final String f178592q = "Finder.FinderLiveMusicInfoPanelPlugin";

    /* renamed from: r */
    public final RoundCornerRelativeLayout f178593r;

    /* renamed from: s */
    public final ImageView f178594s;

    /* renamed from: t */
    public final TextView f178595t;

    /* renamed from: u */
    public final TextView f178596u;

    /* renamed from: v */
    public final TextView f178597v;

    /* renamed from: w */
    public final View f178598w;

    /* renamed from: x */
    public final TextView f178599x;

    /* renamed from: y */
    public final TextView f178600y;

    /* renamed from: z */
    public final BlurView f178601z;

    /* renamed from: qj1.qb$a */
    public /* synthetic */ class C62939a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f178602a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[171] = 1;
            f178602a = iArr;
        }
    }

    /* renamed from: qj1.qb$b */
    public static final class C62940b implements C45395w.C45396a {

        /* renamed from: a */
        public final /* synthetic */ C62938qb f178603a;

        /* renamed from: qj1.qb$b$a */
        public static final class C62941a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C49760hw0 f178604d;

            /* renamed from: e */
            public final /* synthetic */ C62938qb f178605e;

            /* renamed from: f */
            public final /* synthetic */ int f178606f;

            /* renamed from: g */
            public final /* synthetic */ int f178607g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62941a(C49760hw0 hw02, C62938qb qbVar, int i, int i2) {
                super(0);
                this.f178604d = hw02;
                this.f178605e = qbVar;
                this.f178606f = i;
                this.f178607g = i2;
            }

            public Object invoke() {
                Class cls = C11990s0.class;
                Class<C60200t1> cls2 = C60200t1.class;
                LinkedList<C51922x41> linkedList = this.f178604d.f134910d;
                String str = null;
                C51922x41 x412 = linkedList != null ? (C51922x41) C110818d0.m150917O(linkedList, 0) : null;
                if (x412 != null) {
                    C62938qb qbVar = this.f178605e;
                    qbVar.f178595t.setText(x412.f144443e);
                    qbVar.f178596u.setText(x412.f144444f);
                    if (!Util.isNullOrNil(x412.f144445g)) {
                        qbVar.f178597v.setText(x412.f144445g);
                        qbVar.f178597v.setVisibility(0);
                    } else {
                        qbVar.f178597v.setText("");
                        qbVar.f178597v.setVisibility(8);
                    }
                    if (!Util.isNullOrNil(x412.f144447i) || !Util.isNullOrNil(x412.f144450o)) {
                        qbVar.f178599x.setText(x412.f144447i);
                        qbVar.f178600y.setText(x412.f144450o);
                        View view = qbVar.f178598w;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMusicInfoPanelPlugin$fillMusicPanel$1$1$onCgiBack$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMusicInfoPanelPlugin$fillMusicPanel$1$1$onCgiBack$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        qbVar.f178599x.setText("");
                        qbVar.f178600y.setText("");
                        View view3 = qbVar.f178598w;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMusicInfoPanelPlugin$fillMusicPanel$1$1$onCgiBack$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMusicInfoPanelPlugin$fillMusicPanel$1$1$onCgiBack$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    C39818r rVar = C39818r.f106831a;
                    C99344b<C100810g0, Bitmap> b = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(x412.f144446h, C27696y.THUMB_IMAGE), ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.PROFILE_COVER));
                    C62995tb tbVar = new C62995tb(qbVar);
                    b.getClass();
                    b.f291320d = tbVar;
                    b.mo85951a();
                }
                String str2 = this.f178605e.f178592q;
                StringBuilder sb = new StringBuilder();
                sb.append("errType:");
                sb.append(this.f178606f);
                sb.append(", errCode:");
                sb.append(this.f178607g);
                sb.append(", musicInfo.song_id:");
                sb.append(x412 != null ? Integer.valueOf(x412.f144442d) : null);
                sb.append(" musicInfo.song_name:");
                sb.append(x412 != null ? x412.f144443e : null);
                sb.append(" musicInfo.singer_name:");
                sb.append(x412 != null ? x412.f144444f : null);
                sb.append(" musicInfo.album_name:");
                sb.append(x412 != null ? x412.f144445g : null);
                sb.append(" musicInfo.genreTv:");
                sb.append(x412 != null ? x412.f144447i : null);
                sb.append(" musicInfo.public_time:");
                sb.append(x412 != null ? x412.f144450o : null);
                sb.append(" musicInfo.album_pic_url:");
                if (x412 != null) {
                    str = x412.f144446h;
                }
                sb.append(str);
                Log.m105924i(str2, sb.toString());
                return C13598b0.f38549a;
            }
        }

        public C62940b(C62938qb qbVar) {
            this.f178603a = qbVar;
        }

        /* renamed from: a */
        public void mo70900a(int i, int i2, String str, C49760hw0 hw02) {
            C87412m.m108594g(hw02, "resp");
            C61926c.m72668M(new C62941a(hw02, this.f178603a, i, i2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62938qb(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178591p = bVar;
        RoundCornerRelativeLayout roundCornerRelativeLayout = (RoundCornerRelativeLayout) viewGroup.findViewById(C0966R.C0970id.dtu);
        this.f178593r = roundCornerRelativeLayout;
        ImageView imageView = (ImageView) viewGroup.findViewById(C0966R.C0970id.dtr);
        this.f178594s = imageView;
        this.f178595t = (TextView) viewGroup.findViewById(C0966R.C0970id.dtw);
        this.f178596u = (TextView) viewGroup.findViewById(C0966R.C0970id.f358200du1);
        this.f178597v = (TextView) viewGroup.findViewById(C0966R.C0970id.dto);
        this.f178598w = viewGroup.findViewById(C0966R.C0970id.dtv);
        this.f178599x = (TextView) viewGroup.findViewById(C0966R.C0970id.dts);
        this.f178600y = (TextView) viewGroup.findViewById(C0966R.C0970id.dtx);
        BlurView blurView = (BlurView) viewGroup.findViewById(C0966R.C0970id.dtq);
        this.f178601z = blurView;
        this.f178588A = viewGroup.findViewById(C0966R.C0970id.f358199du0);
        this.f178589B = viewGroup.findViewById(C0966R.C0970id.dtp);
        int h = C76577a.m92157h(viewGroup.getContext(), C0966R.dimen.f3727cg);
        Point i = C85875k4.m106186i(viewGroup.getContext());
        int i2 = h + i.x;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (!mo82893g0()) {
            layoutParams.height = i2;
            layoutParams.width = i.x;
        }
        roundCornerRelativeLayout.setLayoutParams(layoutParams);
        float b = (float) C76577a.m92151b(viewGroup.getContext(), 24);
        roundCornerRelativeLayout.mo82317c(0.0f, 0.0f, b, b);
        try {
            blurView.mo101978c(roundCornerRelativeLayout);
            blurView.f215140d.mo89125j(imageView.getDrawable());
            blurView.f215140d.mo89124i(new C111011i(blurView.getContext()));
            blurView.f215140d.mo89123h(50.0f);
            blurView.f215146j = true;
            blurView.f215142f = (float) C76577a.m92157h(blurView.getContext(), C0966R.dimen.f3766df);
            blurView.f215140d.mo89126k(true);
            blurView.mo101977b(Color.parseColor("#61D2D2D2"));
        } catch (Exception unused) {
            Log.m105928w(this.f178592q, "not support RS, back to sold image btn");
            this.f178601z.setBackground(this.f166287d.getContext().getResources().getDrawable(C0966R.C0969drawable.aii));
        }
        this.f178593r.setTranslationY(-((float) C75044y4.m89990b(viewGroup.getContext()).y));
        this.f178601z.setOnClickListener(this);
        this.f178588A.setOnClickListener(this);
        this.f178589B.setOnClickListener(this);
    }

    /* renamed from: Z0 */
    public final void mo87875Z0() {
        Class cls = C55001u.class;
        String str = this.f178592q;
        Log.m105924i(str, "fillMusicPanel curPlayingBgmId:" + this.f178590C);
        if (this.f178590C != 0) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(Integer.valueOf(this.f178590C));
            C54795n5 D0 = mo14476D0();
            if (D0 != null) {
                D0.mo75735g(((C55001u) mo87684A0().mo71262a(cls)).f154420q.f182392d, ((C55001u) mo87684A0().mo71262a(cls)).f154417n, C66785b.f191882e.mo90662O5(), ((C55001u) mo87684A0().mo71262a(cls)).f154416j, 2, linkedList, new C62940b(this));
            }
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveMusicInfoPanelPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        boolean z = true;
        if ((valueOf == null || valueOf.intValue() != C0966R.C0970id.dtp) && (valueOf == null || valueOf.intValue() != C0966R.C0970id.dtq)) {
            z = false;
        }
        if (z) {
            this.f178593r.animate().translationY(-((float) C75044y4.m89990b(this.f166287d.getContext()).y)).setListener(new C63030ub(this)).start();
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.f358199du0) {
            C54795n5 D0 = mo14476D0();
            if (D0 != null) {
                Context context = this.f166287d.getContext();
                C87412m.m108593f(context, "root.context");
                D0.mo75747o(context, this.f178590C, 0);
            }
            ((C54116w) C86312j.m106911c(C54116w.class)).By0(2);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMusicInfoPanelPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        if (C62939a.f178602a[bVar.ordinal()] == 1) {
            this.f178590C = bundle != null ? bundle.getInt("PARAM_LIVE_BGM_ID") : 0;
            mo10792g(0);
            this.f178593r.animate().translationY(0.0f).setListener((Animator.AnimatorListener) null).start();
            mo87875Z0();
        }
    }
}
