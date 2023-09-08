package xk3;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import com.tencent.neattextview.textview.view.NeatTextView;
import d62.C7240a;
import d62.C7241k;
import di3.C86312j;
import java.lang.ref.WeakReference;
import java.util.Map;
import o62.C11375e;
import wd3.C53155r0;

/* renamed from: xk3.f */
public class C15817f extends C11375e {

    /* renamed from: xk3.f$a */
    public class C15818a extends C7240a {

        /* renamed from: e */
        public final /* synthetic */ C11375e.C11377b f42613e;

        /* renamed from: f */
        public final /* synthetic */ Map f42614f;

        /* renamed from: g */
        public final /* synthetic */ Bundle f42615g;

        /* renamed from: h */
        public final /* synthetic */ WeakReference f42616h;

        /* renamed from: i */
        public final /* synthetic */ WeakReference f42617i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15818a(int i, C53155r0 r0Var, C11375e.C11377b bVar, Map map, Bundle bundle, WeakReference weakReference, WeakReference weakReference2) {
            super(i, r0Var);
            this.f42613e = bVar;
            this.f42614f = map;
            this.f42615g = bundle;
            this.f42616h = weakReference;
            this.f42617i = weakReference2;
        }

        /* renamed from: a */
        public void mo1118a(View view) {
            C15817f fVar = C15817f.this;
            C11375e.C11377b bVar = this.f42613e;
            WeakReference<C11375e.C11378c> weakReference = fVar.f33501d;
            if (!(weakReference == null || weakReference.get() == null)) {
                fVar.f33501d.get().mo11394I(view, bVar);
            }
            C15817f.this.getClass();
            ((C7241k) C86312j.m106911c(C7241k.class)).h80("link_revoke_qrcode", this.f42614f, this.f42615g, this.f42616h, this.f42617i);
        }
    }

    public C15817f(C11375e.C11378c cVar) {
        super(cVar);
    }

    /* renamed from: b */
    public String mo11238b() {
        return "link_revoke_qrcode";
    }

    /* renamed from: c */
    public CharSequence mo11239c(Map<String, String> map, String str, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2) {
        String str2 = str;
        String str3 = map.get(str + ".title");
        C11375e.C11377b bVar = new C11375e.C11377b(this);
        bVar.f33503a = map.get(str + ".username");
        bVar.f33504b = map.get(str + ".qrcode");
        SpannableString spannableString = new SpannableString(str3);
        spannableString.setSpan(new C15818a(1, (C53155r0) null, bVar, map, bundle, weakReference, weakReference2), 0, str3.length(), 33);
        return spannableString;
    }
}
