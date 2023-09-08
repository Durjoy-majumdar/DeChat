package qo3;

import al3.C0086a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74821t4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85975v4;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import sl3.C77727a;

/* renamed from: qo3.g */
public class C77398g extends Dialog {

    /* renamed from: A */
    public ViewGroup f225677A;

    /* renamed from: B */
    public LinearLayout f225678B;

    /* renamed from: C */
    public ViewGroup f225679C;

    /* renamed from: D */
    public View f225680D;

    /* renamed from: E */
    public boolean f225681E = false;

    /* renamed from: F */
    public boolean f225682F = false;

    /* renamed from: G */
    public Animation f225683G;

    /* renamed from: H */
    public Animation f225684H;

    /* renamed from: I */
    public Animation f225685I;

    /* renamed from: J */
    public Animation f225686J;

    /* renamed from: K */
    public C77402i.C63298d f225687K;

    /* renamed from: L */
    public DialogInterface.OnDismissListener f225688L;

    /* renamed from: M */
    public C77393e f225689M;

    /* renamed from: d */
    public Context f225690d;

    /* renamed from: e */
    public LinearLayout f225691e;

    /* renamed from: f */
    public LinearLayout f225692f;

    /* renamed from: g */
    public Button f225693g;

    /* renamed from: h */
    public Button f225694h;

    /* renamed from: i */
    public TextView f225695i;

    /* renamed from: j */
    public TextView f225696j;

    /* renamed from: n */
    public TextView f225697n;

    /* renamed from: o */
    public TextView f225698o;

    /* renamed from: p */
    public TextView f225699p;

    /* renamed from: q */
    public TextView f225700q;

    /* renamed from: r */
    public EditText f225701r;

    /* renamed from: s */
    public CheckBox f225702s;

    /* renamed from: t */
    public ImageView f225703t;

    /* renamed from: u */
    public ImageView f225704u;

    /* renamed from: v */
    public View f225705v;

    /* renamed from: w */
    public View f225706w;

    /* renamed from: x */
    public LinearLayout f225707x;

    /* renamed from: y */
    public ViewStub f225708y;

    /* renamed from: z */
    public LinearLayout f225709z;

    /* renamed from: qo3.g$a */
    public class C12909a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ DialogInterface.OnClickListener f36893d;

        /* renamed from: e */
        public final /* synthetic */ boolean f36894e;

