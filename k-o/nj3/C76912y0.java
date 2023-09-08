package nj3;

import al3.C0086a;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import j20.C117292a;
import k20.C9556a;
import kg3.C76577a;
import kj2.C117407d;
import p206nj.C47264o;
import p206nj.C88956h;
import p385u2.C111105a;
import p910lj.C76701a;
import p918s2.C90111a;

/* renamed from: nj3.y0 */
public class C76912y0 extends Toast {

    /* renamed from: h */
    public static final /* synthetic */ int f224770h = 0;

    /* renamed from: a */
    public int f224771a;

    /* renamed from: b */
    public int f224772b;

    /* renamed from: c */
    public long f224773c;

    /* renamed from: d */
    public final Context f224774d;

    /* renamed from: e */
    public View f224775e;

    /* renamed from: f */
    public final TextView f224776f;

    /* renamed from: g */
    public final MTimerHandler f224777g = new MTimerHandler(new C61775g(), true);

    /* renamed from: nj3.y0$b */
    public class C11187b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f32991d;

        /* renamed from: e */
        public final /* synthetic */ Context f32992e;

        public C11187b(TextView textView, Context context) {
            this.f32991d = textView;
            this.f32992e = context;
        }

        public void onGlobalLayout() {
            if (this.f32991d.getLineCount() > 1) {
                this.f32991d.setTextSize(0, (float) C76577a.m92157h(this.f32992e, C0966R.dimen.f3684bd));
            }
            this.f32991d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: nj3.y0$c */
    public class C11188c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f32993d;

        /* renamed from: e */
        public final /* synthetic */ Context f32994e;

        public C11188c(TextView textView, Context context) {
            this.f32993d = textView;
            this.f32994e = context;
        }

        public void onGlobalLayout() {
            if (this.f32993d.getLineCount() > 1) {
                this.f32993d.setTextSize(0, ((float) C76577a.m92155f(this.f32994e, C0966R.dimen.f3684bd)) * C76577a.m92161l(this.f32994e));
            }
            this.f32993d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: nj3.y0$e */
    public class C11189e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f32995d;

        /* renamed from: e */
        public final /* synthetic */ Context f32996e;

        public C11189e(TextView textView, Context context) {
            this.f32995d = textView;
            this.f32996e = context;
        }

        public void onGlobalLayout() {
            if (this.f32995d.getLineCount() > 1) {
                this.f32995d.setTextSize(0, (float) C76577a.m92157h(this.f32996e, C0966R.dimen.f3684bd));
            }
            this.f32995d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: nj3.y0$f */
    public class C11190f implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f32997d;

        /* renamed from: e */
        public final /* synthetic */ Context f32998e;

        public C11190f(TextView textView, Context context) {
            this.f32997d = textView;
            this.f32998e = context;
        }

        public void onGlobalLayout() {
            if (this.f32997d.getLineCount() > 1) {
                this.f32997d.setTextSize(0, (float) C76577a.m92157h(this.f32998e, C0966R.dimen.f3684bd));
            }
            this.f32997d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: nj3.y0$i */
    public static class C11191i {

        /* renamed from: a */
        public static Toast f32999a;

        /* renamed from: b */
        public static int f33000b;

        /* renamed from: a */
        public static void m11049a(Context context, int i) {
            Context applicationContext = context.getApplicationContext();
            if (f33000b != i) {
                f32999a = null;
                f33000b = i;
            }
            if (f32999a == null) {
                f32999a = Toast.makeText(applicationContext, "", 1);
            }
            View inflate = View.inflate(applicationContext, C0966R.C0971layout.bux, (ViewGroup) null);
            if (i == 1) {
                ((TextView) inflate.findViewById(C0966R.C0970id.j4f)).setText(C0966R.string.gqg);
            } else if (i == 3) {
                ((TextView) inflate.findViewById(C0966R.C0970id.j4f)).setText(C0966R.string.gqh);
            } else {
                ((TextView) inflate.findViewById(C0966R.C0970id.j4f)).setText(C0966R.string.gqi);
            }
            f32999a.setView(inflate);
            f32999a.show();
        }
    }

    /* renamed from: nj3.y0$d */
    public class C47271d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f126892d;

        /* renamed from: e */
        public final /* synthetic */ Context f126893e;

        public C47271d(TextView textView, Context context) {
            this.f126892d = textView;
            this.f126893e = context;
        }

        public void onGlobalLayout() {
            if (this.f126892d.getLineCount() > 1) {
                this.f126892d.setTextSize(0, (float) C76577a.m92157h(this.f126893e, C0966R.dimen.f3684bd));
            }
            this.f126892d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: nj3.y0$g */
    public class C61775g implements MTimerHandler.CallBack {
        public C61775g() {
        }

        public boolean onTimerExpired() {
            C76912y0 y0Var = C76912y0.this;
            if (y0Var.f224773c == -1) {
                y0Var.show();
                return true;
            }
            int i = y0Var.f224772b - 1;
            y0Var.f224772b = i;
            if (i >= 0) {
                y0Var.show();
                return true;
            }
            y0Var.cancel();
            return false;
        }
    }

    /* renamed from: nj3.y0$j */
    public interface C61776j {
        /* renamed from: a */
        void mo596a(View view);
    }

    /* renamed from: nj3.y0$h */
    public class C76913h extends MMHandler {

        /* renamed from: a */
        public final /* synthetic */ C76901s0 f224778a;

        public C76913h(C76901s0 s0Var) {
            this.f224778a = s0Var;
        }

        public void handleMessage(Message message) {
            this.f224778a.dismiss();
            super.handleMessage(message);
        }
    }

    /* renamed from: nj3.y0$a */
    public class C76914a implements C75018a.C75024d {

        /* renamed from: a */
        public final /* synthetic */ Context f224779a;

        /* renamed from: nj3.y0$a$a */
        public class C76915a implements DialogInterface.OnClickListener {
            public C76915a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", C76914a.this.f224779a.getPackageName(), (String) null));
                intent.addFlags(268435456);
                Context context = C76914a.this.f224779a;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/ui/base/MMToast$14$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/ui/base/MMToast$14$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C117407d.INSTANCE.idkeyStat(462, 23, 1, true);
            }
        }

        /* renamed from: nj3.y0$a$b */
        public class C76916b implements DialogInterface.OnClickListener {
            public C76916b(C76914a aVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        public C76914a(Context context) {
            this.f224779a = context;
        }

        /* renamed from: a */
        public void mo7429a() {
            if (!C90111a.m112742f((Activity) this.f224779a, "android.permission.READ_EXTERNAL_STORAGE")) {
                Context context = this.f224779a;
                C76879j.m92709C(context, context.getString(C0966R.string.hid), this.f224779a.getString(C0966R.string.hif), this.f224779a.getString(C0966R.string.fyd), this.f224779a.getString(C0966R.string.f7926wf), false, new C76915a(), new C76916b(this));
                return;
            }
            C117407d.INSTANCE.idkeyStat(462, 22, 1, true);
            C90111a.m112741e((Activity) this.f224779a, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 32767);
        }
    }

    public C76912y0(Context context) {
        super(context);
        this.f224774d = context;
        this.f224771a = 1;
        this.f224773c = 2000;
        this.f224772b = ((int) 28) + 1;
        View inflate = View.inflate(context, C0966R.C0971layout.c_v, (ViewGroup) null);
        this.f224775e = inflate;
        setView(inflate);
        setGravity(55, 0, BackwardSupportUtil.BitmapFactory.fromDPToPix(context, 40.0f));
        setDuration(0);
        TextView textView = (TextView) this.f224775e.findViewById(C0966R.C0970id.kpz);
        this.f224776f = textView;
        int i = this.f224771a;
        if (i == 1) {
            textView.setTextColor(-1);
        } else if (i == 2) {
            textView.setTextColor(context.getResources().getColor(C0966R.color.f356993ah1));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m92762a(android.content.Context r3) {
        /*
            boolean r0 = r3 instanceof androidx.appcompat.app.AppCompatActivity
            r1 = 2131165256(0x7f070048, float:1.7944724E38)
            if (r0 == 0) goto L_0x0019
            r0 = r3
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            androidx.appcompat.app.ActionBar r2 = r0.getSupportActionBar()
            if (r2 == 0) goto L_0x0019
            androidx.appcompat.app.ActionBar r0 = r0.getSupportActionBar()
            int r0 = r0.mo91101l()
            goto L_0x003b
        L_0x0019:
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r2 = r0.widthPixels
            int r0 = r0.heightPixels
            if (r2 <= r0) goto L_0x0033
            android.content.res.Resources r0 = r3.getResources()
            r2 = 2131165255(0x7f070047, float:1.7944722E38)
            int r0 = r0.getDimensionPixelSize(r2)
            goto L_0x003b
        L_0x0033:
            android.content.res.Resources r0 = r3.getResources()
            int r0 = r0.getDimensionPixelSize(r1)
        L_0x003b:
            if (r0 != 0) goto L_0x0045
            android.content.res.Resources r3 = r3.getResources()
            int r0 = r3.getDimensionPixelSize(r1)
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nj3.C76912y0.m92762a(android.content.Context):int");
    }

    /* renamed from: b */
    public static Toast m92763b(Context context, CharSequence charSequence) {
        Toast makeText = Toast.makeText(context, "", 0);
        View inflate = View.inflate(context, C0966R.C0971layout.f6796os, (ViewGroup) null);
        ((WeImageView) inflate.findViewById(C0966R.C0970id.kpx)).setImageResource(C0966R.raw.icons_filled_info);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kpy);
        textView.setText(charSequence);
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new C11190f(textView, context));
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
        return makeText;
    }

    /* renamed from: c */
    public static int m92764c(Context context) {
        Rect rect = C85875k4.f250155a;
        return C47264o.m52556a(context, 25);
    }

    /* renamed from: d */
    public static Toast m92765d(Context context, CharSequence charSequence, int i) {
        Toast makeText = Toast.makeText(context, "", 0);
        View inflate = View.inflate(context, C0966R.C0971layout.f6796os, (ViewGroup) null);
        WeImageView weImageView = (WeImageView) inflate.findViewById(C0966R.C0970id.kpx);
        if (i != 0) {
            weImageView.setImageResource(i);
        } else {
            weImageView.setVisibility(8);
        }
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kpy);
        textView.setText(charSequence);
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new C47271d(textView, context));
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
        return makeText;
    }

    /* renamed from: e */
    public static void m92766e(Context context, String str, C61776j jVar) {
        Toast makeText = Toast.makeText(context, "", 0);
        View inflate = View.inflate(context, C0966R.C0971layout.f6796os, (ViewGroup) null);
        ((WeImageView) inflate.findViewById(C0966R.C0970id.kpx)).setImageResource(C0966R.raw.icons_filled_error);
        ((TextView) inflate.findViewById(C0966R.C0970id.kpy)).setText(str);
        jVar.mo596a(inflate);
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
    }

    /* renamed from: f */
    public static void m92767f(Context context, String str) {
        Toast makeText = Toast.makeText(context, "", 0);
        View inflate = View.inflate(context, C0966R.C0971layout.f6796os, (ViewGroup) null);
        ((WeImageView) inflate.findViewById(C0966R.C0970id.kpx)).setImageResource(C0966R.raw.icons_filled_info);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kpy);
        textView.setText(str);
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new C11189e(textView, context));
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
    }

    /* renamed from: g */
    public static void m92768g(Context context, String str) {
        Toast makeText = Toast.makeText(context, "", 0);
        View inflate = View.inflate(context, C0966R.C0971layout.f6796os, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kpy);
        textView.setText(str);
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new C11187b(textView, context));
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
    }

    /* renamed from: h */
    public static Toast m92769h(Context context, String str, int i) {
        Toast makeText = Toast.makeText(context, "", 0);
        View inflate = View.inflate(context, C0966R.C0971layout.f6796os, (ViewGroup) null);
        WeImageView weImageView = (WeImageView) inflate.findViewById(C0966R.C0970id.kpx);
        if (i != 0) {
            weImageView.setImageResource(i);
        } else {
            weImageView.setVisibility(8);
        }
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kpy);
        textView.setText(str);
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new C11188c(textView, context));
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
        return makeText;
    }

