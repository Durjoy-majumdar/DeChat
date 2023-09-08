package com.tencent.p014mm.p136ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C44706b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p206nj.C76860a;

/* renamed from: com.tencent.mm.ui.widget.WXActionMenuView */
public class WXActionMenuView extends RelativeLayout implements View.OnClickListener {

    /* renamed from: s */
    public static final /* synthetic */ int f220458s = 0;

    /* renamed from: d */
    public Context f220459d;

    /* renamed from: e */
    public TextView f220460e;

    /* renamed from: f */
    public ImageView f220461f;

    /* renamed from: g */
    public View f220462g;

    /* renamed from: h */
    public MenuItem f220463h;

    /* renamed from: i */
    public Drawable f220464i;

    /* renamed from: j */
    public int f220465j;

    /* renamed from: n */
    public int f220466n;

    /* renamed from: o */
    public C74962b f220467o;

    /* renamed from: p */
    public Activity f220468p;

    /* renamed from: q */
    public float f220469q;

    /* renamed from: r */
    public C74963a f220470r;

    /* renamed from: com.tencent.mm.ui.widget.WXActionMenuView$b */
    public interface C74962b {
        /* renamed from: a */
        boolean mo104358a(Activity activity, MenuItem menuItem);
    }

    /* renamed from: com.tencent.mm.ui.widget.WXActionMenuView$a */
    public static class C74963a {

        /* renamed from: a */
        public boolean f220471a = true;

        /* renamed from: b */
        public boolean f220472b = false;

        /* renamed from: c */
        public int f220473c;

        /* renamed from: com.tencent.mm.ui.widget.WXActionMenuView$a$a */
        public static class C74964a {

            /* renamed from: a */
            public static C74963a f220474a;

            public C74964a() {
                f220474a = new C74963a();
            }
        }

        public String toString() {
            return "MenuCustomParam{menuTextColor=" + -1 + ", menuTextSize=" + -1.0f + ", maxIconSize=" + 32 + ", maxMenuSize=" + 4 + ", needTitleCenterMode=" + this.f220471a + ", useOrginalSysMode=" + this.f220472b + ", normalActionbarHeight=" + this.f220473c + ", previewIconWidth=" + -1 + ", previewIconHeight=" + -1 + ", menuText='" + "" + '\'' + ", iconDrawabled=" + null + ", hide=" + false + ", backgroundColor=" + 0 + ", backgroundDrawable=" + null + '}';
        }
    }

