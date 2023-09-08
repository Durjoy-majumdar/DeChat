package d51;

import al3.C0086a;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C103422m;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import di3.C86312j;
import e51.C45545g;
import ei3.C86522b;
import g51.C45880a;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import p385u2.C111105a;
import p447aw.C103918d;
import p447aw.C54369c;
import qo3.C101218e0;
import qo3.C77389a;
import qo3.C77398g;
import v10.C52735e;
import vc3.C78382a;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: d51.a */
public class C116574a extends C86301e implements C45545g {

    /* renamed from: d51.a$a */
    public class C116575a implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C101218e0 f349590a;

        /* renamed from: b */
        public final /* synthetic */ C45545g.C45546a f349591b;

        public C116575a(C116574a aVar, C101218e0 e0Var, C45545g.C45546a aVar2) {
            this.f349590a = e0Var;
            this.f349591b = aVar2;
        }

        /* renamed from: a */
        public void mo2001a() {
            this.f349590a.mo140680z();
            C45545g.C45546a aVar = this.f349591b;
            if (aVar != null) {
                aVar.mo63989a();
            }
        }
    }

    /* renamed from: d51.a$b */
    public class C116576b implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C101218e0 f349592a;

        /* renamed from: b */
        public final /* synthetic */ C45545g.C45546a f349593b;

        public C116576b(C116574a aVar, C101218e0 e0Var, C45545g.C45546a aVar2) {
            this.f349592a = e0Var;
            this.f349593b = aVar2;
        }

        /* renamed from: a */
        public void mo2001a() {
            this.f349592a.mo140680z();
            C45545g.C45546a aVar = this.f349593b;
            if (aVar != null) {
                aVar.mo63989a();
            }
        }
    }

    /* renamed from: d51.a$c */
    public class C116577c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ DialogInterface.OnClickListener f349594d;

        /* renamed from: e */
        public final /* synthetic */ PBool f349595e;

        /* renamed from: f */
        public final /* synthetic */ String f349596f;

        public C116577c(C116574a aVar, DialogInterface.OnClickListener onClickListener, PBool pBool, String str) {
            this.f349594d = onClickListener;
            this.f349595e = pBool;
            this.f349596f = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            DialogInterface.OnClickListener onClickListener = this.f349594d;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            }
            this.f349595e.value = true;
            C45880a.m51163b(15, 1501, 1, 23, this.f349596f, "", "");
        }
    }

    /* renamed from: d51.a$d */
    public class C116578d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ DialogInterface.OnClickListener f349597d;

        /* renamed from: e */
        public final /* synthetic */ PBool f349598e;

        /* renamed from: f */
        public final /* synthetic */ String f349599f;

        /* renamed from: d51.a$d$a */
        public class C116579a implements AbsRequestFloatWindowPermissionDialog.C85613a {
            public C116579a(C116578d dVar) {
            }

            /* renamed from: a */
            public void mo247a(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
                absRequestFloatWindowPermissionDialog.finish();
            }

            /* renamed from: b */
            public void mo248b(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
                absRequestFloatWindowPermissionDialog.finish();
            }

            /* renamed from: c */
            public void mo249c(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
                absRequestFloatWindowPermissionDialog.finish();
            }
        }

        public C116578d(C116574a aVar, DialogInterface.OnClickListener onClickListener, PBool pBool, String str) {
            this.f349597d = onClickListener;
            this.f349598e = pBool;
            this.f349599f = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            DialogInterface.OnClickListener onClickListener = this.f349597d;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            }
            this.f349598e.value = true;
            C45880a.m51163b(15, 1501, 1, 3, this.f349599f, "", "");
            if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(MMApplicationContext.getContext())) {
                ((C54369c) C86312j.m106911c(C54369c.class)).mo75136wJ(MMApplicationContext.getContext(), MMApplicationContext.getContext().getString(C0966R.string.evm), new C116579a(this), true, C78382a.m94650b());
            }
        }
    }

    /* renamed from: d51.a$e */
    public class C116580e implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ DialogInterface.OnCancelListener f349600d;

        public C116580e(C116574a aVar, DialogInterface.OnCancelListener onCancelListener) {
            this.f349600d = onCancelListener;
        }

        public void onCancel(DialogInterface dialogInterface) {
            DialogInterface.OnCancelListener onCancelListener = this.f349600d;
            if (onCancelListener != null) {
                onCancelListener.onCancel(dialogInterface);
            }
        }
    }

    /* renamed from: d51.a$f */
    public class C116581f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C103422m f349601d;

        /* renamed from: e */
        public final /* synthetic */ C45545g.C45546a f349602e;

        /* renamed from: f */
        public final /* synthetic */ String f349603f;

        public C116581f(C116574a aVar, C103422m mVar, C45545g.C45546a aVar2, String str) {
            this.f349601d = mVar;
            this.f349602e = aVar2;
            this.f349603f = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/downloader_app/DownloadAppAlertDelegateImpl$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f349601d.dismiss();
            C45545g.C45546a aVar = this.f349602e;
            if (aVar != null) {
                aVar.mo63989a();
            }
            C45880a.m51163b(15, 1502, 1, 2, this.f349603f, "", "");
            C117292a.m165361g(this, "com/tencent/mm/plugin/downloader_app/DownloadAppAlertDelegateImpl$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d51.a$g */
    public class C116582g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C103422m f349604d;

        /* renamed from: e */
        public final /* synthetic */ C45545g.C45546a f349605e;

        /* renamed from: f */
        public final /* synthetic */ String f349606f;

        public C116582g(C116574a aVar, C103422m mVar, C45545g.C45546a aVar2, String str) {
            this.f349604d = mVar;
            this.f349605e = aVar2;
            this.f349606f = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/downloader_app/DownloadAppAlertDelegateImpl$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f349604d.dismiss();
            C45545g.C45546a aVar = this.f349605e;
            if (aVar != null) {
                aVar.mo63989a();
            }
            C45880a.m51163b(15, 1502, 1, 23, this.f349606f, "", "");
            C117292a.m165361g(this, "com/tencent/mm/plugin/downloader_app/DownloadAppAlertDelegateImpl$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d51.a$h */
    public class C116583h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C103422m f349607d;

        /* renamed from: e */
        public final /* synthetic */ C45545g.C45546a f349608e;

        /* renamed from: f */
        public final /* synthetic */ String f349609f;

        public C116583h(C116574a aVar, C103422m mVar, C45545g.C45546a aVar2, String str) {
            this.f349607d = mVar;
            this.f349608e = aVar2;
            this.f349609f = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/downloader_app/DownloadAppAlertDelegateImpl$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f349607d.dismiss();
            C45545g.C45546a aVar = this.f349608e;
            if (aVar != null) {
                aVar.mo63989a();
            }
            C45880a.m51163b(15, 1502, 1, 3, this.f349609f, "", "");
            C117292a.m165361g(this, "com/tencent/mm/plugin/downloader_app/DownloadAppAlertDelegateImpl$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d51.a$i */
    public class C116584i implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f349610d;

        /* renamed from: e */
        public final /* synthetic */ C45545g.C45546a f349611e;

        /* renamed from: f */
        public final /* synthetic */ String f349612f;

        public C116584i(C116574a aVar, PBool pBool, C45545g.C45546a aVar2, String str) {
            this.f349610d = pBool;
            this.f349611e = aVar2;
            this.f349612f = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f349610d.value = true;
            C45545g.C45546a aVar = this.f349611e;
            if (aVar != null) {
                aVar.mo63989a();
            }
            this.f349610d.value = true;
            C45880a.m51163b(15, 1502, 1, 23, this.f349612f, "", "");
        }
    }

    /* renamed from: d51.a$j */
    public class C116585j implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C45545g.C45546a f349613d;

        /* renamed from: e */
        public final /* synthetic */ PBool f349614e;

        /* renamed from: f */
        public final /* synthetic */ String f349615f;

        public C116585j(C116574a aVar, C45545g.C45546a aVar2, PBool pBool, String str) {
            this.f349613d = aVar2;
            this.f349614e = pBool;
            this.f349615f = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C45545g.C45546a aVar = this.f349613d;
            if (aVar != null) {
                aVar.mo63989a();
            }
            this.f349614e.value = true;
            C45880a.m51163b(15, 1502, 1, 3, this.f349615f, "", "");
        }
    }

    /* renamed from: d51.a$k */
    public class C116586k implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C45545g.C45546a f349616d;

        /* renamed from: e */
        public final /* synthetic */ PBool f349617e;

        /* renamed from: f */
        public final /* synthetic */ String f349618f;

        public C116586k(C116574a aVar, C45545g.C45546a aVar2, PBool pBool, String str) {
            this.f349616d = aVar2;
            this.f349617e = pBool;
            this.f349618f = str;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C45545g.C45546a aVar = this.f349616d;
            if (aVar != null) {
                aVar.mo63989a();
            }
            if (!this.f349617e.value) {
                C45880a.m51163b(15, 1502, 1, 2, this.f349618f, "", "");
            }
        }
    }

    /* renamed from: gM */
    public void mo71049gM(Context context, String str, C45545g.C45546a aVar, C45545g.C45546a aVar2, C45545g.C45546a aVar3) {
        if (((C52735e) C86312j.m106911c(C52735e.class)).mo61269fe(C32735h.C32737c.clicfg_download_game_ignore_network, false)) {
            C103422m mVar = new C103422m(context, C0966R.style.f8426i2);
            mVar.mo143460C(1);
            mVar.setCancelable(false);
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bt9, (ViewGroup) null);
            mVar.setContentView(inflate);
            inflate.findViewById(C0966R.C0970id.c9j).setOnClickListener(new C116581f(this, mVar, aVar3, str));
            inflate.findViewById(C0966R.C0970id.c9m).setOnClickListener(new C116582g(this, mVar, aVar, str));
            inflate.findViewById(C0966R.C0970id.c9i).setOnClickListener(new C116583h(this, mVar, aVar2, str));
            mVar.show();
        } else {
            PBool pBool = new PBool();
            C77389a aVar4 = new C77389a();
            aVar4.f225644a = C0086a.m38a(context).getString(C0966R.string.gkl);
            aVar4.f225660q = C0086a.m38a(context).getString(C0966R.string.gkm);
            aVar4.f225663t = C0086a.m38a(context).getString(C0966R.string.gkk);
            aVar4.f225620C = new C116584i(this, pBool, aVar, str);
            aVar4.f225664u = C0086a.m38a(context).getString(C0966R.string.gki);
            aVar4.f225621D = new C116585j(this, aVar2, pBool, str);
            aVar4.f225668y = true;
            aVar4.f225622E = new C116586k(this, aVar3, pBool, str);
            C77398g gVar = new C77398g(context, C0966R.style.a66);
            gVar.mo107525e(aVar4);
            gVar.show();
        }
        C45880a.m51163b(15, 1502, 1, 1, str, "", "");
    }

    public void nk0(Context context, String str, C45545g.C45546a aVar, C45545g.C45546a aVar2) {
        C101218e0 e0Var = new C101218e0(context, 1, 0, false);
        e0Var.mo140667n(context.getString(C0966R.string.f360346c11), context.getString(C0966R.string.f360347c12));
        C116575a aVar3 = new C116575a(this, e0Var, aVar);
        C116576b bVar = new C116576b(this, e0Var, aVar2);
        e0Var.f296373D = aVar3;
        e0Var.f296374E = bVar;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bzc, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.c__);
        if (C85875k4.m106211z()) {
            imageView.setImageResource(C0966R.raw.ic_download_pause_alert_dark);
        } else {
            imageView.setImageResource(C0966R.raw.ic_download_pause_alert);
        }
        e0Var.mo140663j(inflate);
        e0Var.mo140655A();
    }

    /* renamed from: wl */
    public void mo71051wl(Context context, String str, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener, long j) {
        String str2;
        Context context2 = context;
        String str3 = str;
        long j2 = j;
        PBool pBool = new PBool();
        C77389a aVar = new C77389a();
        aVar.f225644a = C0086a.m38a(context).getString(C0966R.string.gkj);
        String string = context.getString(C0966R.string.gkh);
        if (j2 > 0) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.d7n, (ViewGroup) null);
            ((TextView) inflate.findViewById(C0966R.C0970id.o65)).setText(string);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.o64);
            StringBuilder sb = new StringBuilder(context.getString(C0966R.string.ctm));
            int length = sb.length();
            float f = (float) j2;
            float f2 = f / 1.07374182E9f;
            float f3 = f / 1048576.0f;
            if (f2 >= 1.0f) {
                str2 = String.format("%.1fGB", new Object[]{Float.valueOf(f2)});
            } else {
                str2 = String.format("%.1fMB", new Object[]{Float.valueOf(f3)});
            }
            sb.append(str2);
            SpannableString spannableString = new SpannableString(sb);
            spannableString.setSpan(new ForegroundColorSpan(C111105a.m151500b(context, C0966R.color.f3536x0)), length, str2.length() + length, 18);
            textView.setText(spannableString);
            aVar.f225627J = inflate;
        } else {
            aVar.f225660q = string;
        }
        aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.gkk);
        aVar.f225620C = new C116577c(this, onClickListener, pBool, str3);
        aVar.f225664u = C0086a.m38a(context).getString(C0966R.string.f7933wn);
        aVar.f225621D = new C116578d(this, onClickListener2, pBool, str3);
        aVar.f225668y = true;
        aVar.f225622E = new C116580e(this, onCancelListener);
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        C45880a.m51163b(15, 1501, 1, 1, str, "", "");
    }
}
