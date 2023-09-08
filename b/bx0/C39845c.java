package bx0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.C103422m;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.box.webview.BoxWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import cx0.C45212a;
import cx0.C45213b;
import cx0.C45214c;
import cx0.C45215d;
import cx0.C45218e;
import te3.C52267zi;
import xw0.C38860a;

/* renamed from: bx0.c */
public class C39845c extends C103422m implements C39846d {

    /* renamed from: f */
    public C52267zi f106862f;

    /* renamed from: g */
    public FrameLayout f106863g;

    /* renamed from: h */
    public C45215d f106864h;

    /* renamed from: i */
    public BoxWebView f106865i;

    /* renamed from: j */
    public C45213b f106866j;

    public C39845c(Context context, C52267zi ziVar) {
        super(context, C0966R.style.f8366fw);
        this.f106862f = ziVar;
    }

    /* renamed from: k0 */
    public Context mo62488k0() {
        return getContext();
    }

    /* renamed from: l0 */
    public BoxWebView mo62489l0() {
        return this.f106865i;
    }

    /* renamed from: m0 */
    public C45218e mo62490m0() {
        return this.f106866j;
    }

    /* renamed from: n0 */
    public void mo62491n0() {
    }

    /* renamed from: o0 */
    public C45215d mo62492o0() {
        return this.f106864h;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setLayout(-1, -1);
        getWindow().addFlags(67108864);
        getWindow().setDimAmount(0.5f);
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6665l7, (ViewGroup) null, false);
        inflate.setOnTouchListener(new C0388a(this));
        setContentView(inflate, new ViewGroup.LayoutParams(-1, -1));
        this.f106863g = (FrameLayout) inflate.findViewById(C0966R.C0970id.lm9);
        this.f106866j = new C45213b(this);
        this.f106865i = new BoxWebView(MMApplicationContext.getContext());
        this.f106864h = new C45215d(this);
        this.f106865i.mo63455c0(new C45212a(), new C45214c(this.f106862f, this.f106866j));
        this.f106865i.addJavascriptInterface(this.f106864h, "boxJSApi");
        Log.m105925i("MicroMsg.Box.BoxHomeUI", "start to load url %s", this.f106862f.f145968f);
        this.f106865i.loadUrl(this.f106862f.f145968f);
        this.f106863g.addView(this.f106865i);
        setCancelable(true);
        setOnDismissListener(new C39844b(this));
        getWindow().setWindowAnimations(C0966R.style.f8365fv);
        C38860a.m41966a(1);
    }
}
