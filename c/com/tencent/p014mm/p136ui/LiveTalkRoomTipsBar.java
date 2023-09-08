package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b60.C54426a;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fn3.C75778d;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p151er.C58678p;
import p182kk.C61104a;
import p744wt.C66190c;

/* renamed from: com.tencent.mm.ui.LiveTalkRoomTipsBar */
public class LiveTalkRoomTipsBar extends LinearLayout {

    /* renamed from: v */
    public static final /* synthetic */ int f164968v = 0;

    /* renamed from: d */
    public RelativeLayout f164969d;

    /* renamed from: e */
    public RelativeLayout f164970e;

    /* renamed from: f */
    public RelativeLayout f164971f;

    /* renamed from: g */
    public View f164972g;

    /* renamed from: h */
    public ListView f164973h;

    /* renamed from: i */
    public View f164974i;

    /* renamed from: j */
    public View f164975j;

    /* renamed from: n */
    public C67391b f164976n;

    /* renamed from: o */
    public Context f164977o;

    /* renamed from: p */
    public View f164978p;

    /* renamed from: q */
    public WeImageView f164979q;

    /* renamed from: r */
    public View f164980r;

    /* renamed from: s */
    public boolean f164981s;

    /* renamed from: t */
    public String f164982t;

    /* renamed from: u */
    public C58678p f164983u;

