package bu0;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bu0.C79840l;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p225rc.C89925n;

/* renamed from: bu0.c */
public class C79819c extends FrameLayout {

    /* renamed from: q */
    public static final /* synthetic */ int f233939q = 0;

    /* renamed from: d */
    public C79843n f233940d = new C79843n();

    /* renamed from: e */
    public LinearLayout f233941e;

    /* renamed from: f */
    public String f233942f;

    /* renamed from: g */
    public int f233943g;

    /* renamed from: h */
    public int f233944h;

    /* renamed from: i */
    public LinkedList<C79829i> f233945i = new LinkedList<>();

    /* renamed from: j */
    public LinkedList<Pair<C79840l, C79840l>> f233946j = new LinkedList<>();

    /* renamed from: n */
    public int f233947n = 0;

    /* renamed from: o */
    public C79830j f233948o;

    /* renamed from: p */
    public final LinkedList<Animator> f233949p = new LinkedList<>();

    /* renamed from: bu0.c$a */
    public class C79820a extends C79842m {

        /* renamed from: a */
        public final /* synthetic */ ImageView f233950a;

        public C79820a(ImageView imageView) {
            this.f233950a = imageView;
        }

        /* renamed from: a */
        public void mo110010a(Bitmap bitmap, C79840l lVar) {
            C79840l.C79841a aVar;
            if (!(lVar == null || (aVar = lVar.f233991d) == null)) {
                aVar.mo110028a(lVar.f233992e);
            }
            C79819c cVar = C79819c.this;
            ImageView imageView = this.f233950a;
            int i = C79819c.f233939q;
            cVar.getClass();
            cVar.mo110002e(new C79831d(cVar, imageView, bitmap));
        }
    }

    /* renamed from: bu0.c$b */
    public class C79821b extends C79842m {

        /* renamed from: a */
        public final /* synthetic */ ImageView f233952a;

        public C79821b(ImageView imageView) {
            this.f233952a = imageView;
        }

        /* renamed from: a */
        public void mo110010a(Bitmap bitmap, C79840l lVar) {
            C79840l.C79841a aVar;
            if (!(lVar == null || (aVar = lVar.f233991d) == null)) {
                aVar.mo110028a(lVar.f233992e);
            }
            C79819c cVar = C79819c.this;
            ImageView imageView = this.f233952a;
            int i = C79819c.f233939q;
            cVar.getClass();
            cVar.mo110002e(new C79831d(cVar, imageView, bitmap));
        }
    }

    /* renamed from: bu0.c$c */
    public class C79822c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f233954d;

        /* renamed from: e */
        public final /* synthetic */ TextView f233955e;

        /* renamed from: f */
        public final /* synthetic */ ImageView f233956f;

        /* renamed from: g */
        public final /* synthetic */ TextView f233957g;

        /* renamed from: h */
        public final /* synthetic */ RelativeLayout f233958h;

        /* renamed from: i */
        public final /* synthetic */ ImageView f233959i;

        public C79822c(boolean z, TextView textView, ImageView imageView, TextView textView2, RelativeLayout relativeLayout, ImageView imageView2) {
            this.f233954d = z;
            this.f233955e = textView;
            this.f233956f = imageView;
            this.f233957g = textView2;
            this.f233958h = relativeLayout;
            this.f233959i = imageView2;
        }

