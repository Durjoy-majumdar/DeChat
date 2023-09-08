package com.tencent.p014mm.plugin.cast.p035ui;

import a01.C103219b;
import al3.C0086a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import android.os.HandlerThread;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import b01.C67125a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.cast.service.ScreenCastForegroundService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import e01.C107075a;
import e01.C75467d;
import e01.C75468e;
import e01.C75470f;
import eb0.C75592q0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h01.C107987b;
import h81.C32735h;
import i01.C76253c;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import m01.C34456b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import ob0.C11385n;
import ob0.C117747y;
import p192l4.C10462b;
import p206nj.C11171e;
import p447aw.C103918d;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import yz0.C112509d;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/cast/ui/ScreenCastActivity;", "Lcom/tencent/mm/ui/MMActivity;", "Lob0/n;", "<init>", "()V", "plugin-cast_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.cast.ui.ScreenCastActivity */
public final class ScreenCastActivity extends MMActivity implements C11385n {

    /* renamed from: q */
    public static final /* synthetic */ int f197620q = 0;

    /* renamed from: d */
    public Button f197621d;

    /* renamed from: e */
    public View f197622e;

    /* renamed from: f */
    public TextView f197623f;

    /* renamed from: g */
    public WeImageView f197624g;

    /* renamed from: h */
    public WeImageView f197625h;

    /* renamed from: i */
    public ProgressBar f197626i;

    /* renamed from: j */
    public final int f197627j = 1000;

    /* renamed from: n */
    public int f197628n;

    /* renamed from: o */
    public boolean f197629o;

    /* renamed from: p */
    public final C13601g f197630p = C36568h.m40985a(new C68798g(this));

    /* renamed from: com.tencent.mm.plugin.cast.ui.ScreenCastActivity$a */
    public static final class C68785a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ScreenCastActivity f197631d;

        /* renamed from: com.tencent.mm.plugin.cast.ui.ScreenCastActivity$a$a */
        public static final class C68786a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ ScreenCastActivity f197632d;

