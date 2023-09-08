package p572jd;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104920s0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C68711c2;
import com.tencent.p014mm.plugin.appbrand.widget.input.C68717h1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84983t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import eb0.C86493v0;
import fy3.C32226l;
import fy3.C32229r;
import gy3.C8479f0;
import gy3.C87412m;
import p572jd.C108701a;
import rt0.C110653f;
import rt0.C77568i;
import rx3.C13598b0;
import to0.C90561a;
import zt3.C119157j;

/* renamed from: jd.i */
public final class C108719i implements C108706d {

    /* renamed from: a */
    public final C82520h f325601a;

    /* renamed from: b */
    public C32229r<? super String, ? super Integer, ? super String, ? super String, C13598b0> f325602b;

    /* renamed from: c */
    public final C104920s0 f325603c;

    /* renamed from: d */
    public C110653f f325604d;

    /* renamed from: e */
    public boolean f325605e;

    /* renamed from: f */
    public boolean f325606f;

    /* renamed from: g */
    public C108701a f325607g;

    /* renamed from: h */
    public String f325608h;

    /* renamed from: i */
    public final C82531i.C82534c f325609i = new C108720a(this);

    /* renamed from: jd.i$a */
    public static final class C108720a implements C82531i.C82534c {

        /* renamed from: d */
        public final /* synthetic */ C108719i f325610d;

        public C108720a(C108719i iVar) {
            this.f325610d = iVar;
        }

        public final void onDestroy() {
            Log.m105924i("MicroMsg.WebviewExtendSecureKeyboard", "onDestroy");
            C86493v0.m107224d().mo120948e(this.f325610d.f325608h);
        }
    }

    /* renamed from: jd.i$b */
    public static final class C108721b implements C108701a.C108704c {

        /* renamed from: a */
        public final /* synthetic */ C108719i f325611a;

        /* renamed from: jd.i$b$a */
        public static final class C108722a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C108719i f325612d;

            public C108722a(C108719i iVar) {
                this.f325612d = iVar;
            }

