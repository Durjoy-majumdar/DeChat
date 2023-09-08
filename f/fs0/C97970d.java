package fs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.p026ui.record.WAGameRecordShareUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C8479f0;
import qo3.C101218e0;
import rx3.C13598b0;

/* renamed from: fs0.d */
public final class C97970d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f287333d;

    /* renamed from: e */
    public final /* synthetic */ WAGameRecordShareUI f287334e;

    /* renamed from: fs0.d$a */
    public static final class C97971a implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ WAGameRecordShareUI f287335a;

        /* renamed from: b */
        public final /* synthetic */ long f287336b;

        /* renamed from: c */
        public final /* synthetic */ C8479f0<String> f287337c;

        /* renamed from: d */
        public final /* synthetic */ C101218e0 f287338d;

        public C97971a(WAGameRecordShareUI wAGameRecordShareUI, long j, C8479f0<String> f0Var, C101218e0 e0Var) {
            this.f287335a = wAGameRecordShareUI;
            this.f287336b = j;
            this.f287337c = f0Var;
            this.f287338d = e0Var;
        }

        /* renamed from: a */
        public final void mo2001a() {
            int i = WAGameRecordShareUI.f267608p;
            this.f287335a.mo127312M7(602, this.f287336b, 2, 2, (String) this.f287337c.f27484d);
            this.f287338d.mo140680z();
        }
    }

    public C97970d(int i, WAGameRecordShareUI wAGameRecordShareUI) {
        this.f287333d = i;
        this.f287334e = wAGameRecordShareUI;
    }

    public final void run() {
        C13598b0 b0Var;
        String str = "app_brand_game_record_education_flag_" + this.f287333d;
        boolean decodeBool = MultiProcessMMKV.getMultiDefault().decodeBool(str, false);
        Log.m105924i("MicroMsg.WAGameRecordShareUI", "hy: scene " + this.f287333d + " is shown education " + decodeBool);
        C8479f0 f0Var = new C8479f0();
        int i = decodeBool ? C0966R.C0971layout.d3k : C0966R.C0971layout.d0w;
        int i2 = this.f287333d;
        long j = 2;
        if (i2 == 1) {
            f0Var.f27484d = "{\"sharetype\": 1}";
        } else if (i2 != 2) {
            j = i2 != 3 ? 1000 : 1;
        } else {
            f0Var.f27484d = "{\"sharetype\": 2}";
        }
        long j2 = j;
        if (!decodeBool || i2 == 3) {
            C101218e0 e0Var = new C101218e0(this.f287334e, 2, 0);
            WAGameRecordShareUI wAGameRecordShareUI = this.f287334e;
            int i3 = this.f287333d;
            C13598b0 b0Var2 = null;
            View inflate = LayoutInflater.from(wAGameRecordShareUI).inflate(i, (ViewGroup) null);
            String string = (i3 == 1 || i3 == 2) ? wAGameRecordShareUI.getString(C0966R.string.muo) : i3 != 3 ? null : decodeBool ? wAGameRecordShareUI.getString(C0966R.string.mzv) : wAGameRecordShareUI.getString(C0966R.string.mzw);
            String string2 = i3 == 3 ? decodeBool ? wAGameRecordShareUI.getString(C0966R.string.mzt) : wAGameRecordShareUI.getString(C0966R.string.mzu) : null;
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.cdk);
            if (string != null) {
                textView.setText(string);
                textView.setVisibility(0);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                textView.setVisibility(8);
            }
            TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.nkq);
            if (string2 != null) {
                textView2.setText(string2);
                textView2.setVisibility(0);
                b0Var2 = C13598b0.f38549a;
            }
            if (b0Var2 == null) {
                textView2.setVisibility(8);
            }
            e0Var.mo140663j(inflate);
            e0Var.mo140677w(wAGameRecordShareUI.getString(C0966R.string.f8028zq));
            e0Var.mo140676v(1);
            e0Var.f296375F = new C97971a(wAGameRecordShareUI, j2, f0Var, e0Var);
            e0Var.mo140674t(wAGameRecordShareUI.mo117383J7(i));
            e0Var.mo140655A();
            wAGameRecordShareUI.mo127312M7(602, j2, 1, 1, (String) f0Var.f27484d);
            MultiProcessMMKV.getMultiDefault().encode(str, true);
        }
    }
}
