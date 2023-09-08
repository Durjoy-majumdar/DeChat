package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p196ln.C76705f;

/* renamed from: com.tencent.mm.ui.base.TalkRoomPopupNav */
public class TalkRoomPopupNav extends LinearLayout {

    /* renamed from: d */
    public C73220f f214983d;

    /* renamed from: e */
    public LinearLayout f214984e;

    /* renamed from: f */
    public LinearLayout f214985f;

    /* renamed from: g */
    public LinearLayout f214986g;

    /* renamed from: h */
    public LinearLayout f214987h;

    /* renamed from: i */
    public LinearLayout f214988i;

    /* renamed from: j */
    public LinearLayout f214989j;

    /* renamed from: n */
    public View f214990n;

    /* renamed from: o */
    public Button f214991o;

    /* renamed from: p */
    public WeImageView f214992p;

    /* renamed from: q */
    public WeImageView f214993q;

    /* renamed from: r */
    public View f214994r;

    /* renamed from: s */
    public View f214995s;

    /* renamed from: t */
    public WeImageView f214996t;

    /* renamed from: u */
    public C67391b f214997u;

    /* renamed from: v */
    public int f214998v;

    /* renamed from: w */
    public Animation f214999w;

    /* renamed from: com.tencent.mm.ui.base.TalkRoomPopupNav$a */
    public class C73215a implements View.OnClickListener {
        public C73215a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/TalkRoomPopupNav$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C73220f fVar = TalkRoomPopupNav.this.f214983d;
            if (fVar != null) {
                fVar.mo101906b();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/base/TalkRoomPopupNav$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.base.TalkRoomPopupNav$b */
    public class C73216b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f215001d;

        public C73216b(String str) {
            this.f215001d = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/TalkRoomPopupNav$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TalkRoomPopupNav.this.mo101891k(300);
            C73220f fVar = TalkRoomPopupNav.this.f214983d;
            if (fVar != null) {
                fVar.mo101905a(this.f215001d);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/base/TalkRoomPopupNav$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.base.TalkRoomPopupNav$c */
    public class C73217c implements View.OnClickListener {
        public C73217c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/TalkRoomPopupNav$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TalkRoomPopupNav.this.mo101891k(300);
            C117292a.m165361g(this, "com/tencent/mm/ui/base/TalkRoomPopupNav$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.base.TalkRoomPopupNav$d */
    public class C73218d implements View.OnClickListener {
        public C73218d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/TalkRoomPopupNav$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TalkRoomPopupNav.this.mo101891k(300);
            C117292a.m165361g(this, "com/tencent/mm/ui/base/TalkRoomPopupNav$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.base.TalkRoomPopupNav$e */
    public class C73219e implements Animation.AnimationListener {
        public C73219e() {
        }

        public void onAnimationEnd(Animation animation) {
            TalkRoomPopupNav talkRoomPopupNav = TalkRoomPopupNav.this;
            talkRoomPopupNav.f214999w = null;
            talkRoomPopupNav.f214986g.setVisibility(8);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.ui.base.TalkRoomPopupNav$f */
    public interface C73220f {
        /* renamed from: a */
        void mo101905a(String str);

        /* renamed from: b */
        void mo101906b();
    }

    public TalkRoomPopupNav(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo101879b();
    }

    /* renamed from: a */
    public void mo101878a() {
        View view = this.f214994r;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/base/TalkRoomPopupNav", "hideTipsBarBackground", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/base/TalkRoomPopupNav", "hideTipsBarBackground", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: b */
    public final void mo101879b() {
        View.inflate(getContext(), getInitViewLayout(), this);
        this.f214995s = findViewById(C0966R.C0970id.agz);
        this.f214984e = (LinearLayout) findViewById(C0966R.C0970id.h_i);
        this.f214985f = (LinearLayout) findViewById(C0966R.C0970id.h_j);
        this.f214986g = (LinearLayout) findViewById(C0966R.C0970id.c6v);
        this.f214987h = (LinearLayout) findViewById(C0966R.C0970id.f4q);
        this.f214988i = (LinearLayout) findViewById(C0966R.C0970id.f4s);
        this.f214989j = (LinearLayout) findViewById(C0966R.C0970id.f4r);
        this.f214990n = findViewById(C0966R.C0970id.ald);
        this.f214991o = (Button) findViewById(C0966R.C0970id.alg);
        this.f214996t = (WeImageView) findViewById(C0966R.C0970id.f6145yj);
        this.f214992p = (WeImageView) findViewById(C0966R.C0970id.kf_);
        WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.kfa);
        this.f214993q = weImageView;
        weImageView.setVisibility(8);
        this.f214984e.setOnClickListener(new C73215a());
        View view = this.f214994r;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/base/TalkRoomPopupNav", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/base/TalkRoomPopupNav", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int i = this.f214984e.getLayoutParams().height;
        int i2 = this.f214986g.getLayoutParams().height;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.f214998v = (int) Math.floor((double) (((float) (displayMetrics.widthPixels - C74942w4.m89784a(getContext(), 56))) / ((float) C74942w4.m89784a(getContext(), 48))));
    }

    /* renamed from: c */
    public void mo101880c(int i, int i2) {
        if (i < 0) {
            WeImageView weImageView = this.f214993q;
            if (weImageView != null) {
                weImageView.setVisibility(8);
                return;
            }
            return;
        }
        WeImageView weImageView2 = this.f214993q;
        if (weImageView2 != null) {
            weImageView2.setImageResource(i);
            this.f214993q.setIconColor(i2);
            this.f214993q.setVisibility(0);
        }
    }

    /* renamed from: d */
    public void mo101881d(List<String> list) {
        boolean z;
        LinearLayout linearLayout = this.f214987h;
        int i = 0;
        boolean z2 = true;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            z = false;
        } else {
            this.f214987h.removeAllViews();
            z = true;
        }
        LinearLayout linearLayout2 = this.f214988i;
        if (linearLayout2 != null && linearLayout2.getVisibility() == 0) {
            this.f214988i.removeAllViews();
            z = true;
        }
        LinearLayout linearLayout3 = this.f214989j;
        if (linearLayout3 == null || linearLayout3.getVisibility() != 0) {
            z2 = z;
        } else {
            this.f214989j.removeAllViews();
        }
        if (z2) {
            for (String next : list) {
                ImageView imageView = new ImageView(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C76577a.m92151b(MMApplicationContext.getContext(), 40), C76577a.m92151b(MMApplicationContext.getContext(), 40));
                layoutParams.rightMargin = C76577a.m92151b(MMApplicationContext.getContext(), 8);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(layoutParams);
                int i2 = this.f214998v;
                if (i < i2) {
                    this.f214987h.addView(imageView);
                } else if (i >= i2 && i < i2 * 2) {
                    this.f214988i.addView(imageView);
                } else if (i >= i2 * 2 && i < i2 * 3) {
                    this.f214989j.addView(imageView);
                }
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, next);
                i++;
            }
        }
    }

    /* renamed from: e */
    public final void mo101882e(boolean z) {
        View view = this.f214994r;
        if (view == null) {
            return;
        }
        if (z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f214995s;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            LinearLayout linearLayout = this.f214984e;
            if (linearLayout != null) {
                linearLayout.setBackgroundColor(0);
            }
            WeImageView weImageView = this.f214996t;
            if (weImageView != null) {
                weImageView.setVisibility(4);
            }
            C67391b bVar = this.f214997u;
            if (bVar != null) {
                bVar.mo91578s();
                return;
            }
            return;
        }
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(8);
        C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view4 = this.f214995s;
        if (view4 != null) {
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        LinearLayout linearLayout2 = this.f214984e;
        if (linearLayout2 != null) {
            linearLayout2.setBackgroundResource(C0966R.C0969drawable.axw);
        }
        WeImageView weImageView2 = this.f214996t;
        if (weImageView2 != null) {
            weImageView2.setVisibility(0);
        }
    }

    /* renamed from: f */
    public void mo101883f(long j) {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2468ds);
        loadAnimation.setDuration(j);
        this.f214986g.startAnimation(loadAnimation);
    }

    /* renamed from: g */
    public void mo101884g(long j) {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2472dw);
        this.f214999w = loadAnimation;
        loadAnimation.setDuration(j);
        this.f214999w.setAnimationListener(new C73219e());
        this.f214986g.startAnimation(this.f214999w);
    }

    public WeImageView getArrowImg() {
        return this.f214996t;
    }

    public Button getBtnEnter() {
        return this.f214991o;
    }

    public int getInitViewLayout() {
        return C0966R.C0971layout.c86;
    }

    /* renamed from: h */
    public void mo101888h() {
        this.f214985f.startAnimation(AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2393bw));
    }

    /* renamed from: i */
    public void mo101889i() {
    }

    /* renamed from: j */
    public void mo101890j(String str, List<String> list, long j) {
        this.f214991o.setOnClickListener(new C73216b(str));
        this.f214990n.setOnClickListener(new C73217c());
        View view = this.f214994r;
        if (view != null) {
            view.setOnClickListener(new C73218d());
        }
        int i = 0;
        if (this.f214986g.getVisibility() != 0) {
            this.f214986g.setVisibility(0);
            mo101882e(true);
            mo101883f(j);
            View view2 = this.f214994r;
            if (view2 != null) {
                view2.startAnimation(AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2393bw));
            }
        }
        this.f214987h.setVisibility(0);
        this.f214987h.removeAllViews();
        if (list != null) {
            if (list.size() > this.f214998v) {
                this.f214988i.setVisibility(0);
                this.f214988i.removeAllViews();
            }
            if (list.size() > this.f214998v * 2) {
                this.f214989j.setVisibility(0);
                this.f214989j.removeAllViews();
            }
        }
        for (String next : list) {
            ImageView imageView = new ImageView(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C76577a.m92151b(MMApplicationContext.getContext(), 40), C76577a.m92151b(MMApplicationContext.getContext(), 40));
            layoutParams.rightMargin = C76577a.m92151b(MMApplicationContext.getContext(), 8);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setLayoutParams(layoutParams);
            int i2 = this.f214998v;
            if (i < i2) {
                this.f214987h.addView(imageView);
            } else if (i >= i2 && i < i2 * 2) {
                this.f214988i.addView(imageView);
            } else if (i >= i2 * 2 && i < i2 * 3) {
                this.f214989j.addView(imageView);
            }
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, next);
            i++;
        }
    }

    /* renamed from: k */
    public void mo101891k(long j) {
        mo101882e(false);
        if (this.f214986g.getVisibility() == 0) {
            mo101884g(j);
        } else {
            mo101888h();
        }
        this.f214984e.setClickable(true);
    }

    public void setBgViewResource(int i) {
        LinearLayout linearLayout = this.f214984e;
        if (linearLayout != null) {
            linearLayout.setBackgroundResource(i);
        }
    }

    public void setChattingContext(C67391b bVar) {
        this.f214997u = bVar;
    }

    public void setDialogContent(String str) {
        ((TextView) findViewById(C0966R.C0970id.kw7)).setText(str);
    }

    public void setNavContent(String str) {
        ((TextView) findViewById(C0966R.C0970id.kx8)).setText(str);
    }

    public void setOnClickListener(C73220f fVar) {
        this.f214983d = fVar;
    }

    public void setRootTipsBarBackground(View view) {
        this.f214994r = view;
    }

    public TalkRoomPopupNav(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo101879b();
    }
}
