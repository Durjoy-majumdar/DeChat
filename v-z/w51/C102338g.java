package w51;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emoji.model.C41051m;
import com.tencent.p014mm.sdk.platformtools.Util;
import w51.C102336f;
import x51.C102562g;

/* renamed from: w51.g */
public class C102338g extends C102336f {

    /* renamed from: q */
    public int f301423q = 0;

    /* renamed from: r */
    public int f301424r = 0;

    /* renamed from: s */
    public int f301425s = 0;

    /* renamed from: w51.g$a */
    public class C102339a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C102336f.C102337a f301426d;

        public C102339a(C102338g gVar, C102336f.C102337a aVar) {
            this.f301426d = aVar;
        }

        public void run() {
            this.f301426d.f301405y.setPressed(false);
        }
    }

    public C102338g(Context context) {
        super(context);
    }

    /* renamed from: b */
    public int mo141896b() {
        return this.f301425s;
    }

    /* renamed from: f */
    public int mo141897f() {
        return this.f301423q;
    }

    /* renamed from: g */
    public C102562g mo141906g(int i) {
        return super.getItem(i);
    }

    public int getCount() {
        return super.getCount();
    }

    public Object getItem(int i) {
        return super.getItem(i);
    }

    /* renamed from: h */
    public View mo141898h(int i, View view, ViewGroup viewGroup) {
        C102336f.C102337a aVar = (C102336f.C102337a) view.getTag();
        int i2 = this.f301423q;
        if (i2 <= 0) {
            int i3 = this.f301424r;
            if (i3 > 0) {
                if (i == 0) {
                    aVar.f301404x.setVisibility(0);
                    aVar.f301404x.setText(this.f301965d.getString(C0966R.string.c9_));
                } else if (i == i2 + i3) {
                    aVar.f301404x.setVisibility(0);
                    if (!Util.isNullOrNil(C41051m.m44498a().f110538f)) {
                        aVar.f301404x.setText(C41051m.m44498a().f110538f);
                    } else if (C41051m.m44498a().f110536d) {
                        aVar.f301404x.setText(C0966R.string.c99);
                    } else {
                        aVar.f301404x.setText(this.f301965d.getString(C0966R.string.c84));
                    }
                } else {
                    aVar.f301404x.setVisibility(8);
                }
            } else if (i == 0) {
                aVar.f301404x.setVisibility(0);
                if (!Util.isNullOrNil(C41051m.m44498a().f110538f)) {
                    aVar.f301404x.setText(C41051m.m44498a().f110538f);
                } else if (C41051m.m44498a().f110536d) {
                    aVar.f301404x.setText(C0966R.string.c99);
                } else {
                    aVar.f301404x.setText(this.f301965d.getString(C0966R.string.c84));
                }
            } else {
                aVar.f301404x.setVisibility(8);
            }
        } else if (i == 0) {
            aVar.f301404x.setVisibility(0);
            aVar.f301404x.setText(this.f301965d.getString(C0966R.string.c8o));
        } else {
            int i4 = this.f301424r;
            if (i4 > 0 && i == i2) {
                aVar.f301404x.setVisibility(0);
                aVar.f301404x.setText(this.f301965d.getString(C0966R.string.c9_));
            } else if (i == i2 + i4) {
                aVar.f301404x.setVisibility(0);
                if (!Util.isNullOrNil(C41051m.m44498a().f110538f)) {
                    aVar.f301404x.setText(C41051m.m44498a().f110538f);
                } else if (C41051m.m44498a().f110536d) {
                    aVar.f301404x.setText(C0966R.string.c99);
                } else {
                    aVar.f301404x.setText(this.f301965d.getString(C0966R.string.c84));
                }
            } else {
                aVar.f301404x.setVisibility(8);
            }
        }
        FrameLayout frameLayout = aVar.f301405y;
        if (frameLayout != null) {
            frameLayout.postDelayed(new C102339a(this, aVar), 100);
        }
        super.mo141898h(i, view, viewGroup);
        return view;
    }

    /* renamed from: i */
    public int mo141899i() {
        return this.f301424r;
    }

    /* renamed from: n */
    public void mo141901n(int i) {
        this.f301425s = i;
    }

    /* renamed from: o */
    public void mo141902o(int i) {
        this.f301423q = i;
    }

    /* renamed from: p */
    public void mo141903p(int i) {
        this.f301424r = i;
    }
}
