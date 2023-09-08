package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import di3.C86312j;
import gy3.C87412m;
import p151er.C7774m;
import qo3.C47883u;
import qo3.C77426q;
import rx3.C13604l;
import sx3.C90364q0;
import zp3.C79406f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.p2 */
public final class C1771p2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C1841q2 f11513d;

    /* renamed from: e */
    public final /* synthetic */ Activity f11514e;

    /* renamed from: f */
    public final /* synthetic */ String f11515f;

    /* renamed from: g */
    public final /* synthetic */ C82554k f11516g;

    /* renamed from: h */
    public final /* synthetic */ int f11517h;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.p2$a */
    public static final class C1772a implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ Activity f11518a;

        /* renamed from: b */
        public final /* synthetic */ EditText f11519b;

        /* renamed from: c */
        public final /* synthetic */ C82554k f11520c;

        /* renamed from: d */
        public final /* synthetic */ int f11521d;

        /* renamed from: e */
        public final /* synthetic */ C1841q2 f11522e;

        public C1772a(Activity activity, EditText editText, C82554k kVar, int i, C1841q2 q2Var) {
            this.f11518a = activity;
            this.f11519b = editText;
            this.f11520c = kVar;
            this.f11521d = i;
            this.f11522e = q2Var;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            Object systemService = this.f11518a.getSystemService("input_method");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(this.f11519b.getWindowToken(), 0);
            if (z) {
                this.f11520c.mo109647a(this.f11521d, this.f11522e.mo115112m("ok", C90364q0.m113146e(new C13604l(MimeTypes.BASE_TYPE_TEXT, this.f11519b.getText().toString()))));
            }
            Log.m105924i("JsApiEditTextWithPopForm", "dialog click is ok:" + z);
        }
    }

    public C1771p2(C1841q2 q2Var, Activity activity, String str, C82554k kVar, int i) {
        this.f11513d = q2Var;
        this.f11514e = activity;
        this.f11515f = str;
        this.f11516g = kVar;
        this.f11517h = i;
    }

    public final void run() {
        C1841q2 q2Var = this.f11513d;
        Activity activity = this.f11514e;
        q2Var.getClass();
        EditText editText = new EditText(activity);
        editText.setHint(activity.getResources().getString(C0966R.string.a6w));
        editText.setGravity(51);
        editText.setTextSize(0, (float) C79406f.m96347a(activity, 15.0f));
        editText.setMaxEms(80);
        editText.setMaxLines(2);
        editText.setEllipsize(TextUtils.TruncateAt.END);
        ((C7774m) C86312j.m106911c(C7774m.class)).oi0(editText, (TextView) null, 80, 40, C1764o2.f11502d);
        editText.setPadding(editText.getPaddingLeft(), activity.getResources().getDimensionPixelOffset(C0966R.dimen.f3703bv), editText.getPaddingRight(), activity.getResources().getDimensionPixelOffset(C0966R.dimen.f3703bv));
        editText.setBackgroundColor(activity.getResources().getColor(C0966R.color.f3050dd));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        editText.setHeight(C79406f.m96347a(activity, 100.0f));
        editText.setLayoutParams(layoutParams);
        editText.setText(this.f11515f);
        C77426q qVar = new C77426q(this.f11514e);
        qVar.mo107606r(this.f11514e.getResources().getString(C0966R.string.a6x));
        qVar.mo107592d(editText);
        qVar.mo107590b(new C1772a(this.f11514e, editText, this.f11516g, this.f11517h, this.f11513d));
        qVar.mo107603o();
        Log.m105924i("JsApiEditTextWithPopForm", "showEditTextDialog");
    }
}
