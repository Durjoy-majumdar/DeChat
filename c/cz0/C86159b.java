package cz0;

import a14.C53916l;
import a14.C53921m;
import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.text.InputFilter;
import android.widget.TextView;
import az0.C39663c;
import az0.C39664d;
import az0.C39665e;
import az0.C39666f;
import az0.C39668i;
import az0.C79640g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import java.lang.reflect.Array;
import kotlin.Result;
import nj3.C76912y0;
import p170ic.C87687a;
import p225rc.C89916g;
import p225rc.g$$e;
import p225rc.g$$h;
import rx3.C13598b0;
import sx3.C110823p;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import zt3.C119157j;

/* renamed from: cz0.b */
public final class C86159b {

    /* renamed from: cz0.b$a */
    public static final class C86160a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Activity f250686d;

        /* renamed from: e */
        public final /* synthetic */ Intent f250687e;

        /* renamed from: f */
        public final /* synthetic */ int f250688f;

        /* renamed from: g */
        public final /* synthetic */ C53916l<Instrumentation.ActivityResult> f250689g;

        /* renamed from: cz0.b$a$a */
        public static final class C86161a implements MMActivity.C6739d {

            /* renamed from: d */
            public final /* synthetic */ C53916l<Instrumentation.ActivityResult> f250690d;

            public C86161a(C53916l<? super Instrumentation.ActivityResult> lVar) {
                this.f250690d = lVar;
            }

