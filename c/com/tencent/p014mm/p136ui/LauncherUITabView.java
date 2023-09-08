package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74809q;
import com.tencent.p014mm.sdk.event.MvvmEventCenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import p919sl.C77724a;

/* renamed from: com.tencent.mm.ui.LauncherUITabView */
public class LauncherUITabView extends RelativeLayout implements C74809q {

    /* renamed from: A */
    public boolean f121154A = false;

    /* renamed from: d */
    public int f121155d;

    /* renamed from: e */
    public int f121156e = 0;

    /* renamed from: f */
    public Bitmap f121157f;

    /* renamed from: g */
    public ImageView f121158g;

    /* renamed from: h */
    public Matrix f121159h = new Matrix();

    /* renamed from: i */
    public C74809q.C45035a f121160i;

    /* renamed from: j */
    public C44686c f121161j;

    /* renamed from: n */
    public C44686c f121162n;

    /* renamed from: o */
    public C44686c f121163o;

    /* renamed from: p */
    public C44686c f121164p;

    /* renamed from: q */
    public long f121165q = 0;

    /* renamed from: r */
    public int f121166r = -1;

    /* renamed from: s */
    public View.OnClickListener f121167s = new C44684a();

    /* renamed from: t */
    public MMHandler f121168t = new C44685b();

    /* renamed from: u */
    public LinearLayout f121169u;

    /* renamed from: v */
    public int f121170v = 0;

    /* renamed from: w */
    public int f121171w = 0;

    /* renamed from: x */
    public int f121172x = 0;

    /* renamed from: y */
    public int f121173y = 0;

    /* renamed from: z */
    public boolean f121174z = false;

    /* renamed from: com.tencent.mm.ui.LauncherUITabView$a */
    public class C44684a implements View.OnClickListener {
        public C44684a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/LauncherUITabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int intValue = ((Integer) view.getTag()).intValue();
            if (LauncherUITabView.this.f121166r == intValue && intValue == 0 && System.currentTimeMillis() - LauncherUITabView.this.f121165q <= 300) {
                Log.m105926v("MicroMsg.LauncherUITabView", "onMainTabDoubleClick");
                LauncherUITabView.this.f121168t.removeMessages(0);
                ((C77724a) MvvmEventCenter.getEvent(C77724a.class)).publish(0);
                LauncherUITabView.this.f121165q = System.currentTimeMillis();
                LauncherUITabView.this.f121166r = intValue;
                C117292a.m165361g(this, "com/tencent/mm/ui/LauncherUITabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            LauncherUITabView launcherUITabView = LauncherUITabView.this;
            if (launcherUITabView.f121160i != null) {
                if (intValue == 0 && launcherUITabView.f121166r == 0) {
                    launcherUITabView.f121168t.sendEmptyMessageDelayed(0, 300);
                } else {
                    launcherUITabView.f121165q = System.currentTimeMillis();
                    LauncherUITabView launcherUITabView2 = LauncherUITabView.this;
                    launcherUITabView2.f121166r = intValue;
                    launcherUITabView2.f121160i.onTabClick(intValue);
                    C117292a.m165361g(this, "com/tencent/mm/ui/LauncherUITabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            LauncherUITabView.this.f121165q = System.currentTimeMillis();
            LauncherUITabView.this.f121166r = intValue;
            Log.m105929w("MicroMsg.LauncherUITabView", "on tab click, index %d, but listener is null", (Integer) view.getTag());
            C117292a.m165361g(this, "com/tencent/mm/ui/LauncherUITabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.LauncherUITabView$b */
    public class C44685b extends MMHandler {
        public C44685b() {
        }

        public void handleMessage(Message message) {
            Log.m105926v("MicroMsg.LauncherUITabView", "onMainTabClick");
            LauncherUITabView.this.f121160i.onTabClick(0);
        }
    }

    /* renamed from: com.tencent.mm.ui.LauncherUITabView$c */
    public class C44686c {

        /* renamed from: a */
        public MMTabView f121177a;

        public C44686c(LauncherUITabView launcherUITabView) {
        }
    }

    public LauncherUITabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo69854c();
    }

    /* renamed from: a */
    public void mo69852a(boolean z) {
        this.f121154A = z;
        this.f121164p.f121177a.f121184e.setVisibility(z ? 0 : 4);
    }

    /* renamed from: b */
    public C44686c mo69853b(int i, ViewGroup viewGroup) {
        C44686c cVar = new C44686c(this);
        MMTabView mMTabView = new MMTabView(getContext(), i);
        cVar.f121177a = mMTabView;
        mMTabView.setTag(Integer.valueOf(i));
        cVar.f121177a.setOnClickListener(this.f121167s);
        return cVar;
    }

    /* renamed from: c */
    public final void mo69854c() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f121169u = linearLayout;
        linearLayout.setBackgroundColor(getContext().getResources().getColor(C0966R.color.f2928b));
        this.f121169u.setId(2307141);
        this.f121169u.setOrientation(0);
        addView(this.f121169u, new RelativeLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(getContext());
        this.f121158g = imageView;
        imageView.setImageMatrix(this.f121159h);
        this.f121158g.setScaleType(ImageView.ScaleType.MATRIX);
        this.f121158g.setId(2307142);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C76577a.m92151b(getContext(), 3));
        layoutParams.addRule(8, 2307141);
        addView(this.f121158g, layoutParams);
        LinearLayout linearLayout2 = this.f121169u;
        C44686c b = mo69853b(0, linearLayout2);
        b.f121177a.setText((int) C0966R.string.glj);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(C0966R.dimen.arb));
        layoutParams2.weight = 1.0f;
        linearLayout2.addView(b.f121177a, layoutParams2);
        this.f121161j = b;
        LinearLayout linearLayout3 = this.f121169u;
        C44686c b2 = mo69853b(1, linearLayout3);
        b2.f121177a.setText((int) C0966R.string.glk);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(C0966R.dimen.arb));
        layoutParams3.weight = 1.0f;
        linearLayout3.addView(b2.f121177a, layoutParams3);
        this.f121162n = b2;
        LinearLayout linearLayout4 = this.f121169u;
        C44686c b3 = mo69853b(2, linearLayout4);
        b3.f121177a.setText((int) C0966R.string.gli);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(C0966R.dimen.arb));
        layoutParams4.weight = 1.0f;
        linearLayout4.addView(b3.f121177a, layoutParams4);
        this.f121163o = b3;
        LinearLayout linearLayout5 = this.f121169u;
        C44686c b4 = mo69853b(3, linearLayout5);
        b4.f121177a.setText((int) C0966R.string.gmk);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(C0966R.dimen.arb));
        layoutParams5.weight = 1.0f;
        linearLayout5.addView(b4.f121177a, layoutParams5);
        this.f121164p = b4;
    }

