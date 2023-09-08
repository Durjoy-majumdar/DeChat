package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.text.Spanned;
import android.widget.EditText;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import qn3.C77382c;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.d0 */
public final class C68712d0 extends C77382c {

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.d0$a */
    public static abstract class C68713a implements C77382c.C77383a {
        /* renamed from: L3 */
        public void mo4084L3(String str) {
        }

        /* renamed from: P4 */
        public void mo4086P4(String str) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.d0$b */
    public final class C68714b extends C45078p0 {

        /* renamed from: f */
        public final int f197388f;

        /* renamed from: g */
        public final C45078p0.C45079a f197389g;

        /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.d0$b$a */
        public class C68715a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C77382c.C77383a f197391d;

            /* renamed from: e */
            public final /* synthetic */ String f197392e;

            public C68715a(C68714b bVar, C77382c.C77383a aVar, String str) {
                this.f197391d = aVar;
                this.f197392e = str;
            }

            public void run() {
                this.f197391d.mo4083L0(this.f197392e);
            }
        }

        public C68714b(int i, C45078p0.C45079a aVar) {
            super(i, aVar);
            this.f197388f = i;
            this.f197389g = aVar;
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            sb.append(spanned.subSequence(0, i3).toString());
            sb.append(spanned.subSequence(i4, spanned.length()).toString());
            int e = C45078p0.m49926e(sb.toString(), this.f197389g) + C45078p0.m49926e(charSequence.subSequence(i, i2).toString(), this.f197389g);
            int i5 = this.f197388f;
            if (e > i5) {
                z = true;
            }
            if (z) {
                charSequence = charSequence.subSequence(i, Math.max(i, Math.min(i5 - (spanned.length() - (i4 - i3)), i2)));
            }
            if (z && Util.isNullOrNil(charSequence)) {
                WeakReference<EditText> weakReference = C68712d0.this.f225608b;
                EditText editText = weakReference == null ? null : weakReference.get();
                C77382c.C77383a aVar = C68712d0.this.f225614h;
                if (!(editText == null || aVar == null)) {
                    editText.post(new C68715a(this, aVar, editText.getText() != null ? editText.getText().toString() : ""));
                }
            }
            return charSequence;
        }
    }

    public C68712d0(WeakReference<EditText> weakReference) {
        super(weakReference);
    }

    /* renamed from: g */
    public static C68712d0 m80987g(EditText editText) {
        return new C68712d0(new WeakReference(editText));
    }

    /* renamed from: f */
    public C45078p0 mo79812f(int i, C45078p0.C45079a aVar) {
        return new C68714b(i, aVar);
    }
}
