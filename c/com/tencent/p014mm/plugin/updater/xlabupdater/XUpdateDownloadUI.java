package com.tencent.p014mm.plugin.updater.xlabupdater;

import android.content.Context;
import android.os.Build;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import m13.C88689b;
import nj3.C88989a;
import o13.C11327c;
import o13.C11328d;
import o13.C11329e;
import o13.C11342g;
import p663qo.C77384i;
import qo3.C47883u;
import qo3.C77398g;
import qo3.C77426q;
import rx3.C13598b0;
import rx3.C36568h;
import te3.rg4;
import zp3.C23564m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/updater/xlabupdater/XUpdateDownloadUI;", "Lcom/tencent/mm/plugin/updater/xlabupdater/DialogDownloadUI;", "<init>", "()V", "plugin-updater_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(4)
/* renamed from: com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI */
public final class XUpdateDownloadUI extends DialogDownloadUI {

    /* renamed from: q */
    public static final /* synthetic */ int f21647q = 0;

    /* renamed from: h */
    public int f21648h = -1;

    /* renamed from: i */
    public C77398g f21649i;

    /* renamed from: j */
    public C77398g f21650j;

    /* renamed from: n */
    public TextView f21651n;

    /* renamed from: o */
    public TextView f21652o;

    /* renamed from: p */
    public ProgressBar f21653p;

    /* renamed from: com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI$a */
    public static final class C5671a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ XUpdateDownloadUI f21654d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5671a(XUpdateDownloadUI xUpdateDownloadUI) {
            super(0);
            this.f21654d = xUpdateDownloadUI;
        }