    public int getContactTabUnread() {
        return this.f121171w;
    }

    public int getCurIdx() {
        return this.f121156e;
    }

    public int getFriendTabUnread() {
        return this.f121172x;
    }

    public int getMainTabUnread() {
        return this.f121170v;
    }

    public boolean getSettingsPoint() {
        return this.f121154A;
    }

    public int getSettingsTabUnread() {
        return this.f121173y;
    }

    public boolean getShowFriendPoint() {
        return this.f121174z;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        Log.m105919d("MicroMsg.LauncherUITabView", "on layout, width %d", Integer.valueOf(i5));
        int i6 = i5 / 4;
        this.f121155d = i6;
        Bitmap bitmap = this.f121157f;
        if (bitmap == null || bitmap.getWidth() != i6) {
            Object[] objArr = new Object[2];
            Bitmap bitmap2 = this.f121157f;
            objArr[0] = Integer.valueOf(bitmap2 == null ? -1 : bitmap2.getWidth());
            objArr[1] = Integer.valueOf(i6);
            Log.m105929w("MicroMsg.LauncherUITabView", "sharp width changed, from %d to %d", objArr);
            this.f121157f = Bitmap.createBitmap(i6, C76577a.m92151b(getContext(), 3), Bitmap.Config.ARGB_8888);
            new Canvas(this.f121157f).drawColor(getResources().getColor(C0966R.color.akw));
            this.f121159h.setTranslate(((float) this.f121155d) * (((float) this.f121156e) + 0.0f), 0.0f);
            this.f121158g.setImageMatrix(this.f121159h);
            this.f121158g.setImageBitmap(this.f121157f);
        }
        setTo(this.f121156e);
    }

    public void setOnTabClickListener(C74809q.C45035a aVar) {
        this.f121160i = aVar;
    }

    public void setTo(int i) {
        this.f121156e = i;
        this.f121161j.f121177a.setTextColor(i == 0 ? getResources().getColor(C0966R.color.akw) : getContext().getResources().getColor(C0966R.color.FG_0));
        boolean z = false;
        this.f121161j.f121177a.setTag(C0966R.C0970id.f358507fj2, Boolean.valueOf(i == 0));
        this.f121162n.f121177a.setTextColor(i == 1 ? getResources().getColor(C0966R.color.akw) : getContext().getResources().getColor(C0966R.color.FG_0));
        this.f121162n.f121177a.setTag(C0966R.C0970id.f358507fj2, Boolean.valueOf(i == 1));
        this.f121163o.f121177a.setTextColor(i == 2 ? getResources().getColor(C0966R.color.akw) : getContext().getResources().getColor(C0966R.color.FG_0));
        this.f121163o.f121177a.setTag(C0966R.C0970id.f358507fj2, Boolean.valueOf(i == 2));
        this.f121164p.f121177a.setTextColor(i == 3 ? getResources().getColor(C0966R.color.akw) : getContext().getResources().getColor(C0966R.color.FG_0));
        MMTabView mMTabView = this.f121164p.f121177a;
        if (i == 3) {
            z = true;
        }
        mMTabView.setTag(C0966R.C0970id.f358507fj2, Boolean.valueOf(z));
        this.f121165q = System.currentTimeMillis();
        this.f121166r = this.f121156e;
    }

    public LauncherUITabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo69854c();
    }
}