        public void run() {
            Context context;
            int i;
            Context context2;
            int i2;
            if (this.f233954d) {
                context = C79819c.this.getContext();
                i = -12;
            } else {
                context = C79819c.this.getContext();
                i = -8;
            }
            int c = C79819c.m96975c(context, i);
            if (this.f233954d) {
                context2 = C79819c.this.getContext();
                i2 = -1;
            } else {
                context2 = C79819c.this.getContext();
                i2 = -3;
            }
            int c2 = C79819c.m96975c(context2, i2);
            int measuredWidth = (this.f233955e.getMeasuredWidth() - this.f233956f.getMeasuredWidth()) >> 1;
            if (measuredWidth <= 0 || this.f233956f.getVisibility() == 8) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f233957g.getLayoutParams();
                if (layoutParams.leftMargin != c) {
                    layoutParams.leftMargin = c;
                    this.f233958h.updateViewLayout(this.f233957g, layoutParams);
                }
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f233959i.getLayoutParams();
                if (layoutParams2.rightMargin != c2) {
                    layoutParams2.rightMargin = c2;
                    this.f233958h.updateViewLayout(this.f233959i, layoutParams2);
                    return;
                }
                return;
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f233957g.getLayoutParams();
            int i3 = c - measuredWidth;
            if (layoutParams3.leftMargin != i3) {
                layoutParams3.leftMargin = i3;
                this.f233958h.updateViewLayout(this.f233957g, layoutParams3);
            }
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f233959i.getLayoutParams();
            int i4 = c2 + measuredWidth;
            Log.m105918d("MicroMsg.AppBrandPageTabBar", "setItemView, marginRight: " + i4);
            if (layoutParams4.rightMargin != i4) {
                layoutParams4.rightMargin = i4;
                this.f233958h.updateViewLayout(this.f233959i, layoutParams4);
            }
        }
    }

    /* renamed from: bu0.c$d */
    public class C79823d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f233961d;

        public C79823d(boolean z) {
            this.f233961d = z;
        }

        public void run() {
            C79819c.this.mo110001d(this.f233961d);
        }
    }

    /* renamed from: bu0.c$e */
    public class C79824e implements Runnable {
        public C79824e() {
        }

        public void run() {
            C79819c.this.setVisibility(8);
            if (C79819c.this.getParent() instanceof C79828h) {
                ((C79828h) C79819c.this.getParent()).mo110019d0(C79819c.this, true);
            }
        }
    }

    /* renamed from: bu0.c$f */
    public class C79825f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f233964d;

        public C79825f(boolean z) {
            this.f233964d = z;
        }

        public void run() {
            C79819c.this.mo110007i(this.f233964d);
        }
    }

    /* renamed from: bu0.c$g */
    public class C79826g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ObjectAnimator f233966d;

        /* renamed from: bu0.c$g$a */
        public class C79827a implements Runnable {
            public C79827a() {
            }

            public void run() {
                if (C79819c.this.getParent() instanceof C79828h) {
                    ((C79828h) C79819c.this.getParent()).mo110018V(C79819c.this, true);
                }
            }
        }

        public C79826g(ObjectAnimator objectAnimator) {
            this.f233966d = objectAnimator;
        }

        public void run() {
            C79819c.this.setVisibility(0);
            C79819c cVar = C79819c.this;
            ObjectAnimator objectAnimator = this.f233966d;
            C79827a aVar = new C79827a();
            int i = C79819c.f233939q;
            cVar.mo109999a();
            cVar.f233949p.add(objectAnimator);
            objectAnimator.addListener(new C79817a(cVar, aVar, objectAnimator));
            objectAnimator.start();
        }
    }

    /* renamed from: bu0.c$h */
    public interface C79828h extends ViewParent {
        /* renamed from: M */
        void mo110017M(C79819c cVar, boolean z);

        /* renamed from: V */
        void mo110018V(C79819c cVar, boolean z);

        /* renamed from: d0 */
        void mo110019d0(C79819c cVar, boolean z);

        /* renamed from: u */
        void mo110020u(C79819c cVar, boolean z);
    }

    /* renamed from: bu0.c$i */
    public static class C79829i {

        /* renamed from: a */
        public String f233969a;

        /* renamed from: b */
        public C79840l f233970b;

        /* renamed from: c */
        public C79840l f233971c;

        /* renamed from: d */
        public String f233972d;

        /* renamed from: e */
        public boolean f233973e = false;

        /* renamed from: f */
        public boolean f233974f = false;

        /* renamed from: g */
        public String f233975g = "";

        /* renamed from: h */
        public int f233976h = 0;

        /* renamed from: i */
        public int f233977i = -1;
    }

    /* renamed from: bu0.c$j */
    public interface C79830j {
    }

    public C79819c(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f233941e = linearLayout;
        linearLayout.setOrientation(0);
        this.f233941e.setGravity(16);
        this.f233941e.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(this.f233941e);
    }

    /* renamed from: c */
    public static int m96975c(Context context, int i) {
        return Math.round(context.getResources().getDisplayMetrics().density * ((float) i));
    }

    /* renamed from: a */
    public void mo109999a() {
        clearAnimation();
        Iterator<Animator> it = this.f233949p.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.f233949p.clear();
    }

    /* renamed from: b */
    public int mo110000b(String str) {
        C79829i iVar;
        LinkedList<C79829i> linkedList = this.f233945i;
        String a = C89925n.m112488a(str);
        Iterator<C79829i> it = this.f233945i.iterator();
        while (true) {
            if (!it.hasNext()) {
                iVar = null;
                break;
            }
            iVar = it.next();
            if (C89925n.m112488a(iVar.f233969a).equals(a)) {
                break;
            }
        }
        return linkedList.indexOf(iVar);
    }

    /* renamed from: d */
    public void mo110001d(boolean z) {
        if (!MMHandlerThread.isMainThread()) {
            MMHandlerThread.postToMainThread(new C79823d(z));
            return;
        }
        if (getParent() instanceof C79828h) {
            ((C79828h) getParent()).mo110020u(this, z);
        }
        if (!z) {
            setVisibility(8);
            if (getParent() instanceof C79828h) {
                ((C79828h) getParent()).mo110019d0(this, false);
                return;
            }
            return;
        }
        float[] fArr = new float[2];
        fArr[0] = 0.0f;
        fArr[1] = (float) (getHeight() * ("top".equals(this.f233942f) ? -1 : 1));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", fArr);
        ofFloat.setDuration(250);
        C79824e eVar = new C79824e();
        mo109999a();
        this.f233949p.add(ofFloat);
        ofFloat.addListener(new C79817a(this, eVar, ofFloat));
        ofFloat.start();
    }

    /* renamed from: e */
    public final void mo110002e(Runnable runnable) {
        if (runnable != null) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }
    }

    /* renamed from: f */
    public void mo110003f(int i) {
        this.f233945i.get(this.f233947n).f233973e = false;
        if (i <= 0 || i >= this.f233945i.size()) {
            this.f233947n = 0;
        } else {
            this.f233947n = i;
        }
        this.f233945i.get(this.f233947n).f233973e = true;
        mo110002e(new C79818b(this));
    }

    /* renamed from: g */
    public final void mo110004g(View view, C79829i iVar) {
        String str;
        RelativeLayout relativeLayout;
        int i;
        View view2 = view;
        C79829i iVar2 = iVar;
        RelativeLayout relativeLayout2 = (RelativeLayout) view2.findViewById(C0966R.C0970id.f6012uu);
        ImageView imageView = (ImageView) view2.findViewById(C0966R.C0970id.f6013uv);
        TextView textView = (TextView) view2.findViewById(C0966R.C0970id.f6011ut);
        ImageView imageView2 = (ImageView) view2.findViewById(C0966R.C0970id.f6016uy);
        TextView textView2 = (TextView) view2.findViewById(C0966R.C0970id.f6017uz);
        View findViewById = view2.findViewById(C0966R.C0970id.f6015ux);
        boolean D = C76577a.m92148D(getContext());
        Log.m105918d("MicroMsg.AppBrandPageTabBar", "setItemView, useLargerText: " + D);
        if ("top".equals(this.f233942f)) {
            view2.setLayoutParams(new LinearLayout.LayoutParams(0, (int) (((float) m96975c(getContext(), 40)) * C76577a.m92161l(getContext())), 1.0f));
            imageView.setVisibility(8);
            textView2.setTextSize(0, ((float) m96975c(getContext(), 14)) * C76577a.m92161l(getContext()));
            if (iVar2.f233973e) {
                findViewById.setBackgroundColor(this.f233944h);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = findViewById;
                relativeLayout = relativeLayout2;
                i = 0;
                str = "top";
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar", "setItemView", "(Landroid/view/View;Lcom/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar$TabItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar", "setItemView", "(Landroid/view/View;Lcom/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar$TabItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                relativeLayout = relativeLayout2;
                str = "top";
                i = 0;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(4);
                View view4 = findViewById;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar", "setItemView", "(Landroid/view/View;Lcom/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar$TabItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar", "setItemView", "(Landroid/view/View;Lcom/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar$TabItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            relativeLayout = relativeLayout2;
            str = "top";
            i = 0;
            if (iVar2.f233970b.mo110027a() != null) {
                String str2 = iVar2.f233972d;
                if (str2 == null || str2.equals("")) {
                    view2.setLayoutParams(new LinearLayout.LayoutParams(0, (int) (((float) m96975c(getContext(), 48)) * C76577a.m92161l(getContext())), 1.0f));
                    imageView.setVisibility(0);
                    int b = D ? C76577a.m92151b(getContext(), 34) : C76577a.m92151b(getContext(), 28);
                    imageView.getLayoutParams().width = b;
                    imageView.getLayoutParams().height = b;
                    textView2.setVisibility(8);
                } else {
                    view2.setLayoutParams(new LinearLayout.LayoutParams(0, (int) (((float) m96975c(getContext(), 56)) * C76577a.m92161l(getContext())), 1.0f));
                    imageView.setVisibility(0);
                    int b2 = D ? C76577a.m92151b(getContext(), 34) : C76577a.m92151b(getContext(), 28);
                    imageView.getLayoutParams().width = b2;
                    imageView.getLayoutParams().height = b2;
                    textView2.setVisibility(0);
                    textView2.setTextSize(0, ((float) m96975c(getContext(), 12)) * C76577a.m92161l(getContext()));
                }
            } else {
                String str3 = iVar2.f233972d;
                if (str3 != null && !str3.equals("")) {
                    view2.setLayoutParams(new LinearLayout.LayoutParams(0, (int) (((float) m96975c(getContext(), 49)) * C76577a.m92161l(getContext())), 1.0f));
                    imageView.setVisibility(8);
                    textView2.setVisibility(0);
                    textView2.setTextSize(0, ((float) m96975c(getContext(), 16)) * C76577a.m92161l(getContext()));
                }
            }
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(4);
            View view5 = findViewById;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar", "setItemView", "(Landroid/view/View;Lcom/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar$TabItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar", "setItemView", "(Landroid/view/View;Lcom/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar$TabItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        Drawable background = textView.getBackground();
        if (background != null) {
            background.setColorFilter(iVar2.f233976h, PorterDuff.Mode.SRC_ATOP);
        }
        textView.setVisibility(iVar2.f233975g.isEmpty() ? 4 : 0);
        textView.setText(iVar2.f233975g);
        textView.setTextColor(iVar2.f233977i);
        if (!iVar2.f233974f) {
            i = 4;
        }
        imageView2.setVisibility(i);
        if (!iVar2.f233973e || iVar2.f233971c.mo110027a() == null) {
            iVar2.f233970b.f233993f = new C79821b(imageView);
            iVar2.f233970b.mo110025b();
        } else {
            iVar2.f233971c.f233993f = new C79820a(imageView);
            iVar2.f233971c.mo110025b();
        }
        textView2.setText(iVar2.f233972d);
        if (iVar2.f233973e) {
            textView2.setTextColor(this.f233944h);
        } else {
            textView2.setTextColor(this.f233943g);
        }
        if (!str.equals(this.f233942f)) {
            textView2.post(new C79822c(D, textView2, imageView, textView, relativeLayout, imageView2));
        }
    }

    public String getPosition() {
        return this.f233942f;
    }

    /* renamed from: h */
    public final void mo110006h(int i, String str, C79840l lVar, C79840l lVar2, boolean z) {
        if (i < this.f233945i.size()) {
            C79829i iVar = this.f233945i.get(i);
            if (str == null) {
                str = iVar.f233972d;
            }
            iVar.f233972d = str;
            if (lVar != null && (lVar.mo110027a() != null || z)) {
                iVar.f233970b = lVar;
            }
            if (lVar2 != null && (lVar2.mo110027a() != null || z)) {
                iVar.f233971c = lVar2;
            }
            mo110002e(new C79818b(this));
        }
    }

    /* renamed from: i */
    public void mo110007i(boolean z) {
        if (!MMHandlerThread.isMainThread()) {
            MMHandlerThread.postToMainThread(new C79825f(z));
            return;
        }
        if (getParent() instanceof C79828h) {
            ((C79828h) getParent()).mo110017M(this, z);
        }
        if (!z) {
            setVisibility(0);
            setTranslationY(0.0f);
            if (getParent() instanceof C79828h) {
                ((C79828h) getParent()).mo110018V(this, false);
                return;
            }
            return;
        }
        float[] fArr = new float[2];
        fArr[0] = (float) (getHeight() * ("top".equals(this.f233942f) ? -1 : 1));
        fArr[1] = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", fArr);
        ofFloat.setDuration(250);
        post(new C79826g(ofFloat));
    }

    public void setClickListener(C79830j jVar) {
        this.f233948o = jVar;
    }

    public void setPosition(String str) {
        this.f233942f = str;
    }
}