    /* renamed from: com.tencent.mm.ui.LiveTalkRoomTipsBar$a */
    public class C57625a implements View.OnClickListener {
        public C57625a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/LiveTalkRoomTipsBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LiveTalkRoomTipsBar liveTalkRoomTipsBar = LiveTalkRoomTipsBar.this;
            int i = LiveTalkRoomTipsBar.f164968v;
            liveTalkRoomTipsBar.getClass();
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.ui.LiveTalkRoomTipsBar$b */
    public class C57626b implements View.OnClickListener {
        public C57626b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/LiveTalkRoomTipsBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LiveTalkRoomTipsBar liveTalkRoomTipsBar = LiveTalkRoomTipsBar.this;
            int i = LiveTalkRoomTipsBar.f164968v;
            liveTalkRoomTipsBar.getClass();
            C117292a.m165361g(this, "com/tencent/mm/ui/LiveTalkRoomTipsBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.LiveTalkRoomTipsBar$c */
    public class C57627c implements View.OnClickListener {
        public C57627c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/LiveTalkRoomTipsBar$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LiveTalkRoomTipsBar liveTalkRoomTipsBar = LiveTalkRoomTipsBar.this;
            int i = LiveTalkRoomTipsBar.f164968v;
            liveTalkRoomTipsBar.mo81964c(true, true);
            C75778d dVar = C75778d.f222377a;
            LiveTalkRoomTipsBar liveTalkRoomTipsBar2 = LiveTalkRoomTipsBar.this;
            String str = liveTalkRoomTipsBar2.f164982t;
            liveTalkRoomTipsBar2.getClass();
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.ui.LiveTalkRoomTipsBar$d */
    public class C57628d implements Animation.AnimationListener {
        public C57628d() {
        }

        public void onAnimationEnd(Animation animation) {
            LiveTalkRoomTipsBar.this.f164970e.setVisibility(8);
            LiveTalkRoomTipsBar liveTalkRoomTipsBar = LiveTalkRoomTipsBar.this;
            if (!liveTalkRoomTipsBar.f164981s) {
                liveTalkRoomTipsBar.f164970e.setVisibility(8);
                liveTalkRoomTipsBar.setVisibility(8);
                liveTalkRoomTipsBar.setRootTipsBarBackground(false);
                boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_chat_room_live_bar_flashing, false);
                Log.m105924i("MicroMsg.LiveExptConfig", "ChatRoomBarFlashingSwitch: " + wf);
                if (wf) {
                    liveTalkRoomTipsBar.f164983u.mo4625a();
                }
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.ui.LiveTalkRoomTipsBar$e */
    public class C57629e implements View.OnClickListener {
        public C57629e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/LiveTalkRoomTipsBar$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LiveTalkRoomTipsBar liveTalkRoomTipsBar = LiveTalkRoomTipsBar.this;
            int i = LiveTalkRoomTipsBar.f164968v;
            liveTalkRoomTipsBar.mo81964c(true, true);
            C75778d dVar = C75778d.f222377a;
            LiveTalkRoomTipsBar liveTalkRoomTipsBar2 = LiveTalkRoomTipsBar.this;
            String str = liveTalkRoomTipsBar2.f164982t;
            liveTalkRoomTipsBar2.getClass();
            throw null;
        }
    }

    public LiveTalkRoomTipsBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f164977o = context;
        mo81963a();
    }

    /* renamed from: b */
    public static void m66362b(C54426a aVar, Context context) {
        Class cls = C66190c.class;
        LiveConfig.C55204b bVar = new LiveConfig.C55204b();
        if (((C66190c) C86312j.m106911c(cls)).mo89931F() || ((C66190c) C86312j.m106911c(cls)).mo89933L5() || (!C61104a.m71651g(context) && !C61104a.m71669y(context) && !C61104a.m71665u(context) && !C61104a.m71649e(context))) {
            bVar.f157091a = aVar.mo55878A0() ^ true ? 1 : 0;
            bVar.f157095e = aVar.getThumbUrl();
            bVar.f157092b = aVar.mo55881R();
            bVar.f157093c = aVar.mo55880H();
            bVar.f157094d = aVar.mo55879G();
            bVar.f157098h = 1;
            bVar.f157096f = aVar.mo55882Y1();
            LiveConfig a = bVar.mo76374a();
            if (aVar.mo55878A0()) {
                ((C66190c) C86312j.m106911c(cls)).mo89934OG().mo90323c(context, a);
                return;
            }
            Log.m105924i("MicroMsg.LiveVisitorIDKeyStat", "markVisitorClickTipbarEnterLive");
            C115669n.INSTANCE.mo175913w(1381, 1, 1);
            ((C66190c) C86312j.m106911c(cls)).mo89934OG().mo90322b(context, a);
        }
    }

    /* renamed from: a */
    public final void mo81963a() {
        View.inflate(getContext(), C0966R.C0971layout.b7e, this);
        this.f164969d = (RelativeLayout) findViewById(C0966R.C0970id.fz7);
        TextView textView = (TextView) findViewById(C0966R.C0970id.fzb);
        this.f164971f = (RelativeLayout) findViewById(C0966R.C0970id.fz5);
        this.f164978p = findViewById(C0966R.C0970id.agz);
        this.f164979q = (WeImageView) findViewById(C0966R.C0970id.f6145yj);
        this.f164980r = findViewById(C0966R.C0970id.fz4);
        this.f164970e = (RelativeLayout) findViewById(C0966R.C0970id.fzd);
        FrameLayout frameLayout = (FrameLayout) findViewById(C0966R.C0970id.fze);
        this.f164973h = (ListView) findViewById(C0966R.C0970id.fz9);
        View inflate = C85868k2.m106137b(this.f164977o).inflate(C0966R.C0971layout.b7f, (ViewGroup) null);
        this.f164974i = inflate;
        this.f164973h.addFooterView(inflate);
        this.f164972g = findViewById(C0966R.C0970id.fz8);
        this.f164983u = (C58678p) findViewById(C0966R.C0970id.fza);
        mo81964c(true, false);
        this.f164969d.setOnClickListener(new C57625a());
        this.f164971f.setVisibility(8);
        this.f164971f.setOnClickListener(new C57626b());
        this.f164972g.setOnClickListener(new C57627c());
    }

    /* renamed from: c */
    public final void mo81964c(boolean z, boolean z2) {
        C32735h.C32737c cVar = C32735h.C32737c.clicfg_chat_room_live_bar_flashing;
        Class cls = C32735h.class;
        if (z) {
            if (this.f164970e.getVisibility() != 0 || !z2) {
                this.f164970e.setVisibility(8);
                if (!this.f164981s) {
                    this.f164970e.setVisibility(8);
                    setVisibility(8);
                    setRootTipsBarBackground(false);
                    boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(cVar, false);
                    Log.m105924i("MicroMsg.LiveExptConfig", "ChatRoomBarFlashingSwitch: " + wf);
                    if (wf) {
                        this.f164983u.mo4625a();
                    }
                }
            } else {
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2472dw);
                loadAnimation.setAnimationListener(new C57628d());
                this.f164970e.startAnimation(loadAnimation);
            }
            setRootTipsBarBackground(false);
            return;
        }
        if (this.f164970e.getVisibility() != 0) {
            this.f164970e.setVisibility(0);
            setRootTipsBarBackground(true);
            if (z2) {
                this.f164970e.startAnimation(AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2468ds));
                View view = this.f164975j;
                if (view != null) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2393bw));
                }
            }
        }
        if (!this.f164981s) {
            this.f164970e.setVisibility(8);
            setVisibility(8);
            setRootTipsBarBackground(false);
            boolean wf4 = ((C32735h) C86312j.m106911c(cls)).mo58784wf(cVar, false);
            Log.m105924i("MicroMsg.LiveExptConfig", "ChatRoomBarFlashingSwitch: " + wf4);
            if (wf4) {
                this.f164983u.mo4625a();
            }
        }
        C67391b bVar = this.f164976n;
        if (bVar != null) {
            bVar.mo91578s();
        }
    }

    public void setChattingContext(C67391b bVar) {
        this.f164976n = bVar;
    }

    public void setChattingUserName(String str) {
        this.f164982t = str;
    }

    public void setInChatRoom(boolean z) {
        this.f164981s = z;
    }

    public void setRootTipsBarBackground(View view) {
        this.f164975j = view;
    }

    public void setRootTipsBarBackground(boolean z) {
        View view = this.f164975j;
        if (view == null) {
            return;
        }
        if (z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f164975j.setOnClickListener(new C57629e());
            View view2 = this.f164978p;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            WeImageView weImageView = this.f164979q;
            if (weImageView != null) {
                weImageView.setVisibility(4);
            }
            View view3 = this.f164980r;
            if (view3 != null) {
                view3.setBackgroundColor(0);
                return;
            }
            return;
        }
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(8);
        C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view4 = this.f164978p;
        if (view4 != null) {
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        WeImageView weImageView2 = this.f164979q;
        if (weImageView2 != null) {
            weImageView2.setVisibility(0);
        }
        View view6 = this.f164980r;
        if (view6 != null) {
            view6.setBackgroundResource(C0966R.C0969drawable.axw);
        }
    }

    public LiveTalkRoomTipsBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f164977o = context;
        mo81963a();
    }
}
