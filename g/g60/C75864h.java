package g60;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.C103422m;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import en3.C75628g;
import gy3.C87412m;
import xg3.C78804a;
import xg3.C78805b;

/* renamed from: g60.h */
public final class C75864h extends C103422m {

    /* renamed from: f */
    public Context f222504f;

    /* renamed from: g */
    public C75628g f222505g;

    /* renamed from: h */
    public View f222506h;

    /* renamed from: i */
    public final C75865a f222507i = new C75865a(this);

    /* renamed from: j */
    public boolean f222508j;

    /* renamed from: g60.h$a */
    public static final class C75865a implements C78805b {

        /* renamed from: a */
        public final /* synthetic */ C75864h f222509a;

        /* renamed from: g60.h$a$a */
        public static final class C75866a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C75864h f222510d;

            /* renamed from: e */
            public final /* synthetic */ View f222511e;

            /* renamed from: g60.h$a$a$a */
            public static final class C75867a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C75864h f222512d;

                /* renamed from: e */
                public final /* synthetic */ View f222513e;

                public C75867a(C75864h hVar, View view) {
                    this.f222512d = hVar;
                    this.f222513e = view;
                }

                public final void run() {
                    if (this.f222512d.isShowing()) {
                        this.f222512d.cancel();
                    }
                    this.f222513e.setTranslationY(0.0f);
                }
            }

            public C75866a(C75864h hVar, View view) {
                this.f222510d = hVar;
                this.f222511e = view;
            }

            public final void run() {
                new MMHandler().post(new C75867a(this.f222510d, this.f222511e));
            }
        }

        public C75865a(C75864h hVar) {
            this.f222509a = hVar;
        }

        /* renamed from: a */
        public void mo106139a(float f) {
        }

        /* renamed from: b */
        public void mo106140b() {
            C75864h hVar = this.f222509a;
            View view = hVar.f222506h;
            if (view != null) {
                view.setEnabled(false);
                long height = (long) (((((float) view.getHeight()) - view.getTranslationY()) / ((float) view.getHeight())) * ((float) 300));
                if (height < 0) {
                    height = 0;
                }
                view.animate().translationY((float) view.getHeight()).setDuration(height).withEndAction(new C75866a(hVar, view)).start();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75864h(Context context) {
        super(context, C0966R.style.f8426i2);
        C87412m.m108594g(context, "mContext");
        this.f222504f = context;
        mo143460C(1);
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        this.f222505g = new C75628g(context2);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
        boolean z = false;
        if (motionEvent.getActionMasked() == 0) {
            this.f222508j = false;
        }
        this.f222505g.mo105977b(motionEvent);
        C75628g gVar = this.f222505g;
        int i = gVar.f222179h;
        if (!(i == 1 || i == 2)) {
            z = gVar.mo105976a(motionEvent);
        }
        if (!z) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (!this.f222508j) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            super.dispatchTouchEvent(obtain);
            obtain.recycle();
            this.f222508j = true;
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setDimAmount(0.0f);
        }
    }

    public void setContentView(View view) {
        C87412m.m108594g(view, "view");
        Window window = getWindow();
        C87412m.m108591d(window);
        window.setGravity(80);
        window.setWindowAnimations(C0966R.style.f8365fv);
        boolean z = false;
        window.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.f222504f.getResources().getConfiguration().orientation == 2) {
            z = true;
        }
        if (z) {
            attributes.width = -2;
            attributes.height = -1;
        } else {
            attributes.width = -1;
            attributes.height = -2;
        }
        window.setAttributes(attributes);
        view.findViewById(C0966R.C0970id.fwi).setOnClickListener(new C8230i(this));
        super.setContentView(view);
        this.f222506h = view;
        C78804a aVar = new C78804a(view, this.f222507i);
        C75628g gVar = this.f222505g;
        gVar.getClass();
        gVar.f222182k.add(aVar);
        Window window2 = getWindow();
        C87412m.m108591d(window2);
        window2.setLayout(-1, -1);
    }
}
