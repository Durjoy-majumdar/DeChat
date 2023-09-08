package com.tencent.p014mm.p136ui.widget.snackbar;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85975v4;
import com.tencent.p014mm.p136ui.widget.snackbar.SnackContainer;
import com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.ui.widget.snackbar.a */
public class C75018a {

    /* renamed from: a */
    public SnackContainer f220735a;

    /* renamed from: b */
    public View f220736b;

    /* renamed from: c */
    public C75024d f220737c;

    /* renamed from: d */
    public C75025e f220738d;

    /* renamed from: e */
    public Handler f220739e = new Handler();

    /* renamed from: f */
    public final View.OnClickListener f220740f = new C75019a();

    /* renamed from: com.tencent.mm.ui.widget.snackbar.a$a */
    public class C75019a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.ui.widget.snackbar.a$a$a */
        public class C75020a implements Runnable {
            public C75020a() {
            }

            public void run() {
                SnackContainer snackContainer = C75018a.this.f220735a;
                snackContainer.removeCallbacks(snackContainer.f220724f);
                ((SnackContainer.C75014a) snackContainer.f220724f).run();
            }
        }

        public C75019a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/snackbar/SnackBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C75018a aVar = C75018a.this;
            if (aVar.f220737c != null && (!aVar.f220735a.f220722d.isEmpty())) {
                C75018a.this.f220737c.mo7429a();
            }
            C75018a.this.f220739e.postDelayed(new C75020a(), 100);
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/snackbar/SnackBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.snackbar.a$b */
    public class C75021b implements View.OnTouchListener {

        /* renamed from: com.tencent.mm.ui.widget.snackbar.a$b$a */
        public class C75022a implements Runnable {
            public C75022a() {
            }

            public void run() {
                SnackContainer snackContainer = C75018a.this.f220735a;
                snackContainer.removeCallbacks(snackContainer.f220724f);
                ((SnackContainer.C75014a) snackContainer.f220724f).run();
            }
        }

        public C75021b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/snackbar/SnackBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (C75026b.f220750a && (!C75018a.this.f220735a.f220722d.isEmpty())) {
                C75026b.f220750a = false;
                C75018a.this.f220739e.postDelayed(new C75022a(), 100);
            }
            C117292a.m165362h(true, this, "com/tencent/mm/ui/widget/snackbar/SnackBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.snackbar.a$d */
    public interface C75024d {
        /* renamed from: a */
        void mo7429a();
    }

    /* renamed from: com.tencent.mm.ui.widget.snackbar.a$e */
    public interface C75025e {
        /* renamed from: a */
        void mo6958a();

        void onHide();

        void onShow();
    }

    public C75018a(Activity activity, int i) {
        View findViewById = activity.findViewById(16908290);
        LayoutInflater layoutInflater = (LayoutInflater) activity.getSystemService("layout_inflater");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        layoutInflater.inflate(C0966R.C0971layout.c0e, viewGroup);
        mo104594a(viewGroup, layoutInflater.inflate(C0966R.C0971layout.c0f, viewGroup, false), i, activity);
    }

    /* renamed from: a */
    public final void mo104594a(ViewGroup viewGroup, View view, int i, Context context) {
        if (viewGroup != null) {
            SnackContainer snackContainer = (SnackContainer) viewGroup.findViewById(C0966R.C0970id.f359226jo0);
            this.f220735a = snackContainer;
            if (snackContainer == null) {
                this.f220735a = new SnackContainer(viewGroup);
            }
            this.f220736b = view;
            if (i == 36) {
                this.f220735a.setOnTouchListener(new C75021b());
            }
            ((TextView) view.findViewById(C0966R.C0970id.jnz)).setOnClickListener(this.f220740f);
            boolean z = C75044y4.m89993e(context) > 0;
            int c = C75044y4.m89991c(context);
            C85975v4.m106306c("MicroMsg.SnackBar", "snackbar:isNavBarVisibility : %B,navBarHeightd:%d", Boolean.valueOf(z), Integer.valueOf(c));
            int i2 = ((Activity) context).getWindow().getAttributes().flags;
            boolean z2 = i2 == (134217728 | (-134217729 & i2));
            C85975v4.m106306c("MicroMsg.SnackBar", "snackbar:isNavBarTranslucent : %B", Boolean.valueOf(z2));
            if (z2 && z) {
                LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.jny);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
                marginLayoutParams.bottomMargin = c;
                linearLayout.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.snackbar.a$c */
    public static class C75023c {

        /* renamed from: a */
        public C75018a f220745a;

        /* renamed from: b */
        public Context f220746b;

        /* renamed from: c */
        public String f220747c;

        /* renamed from: d */
        public String f220748d;

        /* renamed from: e */
        public int f220749e = NetworkMonitorReceiver.MSG_DELAY_TIME;

        public C75023c(Activity activity) {
            this.f220746b = activity.getApplicationContext();
            this.f220745a = new C75018a(activity, 0);
        }

        /* renamed from: a */
        public C75018a mo104599a() {
            String str = this.f220747c;
            String str2 = this.f220748d;
            Snack snack = new Snack(str, str2 != null ? str2.toUpperCase() : null, 0, (Parcelable) null, this.f220749e, this.f220746b.getResources().getColor(C0966R.color.akw));
            C75018a aVar = this.f220745a;
            SnackContainer snackContainer = aVar.f220735a;
            if (snackContainer != null) {
                View view = aVar.f220736b;
                C75025e eVar = aVar.f220738d;
                if (!(view.getParent() == null || view.getParent() == snackContainer)) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                SnackContainer.C75017d dVar = new SnackContainer.C75017d(snack, view, eVar, (SnackContainer.C75014a) null);
                ((LinkedList) snackContainer.f220722d).offer(dVar);
                if (((LinkedList) snackContainer.f220722d).size() == 1) {
                    snackContainer.mo104586b(dVar, false);
                }
            }
            return this.f220745a;
        }

        public C75023c(Context context, View view) {
            this.f220746b = context;
            this.f220745a = new C75018a(context, view, 0);
        }
    }

    public C75018a(Context context, View view, int i) {
        if (view == null && (context instanceof Activity)) {
            view = ((Activity) context).findViewById(16908290);
        }
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        ViewGroup viewGroup = (ViewGroup) view;
        layoutInflater.inflate(C0966R.C0971layout.c0e, viewGroup);
        mo104594a(viewGroup, layoutInflater.inflate(C0966R.C0971layout.c0f, viewGroup, false), i, context);
    }
}
