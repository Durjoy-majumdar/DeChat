package y03;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import gc0.C20828a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import t03.C22426h;
import te3.xh4;
import x03.C22946a;
import x03.C22947b;
import x03.C22960m;
import x03.C22974q;
import y03.C23184e;

/* renamed from: y03.x */
public class C23220x extends C23184e {

    /* renamed from: Q0 */
    public ImageView f66654Q0;

    /* renamed from: R0 */
    public TextView f66655R0;

    /* renamed from: S0 */
    public View f66656S0;

    /* renamed from: T0 */
    public ImageView f66657T0;

    /* renamed from: U0 */
    public TextView f66658U0;

    /* renamed from: V0 */
    public View f66659V0;

    /* renamed from: W */
    public View f66660W;

    /* renamed from: p0 */
    public View f66661p0;

    /* renamed from: x0 */
    public View f66662x0;

    /* renamed from: y0 */
    public View f66663y0;

    /* renamed from: y03.x$a */
    public class C23221a extends C23184e.C23199m {
        public C23221a(C23220x xVar) {
            super();
        }

        /* renamed from: b */
        public int mo36120b(int i, float f) {
            return getCurrentPosition();
        }

        /* renamed from: d */
        public void mo36122d(int i, float f) {
        }

        /* renamed from: h */
        public void mo36127h() {
        }
    }

    public C23220x(Context context, C22947b bVar, C22946a aVar) {
        super(context, bVar, aVar);
    }

    /* renamed from: b */
    public C96814a.C96817e mo36138b(xh4 xh4) {
        float A = (float) C76577a.m92145A(MMApplicationContext.getContext());
        float j = (float) (C76577a.m92159j(MMApplicationContext.getContext()) - C76577a.m92151b(MMApplicationContext.getContext(), 64));
        float f = A / j;
        float f2 = ((float) xh4.f64730i) / ((float) xh4.f64731j);
        Log.m105925i("MicroMsg.TopStory.TopStoryVerticalFSVideoContainer", "getScaleType playAreaRatio %.2f videoRatio %.2f playAreaWidth %.2f playAreaHeight %.2f", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(A), Float.valueOf(j));
        return f <= f2 ? C96814a.C96817e.CONTAIN : C96814a.C96817e.COVER;
    }

    /* renamed from: d */
    public void mo36140d() {
        super.mo36140d();
        this.f66660W = findViewById(C0966R.C0970id.ji6);
        this.f66661p0 = findViewById(C0966R.C0970id.gzq);
        this.f66662x0 = findViewById(C0966R.C0970id.gzd);
        this.f66663y0 = findViewById(C0966R.C0970id.lrj);
        this.f66654Q0 = (ImageView) findViewById(C0966R.C0970id.lri);
        this.f66655R0 = (TextView) findViewById(C0966R.C0970id.lrh);
        this.f66656S0 = findViewById(C0966R.C0970id.jyp);
        this.f66657T0 = (ImageView) findViewById(C0966R.C0970id.jyo);
        this.f66658U0 = (TextView) findViewById(C0966R.C0970id.jyt);
        this.f66659V0 = findViewById(C0966R.C0970id.jyn);
        this.f66661p0.setOnClickListener(this.f66581I);
        this.f66663y0.setOnClickListener(this.f66583K);
        this.f66656S0.setOnClickListener(this.f66585M);
        this.f66660W.setOnClickListener(this.f66582J);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f360039ca3;
    }

    /* renamed from: r */
    public void mo36162r() {
        super.mo36162r();
        C96814a.C96817e b = mo36138b(this.f65924E);
        ViewGroup.LayoutParams layoutParams = this.f65928g.getLayoutParams();
        if (b == C96814a.C96817e.CONTAIN) {
            int A = C76577a.m92145A(MMApplicationContext.getContext());
            layoutParams.width = A;
            xh4 xh4 = this.f65924E;
            layoutParams.height = (int) (((float) A) / (((float) xh4.f64730i) / ((float) xh4.f64731j)));
        } else {
            layoutParams.width = -1;
            layoutParams.height = -1;
        }
        this.f65928g.setLayoutParams(layoutParams);
        View view = this.f66659V0;
        if (!(view == null || this.f66658U0 == null || this.f66657T0 == null)) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f66658U0.setVisibility(8);
            this.f66657T0.setVisibility(8);
            if (!Util.isNullOrNil(this.f65924E.f64739t)) {
                this.f66658U0.setText(this.f65924E.f64739t);
                this.f66658U0.setVisibility(0);
                if (C22974q.m27136f(this.f65924E)) {
                    View view2 = this.f66659V0;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (!Util.isNullOrNil(this.f65924E.f64702C)) {
                    C20828a.m22825b().mo32519h(this.f65924E.f64702C, this.f66657T0, C22426h.f63540a);
                } else {
                    this.f66657T0.setImageResource(C0966R.C0969drawable.bfa);
                }
                this.f66657T0.setVisibility(0);
            }
        }
        if (this.f65920A.mo24952K6()) {
            View view3 = this.f66662x0;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view5 = this.f66661p0;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view7 = this.f66662x0;
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar5.mo10233c(8);
            C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view8 = this.f66661p0;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(8);
            View view9 = view8;
            C117292a.m165358d(view9, aVar6.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo36636v();
    }

    /* renamed from: t */
    public void mo36635t() {
        this.f66580H = new C22960m(getContext(), this, new C23221a(this));
    }

    /* renamed from: v */
    public void mo36636v() {
        if ((this.f65924E.f64711L & 128) > 0) {
            View view = this.f66663y0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateWowUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateWowUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f65924E.f64716R) {
                this.f66654Q0.setImageResource(C0966R.raw.top_story_wow_selected);
                this.f66655R0.setTextColor(getResources().getColor(C0966R.color.ahc));
            } else {
                this.f66654Q0.setImageResource(C0966R.raw.top_story_wow_unselected);
                this.f66655R0.setTextColor(getResources().getColor(C0966R.color.al_));
            }
            this.f66655R0.setText(C22426h.m26105g(this.f65924E.f64722X));
            return;
        }
        View view3 = this.f66663y0;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateWowUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateWowUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