            public final void run() {
                String str;
                C108719i iVar = this.f325612d;
                C108701a aVar = iVar.f325607g;
                iVar.getClass();
                String str2 = null;
                try {
                    str2 = C76402j.m91824a(aVar, iVar.f325601a, iVar.f325604d);
                    str = null;
                } catch (IllegalStateException e) {
                    str = e.getMessage();
                    Log.m105924i("MicroMsg.WebviewExtendSecureKeyboard", "dispatchKeyboardComplete, encryptErrorMsg: " + str);
                }
                Editable m = iVar.mo159756m();
                int length = m != null ? m.length() : 0;
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < length; i++) {
                    sb.append('*');
                }
                String sb4 = sb.toString();
                C87412m.m108593f(sb4, "stringBuilder.toString()");
                int selectionEnd = Selection.getSelectionEnd(iVar.mo159756m());
                C32229r<? super String, ? super Integer, ? super String, ? super String, C13598b0> rVar = iVar.f325602b;
                if (rVar != null) {
                    rVar.mo162I(sb4, Integer.valueOf(selectionEnd), str2, str);
                }
            }
        }

        public C108721b(C108719i iVar) {
            this.f325611a = iVar;
        }

        /* renamed from: a */
        public void mo159728a() {
            C108719i iVar = this.f325611a;
            if (!iVar.f325606f) {
                ((C119157j) C119157j.f356862d).mo183895z(new C108722a(iVar));
            }
        }
    }

    public C108719i(C82520h hVar, InputConnection inputConnection) {
        C87412m.m108594g(hVar, "appBrandPage");
        C87412m.m108594g(inputConnection, "inputConnection");
        this.f325601a = hVar;
        C104920s0.C104921a aVar = C104920s0.f311539n;
        View contentView = hVar.getContentView();
        C87412m.m108593f(contentView, "appBrandPage.contentView");
        C104920s0 b = aVar.mo148915b(contentView, false, (C90561a) null);
        C87412m.m108591d(b);
        this.f325603c = b;
        Context context = hVar.getContext();
        C87412m.m108593f(context, "appBrandPage.context");
        this.f325607g = new C108701a(context, inputConnection);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        r1 = eb0.C86493v0.m107224d().mo120946b(r1);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo159730a() {
        /*
            r7 = this;
            r0 = 1
            r7.f325606f = r0
            rt0.f r1 = r7.f325604d
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x002e
            java.lang.Integer r1 = r1.f331024X
            if (r1 == 0) goto L_0x002e
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.tencent.mm.plugin.appbrand.jsapi.h r6 = r7.f325601a
            int r6 = r6.getComponentId()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r2] = r6
            r5[r0] = r1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r4 = "AppBrandSecureInput#%s#%s"
            java.lang.String r1 = java.lang.String.format(r4, r1)
            java.lang.String r4 = "format(this, *args)"
            gy3.C87412m.m108593f(r1, r4)
            goto L_0x002f
        L_0x002e:
            r1 = r3
        L_0x002f:
            r7.f325608h = r1
            com.tencent.mm.plugin.appbrand.jsapi.h r1 = r7.f325601a
            com.tencent.mm.plugin.appbrand.jsapi.i$c r4 = r7.f325609i
            r1.mo114865m(r4)
            java.lang.String r1 = r7.f325608h
            if (r1 == 0) goto L_0x004d
            eb0.v0 r4 = eb0.C86493v0.m107224d()
            eb0.v0$c r1 = r4.mo120946b(r1)
            if (r1 == 0) goto L_0x004d
            java.lang.String r4 = "SecureInputValue"
            java.lang.String r1 = r1.mo120959f(r4, r3)
            goto L_0x004e
        L_0x004d:
            r1 = r3
        L_0x004e:
            if (r1 == 0) goto L_0x0058
            int r4 = r1.length()
            if (r4 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r0 = 0
        L_0x0058:
            if (r0 != 0) goto L_0x006f
            boolean r0 = r7.f325605e
            if (r0 != 0) goto L_0x006f
            jd.a r0 = r7.f325607g
            r0.setText(r1)
            com.tencent.mm.plugin.appbrand.widget.input.s0 r0 = r7.f325603c
            android.widget.EditText r0 = r0.getAttachedInputWidget()
            if (r0 == 0) goto L_0x007f
            r0.setText(r1)
            goto L_0x007f
        L_0x006f:
            jd.a r0 = r7.f325607g
            r0.setText(r3)
            com.tencent.mm.plugin.appbrand.widget.input.s0 r0 = r7.f325603c
            android.widget.EditText r0 = r0.getAttachedInputWidget()
            if (r0 == 0) goto L_0x007f
            r0.setText(r3)
        L_0x007f:
            jd.a r0 = r7.f325607g
            jd.i$b r1 = new jd.i$b
            r1.<init>(r7)
            r0.setListener(r1)
            com.tencent.mm.plugin.appbrand.widget.input.s0 r0 = r7.f325603c
            jd.a r1 = r7.f325607g
            r0.mo148911t(r1)
            r7.f325606f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p572jd.C108719i.mo159730a():void");
    }

    /* renamed from: b */
    public int mo159731b() {
        return this.f325603c.getMinimumHeight();
    }

    /* renamed from: c */
    public boolean mo159732c(EditText editText) {
        C87412m.m108594g(editText, MimeTypes.BASE_TYPE_TEXT);
        return true;
    }

    /* renamed from: d */
    public void mo159733d(boolean z) {
    }

    /* renamed from: e */
    public void mo159734e(int i) {
    }

    /* renamed from: f */
    public void mo159735f(EditText editText) {
        C87412m.m108594g(editText, MimeTypes.BASE_TYPE_TEXT);
    }

    /* renamed from: g */
    public void mo159736g(C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(lVar, "l");
    }

    public C110653f getParams() {
        return this.f325604d;
    }

    public View getView() {
        return this.f325603c;
    }

    /* renamed from: h */
    public void mo159739h(boolean z) {
        C104920s0 s0Var = this.f325603c;
        C82520h hVar = this.f325601a;
        s0Var.mo148913v(z, hVar instanceof C83780d1 ? ((C83780d1) hVar).mo116161P0() : null);
    }

    public void hideKeyboard() {
        String str;
        Editable m = mo159756m();
        String obj = m != null ? m.toString() : null;
        if (!(obj == null || (str = this.f325608h) == null)) {
            C86493v0.m107224d().mo120947c(str, true).mo120964k("SecureInputValue", obj);
        }
        C104920s0 s0Var = this.f325603c;
        Log.m105918d(s0Var.f311541e, "hide");
        s0Var.setVisibility(8);
        Log.m105918d(s0Var.f311541e, "resetFocusStatus");
        EditText editText = s0Var.f311544h;
        if (editText != null) {
            editText.clearFocus();
            s0Var.f311544h = null;
            s0Var.f311545i = null;
            s0Var.f311546j = false;
        }
    }

    /* renamed from: i */
    public void mo159741i(C77568i iVar) {
        C87412m.m108594g(iVar, "params");
        C110653f fVar = this.f325604d;
        if (fVar == null) {
            this.f325604d = (C110653f) iVar;
        } else {
            C87412m.m108591d(fVar);
            fVar.mo162196a(iVar);
            C68711c2.f197387a.mo94511a(fVar, iVar);
        }
        C108701a aVar = this.f325607g;
        C110653f fVar2 = this.f325604d;
        aVar.getClass();
        Log.m105918d("MicroMsg.DelegateEditText", "updateStyle");
        C110653f fVar3 = aVar.f325541A;
        if (fVar3 == null) {
            C87412m.m108592e(fVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.widget.input.params.InsertParams");
            aVar.f325541A = fVar2;
        } else if (fVar2 != null) {
            fVar3.mo162196a(fVar2);
            C68711c2.f197387a.mo94511a(fVar2, fVar2);
        }
        C8479f0 f0Var = new C8479f0();
        C110653f fVar4 = aVar.f325541A;
        T t = fVar4 != null ? fVar4.f226135I : null;
        f0Var.f27484d = t;
        if (t != null) {
            aVar.f325543w.setInputLength(t.intValue(), ((Number) f0Var.f27484d).intValue());
            aVar.setMaxEms(((Number) f0Var.f27484d).intValue());
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C76401c(f0Var, aVar));
    }

    /* renamed from: j */
    public void mo159742j(C84983t0.C84990i iVar) {
        C87412m.m108594g(iVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    /* renamed from: k */
    public /* bridge */ /* synthetic */ C68717h1 mo159743k() {
        return null;
    }

    /* renamed from: l */
    public void mo159744l(C110653f fVar) {
        C87412m.m108594g(fVar, "params");
        mo159741i(fVar);
    }

    /* renamed from: m */
    public final Editable mo159756m() {
        EditText attachedInputWidget = this.f325603c.getAttachedInputWidget();
        C87412m.m108592e(attachedInputWidget, "null cannot be cast to non-null type com.tencent.luggage.xweb_ext.extendplugin.input.DelegateEditText");
        return ((C108701a) attachedInputWidget).getRealText$luggage_xweb_ext_release();
    }

    public void setText(String str) {
        if (Util.isNullOrNil(str)) {
            this.f325605e = true;
        }
    }
}