        public Object invoke() {
            String str = this.f21654d.mo6692I7().f259802j;
            return str == null ? "" : str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI$b */
    public static final class C5672b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ XUpdateDownloadUI f21655d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5672b(XUpdateDownloadUI xUpdateDownloadUI) {
            super(0);
            this.f21655d = xUpdateDownloadUI;
        }

        public Object invoke() {
            C77398g gVar = this.f21655d.f21650j;
            if (gVar != null) {
                gVar.hide();
            }
            this.f21655d.f21650j = null;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI$c */
    public static final class C5673c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ XUpdateDownloadUI f21656d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5673c(XUpdateDownloadUI xUpdateDownloadUI) {
            super(0);
            this.f21656d = xUpdateDownloadUI;
        }

        public Object invoke() {
            Toast.makeText(this.f21656d.getContext(), "fail", 0).show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI$d */
    public static final class C5674d implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ XUpdateDownloadUI f21657a;

        public C5674d(XUpdateDownloadUI xUpdateDownloadUI) {
            this.f21657a = xUpdateDownloadUI;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            XUpdateDownloadUI xUpdateDownloadUI = this.f21657a;
            int i = XUpdateDownloadUI.f21647q;
            xUpdateDownloadUI.mo6703P7();
            this.f21657a.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI$e */
    public static final class C5675e implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ XUpdateDownloadUI f21658a;

        public C5675e(XUpdateDownloadUI xUpdateDownloadUI) {
            this.f21658a = xUpdateDownloadUI;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            XUpdateDownloadUI xUpdateDownloadUI = this.f21658a;
            int i = XUpdateDownloadUI.f21647q;
            xUpdateDownloadUI.mo6703P7();
            C11329e eVar = C11329e.f33285a;
            String str2 = this.f21658a.mo6692I7().f259805p;
            C87412m.m108593f(str2, "dialogInfo.cdnUrl");
            ((C77384i) C86312j.m106911c(C77384i.class)).mo107505nD(eVar.mo11358g(str2));
            String str3 = this.f21658a.mo6692I7().f259805p;
            C87412m.m108593f(str3, "dialogInfo.cdnUrl");
            MultiProcessMMKV.getMMKV("MMKV_NAME_FILE_NAME").remove(str3);
            MultiProcessMMKV.getMMKV("MMKV_NAME_MEDIA_ID").remove(str3);
            this.f21658a.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI$f */
    public static final class C5676f extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ XUpdateDownloadUI f21659d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5676f(XUpdateDownloadUI xUpdateDownloadUI) {
            super(0);
            this.f21659d = xUpdateDownloadUI;
        }

        public Object invoke() {
            String str = this.f21659d.mo6692I7().f259801i;
            return str == null ? "" : str;
        }
    }

    public XUpdateDownloadUI() {
        C36568h.m40985a(new C5676f(this));
        C36568h.m40985a(new C5671a(this));
    }

    /* renamed from: J7 */
    public void mo6693J7(String str) {
        C87412m.m108594g(str, "msg");
        Log.m105924i("MicroMsg.XUpdate.XUpdateDownloadUI", "onDownloadFail ");
        C23564m.m28136f(new C5673c(this));
    }

    /* renamed from: K7 */
    public void mo6694K7(double d) {
        Log.m105924i("MicroMsg.XUpdate.XUpdateDownloadUI", "onDownloadProgress " + d);
        if (Build.VERSION.SDK_INT >= 24) {
            ProgressBar progressBar = this.f21653p;
            if (progressBar != null) {
                progressBar.setProgress((int) d, true);
                return;
            }
            return;
        }
        ProgressBar progressBar2 = this.f21653p;
        if (progressBar2 != null) {
            progressBar2.setProgress((int) d);
        }
    }

    /* renamed from: L7 */
    public void mo6695L7(rg4 rg4) {
        C87412m.m108594g(rg4, "info");
        Log.m105924i("MicroMsg.XUpdate.XUpdateDownloadUI", "onDownloadSuccess ");
        C11329e eVar = C11329e.f33285a;
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        eVar.mo11362k(context, rg4);
        mo6703P7();
        finish();
    }

    /* renamed from: M7 */
    public void mo6696M7() {
        int i = this.f21648h;
        C11329e eVar = C11329e.f33285a;
        String str = mo6692I7().f259805p;
        C87412m.m108593f(str, "dialogInfo.cdnUrl");
        if (i == eVar.mo11356e(str)) {
            Log.m105924i("MicroMsg.XUpdate.XUpdateDownloadUI", "curShowingStatus == XUpdateHelper.getCurStatus, dont need changeDialog " + this.f21648h);
            return;
        }
        String str2 = mo6692I7().f259805p;
        C87412m.m108593f(str2, "dialogInfo.cdnUrl");
        boolean z = false;
        if (eVar.mo11356e(str2) == 0) {
            this.f21648h = 0;
            C77426q qVar = new C77426q(this);
            String str3 = mo6692I7().f259801i;
            if (str3 == null || str3.length() == 0) {
                str3 = getString(C0966R.string.f8203af);
            }
            qVar.mo107595g(str3);
            String str4 = mo6692I7().f259803n;
            if (str4 == null || str4.length() == 0) {
                str4 = getString(C0966R.string.f7950x8);
            }
            qVar.mo107602n(str4);
            String str5 = mo6692I7().f259804o;
            if (str5 == null || str5.length() == 0) {
                z = true;
            }
            if (z) {
                str5 = getString(C0966R.string.f7926wf);
            }
            qVar.mo107598j(str5);
            qVar.mo107600l(new C11327c(this));
            qVar.mo107597i(new C11328d(this));
            qVar.mo107603o();
            this.f21649i = qVar.f225839c;
            return;
        }
        String str6 = mo6692I7().f259805p;
        C87412m.m108593f(str6, "dialogInfo.cdnUrl");
        if (eVar.mo11356e(str6) == 1) {
            z = true;
        }
        if (z) {
            this.f21648h = 1;
            mo6704Q7();
        }
    }

    /* renamed from: N7 */
    public void mo6697N7(String str, rg4 rg4) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(rg4, "info");
        Log.m105924i("MicroMsg.XUpdate.XUpdateDownloadUI", "onMergeSuccess ");
        ((C88689b) C86312j.m106911c(C88689b.class)).mo122770ya(this, C11342g.f33303d.mo11368q().f259799g);
    }

    /* renamed from: P7 */
    public final void mo6703P7() {
        Log.m105924i("MicroMsg.XUpdate.XUpdateDownloadUI", "hideDownloadingDialog: ");
        C23564m.m28136f(new C5672b(this));
    }

    /* renamed from: Q7 */
    public final void mo6704Q7() {
        TextPaint paint;
        C77426q qVar = new C77426q(this);
        qVar.mo107592d(C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d74, (ViewGroup) null));
        qVar.mo107602n(getString(C0966R.string.f8202ae));
        qVar.mo107600l(new C5674d(this));
        qVar.mo107598j(getString(C0966R.string.f7926wf));
        qVar.mo107597i(new C5675e(this));
        qVar.mo107603o();
        C77398g gVar = qVar.f225839c;
        this.f21650j = gVar;
        this.f21651n = (TextView) gVar.findViewById(C0966R.C0970id.o4s);
        this.f21652o = (TextView) gVar.findViewById(C0966R.C0970id.o4q);
        ProgressBar progressBar = (ProgressBar) gVar.findViewById(C0966R.C0970id.o4r);
        this.f21653p = progressBar;
        boolean z = false;
        if (progressBar != null) {
            progressBar.setProgress(this.f21640d, false);
        }
        TextView textView = this.f21651n;
        if (!(textView == null || (paint = textView.getPaint()) == null)) {
            C85875k4.m106191k0(paint);
        }
        TextView textView2 = this.f21651n;
        if (textView2 != null) {
            String str = mo6692I7().f259815z;
            if (str == null || str.length() == 0) {
                str = getString(C0966R.string.nac);
            }
            textView2.setText(str);
        }
        TextView textView3 = this.f21652o;
        if (textView3 != null) {
            String str2 = mo6692I7().f259815z;
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (z) {
                str2 = getString(C0966R.string.k7i) + Util.getSizeMB((long) mo6692I7().f259798f);
            }
            textView3.setText(str2);
        }
    }

    public int getLayoutId() {
        return -1;
    }
}