        public C12909a(DialogInterface.OnClickListener onClickListener, boolean z) {
            this.f36893d = onClickListener;
            this.f36894e = z;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMAlertDialog$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            DialogInterface.OnClickListener onClickListener = this.f36893d;
            if (onClickListener != null) {
                onClickListener.onClick(C77398g.this, -1);
            }
            if (this.f36894e) {
                C77398g.this.dismiss();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMAlertDialog$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qo3.g$b */
    public class C12910b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ DialogInterface.OnClickListener f36896d;

        /* renamed from: e */
        public final /* synthetic */ boolean f36897e;

        public C12910b(DialogInterface.OnClickListener onClickListener, boolean z) {
            this.f36896d = onClickListener;
            this.f36897e = z;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMAlertDialog$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            DialogInterface.OnClickListener onClickListener = this.f36896d;
            if (onClickListener != null) {
                onClickListener.onClick(C77398g.this, -2);
            }
            if (this.f36897e) {
                C77398g.this.cancel();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMAlertDialog$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qo3.g$c */
    public class C12911c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77389a f36899d;

        public C12911c(C77389a aVar) {
            this.f36899d = aVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMAlertDialog$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            DialogInterface.OnClickListener onClickListener = this.f36899d.f225624G;
            if (onClickListener != null) {
                onClickListener.onClick(C77398g.this, -1);
            }
            C77398g.this.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMAlertDialog$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qo3.g$d */
    public class C12912d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77389a f36901d;

        public C12912d(C77389a aVar) {
            this.f36901d = aVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMAlertDialog$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            DialogInterface.OnClickListener onClickListener = this.f36901d.f225625H;
            if (onClickListener != null) {
                onClickListener.onClick(C77398g.this, -2);
            }
            C77398g.this.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMAlertDialog$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qo3.g$e */
    public class C12913e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77389a f36903d;

        public C12913e(C77389a aVar) {
            this.f36903d = aVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMAlertDialog$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            DialogInterface.OnClickListener onClickListener = this.f36903d.f225626I;
            if (onClickListener != null) {
                onClickListener.onClick(C77398g.this, -3);
            }
            C77398g.this.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMAlertDialog$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qo3.g$f */
    public class C77399f implements Runnable {
        public C77399f() {
        }

        public void run() {
            C77398g.this.dismiss();
        }
    }

    /* renamed from: qo3.g$g */
    public class C77400g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77402i.C77404b f225711d;

        public C77400g(C77398g gVar, C77402i.C77404b bVar) {
            this.f225711d = bVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMAlertDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C77402i.C77404b bVar = this.f225711d;
            if (bVar != null) {
                bVar.mo25a();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMAlertDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qo3.g$h */
    public class C77401h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77402i.C77404b f225712d;

        public C77401h(C77398g gVar, C77402i.C77404b bVar) {
            this.f225712d = bVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMAlertDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C77402i.C77404b bVar = this.f225712d;
            if (bVar != null) {
                bVar.mo25a();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMAlertDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qo3.g$i */
    public static class C77402i {

        /* renamed from: a */
        public Context f225713a;

        /* renamed from: b */
        public C77389a f225714b = new C77389a();

        /* renamed from: qo3.g$i$c */
        public interface C63297c {
            /* renamed from: a */
            void mo88205a(boolean z);
        }

        /* renamed from: qo3.g$i$d */
        public interface C63298d {
            /* renamed from: a */
            CharSequence mo88206a(Context context, CharSequence charSequence, float f);
        }

        /* renamed from: qo3.g$i$a */
        public interface C77403a {
            /* renamed from: a */
            void mo90277a(ImageView imageView, String str);
        }

        /* renamed from: qo3.g$i$b */
        public interface C77404b {
            /* renamed from: a */
            void mo25a();
        }

        public C77402i(Context context) {
            this.f225713a = context;
        }

        /* renamed from: a */
        public C77398g mo107548a() {
            C77398g gVar = new C77398g(this.f225713a, C0966R.style.a66);
            gVar.mo107525e(this.f225714b);
            return gVar;
        }

        /* renamed from: b */
        public C77402i mo107549b(String str, CharSequence charSequence, Boolean bool, C63297c cVar, C77403a aVar) {
            C77389a aVar2 = this.f225714b;
            aVar2.f225650g = str;
            aVar2.f225651h = charSequence;
            aVar2.f225652i = bool.booleanValue();
            C77389a aVar3 = this.f225714b;
            aVar3.f225653j = cVar;
            aVar3.f225654k = aVar;
            return this;
        }

        /* renamed from: c */
        public C77402i mo107550c(int i) {
            this.f225714b.f225660q = C0086a.m38a(this.f225713a).getString(i);
            return this;
        }

        /* renamed from: d */
        public C77402i mo107551d(int i) {
            this.f225714b.f225664u = C0086a.m38a(this.f225713a).getString(i);
            return this;
        }

        /* renamed from: e */
        public C77402i mo107552e(int i) {
            this.f225714b.f225663t = C0086a.m38a(this.f225713a).getString(i);
            return this;
        }

        /* renamed from: f */
        public C77402i mo107553f(int i) {
            this.f225714b.f225644a = C0086a.m38a(this.f225713a).getString(i);
            return this;
        }
    }

    public C77398g(Context context) {
        super(context, C0966R.style.a66);
        this.f225690d = context;
        m93307h(context);
    }

    /* renamed from: a */
    public static void m93304a(C77398g gVar, Animation animation) {
        LinearLayout linearLayout = gVar.f225709z;
        if (linearLayout != null) {
            linearLayout.startAnimation(animation);
        }
        LinearLayout linearLayout2 = gVar.f225678B;
        if (linearLayout2 != null) {
            linearLayout2.startAnimation(animation);
        }
        TextView textView = gVar.f225700q;
        if (textView != null && gVar.f225681E) {
            textView.startAnimation(animation);
        }
        EditText editText = gVar.f225701r;
        if (editText == null) {
            return;
        }
        if (!gVar.f225682F) {
            editText.setVisibility(8);
        } else {
            editText.startAnimation(animation);
        }
    }

    /* renamed from: d */
    public static void m93306d(C77398g gVar, C77389a aVar) {
        View inflate = View.inflate(gVar.f225690d, C0966R.C0971layout.f7037vq, (ViewGroup) null);
        gVar.f225694h = (Button) inflate.findViewById(C0966R.C0970id.gui);
        Button button = (Button) inflate.findViewById(C0966R.C0970id.guw);
        gVar.f225693g = button;
        button.setVisibility(0);
        gVar.f225693g.setText(aVar.f225663t);
        int i = aVar.f225638U;
        if (i != 0) {
            gVar.f225693g.setTextColor(i);
        }
        gVar.f225693g.setOnClickListener(new C12917l(gVar, aVar));
        gVar.f225694h.setVisibility(0);
        gVar.f225694h.setText(aVar.f225664u);
        int i2 = aVar.f225637T;
        if (i2 != 0) {
            gVar.f225694h.setTextColor(i2);
        }
        gVar.f225694h.setOnClickListener(new C12920m(gVar, aVar));
        gVar.m93309q(inflate, new LinearLayout.LayoutParams(-1, -1));
    }

    /* renamed from: h */
    private void m93307h(Context context) {
        LinearLayout linearLayout = (LinearLayout) View.inflate(this.f225690d, C0966R.C0971layout.bbu, (ViewGroup) null);
        this.f225691e = linearLayout;
        this.f225692f = (LinearLayout) linearLayout.findViewById(C0966R.C0970id.f5779oe);
        this.f225693g = (Button) this.f225691e.findViewById(C0966R.C0970id.guw);
        this.f225694h = (Button) this.f225691e.findViewById(C0966R.C0970id.gui);
        this.f225695i = (TextView) this.f225691e.findViewById(C0966R.C0970id.gux);
        this.f225696j = (TextView) this.f225691e.findViewById(C0966R.C0970id.guz);
        this.f225697n = (TextView) this.f225691e.findViewById(C0966R.C0970id.guo);
        this.f225698o = (TextView) this.f225691e.findViewById(C0966R.C0970id.guu);
        this.f225699p = (TextView) this.f225691e.findViewById(C0966R.C0970id.gut);
        this.f225700q = (TextView) this.f225691e.findViewById(C0966R.C0970id.blg);
        this.f225701r = (EditText) this.f225691e.findViewById(C0966R.C0970id.blm);
        this.f225702s = (CheckBox) this.f225691e.findViewById(C0966R.C0970id.bla);
        this.f225703t = (ImageView) this.f225691e.findViewById(C0966R.C0970id.gus);
        this.f225704u = (ImageView) this.f225691e.findViewById(C0966R.C0970id.c7p);
        this.f225707x = (LinearLayout) this.f225691e.findViewById(C0966R.C0970id.guy);
        this.f225708y = (ViewStub) this.f225691e.findViewById(C0966R.C0970id.koy);
        this.f225709z = (LinearLayout) this.f225691e.findViewById(C0966R.C0970id.guq);
        this.f225677A = (ViewGroup) this.f225691e.findViewById(C0966R.C0970id.guc);
        this.f225680D = this.f225691e.findViewById(C0966R.C0970id.guh);
        this.f225678B = (LinearLayout) this.f225691e.findViewById(C0966R.C0970id.guk);
        this.f225679C = (ViewGroup) this.f225691e.findViewById(C0966R.C0970id.kox);
        setCanceledOnTouchOutside(true);
        this.f225683G = AnimationUtils.loadAnimation(this.f225690d, C0966R.C0968anim.f2328p);
        this.f225684H = AnimationUtils.loadAnimation(this.f225690d, C0966R.C0968anim.f2328p);
        this.f225685I = AnimationUtils.loadAnimation(this.f225690d, C0966R.C0968anim.f2329q);
        this.f225686J = AnimationUtils.loadAnimation(this.f225690d, C0966R.C0968anim.f2329q);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m93308o(int i) {
        LinearLayout linearLayout = this.f225709z;
        if (linearLayout != null) {
            linearLayout.setVisibility(i);
        }
        LinearLayout linearLayout2 = this.f225678B;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(i);
        }
        TextView textView = this.f225700q;
        if (textView != null && this.f225681E) {
            textView.setVisibility(i);
        }
        EditText editText = this.f225701r;
        if (editText == null) {
            return;
        }
        if (!this.f225682F) {
            editText.setVisibility(8);
        } else {
            editText.setVisibility(i);
        }
    }

    /* renamed from: q */
    private void m93309q(View view, ViewGroup.LayoutParams layoutParams) {
        View view2 = this.f225680D;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/widget/dialog/MMAlertDialog", "setCustomBottomView", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/widget/dialog/MMAlertDialog", "setCustomBottomView", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f225677A.removeAllViews();
        this.f225677A.addView(view, layoutParams);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dismiss() {
        /*
            r5 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 0
            java.lang.String r3 = "MicroMsg.MMAlertDialog"
            if (r0 == r1) goto L_0x0026
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            qo3.g$f r1 = new qo3.g$f
            r1.<init>()
            r0.post(r1)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "dialog dismiss error!"
            com.tencent.p014mm.p136ui.C85975v4.m106305b(r3, r1, r0)
            return
        L_0x0026:
            android.content.Context r0 = r5.f225690d     // Catch:{ Exception -> 0x003e }
            if (r0 == 0) goto L_0x003a
            boolean r1 = r0 instanceof android.app.Activity     // Catch:{ Exception -> 0x003e }
            if (r1 == 0) goto L_0x003a
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ Exception -> 0x003e }
            boolean r0 = r0.isFinishing()     // Catch:{ Exception -> 0x003e }
            if (r0 != 0) goto L_0x0059
            super.dismiss()     // Catch:{ Exception -> 0x003e }
            goto L_0x0059
        L_0x003a:
            super.dismiss()     // Catch:{ Exception -> 0x003e }
            goto L_0x0059
        L_0x003e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "dismiss exception, e = "
            r1.append(r4)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.tencent.p014mm.p136ui.C85975v4.m106305b(r3, r0, r1)
        L_0x0059:
            qo3.e r0 = r5.f225689M
            if (r0 == 0) goto L_0x0060
            r0.onDialogDismiss(r5)
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qo3.C77398g.dismiss():void");
    }

    /* renamed from: e */
    public void mo107525e(C77389a aVar) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        View findViewById;
        Button button;
        Button button2;
        int i;
        int i2;
        Bitmap bitmap;
        int i3;
        int i4;
        LinearLayout linearLayout3;
        CharSequence charSequence;
        LinearLayout linearLayout4;
        C77389a aVar2 = aVar;
        CharSequence charSequence2 = aVar2.f225644a;
        if (charSequence2 != null && charSequence2.length() > 0) {
            int i5 = aVar2.f225634Q;
            TextView textView = this.f225695i;
            if (textView != null) {
                textView.setGravity(i5);
            }
            setTitle(aVar2.f225644a);
        }
        CharSequence charSequence3 = aVar2.f225645b;
        if (charSequence3 != null && charSequence3.length() > 0) {
            CharSequence charSequence4 = aVar2.f225645b;
            this.f225707x.setVisibility(0);
            this.f225696j.setVisibility(0);
            C77402i.C63298d dVar = this.f225687K;
            if (dVar != null) {
                charSequence4 = dVar.mo88206a(this.f225690d, charSequence4.toString(), this.f225695i.getTextSize());
            }
            this.f225696j.setText(charSequence4);
        }
        int i6 = aVar2.f225630M;
        if (i6 != 0) {
            this.f225695i.setTextColor(ColorStateList.valueOf(i6));
        }
        int i7 = aVar2.f225631N;
        if (i7 != 0) {
            this.f225695i.setMaxLines(i7);
        }
        int i8 = aVar2.f225632O;
        if (i8 != 0) {
            this.f225697n.setMaxLines(i8);
        }
        View view = aVar2.f225627J;
        if (view != null) {
            mo107544z(view, -1);
        }
        View view2 = aVar2.f225628K;
        if (view2 != null) {
            this.f225707x.setVisibility(0);
            this.f225708y.setLayoutResource(C0966R.C0971layout.f7038vr);
            try {
                linearLayout4 = (LinearLayout) this.f225708y.inflate();
            } catch (Exception unused) {
                this.f225708y.setVisibility(0);
                linearLayout4 = null;
            }
            linearLayout4.addView(view2);
        }
        View view3 = aVar2.f225629L;
        if (view3 != null) {
            this.f225706w = view3;
            this.f225709z.setVisibility(8);
            this.f225700q.setVisibility(8);
            this.f225701r.setVisibility(8);
            this.f225679C.removeAllViews();
            this.f225679C.addView(this.f225706w, new LinearLayout.LayoutParams(-1, -1));
            this.f225679C.setVisibility(8);
        }
        CharSequence charSequence5 = aVar2.f225660q;
        if (charSequence5 != null && ((String) charSequence5).length() > 0) {
            mo107533r(aVar2.f225660q);
        }
        if (aVar2.f225618A) {
            int a = C74942w4.m89784a(this.f225690d, 8);
            this.f225709z.setVisibility(0);
            this.f225709z.setPadding(a, a, a, a);
        }
        String str = aVar2.f225659p;
        if (str != null) {
            int a2 = C74942w4.m89784a(this.f225690d, 120);
            this.f225709z.setVisibility(0);
            this.f225703t.setVisibility(0);
            ImageView imageView = this.f225703t;
            if (imageView instanceof C77727a) {
                ((C77727a) imageView).mo100287a(str, a2, a2);
            }
            int i9 = aVar2.f225636S;
            this.f225709z.setVisibility(i9);
            this.f225703t.setVisibility(i9);
        }
        CharSequence charSequence6 = aVar2.f225660q;
        if (charSequence6 != null && ((String) charSequence6).length() > 0) {
            mo107533r(aVar2.f225660q);
        }
        CharSequence charSequence7 = aVar2.f225661r;
        if (charSequence7 != null && charSequence7.length() > 0) {
            CharSequence charSequence8 = aVar2.f225661r;
            this.f225709z.setVisibility(0);
            this.f225698o.setVisibility(0);
            this.f225698o.setMaxLines(2);
            this.f225698o.setText(charSequence8);
        }
        CharSequence charSequence9 = aVar2.f225662s;
        if (!(charSequence9 == null || ((String) charSequence9).length() <= 0 || (charSequence = aVar2.f225662s) == null)) {
            this.f225709z.setVisibility(0);
            this.f225699p.setVisibility(0);
            C77402i.C63298d dVar2 = this.f225687K;
            if (dVar2 != null) {
                charSequence = dVar2.mo88206a(this.f225699p.getContext(), (String) charSequence, this.f225699p.getTextSize());
            }
            this.f225699p.setText(charSequence);
        }
        Bitmap bitmap2 = aVar2.f225657n;
        if (bitmap2 != null && this.f225705v == null) {
            this.f225709z.setVisibility(0);
            this.f225703t.setVisibility(0);
            this.f225703t.setImageBitmap(bitmap2);
        }
        String str2 = aVar2.f225650g;
        if (!(str2 == null && aVar2.f225651h == null)) {
            CharSequence charSequence10 = aVar2.f225651h;
            Boolean valueOf = Boolean.valueOf(aVar2.f225652i);
            C77402i.C63297c cVar = aVar2.f225653j;
            C77402i.C77403a aVar3 = aVar2.f225654k;
            this.f225708y.setLayoutResource(C0966R.C0971layout.f7047w2);
            try {
                linearLayout3 = (LinearLayout) this.f225708y.inflate();
            } catch (Exception unused2) {
                this.f225708y.setVisibility(0);
                linearLayout3 = null;
            }
            if (!(linearLayout3 == null || str2 == null)) {
                ImageView imageView2 = (ImageView) linearLayout3.findViewById(C0966R.C0970id.kon);
                imageView2.setVisibility(0);
                imageView2.setImportantForAccessibility(2);
                if (aVar3 != null) {
                    aVar3.mo90277a(imageView2, str2);
                }
            }
            if (!(linearLayout3 == null || charSequence10 == null)) {
                TextView textView2 = (TextView) linearLayout3.findViewById(C0966R.C0970id.kpi);
                textView2.setVisibility(0);
                C77402i.C63298d dVar3 = this.f225687K;
                if (dVar3 != null) {
                    charSequence10 = dVar3.mo88206a(this.f225690d, charSequence10.toString(), this.f225695i.getTextSize());
                }
                textView2.setText(charSequence10);
            }
            if (valueOf.booleanValue() && linearLayout3 != null) {
                ImageView imageView3 = (ImageView) linearLayout3.findViewById(C0966R.C0970id.f5_);
                imageView3.setVisibility(0);
                m93308o(0);
                linearLayout3.setOnClickListener(new C77395f(this, cVar, imageView3));
            }
        }
        C77402i.C77404b bVar = aVar2.f225655l;
        if (bVar != null) {
            mo107531n(bVar);
        }
        Bitmap bitmap3 = aVar2.f225658o;
        if (bitmap3 != null && !bitmap3.isRecycled()) {
            Bitmap bitmap4 = aVar2.f225658o;
            boolean z = aVar2.f225619B;
            int i15 = aVar2.f225635R;
            if (bitmap4 != null) {
                this.f225709z.setVisibility(0);
                this.f225709z.setGravity(1);
                this.f225709z.setPadding(0, 0, 0, 0);
                View inflate = View.inflate(this.f225690d, C0966R.C0971layout.f7040vv, (ViewGroup) null);
                ImageView imageView4 = (ImageView) inflate.findViewById(C0966R.C0970id.gus);
                if (z) {
                    float height = ((float) bitmap4.getHeight()) / ((float) bitmap4.getWidth());
                    int c = C74942w4.m89786c(this.f225690d, C0966R.dimen.f3687bg);
                    int c2 = C74942w4.m89786c(this.f225690d, C0966R.dimen.f3686bf);
                    if (height <= 0.0f || ((double) height) >= 0.5d) {
                        if (((double) height) >= 0.5d && height < 1.0f) {
                            i4 = (int) (((float) c2) * height);
                            i3 = i4;
                        } else if (height >= 1.0f && height < 2.0f) {
                            i2 = (int) (((float) c2) / height);
                            i = c2;
                            c = i;
                            c2 = i2;
                        } else if (height >= 2.0f) {
                            i4 = (int) (((float) c) * height);
                            int i16 = c;
                            i3 = c2;
                            c2 = i16;
                        } else {
                            c2 = 0;
                            i2 = 0;
                            i = 0;
                            c = 0;
                        }
                        i = i3;
                        c = i4;
                        i2 = c2;
                    } else {
                        i2 = (int) (((float) c) / height);
                        i = c;
                    }
                    if (c <= 0 || i2 <= 0) {
                        bitmap = null;
                    } else {
                        bitmap = Bitmap.createScaledBitmap(bitmap4, i2, c, true);
                        imageView4.setLayoutParams(new FrameLayout.LayoutParams(c2, i));
                    }
                    bitmap4 = C74821t4.m89550a(bitmap, true, (float) C74942w4.m89784a(this.f225690d, 3), false);
                }
                imageView4.setImageBitmap(bitmap4);
                ImageView imageView5 = (ImageView) inflate.findViewById(C0966R.C0970id.f59);
                if (i15 == 0) {
                    imageView5.setVisibility(8);
                } else {
                    imageView5.setVisibility(0);
                    if (i15 == 1) {
                        imageView5.setImageResource(C0966R.raw.sight_icon_in_gird);
                    } else if (i15 == 2) {
                        imageView5.setImageResource(C0966R.raw.video_icon_in_gird);
                    }
                }
                mo107544z(inflate, -2);
            }
        }
        CharSequence charSequence11 = aVar2.f225646c;
        if (charSequence11 != null && ((String) charSequence11).length() > 0) {
            CharSequence charSequence12 = aVar2.f225646c;
            if (charSequence12 != null) {
                this.f225700q.setVisibility(0);
                this.f225700q.setText(charSequence12);
            }
            this.f225681E = true;
            int i17 = aVar2.f225633P;
            TextView textView3 = this.f225700q;
            if (textView3 != null) {
                textView3.setGravity(i17);
            }
        }
        CharSequence charSequence13 = aVar2.f225647d;
        if (charSequence13 != null && ((String) charSequence13).length() > 0) {
            CharSequence charSequence14 = aVar2.f225647d;
            this.f225701r.setVisibility(0);
            this.f225701r.setHint(charSequence14);
        }
        CharSequence charSequence15 = aVar2.f225648e;
        if (charSequence15 != null && ((String) charSequence15).length() > 0) {
            CharSequence charSequence16 = aVar2.f225648e;
            this.f225702s.setVisibility(0);
            this.f225702s.setText(charSequence16);
        }
        boolean z2 = aVar2.f225649f;
        if (z2) {
            this.f225682F = z2;
            if (z2) {
                this.f225701r.setVisibility(0);
            } else {
                this.f225701r.setVisibility(8);
            }
        }
        CharSequence charSequence17 = aVar2.f225663t;
        if (!(charSequence17 == null || ((String) charSequence17).length() <= 0 || (button2 = this.f225693g) == null)) {
            button2.setVisibility(0);
            this.f225693g.setText(aVar2.f225663t);
            this.f225693g.post(new C77405h(this, aVar2));
            this.f225693g.setOnClickListener(new C12915i(this, aVar2));
        }
        CharSequence charSequence18 = aVar2.f225664u;
        if (!(charSequence18 == null || ((String) charSequence18).length() <= 0 || (button = this.f225694h) == null)) {
            button.setVisibility(0);
            this.f225694h.setText(aVar2.f225664u);
            this.f225694h.post(new C77406j(this, aVar2));
            this.f225694h.setOnClickListener(new C12916k(this, aVar2));
        }
        int i18 = aVar2.f225638U;
        if (i18 != 0) {
            mo107543y(i18);
        }
        int i19 = aVar2.f225637T;
        if (i19 != 0) {
            mo107540u(i19);
        }
        DialogInterface.OnCancelListener onCancelListener = aVar2.f225622E;
        if (onCancelListener != null) {
            setOnCancelListener(onCancelListener);
        }
        DialogInterface.OnDismissListener onDismissListener = aVar2.f225623F;
        if (onDismissListener != null) {
            this.f225688L = onDismissListener;
            setOnDismissListener(onDismissListener);
        }
        C77402i.C63298d dVar4 = aVar2.f225656m;
        if (dVar4 != null) {
            this.f225687K = dVar4;
        }
        setCancelable(aVar2.f225668y);
        if (!aVar2.f225668y) {
            super.setCancelable(aVar2.f225669z);
        }
        if (!(aVar2.f225665v == null && aVar2.f225666w == null && aVar2.f225667x == null)) {
            View inflate2 = View.inflate(this.f225690d, C0966R.C0971layout.f7046w1, (ViewGroup) null);
            Button button3 = (Button) inflate2.findViewById(C0966R.C0970id.gue);
            Button button4 = (Button) inflate2.findViewById(C0966R.C0970id.guf);
            Button button5 = (Button) inflate2.findViewById(C0966R.C0970id.gug);
            if (aVar2.f225665v != null) {
                button3.setVisibility(0);
                button3.setText(aVar2.f225665v);
                button3.setOnClickListener(new C12911c(aVar2));
            }
            if (aVar2.f225666w != null) {
                button4.setVisibility(0);
                button4.setText(aVar2.f225666w);
                button4.setOnClickListener(new C12912d(aVar2));
            }
            if (aVar2.f225667x != null) {
                button5.setVisibility(0);
                button5.setText(aVar2.f225667x);
                button5.setOnClickListener(new C12913e(aVar2));
            }
            m93309q(inflate2, new LinearLayout.LayoutParams(-1, -1));
        }
        if (aVar2.f225642Y) {
            LinearLayout linearLayout5 = this.f225692f;
            if (linearLayout5 != null) {
                linearLayout5.setBackgroundResource(C0966R.C0969drawable.f4900qq);
            }
            int color = this.f225690d.getResources().getColor(C0966R.color.BW_100_Alpha_0_8);
            TextView textView4 = this.f225697n;
            if (textView4 != null) {
                textView4.setTextColor(color);
            }
            mo107540u(this.f225690d.getResources().getColor(C0966R.color.BW_100_Alpha_0_6));
            ImageView imageView6 = this.f225704u;
            if (imageView6 != null) {
                imageView6.setBackgroundColor(this.f225690d.getResources().getColor(C0966R.color.BW_100_Alpha_0_0_5));
            }
            ViewGroup viewGroup = this.f225677A;
            if (viewGroup != null) {
                viewGroup.setBackgroundResource(C0966R.C0969drawable.ayt);
            }
        }
        if (aVar2.f225643Z && (findViewById = this.f225691e.findViewById(C0966R.C0970id.o4_)) != null) {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view4 = findViewById;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/ui/widget/dialog/MMAlertDialog", "apply", "(Lcom/tencent/mm/ui/widget/dialog/AlertParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/widget/dialog/MMAlertDialog", "apply", "(Lcom/tencent/mm/ui/widget/dialog/AlertParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!(aVar2.f225639V == Integer.MAX_VALUE || (linearLayout2 = (LinearLayout) this.f225691e.findViewById(C0966R.C0970id.guc)) == null)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.setMargins(layoutParams.leftMargin, aVar2.f225639V, layoutParams.rightMargin, layoutParams.bottomMargin);
            } else {
                layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(0, aVar2.f225639V, 0, 0);
            }
            linearLayout2.setLayoutParams(layoutParams);
        }
        if (aVar2.f225640W != Integer.MAX_VALUE && (linearLayout = (LinearLayout) this.f225691e.findViewById(C0966R.C0970id.guy)) != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.setMargins(layoutParams2.leftMargin, aVar2.f225640W, layoutParams2.rightMargin, layoutParams2.bottomMargin);
            } else {
                layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(0, aVar2.f225640W, 0, 0);
            }
            linearLayout.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: f */
    public Button mo107526f(int i) {
        if (i == -2) {
            return this.f225694h;
        }
        if (i != -1) {
            return null;
        }
        return this.f225693g;
    }

    /* renamed from: g */
    public String mo107527g() {
        EditText editText = this.f225701r;
        if (editText == null) {
            return null;
        }
        return editText.getText().toString();
    }

    public View getContentView() {
        return this.f225691e;
    }

    /* renamed from: i */
    public void mo107529i(int i, boolean z) {
        if (i != -2) {
            if (i == -1) {
                if (z) {
                    this.f225693g.setVisibility(0);
                } else {
                    this.f225693g.setVisibility(8);
                }
            }
        } else if (z) {
            this.f225694h.setVisibility(0);
        } else {
            this.f225694h.setVisibility(8);
        }
    }

    /* renamed from: l */
    public void mo107530l(boolean z) {
        super.setCancelable(z);
    }

    /* renamed from: n */
    public void mo107531n(C77402i.C77404b bVar) {
        LinearLayout linearLayout = this.f225709z;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            LinearLayout linearLayout2 = this.f225678B;
            if (linearLayout2 != null) {
                linearLayout2.setOnClickListener(new C77401h(this, bVar));
                return;
            }
            return;
        }
        this.f225709z.setOnClickListener(new C77400g(this, bVar));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f225691e);
    }

    /* renamed from: r */
    public void mo107533r(CharSequence charSequence) {
        this.f225709z.setVisibility(0);
        this.f225697n.setVisibility(0);
        C77402i.C63298d dVar = this.f225687K;
        if (dVar != null) {
            charSequence = dVar.mo88206a(this.f225697n.getContext(), charSequence.toString(), this.f225697n.getTextSize());
        }
        this.f225697n.setText(charSequence);
    }

    /* renamed from: s */
    public void mo107534s(int i, DialogInterface.OnClickListener onClickListener) {
        mo107539t(C0086a.m38a(this.f225690d).getString(i), true, onClickListener);
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        setCanceledOnTouchOutside(z);
    }

    public void setTitle(CharSequence charSequence) {
        this.f225707x.setVisibility(0);
        this.f225695i.setVisibility(0);
        C77402i.C63298d dVar = this.f225687K;
        if (dVar != null) {
            charSequence = dVar.mo88206a(this.f225690d, charSequence.toString(), this.f225695i.getTextSize());
        }
        this.f225695i.setMaxLines(2);
        this.f225695i.setText(charSequence);
        this.f225695i.getPaint().setFakeBoldText(true);
        int color = this.f225690d.getResources().getColor(C0966R.color.FG_1);
        TextView textView = this.f225697n;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public void show() {
        try {
            super.show();
        } catch (Exception e) {
            C85975v4.m106307d("MicroMsg.MMAlertDialog", e, "", new Object[0]);
        }
    }

    /* renamed from: t */
    public void mo107539t(CharSequence charSequence, boolean z, DialogInterface.OnClickListener onClickListener) {
        Button button = this.f225694h;
        if (button != null) {
            button.setVisibility(0);
            this.f225694h.setText(charSequence);
            this.f225694h.setOnClickListener(new C12910b(onClickListener, z));
        }
    }

    /* renamed from: u */
    public void mo107540u(int i) {
        this.f225694h.setTextColor(i);
    }

    /* renamed from: v */
    public void mo107541v(int i, DialogInterface.OnClickListener onClickListener) {
        mo107542x(C0086a.m38a(this.f225690d).getString(i), true, onClickListener);
    }

    /* renamed from: x */
    public void mo107542x(CharSequence charSequence, boolean z, DialogInterface.OnClickListener onClickListener) {
        Button button = this.f225693g;
        if (button != null) {
            button.setVisibility(0);
            this.f225693g.setText(charSequence);
            this.f225693g.setOnClickListener(new C12909a(onClickListener, z));
        }
    }

    /* renamed from: y */
    public void mo107543y(int i) {
        this.f225693g.setTextColor(i);
    }

    /* renamed from: z */
    public void mo107544z(View view, int i) {
        this.f225705v = view;
        if (view != null) {
            this.f225709z.setVisibility(0);
            this.f225678B.setVisibility(0);
            this.f225678B.removeAllViews();
            this.f225678B.setGravity(1);
            this.f225678B.addView(this.f225705v, new LinearLayout.LayoutParams(i, i));
        }
    }

    public C77398g(Context context, int i) {
        super(context, C0966R.style.a66);
        this.f225690d = context;
        m93307h(context);
    }

    public void setTitle(int i) {
        this.f225707x.setVisibility(0);
        this.f225695i.setVisibility(0);
        this.f225695i.setMaxLines(2);
        this.f225695i.setText(i);
        this.f225695i.getPaint().setFakeBoldText(true);
        int color = this.f225690d.getResources().getColor(C0966R.color.FG_1);
        TextView textView = this.f225697n;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }
}