    public WXActionMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getShowAsAction() {
        try {
            Field declaredField = this.f220463h.getClass().getDeclaredField("mShowAsAction");
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(this.f220463h)).intValue();
        } catch (Exception unused) {
            return 2;
        }
    }

    private void setMenuBackgroundColor(int i) {
        View view = this.f220462g;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    private void setMenuBackgroundDrawble(Drawable drawable) {
        View view = this.f220462g;
        if (view != null && drawable != null) {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a */
    public final void mo104350a(Activity activity, MenuItem menuItem, C74963a aVar, C74962b bVar) {
        TextView textView;
        ImageView imageView;
        TextView textView2;
        TextView textView3;
        ImageView imageView2;
        this.f220468p = activity;
        this.f220467o = bVar;
        this.f220470r = aVar;
        Log.m105925i("MicroMsg.WXActionMenuView", "buildMMActionMenuView, menuCustomParam: %s.", aVar);
        Log.m105925i("MicroMsg.WXActionMenuView", "initialize : itemData: %s.", menuItem);
        this.f220463h = menuItem;
        this.f220470r.getClass();
        this.f220465j = (int) ((((float) 32) * this.f220469q) + 0.5f);
        this.f220470r.getClass();
        setMenuBackgroundColor(0);
        this.f220470r.getClass();
        setMenuBackgroundDrawble((Drawable) null);
        this.f220470r.getClass();
        setMenuTitleTextColor(-1);
        this.f220470r.getClass();
        setMenuTitleTextSize(-1.0f);
        this.f220470r.getClass();
        this.f220470r.getClass();
        setIcon(menuItem.getIcon());
        setTitle(menuItem.getTitle());
        setId(menuItem.getItemId());
        setVisibility(menuItem.isVisible() ? 0 : 8);
        setEnabled(menuItem.isEnabled());
        menuItem.hasSubMenu();
        if (this.f220463h == null) {
            Log.m105924i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction, mItemData is null");
            return;
        }
        View view = this.f220462g;
        if (view != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/widget/WXActionMenuView", "adapterMenuShowAsAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/widget/WXActionMenuView", "adapterMenuShowAsAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int showAsAction = getShowAsAction();
        Log.m105925i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction, showAsAction: %s.", Integer.valueOf(showAsAction));
        if ((showAsAction & 2) == 2 || (showAsAction & 1) == 1 || (showAsAction & 8) == 8) {
            if (this.f220463h.getIcon() != null && (imageView = this.f220461f) != null) {
                imageView.setVisibility(0);
                TextView textView4 = this.f220460e;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
                Log.m105924i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction is menuTitle gone, menuIcon show.");
            } else if (this.f220463h.getTitle() == null || (textView = this.f220460e) == null) {
                ImageView imageView3 = this.f220461f;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
                TextView textView5 = this.f220460e;
                if (textView5 != null) {
                    textView5.setVisibility(8);
                }
                View view3 = this.f220462g;
                if (view3 != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/ui/widget/WXActionMenuView", "adapterMenuShowAsAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/ui/widget/WXActionMenuView", "adapterMenuShowAsAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                Log.m105924i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction is all gone");
            } else {
                textView.setVisibility(0);
                ImageView imageView4 = this.f220461f;
                if (imageView4 != null) {
                    imageView4.setVisibility(8);
                }
                Log.m105924i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction is menuTitle show, menuIcon gone.");
            }
        } else if ((showAsAction & 4) == 4 || (showAsAction & 0) == 0) {
            ImageView imageView5 = this.f220461f;
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
            if (!(this.f220463h.getTitle() == null || (textView2 = this.f220460e) == null)) {
                textView2.setVisibility(0);
                ImageView imageView6 = this.f220461f;
                if (imageView6 != null) {
                    imageView6.setVisibility(8);
                }
            }
            Log.m105924i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction is menuTitle show, menuIcon gone.");
        } else if (this.f220463h.getIcon() != null && (imageView2 = this.f220461f) != null) {
            imageView2.setVisibility(0);
            TextView textView6 = this.f220460e;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            Log.m105924i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction is menuTitle gone, menuIcon show.");
        } else if (this.f220463h.getTitle() == null || (textView3 = this.f220460e) == null) {
            ImageView imageView7 = this.f220461f;
            if (imageView7 != null) {
                imageView7.setVisibility(8);
            }
            TextView textView7 = this.f220460e;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            View view5 = this.f220462g;
            if (view5 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/ui/widget/WXActionMenuView", "adapterMenuShowAsAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/ui/widget/WXActionMenuView", "adapterMenuShowAsAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            Log.m105924i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction is all gone");
        } else {
            textView3.setVisibility(0);
            ImageView imageView8 = this.f220461f;
            if (imageView8 != null) {
                imageView8.setVisibility(8);
            }
            Log.m105924i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction is menuTitle show, menuIcon gone.");
        }
    }

    public void onClick(View view) {
        C74962b bVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/WXActionMenuView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view == this.f220462g && (bVar = this.f220467o) != null) {
            bVar.mo104358a(this.f220468p, this.f220463h);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/WXActionMenuView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void setIcon(Drawable drawable) {
        this.f220464i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f220465j;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setMenuIcon(drawable);
    }

    public void setMenuIcon(Drawable drawable) {
        ImageView imageView = this.f220461f;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public void setMenuTitleText(CharSequence charSequence) {
        TextView textView = this.f220460e;
        if (textView != null) {
            textView.setText(charSequence);
            this.f220460e.setContentDescription(charSequence);
        }
        if (!Util.isNullOrNil(charSequence) && !Util.isNullOrNil(charSequence.toString()) && !charSequence.toString().contains(getContext().getResources().getString(C0966R.string.bio))) {
            ImageView imageView = this.f220461f;
            imageView.setContentDescription(charSequence + getContext().getResources().getString(C0966R.string.bio));
        }
    }

    public void setMenuTitleTextColor(int i) {
        TextView textView = this.f220460e;
        if (textView != null && i > 0) {
            textView.setTextColor(i);
        }
    }

    public void setMenuTitleTextSize(float f) {
        TextView textView = this.f220460e;
        if (textView != null && f > 0.0f) {
            textView.setTextSize(f);
        }
    }

    public void setTitle(CharSequence charSequence) {
        setMenuTitleText(charSequence);
    }

    public WXActionMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f220460e = null;
        this.f220461f = null;
        Resources resources = context.getResources();
        this.f220459d = context;
        float f = resources.getDisplayMetrics().density;
        this.f220469q = f;
        this.f220465j = (int) ((f * 32.0f) + 0.5f);
        this.f220466n = C76860a.m92656b((Activity) context, (int) context.getResources().getDimension(context.getResources().getConfiguration().orientation == 2 ? C0966R.dimen.f3678b8 : C0966R.dimen.f3679b9));
        Log.m105925i("MicroMsg.WXActionMenuView", "mMaxIconSize : %s, mDefaultNormalActionbarHeight: %s.", Integer.valueOf(this.f220465j), Integer.valueOf(this.f220466n));
        setOnClickListener(this);
        View inflate = LayoutInflater.from(this.f220459d).inflate(C0966R.C0971layout.f6304b6, this);
        this.f220462g = inflate;
        if (inflate.getLayoutParams() != null) {
            this.f220462g.getLayoutParams().width = -2;
            this.f220462g.getLayoutParams().height = -1;
        } else {
            this.f220462g.setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
        }
        this.f220460e = (TextView) findViewById(C0966R.C0970id.f358732gs0);
        this.f220461f = (ImageView) findViewById(C0966R.C0970id.gs5);
        C44706b.m49451b(this.f220460e, C0966R.dimen.f3619c);
    }
}