            public C68786a(ScreenCastActivity screenCastActivity) {
                this.f197632d = screenCastActivity;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.mo107140d(0, this.f197632d.getResources().getColor(C0966R.color.a_0), this.f197632d.getResources().getString(C0966R.string.jo7));
            }
        }

        /* renamed from: com.tencent.mm.plugin.cast.ui.ScreenCastActivity$a$b */
        public static final class C68787b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ ScreenCastActivity f197633d;

            public C68787b(ScreenCastActivity screenCastActivity) {
                this.f197633d = screenCastActivity;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                if (menuItem.getItemId() == 0) {
                    ScreenCastActivity screenCastActivity = this.f197633d;
                    int i2 = ScreenCastActivity.f197620q;
                    screenCastActivity.mo94638K7();
                    this.f197633d.initView();
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.cast.ui.ScreenCastActivity$a$c */
        public static final class C68788c implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ ScreenCastActivity f197634d;

            public C68788c(ScreenCastActivity screenCastActivity) {
                this.f197634d = screenCastActivity;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/cast/ui/ScreenCastActivity$initBtnListener$1$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f197634d.finish();
                C117292a.m165361g(this, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$initBtnListener$1$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.cast.ui.ScreenCastActivity$a$d */
        public static final class C68789d implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ ScreenCastActivity f197635d;

            public C68789d(ScreenCastActivity screenCastActivity) {
                this.f197635d = screenCastActivity;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/cast/ui/ScreenCastActivity$initBtnListener$1$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f197635d.finish();
                C117292a.m165361g(this, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$initBtnListener$1$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.cast.ui.ScreenCastActivity$a$e */
        public /* synthetic */ class C68790e {

            /* renamed from: a */
            public static final /* synthetic */ int[] f197636a;

            static {
                int[] iArr = new int[C76253c.values().length];
                iArr[2] = 1;
                iArr[1] = 2;
                iArr[5] = 3;
                iArr[3] = 4;
                iArr[4] = 5;
                f197636a = iArr;
            }
        }

        public C68785a(ScreenCastActivity screenCastActivity) {
            this.f197631d = screenCastActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/cast/ui/ScreenCastActivity$initBtnListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C112509d.f336921e == null) {
                C112509d.f336921e = new C107075a();
            }
            C107075a aVar = C112509d.f336921e;
            if (aVar != null) {
                ScreenCastActivity screenCastActivity = this.f197631d;
                C76253c cVar = aVar.f320512r;
                int i = cVar == null ? -1 : C68790e.f197636a[cVar.ordinal()];
                boolean z = true;
                if (i == 1) {
                    C77407n nVar = new C77407n((Context) screenCastActivity, 1, true);
                    nVar.f225771i = new C68786a(screenCastActivity);
                    nVar.f225782p = new C68787b(screenCastActivity);
                    nVar.mo107573q();
                } else if (i != 2) {
                    if (i == 3) {
                        Button button = screenCastActivity.f197621d;
                        if (button != null) {
                            button.setText(screenCastActivity.getString(C0966R.string.i4h));
                        }
                        Button button2 = screenCastActivity.f197621d;
                        if (button2 != null) {
                            button2.setOnClickListener(new C68788c(screenCastActivity));
                        }
                    } else if (i == 4 || i == 5) {
                        Log.m105924i("MicroMsg.CastReportHelper", "markClickStartScreenCastRetry");
                        C115669n.INSTANCE.mo175913w(1634, 5, 1);
                        int i2 = screenCastActivity.f197628n + 1;
                        screenCastActivity.f197628n = i2;
                        int i3 = 0;
                        if (i2 < 5) {
                            if (C112509d.f336921e == null) {
                                C112509d.f336921e = new C107075a();
                            }
                            C107075a aVar2 = C112509d.f336921e;
                            if (aVar2 != null) {
                                Log.m105924i("MicroMsg.ScreenCastManager", "retryConnect " + aVar2.f320495a);
                                C103219b bVar = aVar2.f320495a;
                                if (!(((bVar != null ? bVar.f304419p : null) == null || bVar.f304418o == null) ? false : true)) {
                                    bVar = null;
                                }
                                if (bVar != null) {
                                    Log.m105924i("MicroMsg.ScreenCastManager", "remote pc addr: " + bVar.f304418o + XVFSFile.PATH_SEPARATOR_CHAR + bVar.f304419p + "local phone is " + C34456b.m40354a());
                                    C107987b bVar2 = aVar2.f320511q;
                                    if (bVar2 != null) {
                                        String str = bVar.f304418o;
                                        C87412m.m108591d(str);
                                        Integer num = bVar.f304419p;
                                        if (num != null) {
                                            i3 = num.intValue();
                                        }
                                        bVar2.mo158376a(str, i3, new C75470f(aVar2));
                                    }
                                }
                            }
                        } else {
                            z = false;
                        }
                        if (!z) {
                            Button button3 = screenCastActivity.f197621d;
                            if (button3 != null) {
                                button3.setText(screenCastActivity.getString(C0966R.string.i4h));
                            }
                            Button button4 = screenCastActivity.f197621d;
                            if (button4 != null) {
                                button4.setOnClickListener(new C68789d(screenCastActivity));
                            }
                        } else {
                            Log.m105924i("MicroMsg.ScreenCastActivity", "error happened");
                        }
                    } else {
                        Log.m105924i("MicroMsg.CastReportHelper", "markClickStartScreenCastBtnReport");
                        C115669n.INSTANCE.mo175913w(1634, 4, 1);
                        int i4 = ScreenCastActivity.f197620q;
                        screenCastActivity.mo94637J7();
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$initBtnListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.cast.ui.ScreenCastActivity$b */
    public static final class C68791b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ScreenCastActivity f197637d;

        public C68791b(ScreenCastActivity screenCastActivity) {
            this.f197637d = screenCastActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/cast/ui/ScreenCastActivity$initBtnListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f197637d.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$initBtnListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.cast.ui.ScreenCastActivity$c */
    public static final class C68792c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ScreenCastActivity f197638d;

        public C68792c(ScreenCastActivity screenCastActivity) {
            this.f197638d = screenCastActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f197638d.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.cast.ui.ScreenCastActivity$d */
    public static final class C68793d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ScreenCastActivity f197639d;

        public C68793d(ScreenCastActivity screenCastActivity) {
            this.f197639d = screenCastActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f197639d.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.cast.ui.ScreenCastActivity$e */
    public static final class C68794e extends C87413o implements C32226l<C76253c, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ScreenCastActivity f197640d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68794e(ScreenCastActivity screenCastActivity) {
            super(1);
            this.f197640d = screenCastActivity;
        }

        public Object invoke(Object obj) {
            C76253c cVar = (C76253c) obj;
            C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
            ScreenCastActivity screenCastActivity = this.f197640d;
            int i = ScreenCastActivity.f197620q;
            screenCastActivity.getClass();
            switch (cVar.ordinal()) {
                case 0:
                    Log.m105924i("MicroMsg.ScreenCastActivity", "trans to pc disconnect");
                    screenCastActivity.mo94639L7(3);
                    break;
                case 1:
                    screenCastActivity.mo94639L7(1);
                    break;
                case 2:
                    Log.m105924i("MicroMsg.ScreenCastActivity", "trans to pc CONNECTED");
                    if (C112509d.f336921e == null) {
                        C112509d.f336921e = new C107075a();
                    }
                    C107075a aVar = C112509d.f336921e;
                    boolean z = false;
                    if (aVar != null && !aVar.f320505k) {
                        z = true;
                    }
                    if (z) {
                        if (aVar == null) {
                            C112509d.f336921e = new C107075a();
                        }
                        C107075a aVar2 = C112509d.f336921e;
                        if (aVar2 != null) {
                            aVar2.f320505k = true;
                        }
                        Object systemService = screenCastActivity.getSystemService("media_projection");
                        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
                        screenCastActivity.startActivityForResult(((MediaProjectionManager) systemService).createScreenCaptureIntent(), screenCastActivity.f197627j);
                        screenCastActivity.mo94639L7(4);
                        break;
                    }
                    break;
                case 3:
                    Log.m105924i("MicroMsg.ScreenCastActivity", "trans to pc timeout");
                    screenCastActivity.mo94639L7(2);
                    break;
                case 4:
                    Log.m105924i("MicroMsg.ScreenCastActivity", "trans to pc ERROR");
                    screenCastActivity.mo94639L7(5);
                    break;
                case 5:
                    Log.m105924i("MicroMsg.ScreenCastActivity", "trans to pc timeout");
                    screenCastActivity.mo94638K7();
                    screenCastActivity.mo94639L7(7);
                    break;
                case 6:
                    Log.m105924i("MicroMsg.ScreenCastActivity", "trans to pc service removed");
                    screenCastActivity.mo94638K7();
                    screenCastActivity.mo94639L7(8);
                    break;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.cast.ui.ScreenCastActivity$f */
    public static final class C68795f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ScreenCastActivity f197641d;

        /* renamed from: e */
        public final /* synthetic */ int f197642e;

        /* renamed from: com.tencent.mm.plugin.cast.ui.ScreenCastActivity$f$a */
        public static final class C68796a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ ScreenCastActivity f197643d;

            public C68796a(ScreenCastActivity screenCastActivity) {
                this.f197643d = screenCastActivity;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f197643d.finish();
                C117292a.m165361g(this, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.cast.ui.ScreenCastActivity$f$b */
        public static final class C68797b implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ ScreenCastActivity f197644d;

            public C68797b(ScreenCastActivity screenCastActivity) {
                this.f197644d = screenCastActivity;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f197644d.finish();
                C117292a.m165361g(this, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C68795f(ScreenCastActivity screenCastActivity, int i) {
            this.f197641d = screenCastActivity;
            this.f197642e = i;
        }

        public final void run() {
            ScreenCastActivity screenCastActivity = this.f197641d;
            int i = ScreenCastActivity.f197620q;
            screenCastActivity.mo94636I7();
            switch (this.f197642e) {
                case 1:
                    WeImageView weImageView = this.f197641d.f197624g;
                    if (weImageView != null) {
                        weImageView.setVisibility(8);
                    }
                    WeImageView weImageView2 = this.f197641d.f197625h;
                    if (weImageView2 != null) {
                        weImageView2.setVisibility(0);
                    }
                    ScreenCastActivity screenCastActivity2 = this.f197641d;
                    WeImageView weImageView3 = screenCastActivity2.f197625h;
                    if (weImageView3 != null) {
                        weImageView3.setImageDrawable(C74933u4.m89768e(screenCastActivity2.getContext(), C0966R.raw.icons_outlined_wifi, Color.parseColor("#1AAD19")));
                    }
                    WeImageView weImageView4 = this.f197641d.f197625h;
                    if (weImageView4 != null) {
                        weImageView4.setIconColor(Color.parseColor("#1AAD19"));
                    }
                    ProgressBar progressBar = this.f197641d.f197626i;
                    if (progressBar != null) {
                        progressBar.setVisibility(0);
                    }
                    TextView textView = this.f197641d.f197623f;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    ScreenCastActivity screenCastActivity3 = this.f197641d;
                    TextView textView2 = screenCastActivity3.f197623f;
                    if (textView2 != null) {
                        textView2.setText(screenCastActivity3.getResources().getString(C0966R.string.b2x));
                    }
                    Button button = this.f197641d.f197621d;
                    if (button != null) {
                        button.setVisibility(8);
                    }
                    View view = this.f197641d.f197622e;
                    if (view != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    Log.m105924i("MicroMsg.CastReportHelper", "markScreenCastNetConnectSucc");
                    C115669n.INSTANCE.mo175913w(1634, 11, 1);
                    return;
                case 2:
                    WeImageView weImageView5 = this.f197641d.f197624g;
                    if (weImageView5 != null) {
                        weImageView5.setVisibility(0);
                    }
                    ScreenCastActivity screenCastActivity4 = this.f197641d;
                    WeImageView weImageView6 = screenCastActivity4.f197624g;
                    if (weImageView6 != null) {
                        weImageView6.setImageDrawable(C74933u4.m89768e(screenCastActivity4.getContext(), C0966R.raw.on_error_info, Color.parseColor("#FA5151")));
                    }
                    WeImageView weImageView7 = this.f197641d.f197624g;
                    if (weImageView7 != null) {
                        weImageView7.setIconColor(Color.parseColor("#FA5151"));
                    }
                    WeImageView weImageView8 = this.f197641d.f197625h;
                    if (weImageView8 != null) {
                        weImageView8.setVisibility(8);
                    }
                    ProgressBar progressBar2 = this.f197641d.f197626i;
                    if (progressBar2 != null) {
                        progressBar2.setVisibility(8);
                    }
                    TextView textView3 = this.f197641d.f197623f;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                    ScreenCastActivity screenCastActivity5 = this.f197641d;
                    TextView textView4 = screenCastActivity5.f197623f;
                    if (textView4 != null) {
                        textView4.setText(screenCastActivity5.getResources().getString(C0966R.string.b2s));
                    }
                    Button button2 = this.f197641d.f197621d;
                    if (button2 != null) {
                        button2.setVisibility(0);
                    }
                    View view3 = this.f197641d.f197622e;
                    if (view3 != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    ScreenCastActivity screenCastActivity6 = this.f197641d;
                    Button button3 = screenCastActivity6.f197621d;
                    if (button3 != null) {
                        button3.setText(screenCastActivity6.getString(C0966R.string.i4g));
                    }
                    Log.m105924i("MicroMsg.CastReportHelper", "markScreenCastNetSdkConnectTimeOut");
                    C115669n.INSTANCE.mo175913w(1634, 10, 1);
                    return;
                case 3:
                    WeImageView weImageView9 = this.f197641d.f197624g;
                    if (weImageView9 != null) {
                        weImageView9.setVisibility(8);
                    }
                    WeImageView weImageView10 = this.f197641d.f197625h;
                    if (weImageView10 != null) {
                        weImageView10.setVisibility(0);
                    }
                    ScreenCastActivity screenCastActivity7 = this.f197641d;
                    WeImageView weImageView11 = screenCastActivity7.f197625h;
                    if (weImageView11 != null) {
                        weImageView11.setImageDrawable(C74933u4.m89768e(screenCastActivity7.getContext(), C0966R.raw.icons_outlined_wifi, Color.parseColor("#1AAD19")));
                    }
                    WeImageView weImageView12 = this.f197641d.f197625h;
                    if (weImageView12 != null) {
                        weImageView12.setIconColor(Color.parseColor("#1AAD19"));
                    }
                    ProgressBar progressBar3 = this.f197641d.f197626i;
                    if (progressBar3 != null) {
                        progressBar3.setVisibility(8);
                    }
                    TextView textView5 = this.f197641d.f197623f;
                    if (textView5 != null) {
                        textView5.setVisibility(0);
                    }
                    ScreenCastActivity screenCastActivity8 = this.f197641d;
                    TextView textView6 = screenCastActivity8.f197623f;
                    if (textView6 != null) {
                        textView6.setText(screenCastActivity8.getResources().getString(C0966R.string.ifw));
                    }
                    Button button4 = this.f197641d.f197621d;
                    if (button4 != null) {
                        button4.setVisibility(0);
                    }
                    View view5 = this.f197641d.f197622e;
                    if (view5 != null) {
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar3.mo10233c(0);
                        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view5, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    ScreenCastActivity screenCastActivity9 = this.f197641d;
                    Button button5 = screenCastActivity9.f197621d;
                    if (button5 != null) {
                        button5.setText(screenCastActivity9.getString(C0966R.string.jmo));
                    }
                    ScreenCastActivity screenCastActivity10 = this.f197641d;
                    Button button6 = screenCastActivity10.f197621d;
                    if (button6 != null) {
                        button6.setTextColor(screenCastActivity10.getResources().getColor(C0966R.color.f2927a));
                    }
                    ScreenCastActivity screenCastActivity11 = this.f197641d;
                    Button button7 = screenCastActivity11.f197621d;
                    if (button7 != null) {
                        button7.setBackground(screenCastActivity11.getDrawable(C0966R.C0969drawable.f4653j6));
                        return;
                    }
                    return;
                case 4:
                    WeImageView weImageView13 = this.f197641d.f197624g;
                    if (weImageView13 != null) {
                        weImageView13.setVisibility(0);
                    }
                    ScreenCastActivity screenCastActivity12 = this.f197641d;
                    WeImageView weImageView14 = screenCastActivity12.f197624g;
                    if (weImageView14 != null) {
                        weImageView14.setImageDrawable(C74933u4.m89768e(screenCastActivity12.getContext(), C0966R.raw.pc_connect_succ, Color.parseColor("#1AAD19")));
                    }
                    WeImageView weImageView15 = this.f197641d.f197624g;
                    if (weImageView15 != null) {
                        weImageView15.setIconColor(Color.parseColor("#1AAD19"));
                    }
                    WeImageView weImageView16 = this.f197641d.f197625h;
                    if (weImageView16 != null) {
                        weImageView16.setVisibility(0);
                    }
                    ScreenCastActivity screenCastActivity13 = this.f197641d;
                    WeImageView weImageView17 = screenCastActivity13.f197625h;
                    if (weImageView17 != null) {
                        weImageView17.setImageDrawable(C74933u4.m89768e(screenCastActivity13.getContext(), C0966R.raw.icons_outlined_wifi, Color.parseColor("#1AAD19")));
                    }
                    WeImageView weImageView18 = this.f197641d.f197625h;
                    if (weImageView18 != null) {
                        weImageView18.setIconColor(Color.parseColor("#1AAD19"));
                    }
                    ProgressBar progressBar4 = this.f197641d.f197626i;
                    if (progressBar4 != null) {
                        progressBar4.setVisibility(8);
                    }
                    TextView textView7 = this.f197641d.f197623f;
                    if (textView7 != null) {
                        textView7.setVisibility(0);
                    }
                    ScreenCastActivity screenCastActivity14 = this.f197641d;
                    TextView textView8 = screenCastActivity14.f197623f;
                    if (textView8 != null) {
                        textView8.setText(screenCastActivity14.getResources().getString(C0966R.string.f361241if2));
                    }
                    Button button8 = this.f197641d.f197621d;
                    if (button8 != null) {
                        button8.setVisibility(0);
                    }
                    View view6 = this.f197641d.f197622e;
                    if (view6 != null) {
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                        aVar4.mo10233c(0);
                        C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view6, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    ScreenCastActivity screenCastActivity15 = this.f197641d;
                    Button button9 = screenCastActivity15.f197621d;
                    if (button9 != null) {
                        button9.setText(screenCastActivity15.getString(C0966R.string.jo7));
                    }
                    ScreenCastActivity screenCastActivity16 = this.f197641d;
                    Button button10 = screenCastActivity16.f197621d;
                    if (button10 != null) {
                        button10.setTextColor(screenCastActivity16.getResources().getColor(C0966R.color.f2939n));
                    }
                    ScreenCastActivity screenCastActivity17 = this.f197641d;
                    Button button11 = screenCastActivity17.f197621d;
                    if (button11 != null) {
                        button11.setBackground(screenCastActivity17.getDrawable(C0966R.C0969drawable.f4665jf));
                        return;
                    }
                    return;
                case 5:
                    WeImageView weImageView19 = this.f197641d.f197624g;
                    if (weImageView19 != null) {
                        weImageView19.setVisibility(0);
                    }
                    ScreenCastActivity screenCastActivity18 = this.f197641d;
                    WeImageView weImageView20 = screenCastActivity18.f197624g;
                    if (weImageView20 != null) {
                        weImageView20.setImageDrawable(C74933u4.m89768e(screenCastActivity18.getContext(), C0966R.raw.on_error_info, Color.parseColor("#FA5151")));
                    }
                    WeImageView weImageView21 = this.f197641d.f197624g;
                    if (weImageView21 != null) {
                        weImageView21.setIconColor(Color.parseColor("#FA5151"));
                    }
                    WeImageView weImageView22 = this.f197641d.f197625h;
                    if (weImageView22 != null) {
                        weImageView22.setVisibility(8);
                    }
                    ProgressBar progressBar5 = this.f197641d.f197626i;
                    if (progressBar5 != null) {
                        progressBar5.setVisibility(8);
                    }
                    TextView textView9 = this.f197641d.f197623f;
                    if (textView9 != null) {
                        textView9.setVisibility(0);
                    }
                    ScreenCastActivity screenCastActivity19 = this.f197641d;
                    TextView textView10 = screenCastActivity19.f197623f;
                    if (textView10 != null) {
                        textView10.setText(screenCastActivity19.getResources().getString(C0966R.string.b2q));
                    }
                    Button button12 = this.f197641d.f197621d;
                    if (button12 != null) {
                        button12.setVisibility(0);
                    }
                    View view7 = this.f197641d.f197622e;
                    if (view7 != null) {
                        C9556a aVar5 = new C9556a();
                        ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                        aVar5.mo10233c(0);
                        View view8 = view7;
                        C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(view8, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    ScreenCastActivity screenCastActivity20 = this.f197641d;
                    Button button13 = screenCastActivity20.f197621d;
                    if (button13 != null) {
                        button13.setText(screenCastActivity20.getString(C0966R.string.i4g));
                    }
                    Log.m105924i("MicroMsg.CastReportHelper", "markScreenCastNetSdkConnectFailed");
                    C115669n.INSTANCE.mo175913w(1634, 9, 1);
                    return;
                case 6:
                    WeImageView weImageView23 = this.f197641d.f197624g;
                    if (weImageView23 != null) {
                        weImageView23.setVisibility(0);
                    }
                    ScreenCastActivity screenCastActivity21 = this.f197641d;
                    WeImageView weImageView24 = screenCastActivity21.f197624g;
                    if (weImageView24 != null) {
                        weImageView24.setImageDrawable(C74933u4.m89768e(screenCastActivity21.getContext(), C0966R.raw.on_error_info, Color.parseColor("#FA5151")));
                    }
                    WeImageView weImageView25 = this.f197641d.f197624g;
                    if (weImageView25 != null) {
                        weImageView25.setIconColor(Color.parseColor("#FA5151"));
                    }
                    WeImageView weImageView26 = this.f197641d.f197625h;
                    if (weImageView26 != null) {
                        weImageView26.setVisibility(8);
                    }
                    ProgressBar progressBar6 = this.f197641d.f197626i;
                    if (progressBar6 != null) {
                        progressBar6.setVisibility(8);
                    }
                    TextView textView11 = this.f197641d.f197623f;
                    if (textView11 != null) {
                        textView11.setVisibility(0);
                    }
                    ScreenCastActivity screenCastActivity22 = this.f197641d;
                    TextView textView12 = screenCastActivity22.f197623f;
                    if (textView12 != null) {
                        textView12.setText(screenCastActivity22.getResources().getString(C0966R.string.b2r));
                    }
                    Button button14 = this.f197641d.f197621d;
                    if (button14 != null) {
                        button14.setVisibility(8);
                    }
                    View view9 = this.f197641d.f197622e;
                    if (view9 != null) {
                        C9556a aVar6 = new C9556a();
                        ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                        aVar6.mo10233c(8);
                        View view10 = view9;
                        C117292a.m165358d(view10, aVar6.mo10232b(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view9.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                        C117292a.m165359e(view10, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    Log.m105924i("MicroMsg.CastReportHelper", "markScreenCastDiffNetWork");
                    C115669n.INSTANCE.mo175913w(1634, 8, 1);
                    return;
                case 7:
                    WeImageView weImageView27 = this.f197641d.f197624g;
                    if (weImageView27 != null) {
                        weImageView27.setVisibility(0);
                    }
                    ScreenCastActivity screenCastActivity23 = this.f197641d;
                    WeImageView weImageView28 = screenCastActivity23.f197624g;
                    if (weImageView28 != null) {
                        weImageView28.setImageDrawable(C74933u4.m89768e(screenCastActivity23.getContext(), C0966R.raw.on_error_info, Color.parseColor("#FA5151")));
                    }
                    WeImageView weImageView29 = this.f197641d.f197624g;
                    if (weImageView29 != null) {
                        weImageView29.setIconColor(Color.parseColor("#FA5151"));
                    }
                    WeImageView weImageView30 = this.f197641d.f197625h;
                    if (weImageView30 != null) {
                        weImageView30.setVisibility(8);
                    }
                    ProgressBar progressBar7 = this.f197641d.f197626i;
                    if (progressBar7 != null) {
                        progressBar7.setVisibility(8);
                    }
                    TextView textView13 = this.f197641d.f197623f;
                    if (textView13 != null) {
                        textView13.setVisibility(0);
                    }
                    ScreenCastActivity screenCastActivity24 = this.f197641d;
                    TextView textView14 = screenCastActivity24.f197623f;
                    if (textView14 != null) {
                        textView14.setText(screenCastActivity24.getResources().getString(C0966R.string.b2y));
                    }
                    Button button15 = this.f197641d.f197621d;
                    if (button15 != null) {
                        button15.setVisibility(0);
                    }
                    View view11 = this.f197641d.f197622e;
                    if (view11 != null) {
                        C9556a aVar7 = new C9556a();
                        ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                        aVar7.mo10233c(0);
                        View view12 = view11;
                        C117292a.m165358d(view12, aVar7.mo10232b(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view11.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                        C117292a.m165359e(view12, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    Log.m105924i("MicroMsg.CastReportHelper", "markInitVideoEncoderFailed");
                    C115669n.INSTANCE.mo175913w(1634, 34, 1);
                    ScreenCastActivity screenCastActivity25 = this.f197641d;
                    Button button16 = screenCastActivity25.f197621d;
                    if (button16 != null) {
                        button16.setText(screenCastActivity25.getString(C0966R.string.i4h));
                    }
                    ScreenCastActivity screenCastActivity26 = this.f197641d;
                    Button button17 = screenCastActivity26.f197621d;
                    if (button17 != null) {
                        button17.setOnClickListener(new C68796a(screenCastActivity26));
                        return;
                    }
                    return;
                case 8:
                    WeImageView weImageView31 = this.f197641d.f197624g;
                    if (weImageView31 != null) {
                        weImageView31.setVisibility(0);
                    }
                    ScreenCastActivity screenCastActivity27 = this.f197641d;
                    WeImageView weImageView32 = screenCastActivity27.f197624g;
                    if (weImageView32 != null) {
                        weImageView32.setImageDrawable(C74933u4.m89768e(screenCastActivity27.getContext(), C0966R.raw.on_error_info, Color.parseColor("#FA5151")));
                    }
                    WeImageView weImageView33 = this.f197641d.f197624g;
                    if (weImageView33 != null) {
                        weImageView33.setIconColor(Color.parseColor("#FA5151"));
                    }
                    WeImageView weImageView34 = this.f197641d.f197625h;
                    if (weImageView34 != null) {
                        weImageView34.setVisibility(8);
                    }
                    ProgressBar progressBar8 = this.f197641d.f197626i;
                    if (progressBar8 != null) {
                        progressBar8.setVisibility(8);
                    }
                    TextView textView15 = this.f197641d.f197623f;
                    if (textView15 != null) {
                        textView15.setVisibility(0);
                    }
                    ScreenCastActivity screenCastActivity28 = this.f197641d;
                    TextView textView16 = screenCastActivity28.f197623f;
                    if (textView16 != null) {
                        textView16.setText(screenCastActivity28.getResources().getString(C0966R.string.b2z));
                    }
                    Button button18 = this.f197641d.f197621d;
                    if (button18 != null) {
                        button18.setVisibility(0);
                    }
                    View view13 = this.f197641d.f197622e;
                    if (view13 != null) {
                        C9556a aVar8 = new C9556a();
                        ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
                        aVar8.mo10233c(0);
                        View view14 = view13;
                        C117292a.m165358d(view14, aVar8.mo10232b(), "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view13.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                        C117292a.m165359e(view14, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    Log.m105924i("MicroMsg.CastReportHelper", "markInitVideoEncoderFailed");
                    C115669n.INSTANCE.mo175913w(1634, 34, 1);
                    ScreenCastActivity screenCastActivity29 = this.f197641d;
                    Button button19 = screenCastActivity29.f197621d;
                    if (button19 != null) {
                        button19.setText(screenCastActivity29.getString(C0966R.string.i4h));
                    }
                    ScreenCastActivity screenCastActivity30 = this.f197641d;
                    Button button20 = screenCastActivity30.f197621d;
                    if (button20 != null) {
                        button20.setOnClickListener(new C68797b(screenCastActivity30));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.cast.ui.ScreenCastActivity$g */
    public static final class C68798g extends C87413o implements C32224a<C67125a> {

        /* renamed from: d */
        public final /* synthetic */ ScreenCastActivity f197645d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68798g(ScreenCastActivity screenCastActivity) {
            super(0);
            this.f197645d = screenCastActivity;
        }

        public Object invoke() {
            View findViewById = this.f197645d.findViewById(C0966R.C0970id.maw);
            int i = C0966R.C0970id.f357638ay1;
            WeImageView weImageView = (WeImageView) C10462b.m10395a(findViewById, C0966R.C0970id.f357638ay1);
            if (weImageView != null) {
                ScrollView scrollView = (ScrollView) findViewById;
                i = C0966R.C0970id.f357858c42;
                TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.f357858c42);
                if (textView != null) {
                    i = C0966R.C0970id.f358916hu0;
                    ProgressBar progressBar = (ProgressBar) C10462b.m10395a(findViewById, C0966R.C0970id.f358916hu0);
                    if (progressBar != null) {
                        i = C0966R.C0970id.f358917hu1;
                        WeImageView weImageView2 = (WeImageView) C10462b.m10395a(findViewById, C0966R.C0970id.f358917hu1);
                        if (weImageView2 != null) {
                            i = C0966R.C0970id.huw;
                            WeImageView weImageView3 = (WeImageView) C10462b.m10395a(findViewById, C0966R.C0970id.huw);
                            if (weImageView3 != null) {
                                i = C0966R.C0970id.j2x;
                                RelativeLayout relativeLayout = (RelativeLayout) C10462b.m10395a(findViewById, C0966R.C0970id.j2x);
                                if (relativeLayout != null) {
                                    i = C0966R.C0970id.j2y;
                                    WeImageView weImageView4 = (WeImageView) C10462b.m10395a(findViewById, C0966R.C0970id.j2y);
                                    if (weImageView4 != null) {
                                        i = C0966R.C0970id.k0m;
                                        Button button = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.k0m);
                                        if (button != null) {
                                            i = C0966R.C0970id.k0n;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) C10462b.m10395a(findViewById, C0966R.C0970id.k0n);
                                            if (relativeLayout2 != null) {
                                                i = C0966R.C0970id.k1f;
                                                TextView textView2 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.k1f);
                                                if (textView2 != null) {
                                                    return new C67125a(scrollView, weImageView, scrollView, textView, progressBar, weImageView2, weImageView3, relativeLayout, weImageView4, button, relativeLayout2, textView2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    /* renamed from: H7 */
    public final C67125a mo94635H7() {
        return (C67125a) ((C36570n) this.f197630p).getValue();
    }

    /* renamed from: I7 */
    public final void mo94636I7() {
        Button button = this.f197621d;
        if (button != null) {
            button.setOnClickListener(new C68785a(this));
        }
        View findViewById = findViewById(C0966R.C0970id.j2y);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C68791b(this));
        }
    }

    /* renamed from: J7 */
    public final void mo94637J7() {
        String str;
        Integer num;
        if (((C103918d) C86312j.m106911c(C103918d.class)).Uu0(this, new String[]{"android.permission.RECORD_AUDIO"}, 148, "", "")) {
            if (C112509d.f336921e == null) {
                C112509d.f336921e = new C107075a();
            }
            C107075a aVar = C112509d.f336921e;
            if (aVar != null) {
                C68794e eVar = new C68794e(this);
                Log.m105924i("MicroMsg.ScreenCastManager", "initScreenCastMgr");
                eVar.invoke(C76253c.CONNECTING);
                aVar.f320513s = eVar;
                HandlerThread handlerThread = new HandlerThread("MicroMsg.ScreenCastManager_DataSender", 5);
                aVar.f320503i = handlerThread;
                handlerThread.start();
                HandlerThread handlerThread2 = aVar.f320503i;
                if (handlerThread2 != null) {
                    aVar.f320504j = new MMHandler(handlerThread2.getLooper(), (MMHandler.Callback) new C75467d(aVar));
                }
                aVar.f320511q = new C107987b();
                C103219b bVar = aVar.f320495a;
                if (bVar != null && (str = bVar.f304418o) != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("remote pc addr: ");
                    sb.append(str);
                    sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
                    C103219b bVar2 = aVar.f320495a;
                    sb.append(bVar2 != null ? bVar2.f304419p : null);
                    sb.append("local phone is ");
                    sb.append(C34456b.m40354a());
                    Log.m105924i("MicroMsg.ScreenCastManager", sb.toString());
                    C107987b bVar3 = aVar.f320511q;
                    if (bVar3 != null) {
                        C103219b bVar4 = aVar.f320495a;
                        bVar3.mo158376a(str, (bVar4 == null || (num = bVar4.f304419p) == null) ? 0 : num.intValue(), new C75468e(aVar));
                    }
                }
            }
        }
    }

    /* renamed from: K7 */
    public final void mo94638K7() {
        stopService(new Intent(this, ScreenCastForegroundService.class));
        this.f197629o = false;
        if (C112509d.f336921e == null) {
            C112509d.f336921e = new C107075a();
        }
        C107075a aVar = C112509d.f336921e;
        if (aVar != null) {
            aVar.mo157529b();
        }
    }

    /* renamed from: L7 */
    public final void mo94639L7(int i) {
        Log.m105924i("MicroMsg.ScreenCastActivity", "switchIconStatus status is " + i);
        ((C119157j) C119157j.f356862d).mo183895z(new C68795f(this, i));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6794oq;
    }

    public void initView() {
        C103219b bVar;
        C103219b bVar2;
        super.initView();
        this.f197624g = mo94635H7().f192734c;
        this.f197625h = mo94635H7().f192735d;
        this.f197626i = mo94635H7().f192733b;
        this.f197621d = mo94635H7().f192736e;
        this.f197622e = mo94635H7().f192737f;
        TextView textView = mo94635H7().f192732a;
        this.f197623f = mo94635H7().f192738g;
        mo94636I7();
        if (C112509d.f336921e == null) {
            C112509d.f336921e = new C107075a();
        }
        C107075a aVar = C112509d.f336921e;
        String str = null;
        C76253c cVar = aVar != null ? aVar.f320512r : null;
        if (cVar != null) {
            int ordinal = cVar.ordinal();
            if (ordinal == 0) {
                mo94639L7(3);
                mo94638K7();
            } else if (ordinal == 2) {
                mo94639L7(4);
            } else if (ordinal == 3) {
                Log.m105924i("MicroMsg.ScreenCastActivity", "trans to pc timeout");
                mo94639L7(2);
            } else if (ordinal != 4) {
                if (C112509d.f336921e == null) {
                    C112509d.f336921e = new C107075a();
                }
                C107075a aVar2 = C112509d.f336921e;
                boolean z = false;
                if (aVar2 != null && !aVar2.f320505k) {
                    z = true;
                }
                if (z) {
                    TextView textView2 = this.f197623f;
                    if (textView2 != null) {
                        textView2.setText(getString(C0966R.string.ifw));
                    }
                    mo94639L7(3);
                    return;
                }
                mo94639L7(4);
            } else {
                Log.m105924i("MicroMsg.ScreenCastActivity", "trans to pc ERROR");
                mo94639L7(5);
            }
        } else {
            if (C112509d.f336921e == null) {
                C112509d.f336921e = new C107075a();
            }
            C107075a aVar3 = C112509d.f336921e;
            String str2 = (aVar3 == null || (bVar2 = aVar3.f320495a) == null) ? null : bVar2.f304421r;
            if (C112509d.f336921e == null) {
                C112509d.f336921e = new C107075a();
            }
            C107075a aVar4 = C112509d.f336921e;
            if (!(aVar4 == null || (bVar = aVar4.f320495a) == null)) {
                str = bVar.f304422s;
            }
            if (!C87412m.m108589b(str2, str)) {
                mo94639L7(6);
                mo94638K7();
                return;
            }
            mo94639L7(3);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.f197627j) {
            boolean z = false;
            if (i2 != -1) {
                Log.m105924i("MicroMsg.ScreenCastActivity", "User cancelled");
                Log.m105924i("MicroMsg.CastReportHelper", "markClickPermissionCancelReport");
                C115669n.INSTANCE.mo175913w(1634, 6, 1);
                if (C112509d.f336921e == null) {
                    C112509d.f336921e = new C107075a();
                }
                C107075a aVar = C112509d.f336921e;
                if (aVar != null) {
                    aVar.f320505k = false;
                }
                if (C112509d.f336921e == null) {
                    C112509d.f336921e = new C107075a();
                }
                C107075a aVar2 = C112509d.f336921e;
                if (aVar2 != null) {
                    aVar2.mo157529b();
                }
                initView();
            } else if (intent != null) {
                this.f197629o = false;
                if (C112509d.f336921e == null) {
                    C112509d.f336921e = new C107075a();
                }
                C107075a aVar3 = C112509d.f336921e;
                if (aVar3 != null) {
                    aVar3.f320505k = true;
                }
                Log.printInfoStack("MicroMsg.ScreenCastActivity", "bindScreenCastForegroundIfNeed", new Object[0]);
                if (!this.f197629o) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("code", i2);
                    intent2.putExtra("data", intent);
                    intent2.setClass(MMApplicationContext.getContext(), ScreenCastForegroundService.class);
                    try {
                        if (C11171e.m11046c(26)) {
                            MMApplicationContext.getContext().startForegroundService(intent2);
                        } else {
                            MMApplicationContext.getContext().startService(intent2);
                        }
                        z = true;
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.ScreenCastActivity", e, "using start service to bindVoipForegroundIfNeed error: %s", e.getMessage());
                        try {
                            if (C11171e.m11046c(26)) {
                                MMApplicationContext.getContext().startForegroundService(intent2);
                            } else {
                                MMApplicationContext.getContext().startService(intent2);
                            }
                        } catch (Exception e2) {
                            Log.printErrStackTrace("MicroMsg.ScreenCastActivity", e2, "using start foreground service to bindVoipForegroundIfNeed error: %s", e2.getMessage());
                        }
                    }
                    if (z) {
                        this.f197629o = true;
                    }
                }
                initView();
                Log.m105924i("MicroMsg.ScreenCastActivity", "Started screen recording");
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String h = C75592q0.m90778h();
        C87412m.m108593f(h, "getDefaultFinderUsername()");
        if (h.length() == 0) {
            AppCompatActivity context = getContext();
            C77389a aVar = new C77389a();
            aVar.f225660q = getContext().getString(C0966R.string.b2v);
            aVar.f225668y = false;
            aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.i4h);
            aVar.f225620C = new C68792c(this);
            C77398g gVar = new C77398g(context, C0966R.style.a66);
            gVar.mo107525e(aVar);
            gVar.show();
            Log.m105924i("MicroMsg.CastReportHelper", "markScreenCastFailedCauseNotFinderUserReport");
            C115669n.INSTANCE.mo175913w(1634, 1, 1);
        } else if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_finder_screen_cast_pc_forbidden, false)) {
            AppCompatActivity context2 = getContext();
            C77389a aVar2 = new C77389a();
            aVar2.f225660q = getContext().getString(C0966R.string.b2t);
            aVar2.f225668y = false;
            aVar2.f225663t = C0086a.m38a(context2).getString(C0966R.string.i4h);
            aVar2.f225620C = new C68793d(this);
            C77398g gVar2 = new C77398g(context2, C0966R.style.a66);
            gVar2.mo107525e(aVar2);
            gVar2.show();
        } else {
            if (C112509d.f336921e == null) {
                C112509d.f336921e = new C107075a();
            }
            C107075a aVar3 = C112509d.f336921e;
            if ((aVar3 != null ? aVar3.f320495a : null) == null) {
                finish();
            } else {
                Log.m105924i("MicroMsg.CastReportHelper", "markEnterScreenCastReport");
                C115669n.INSTANCE.mo175913w(1634, 0, 1);
                initView();
            }
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        setActionbarColor(getResources().getColor(C0966R.color.f2929c));
        overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == this.f197627j) {
            if ((!(iArr.length == 0)) && iArr[0] == 0) {
                mo94637J7();
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
    }
}