            public final void mmOnActivityResult(int i, int i2, Intent intent) {
                C53916l<Instrumentation.ActivityResult> lVar = this.f250690d;
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(new Instrumentation.ActivityResult(i2, intent)));
            }
        }

        /* renamed from: cz0.b$a$b */
        public static final class C86162b implements MMFragmentActivity$$f {

            /* renamed from: a */
            public final /* synthetic */ C53916l<Instrumentation.ActivityResult> f250691a;

            public C86162b(C53916l<? super Instrumentation.ActivityResult> lVar) {
                this.f250691a = lVar;
            }

            public final void mmOnActivityResult(int i, int i2, Intent intent) {
                C53916l<Instrumentation.ActivityResult> lVar = this.f250691a;
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(new Instrumentation.ActivityResult(i2, intent)));
            }
        }

        /* renamed from: cz0.b$a$c */
        public static final class C86163c implements g$$e {

            /* renamed from: a */
            public final /* synthetic */ C53916l<Instrumentation.ActivityResult> f250692a;

            public C86163c(C53916l<? super Instrumentation.ActivityResult> lVar) {
                this.f250692a = lVar;
            }

            /* renamed from: a */
            public final void mo1626a(int i, Intent intent) {
                C53916l<Instrumentation.ActivityResult> lVar = this.f250692a;
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(new Instrumentation.ActivityResult(i, intent)));
            }
        }

        public C86160a(Activity activity, Intent intent, int i, C53916l<? super Instrumentation.ActivityResult> lVar) {
            this.f250686d = activity;
            this.f250687e = intent;
            this.f250688f = i;
            this.f250689g = lVar;
        }

        public final void run() {
            Activity activity = this.f250686d;
            if (activity instanceof MMActivity) {
                ((MMActivity) activity).mmStartActivityForResult(new C86161a(this.f250689g), this.f250687e, this.f250688f);
            } else if (activity instanceof MMFragmentActivity) {
                ((MMFragmentActivity) activity).mmStartActivityForResult(new C86162b(this.f250689g), this.f250687e, this.f250688f);
            } else if (activity instanceof g$$h) {
                C89916g.m112446a(activity).mo124236j(this.f250687e, new C86163c(this.f250689g));
            } else {
                Log.m105920e("CarLicensePlateViewUtils", "startForResultSuspended with invalid activity(" + this.f250686d + "), return CANCELED");
                C53916l<Instrumentation.ActivityResult> lVar = this.f250689g;
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(new Instrumentation.ActivityResult(0, (Intent) null)));
            }
        }
    }

    /* renamed from: cz0.b$b */
    public static final class C86164b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f250693d;

        /* renamed from: e */
        public final /* synthetic */ C53916l<C13598b0> f250694e;

        public C86164b(C32224a<C13598b0> aVar, C53916l<? super C13598b0> lVar) {
            this.f250693d = aVar;
            this.f250694e = lVar;
        }

        public final void run() {
            this.f250693d.invoke();
            C53916l<C13598b0> lVar = this.f250694e;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
    }

    /* renamed from: a */
    public static final void m106673a(TextView textView, InputFilter inputFilter) {
        Object obj;
        C87412m.m108594g(textView, "<this>");
        C87412m.m108594g(inputFilter, "filter");
        InputFilter[] filters = textView.getFilters();
        InputFilter[] filters2 = textView.getFilters();
        int length = filters2 != null ? filters2.length : 0;
        Class<?> componentType = filters != null ? filters.getClass().getComponentType() : inputFilter.getClass();
        if (filters != null) {
            int length2 = Array.getLength(filters);
            if (length > length2 || length < 0) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Index: ");
                stringBuffer.append(length);
                stringBuffer.append(", Length: ");
                stringBuffer.append(length2);
                throw new IndexOutOfBoundsException(stringBuffer.toString());
            }
            Object newInstance = Array.newInstance(componentType, length2 + 1);
            System.arraycopy(filters, 0, newInstance, 0, length);
            Array.set(newInstance, length, inputFilter);
            if (length < length2) {
                System.arraycopy(filters, length, newInstance, length + 1, length2 - length);
            }
            obj = newInstance;
        } else if (length == 0) {
            obj = Array.newInstance(componentType, 1);
            Array.set(obj, 0, inputFilter);
        } else {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Index: ");
            stringBuffer2.append(length);
            stringBuffer2.append(", Length: 0");
            throw new IndexOutOfBoundsException(stringBuffer2.toString());
        }
        Object[] objArr = (Object[]) obj;
        C87412m.m108592e(objArr, "null cannot be cast to non-null type kotlin.Array<out android.text.InputFilter>");
        textView.setFilters((InputFilter[]) objArr);
    }

    /* renamed from: b */
    public static final void m106674b(C39666f fVar) {
        C39666f fVar2 = fVar;
        C87412m.m108594g(fVar2, "<this>");
        if (-17502 == fVar2.f106439e) {
            C76912y0.m92767f(MMApplicationContext.getContext(), MMApplicationContext.getString(C0966R.string.avk));
            return;
        }
        C39663c<?, ?> cVar = fVar2.f106441g;
        String str = "";
        if (cVar instanceof C39665e) {
            Context context = MMApplicationContext.getContext();
            StringBuilder sb = new StringBuilder();
            sb.append(MMApplicationContext.getString(C0966R.string.av9));
            String[] strArr = new String[3];
            strArr[0] = String.valueOf(fVar2.f106438d);
            strArr[1] = String.valueOf(fVar2.f106439e);
            String str2 = fVar2.f106440f;
            if (str2 != null) {
                str = str2;
            }
            strArr[2] = str;
            sb.append(C110823p.m150987M(strArr, " ", "\n", (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 60, (Object) null));
            C76912y0.m92767f(context, sb.toString());
        } else if (cVar instanceof C39668i) {
            Context context2 = MMApplicationContext.getContext();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(MMApplicationContext.getString(C0966R.string.ava));
            String[] strArr2 = new String[3];
            strArr2[0] = String.valueOf(fVar2.f106438d);
            strArr2[1] = String.valueOf(fVar2.f106439e);
            String str3 = fVar2.f106440f;
            if (str3 != null) {
                str = str3;
            }
            strArr2[2] = str;
            sb4.append(C110823p.m150987M(strArr2, " ", "\n", (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 60, (Object) null));
            C76912y0.m92767f(context2, sb4.toString());
        } else if (cVar instanceof C39664d) {
            Context context3 = MMApplicationContext.getContext();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(MMApplicationContext.getString(C0966R.string.av8));
            String[] strArr3 = new String[3];
            strArr3[0] = String.valueOf(fVar2.f106438d);
            strArr3[1] = String.valueOf(fVar2.f106439e);
            String str4 = fVar2.f106440f;
            if (str4 != null) {
                str = str4;
            }
            strArr3[2] = str;
            sb5.append(C110823p.m150987M(strArr3, " ", "\n", (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 60, (Object) null));
            C76912y0.m92767f(context3, sb5.toString());
        } else if (cVar instanceof C79640g) {
            Context context4 = MMApplicationContext.getContext();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(MMApplicationContext.getString(C0966R.string.av_));
            String[] strArr4 = new String[3];
            strArr4[0] = String.valueOf(fVar2.f106438d);
            strArr4[1] = String.valueOf(fVar2.f106439e);
            String str5 = fVar2.f106440f;
            if (str5 != null) {
                str = str5;
            }
            strArr4[2] = str;
            sb6.append(C110823p.m150987M(strArr4, " ", "\n", (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 60, (Object) null));
            C76912y0.m92767f(context4, sb6.toString());
        }
    }

    /* renamed from: c */
    public static final Object m106675c(Activity activity, Intent intent, C15601d<? super Instrumentation.ActivityResult> dVar) {
        int a = C87687a.m109085a(activity);
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        ((C119157j) C119157j.f356862d).mo183895z(new C86160a(activity, intent, a, mVar));
        return mVar.mo74608o();
    }

    /* renamed from: d */
    public static final Object m106676d(C32224a<C13598b0> aVar, C15601d<? super C13598b0> dVar) {
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        ((C119157j) C119157j.f356862d).mo183895z(new C86164b(aVar, mVar));
        Object o = mVar.mo74608o();
        return o == C15911a.COROUTINE_SUSPENDED ? o : C13598b0.f38549a;
    }
}
