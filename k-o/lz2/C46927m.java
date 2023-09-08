package lz2;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.widget.TextView;
import az2.C39674e;
import b03.C39691c;
import b03.C39707j;
import b03.C39713l;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.NoMeasuredTextView;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kg3.C76577a;
import p629ny.C76979h;
import p773yy.C66710j;
import qy2.C47901s;
import qy2.C63347a;
import rz2.C48201c;
import rz2.C48212k;
import su0.C13781a;
import uz2.C52676d1;
import uz2.C52725x;
import z04.C112550d0;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: lz2.m */
public final class C46927m {

    /* renamed from: a */
    public static final C46927m f126173a = new C46927m();

    /* renamed from: b */
    public static final Map<Integer, C46933f> f126174b = new LinkedHashMap();

    /* renamed from: lz2.m$a */
    public static final class C46928a implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public static final C46928a f126175d = new C46928a();

        public final void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Log.m105924i("MicroMsg.TextStatus.TextStatusEventCenter", "TextStatusStorage notify " + str);
            C46927m mVar = C46927m.f126173a;
            C87412m.m108593f(str, "userName");
            C46927m.m52251a(mVar, str);
        }
    }

    /* renamed from: lz2.m$b */
    public static final class C46929b implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public static final C46929b f126176d = new C46929b();

        public final void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Log.m105924i("MicroMsg.TextStatus.TextStatusEventCenter", "TextStatusLikedStorage notify " + str);
            C46927m mVar = C46927m.f126173a;
            C87412m.m108593f(str, "userName");
            C46927m.m52251a(mVar, str);
        }
    }

    /* renamed from: lz2.m$c */
    public static final class C46930c implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public static final C46930c f126177d = new C46930c();

        public final void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Log.m105924i("MicroMsg.TextStatus.TextStatusEventCenter", "conversation notify " + str);
            C46927m mVar = C46927m.f126173a;
            String a = C13781a.m13082a();
            C87412m.m108593f(a, "username()");
            C46927m.m52251a(mVar, a);
        }
    }

    /* renamed from: lz2.m$d */
    public static final class C46931d implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public static final C46931d f126178d = new C46931d();

        public final void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            boolean z = false;
            if (mStorageEventData != null && mStorageEventData.eventId == 2) {
                z = true;
            }
            if (z) {
                Log.m105924i("MicroMsg.TextStatus.TextStatusEventCenter", "greeting notify");
                C46927m mVar = C46927m.f126173a;
                String a = C13781a.m13082a();
                C87412m.m108593f(a, "username()");
                C46927m.m52251a(mVar, a);
            }
        }
    }

    /* renamed from: lz2.m$e */
    public static final class C46932e implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public static final C46932e f126179d = new C46932e();

        public final void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            boolean z = true;
            if (mStorageEventData != null && mStorageEventData.eventId == 2) {
                C46927m mVar = C46927m.f126173a;
                String a = C13781a.m13082a();
                C87412m.m108593f(a, "username()");
                C46927m.m52251a(mVar, a);
            }
            String str2 = null;
            Object obj = mStorageEventData != null ? mStorageEventData.obj : null;
            C48212k kVar = obj instanceof C48212k ? (C48212k) obj : null;
            if (kVar != null) {
                str2 = kVar.field_sessionId;
            }
            if (str2 != null && !C112551y.m153811k(str2)) {
                z = false;
            }
            if (!z) {
                Log.m105918d("MicroMsg.TextStatus.TextStatusEventCenter", "stranger contact notify " + str2);
                C46927m.m52251a(C46927m.f126173a, str2);
            }
        }
    }

    /* renamed from: lz2.m$f */
    public static abstract class C46933f {

        /* renamed from: a */
        public String f126180a;

        /* renamed from: b */
        public WeakReference<Object> f126181b;

        public C46933f(Object obj, String str) {
            C87412m.m108594g(obj, "subject");
            C87412m.m108594g(str, "key");
            this.f126180a = str;
            this.f126181b = new WeakReference<>(obj);
            Map<Integer, C46933f> map = C46927m.f126174b;
            synchronized (map) {
                C46933f put = map.put(Integer.valueOf(obj.hashCode()), this);
            }
        }

        /* renamed from: a */
        public final WeakReference<Object> mo72121a() {
            WeakReference<Object> weakReference = this.f126181b;
            if (weakReference != null) {
                return weakReference;
            }
            C87412m.m108603p("ref");
            throw null;
        }

        /* renamed from: b */
        public abstract void mo72122b();
    }

    /* renamed from: lz2.m$g */
    public static final class C46934g extends C46933f {

        /* renamed from: c */
        public final C63347a.C47893d f126182c;

        /* renamed from: d */
        public final C63347a.C47892c f126183d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46934g(String str, TextView textView, C63347a.C47893d dVar, C63347a.C47892c cVar) {
            super(textView, str);
            C87412m.m108594g(str, "userName");
            C87412m.m108594g(textView, "iconTV");
            C87412m.m108594g(dVar, "iconType");
            C87412m.m108594g(cVar, "iconScene");
            this.f126182c = dVar;
            this.f126183d = cVar;
            mo72122b();
        }

        /* renamed from: b */
        public void mo72122b() {
            CharSequence M;
            Log.m105918d("MicroMsg.TextStatus.StatusSpanListener", "onChange " + this.f126180a);
            Object obj = mo72121a().get();
            TextView textView = obj instanceof TextView ? (TextView) obj : null;
            if (textView != null && (M = IStatusIconHelperKt.m39109a().mo62283M(textView, this.f126180a, textView.getText(), C76577a.m92151b(MMApplicationContext.getContext(), 20), this.f126182c, this.f126183d)) != null && !C87412m.m108589b(textView.getText(), M)) {
                textView.setText(M);
            }
        }
    }

    /* renamed from: lz2.m$h */
    public static final class C46935h extends C46933f {

        /* renamed from: c */
        public final C63347a.C47892c f126184c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46935h(String str, NoMeasuredTextView noMeasuredTextView, C63347a.C47892c cVar) {
            super(noMeasuredTextView, str);
            C87412m.m108594g(str, "userName");
            C87412m.m108594g(noMeasuredTextView, "iconTV");
            C87412m.m108594g(cVar, "iconScene");
            this.f126184c = cVar;
            mo72122b();
        }

        /* renamed from: b */
        public void mo72122b() {
            CharSequence M;
            Log.m105918d("MicroMsg.TextStatus.StatusSpanListenerNoMeasure", "onChange " + this.f126180a);
            Object obj = mo72121a().get();
            NoMeasuredTextView noMeasuredTextView = obj instanceof NoMeasuredTextView ? (NoMeasuredTextView) obj : null;
            if (noMeasuredTextView != null && (M = IStatusIconHelperKt.m39109a().mo62283M(noMeasuredTextView, this.f126180a, noMeasuredTextView.getText(), C76577a.m92151b(MMApplicationContext.getContext(), 20), C63347a.C47893d.OUTLINED, this.f126184c)) != null && !C87412m.m108589b(noMeasuredTextView.getText(), M)) {
                noMeasuredTextView.setText(M);
            }
        }
    }

    /* renamed from: lz2.m$i */
    public static final class C46936i extends C46933f {

        /* renamed from: c */
        public final C63347a.C47892c f126185c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46936i(String str, TextView textView, C63347a.C47892c cVar) {
            super(textView, str);
            C87412m.m108594g(str, "userName");
            C87412m.m108594g(textView, "iconTV");
            C87412m.m108594g(cVar, "iconScene");
            this.f126185c = cVar;
            mo72122b();
        }

        /* renamed from: b */
        public void mo72122b() {
            CharSequence M;
            Log.m105918d("MicroMsg.TextStatus.StatusSpanListenerTextView", "onChange " + this.f126180a);
            Object obj = mo72121a().get();
            TextView textView = obj instanceof TextView ? (TextView) obj : null;
            if (textView != null && (M = IStatusIconHelperKt.m39109a().mo62283M(textView, this.f126180a, textView.getText(), (int) textView.getTextSize(), C63347a.C47893d.OUTLINED, this.f126185c)) != null && !C87412m.m108589b(textView.getText(), M)) {
                textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).Te0(textView.getContext(), M, textView.getTextSize()));
            }
        }
    }

    /* renamed from: lz2.m$j */
    public static final class C46937j extends C46933f {

        /* renamed from: c */
        public final int f126186c;

        /* renamed from: d */
        public final C63347a.C47893d f126187d;

        /* renamed from: e */
        public final C63347a.C47892c f126188e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46937j(String str, TextView textView, int i, C63347a.C47893d dVar, C63347a.C47892c cVar) {
            super(textView, str);
            C87412m.m108594g(str, "userName");
            C87412m.m108594g(textView, "iconTV");
            C87412m.m108594g(dVar, "iconType");
            C87412m.m108594g(cVar, "iconScene");
            this.f126186c = i;
            this.f126187d = dVar;
            this.f126188e = cVar;
            mo72122b();
        }

        /* renamed from: b */
        public void mo72122b() {
            String str;
            int i;
            Log.m105918d("MicroMsg.TextStatus.StatusSpanWithDescListener", "onChange " + this.f126180a);
            Object obj = mo72121a().get();
            SpannableStringBuilder spannableStringBuilder = null;
            TextView textView = obj instanceof TextView ? (TextView) obj : null;
            if (textView != null) {
                C39691c a = IStatusIconHelperKt.m39109a();
                String str2 = this.f126180a;
                CharSequence text = textView.getText();
                int i2 = this.f126186c;
                C63347a.C47893d dVar = this.f126187d;
                C63347a.C47892c cVar = this.f126188e;
                a.getClass();
                C87412m.m108594g(dVar, "iconType");
                C87412m.m108594g(cVar, "iconScene");
                boolean z = false;
                if (!(str2 == null || C112551y.m153811k(str2))) {
                    if (!(text == null || text.length() == 0)) {
                        C48201c n0 = C39674e.f106452d.mo62253n0(str2);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        if (n0 != null) {
                            if (IStatusIconHelperKt.m39109a().mo62279I() || IStatusIconHelperKt.m39109a().mo62275E()) {
                                str = "";
                            } else {
                                str = ' ' + IStatusIconHelperKt.m39109a().mo62301m(C66710j.C53637a.m60171a(n0, false, 1, (Object) null));
                            }
                            String str3 = str;
                            ImageSpan k = IStatusIconHelperKt.m39109a().mo62299k(textView, n0.field_IconID, dVar, n0.mo72947p2() ? C63347a.C47891b.GREY : C63347a.C47891b.DEFAULT, cVar, i2, n0);
                            if (!C112550d0.m153804x(spannableStringBuilder2, 8199, false, 2, (Object) null)) {
                                spannableStringBuilder2.append(8199);
                            }
                            spannableStringBuilder2.append(str3);
                            spannableStringBuilder2.setSpan(k, 0, spannableStringBuilder2.length() - str3.length(), 34);
                            C39707j.f106537a.getClass();
                            C52676d1 d = C39713l.m42499d(C39707j.f106541e, n0.field_IconID);
                            C52725x h = d != null ? C39713l.m42503h(d) : null;
                            if (n0.mo72947p2()) {
                                i = MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_2);
                            } else {
                                if (h != null && C39713l.m42505j(h)) {
                                    z = true;
                                }
                                if (z) {
                                    try {
                                        i = Color.parseColor(h.f147291q);
                                    } catch (Throwable th) {
                                        Log.m105928w("MicroMsg.TextStatus.IStatusIconHelper", "hy: given color is incorrect.use default .e:" + th);
                                        i = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2971b1);
                                    }
                                } else {
                                    i = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2971b1);
                                }
                            }
                            spannableStringBuilder2.setSpan(new ForegroundColorSpan(i), spannableStringBuilder2.length() - str3.length(), spannableStringBuilder2.length(), 34);
                            z = true;
                        }
                        if (z) {
                            spannableStringBuilder = spannableStringBuilder2;
                        }
                    }
                }
                if (spannableStringBuilder != null && !C87412m.m108589b(textView.getText(), spannableStringBuilder)) {
                    textView.setTextSize(10.0f);
                    textView.setText(spannableStringBuilder);
                    textView.requestLayout();
                }
            }
        }
    }

    /* renamed from: lz2.m$k */
    public static final class C46938k extends C46933f {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46938k(String str, C47901s sVar) {
            super(sVar, str);
            C87412m.m108594g(str, "userName");
            C87412m.m108594g(sVar, "statusUpdate");
        }

        /* renamed from: b */
        public void mo72122b() {
            Log.m105924i("MicroMsg.TextStatus.StatusCardListener", "StatusCardListener onChange " + this.f126180a);
            Object obj = mo72121a().get();
            C47901s sVar = obj instanceof C47901s ? (C47901s) obj : null;
            if (sVar != null) {
                sVar.mo72650h(this.f126180a);
            }
        }
    }

    static {
        C39674e eVar = C39674e.f106452d;
        eVar.mo62255t0().add(C46928a.f126175d);
        eVar.mo62246S().add(C46929b.f126176d);
        eVar.mo62238D().add(C46930c.f126177d);
        eVar.mo62243O().add(C46931d.f126178d);
        eVar.mo62239E0().add(C46932e.f126179d);
    }

    /* renamed from: a */
    public static final void m52251a(C46927m mVar, String str) {
        mVar.getClass();
        Log.m105924i("MicroMsg.TextStatus.TextStatusEventCenter", "onNotify " + str);
        ((C119157j) C119157j.f356862d).mo183895z(new C46939n(str));
    }
}