    /* renamed from: i */
    public static void m92770i(Context context, String str) {
        Toast makeText = Toast.makeText(context, "", 0);
        View inflate = View.inflate(context, C0966R.C0971layout.cp8, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0966R.C0970id.kpy)).setText(str);
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
    }

    /* renamed from: j */
    public static void m92771j(Context context, View view) {
        if (!(context instanceof Activity) || C111105a.m151499a((Activity) context, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            m92772k(context);
            return;
        }
        String string = context.getString(C0966R.string.hie);
        String string2 = context.getString(C0966R.string.a2z);
        C76914a aVar = new C76914a(context);
        C75018a.C75023c cVar = new C75018a.C75023c(context, view);
        cVar.f220747c = string;
        cVar.f220748d = string2;
        cVar.f220749e = 2500;
        C75026b.m89956f(cVar, aVar, (C75018a.C75025e) null);
    }

    /* renamed from: k */
    public static void m92772k(Context context) {
        if (C88956h.m111062c().equals("mounted_ro")) {
            C11191i.m11049a(context, 3);
        } else {
            C11191i.m11049a(context, 1);
        }
    }

    /* renamed from: l */
    public static void m92773l(Context context, String str) {
        Toast makeText = Toast.makeText(context, "", 0);
        View inflate = View.inflate(context, C0966R.C0971layout.c_8, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0966R.C0970id.kpy)).setText(str);
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
    }

    /* renamed from: m */
    public static void m92774m(Context context, String str) {
        Toast makeText = Toast.makeText(context, "", 1);
        View inflate = View.inflate(context, C0966R.C0971layout.c_8, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0966R.C0970id.kpy)).setText(str);
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
    }

    public static Toast makeText(Context context, int i, int i2) {
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        return C76701a.makeText(context, i, i2);
    }

    /* renamed from: n */
    public static C76901s0 m92775n(Activity activity, String str, long j) {
        View inflate = View.inflate(activity, C0966R.C0971layout.c_v, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0966R.C0970id.kpz)).setText(str);
        C76901s0 s0Var = new C76901s0(inflate);
        s0Var.setWidth(-1);
        s0Var.setHeight(-2);
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        s0Var.showAtLocation(activity.getWindow().getDecorView(), 48, 0, rect.top + m92762a(activity));
        new C76913h(s0Var).sendEmptyMessageDelayed(0, j);
        return s0Var;
    }

    /* renamed from: o */
    public static C76901s0 m92776o(Activity activity, int i, String str, long j) {
        View inflate = View.inflate(activity, C0966R.C0971layout.b5z, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.fpf);
        textView.setText(str);
        textView.setOnClickListener((View.OnClickListener) null);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.fpe);
        if (i == 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(i);
        }
        C76901s0 s0Var = new C76901s0(inflate);
        s0Var.setWidth(-1);
        s0Var.setHeight(-2);
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i2 = rect.top;
        int a = m92762a(activity);
        if (i2 == 0) {
            i2 = m92764c(activity);
        }
        MMHandlerThread.postToMainThread(new C76869a1(s0Var, activity, i2 + a));
        MMHandlerThread.postToMainThreadDelayed(new C76904w0(s0Var), j);
        ImageButton imageButton = (ImageButton) inflate.findViewById(C0966R.C0970id.fpd);
        imageButton.setVisibility(8);
        imageButton.setOnClickListener(new C47270x0(s0Var));
        return s0Var;
    }

    public void setText(CharSequence charSequence) {
        this.f224776f.setText(charSequence);
    }

    public void setText(int i) {
        this.f224776f.setText(C0086a.m38a(this.f224774d).getString(i));
    }

    public static Toast makeText(Context context, CharSequence charSequence, int i) {
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        return C76701a.makeText(context, charSequence, i);
    }
}
