package o40;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.LiveData;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.tmassistantsdk.downloadservice.ByteRange;
import com.tencent.xweb.file.XVFSFile;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import kg3.C76577a;
import lp3.C88629c;
import lu3.C109426i;
import lu3.C34379c;
import pe3.C47465a;
import rx3.C13598b0;
import sx3.C64175a0;
import z04.C112551y;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: o40.c */
public final class C61926c {

    /* renamed from: a */
    public static final Pattern f176038a = Pattern.compile("%([0-9]+\\$|<?)([^a-zA-z%]*)([[a-zA-Z%]&&[^tT]]|[tT][a-zA-Z])");

    /* renamed from: o40.c$h */
    public static final class C11346h<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C32226l<T, R> f33439a;

        public C11346h(C32226l<? super T, ? extends R> lVar) {
            this.f33439a = lVar;
        }

        public final R call(T t) {
            return this.f33439a.invoke(t);
        }
    }

    /* renamed from: o40.c$l */
    public static final class C11347l<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C32226l<T, R> f33440a;

        public C11347l(C32226l<? super T, ? extends R> lVar) {
            this.f33440a = lVar;
        }

        public final R call(T t) {
            return this.f33440a.invoke(t);
        }
    }

    /* renamed from: o40.c$g */
    public static final class C35098g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f94166d;

        public C35098g(C32224a aVar) {
            this.f94166d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f94166d.invoke();
        }
    }

    /* renamed from: o40.c$i */
    public static final class C35099i implements C109426i {

        /* renamed from: d */
        public final /* synthetic */ String f94167d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f94168e;

        /* renamed from: f */
        public final /* synthetic */ boolean f94169f;

        public C35099i(String str, C32224a<C13598b0> aVar, boolean z) {
            this.f94167d = str;
            this.f94168e = aVar;
            this.f94169f = z;
        }

        public String getKey() {
            return this.f94167d;
        }

        public boolean isLogging() {
            return this.f94169f;
        }

        public void run() {
            this.f94168e.invoke();
        }
    }

    /* renamed from: o40.c$j */
    public static final class C35100j implements C109426i {

        /* renamed from: d */
        public final /* synthetic */ String f94170d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f94171e;

        /* renamed from: f */
        public final /* synthetic */ boolean f94172f;

        public C35100j(String str, C32224a<C13598b0> aVar, boolean z) {
            this.f94170d = str;
            this.f94171e = aVar;
            this.f94172f = z;
        }

        public String getKey() {
            return this.f94170d + '#' + C112551y.m153817q(this.f94171e.getClass().getName(), "com.tencent.mm", "", true);
        }

        public boolean isLogging() {
            return this.f94172f;
        }

        public void run() {
            this.f94171e.invoke();
        }
    }

    /* renamed from: o40.c$k */
    public static final class C35101k implements C109426i {

        /* renamed from: d */
        public final /* synthetic */ String f94173d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f94174e;

        /* renamed from: f */
        public final /* synthetic */ boolean f94175f;

        public C35101k(String str, C32224a<C13598b0> aVar, boolean z) {
            this.f94173d = str;
            this.f94174e = aVar;
            this.f94175f = z;
        }

        public String getKey() {
            return this.f94173d + '#' + C112551y.m153817q(this.f94174e.getClass().getName(), "com.tencent.mm", "", true);
        }

        public boolean isLogging() {
            return this.f94175f;
        }

        public void run() {
            this.f94174e.invoke();
        }
    }

    /* renamed from: o40.c$a */
    public static final class C61927a implements View.OnLayoutChangeListener {

        /* renamed from: d */
        public final C32224a<C13598b0> f176039d;

        /* renamed from: e */
        public final /* synthetic */ View f176040e;

        /* renamed from: o40.c$a$a */
        public static final class C61928a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C32224a<C13598b0> f176041d;

            /* renamed from: e */
            public final /* synthetic */ View f176042e;

            /* renamed from: f */
            public final /* synthetic */ C61927a f176043f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C61928a(C32224a<C13598b0> aVar, View view, C61927a aVar2) {
                super(0);
                this.f176041d = aVar;
                this.f176042e = view;
                this.f176043f = aVar2;
            }

            public Object invoke() {
                this.f176041d.invoke();
                this.f176042e.removeOnLayoutChangeListener(this.f176043f);
                return C13598b0.f38549a;
            }
        }

        public C61927a(C32224a<C13598b0> aVar, View view) {
            this.f176040e = view;
            this.f176039d = new C61928a(aVar, view, this);
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (view == null) {
                this.f176040e.removeCallbacks(new C35098g(this.f176039d));
                this.f176040e.removeOnLayoutChangeListener(this);
                return;
            }
            this.f176040e.removeCallbacks(new C35098g(this.f176039d));
            this.f176040e.postDelayed(new C35098g(this.f176039d), 100);
        }
    }

    /* renamed from: o40.c$b */
    public static final class C61929b implements View.OnAttachStateChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C61927a f176044d;

        /* renamed from: e */
        public final /* synthetic */ View f176045e;

        public C61929b(C61927a aVar, View view) {
            this.f176044d = aVar;
            this.f176045e = view;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            this.f176044d.onLayoutChange((View) null, 0, 0, 0, 0, 0, 0, 0, 0);
            this.f176045e.removeOnLayoutChangeListener(this.f176044d);
        }
    }

    /* renamed from: o40.c$c */
    public static final class C61930c implements View.OnLayoutChangeListener {

        /* renamed from: d */
        public final /* synthetic */ View f176046d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f176047e;

        /* renamed from: o40.c$c$a */
        public static final class C61931a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C32224a<C13598b0> f176048d;

            public C61931a(C32224a<C13598b0> aVar) {
                this.f176048d = aVar;
            }

            public final void run() {
                this.f176048d.invoke();
            }
        }

        public C61930c(View view, C32224a<C13598b0> aVar) {
            this.f176046d = view;
            this.f176047e = aVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f176046d.post(new C61931a(this.f176047e));
            this.f176046d.removeOnLayoutChangeListener(this);
        }
    }

    /* renamed from: o40.c$d */
    public static final class C61932d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a<R> f176049d;

        /* renamed from: e */
        public final /* synthetic */ boolean f176050e;

        /* renamed from: f */
        public final /* synthetic */ HandlerThread f176051f;

        public C61932d(C32224a<? extends R> aVar, boolean z, HandlerThread handlerThread) {
            this.f176049d = aVar;
            this.f176050e = z;
            this.f176051f = handlerThread;
        }

        public final void run() {
            this.f176049d.invoke();
            if (this.f176050e) {
                this.f176051f.quitSafely();
            }
        }
    }

    /* renamed from: o40.c$e */
    public static final class C61933e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveData<T> f176052d;

        /* renamed from: e */
        public final /* synthetic */ C0120a0<T> f176053e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61933e(LiveData<T> liveData, C0120a0<T> a0Var) {
            super(0);
            this.f176052d = liveData;
            this.f176053e = a0Var;
        }

        public Object invoke() {
            this.f176052d.observeForever(this.f176053e);
            ((C119157j) C119157j.f356862d).mo183895z(new C61935d(this.f176052d, this.f176053e));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: o40.c$f */
    public static final class C61934f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveData<T> f176054d;

        /* renamed from: e */
        public final /* synthetic */ C0125s f176055e;

        /* renamed from: f */
        public final /* synthetic */ C0120a0<T> f176056f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61934f(LiveData<T> liveData, C0125s sVar, C0120a0<T> a0Var) {
            super(0);
            this.f176054d = liveData;
            this.f176055e = sVar;
            this.f176056f = a0Var;
        }

        public Object invoke() {
            this.f176054d.observe(this.f176055e, this.f176056f);
            ((C119157j) C119157j.f356862d).mo183895z(new C61936e(this.f176054d, this.f176055e, this.f176056f));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: A */
    public static final void m72656A(String str, C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "block");
        if (str == null || str.length() == 0) {
            try {
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                if (stackTrace != null) {
                    if (stackTrace.length >= 4) {
                        String className = stackTrace[3].getClassName();
                        C87412m.m108593f(className, "stackTrace[3].className");
                        String substring = className.substring(15);
                        C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                        str = (substring + XVFSFile.PATH_SEPARATOR_CHAR + stackTrace[3].getMethodName()) + '[' + stackTrace[3].getLineNumber() + ']';
                    }
                }
            } catch (Throwable unused) {
            }
            str = "";
        }
        m72657B(str, true, aVar);
    }

    /* renamed from: B */
    public static final void m72657B(String str, boolean z, C32224a<C13598b0> aVar) {
        C87412m.m108594g(str, "taskName");
        C87412m.m108594g(aVar, "block");
        ((C119157j) C119157j.f356862d).mo183875f(new C35099i(str, aVar, z));
    }

    /* renamed from: C */
    public static /* synthetic */ void m72658C(String str, C32224a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m72656A(str, aVar);
    }

    /* renamed from: D */
    public static /* synthetic */ void m72659D(String str, boolean z, C32224a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        m72657B(str, z, aVar);
    }

    /* renamed from: E */
    public static final C34379c<?> m72660E(String str, boolean z, C32224a<C13598b0> aVar) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(aVar, "block");
        C119179t tVar = C119157j.f356862d;
        C35100j jVar = new C35100j(str, aVar, z);
        C119157j jVar2 = (C119157j) tVar;
        jVar2.getClass();
        C34379c<?> j = jVar2.mo183879j(jVar, 0, str);
        C87412m.m108593f(j, "tag: String, isPrintLog:…og\n        }\n\n    }, tag)");
        return j;
    }

    /* renamed from: F */
    public static final void m72661F(String str, C32224a<C13598b0> aVar) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(aVar, "block");
        m72660E(str, true, aVar);
    }

    /* renamed from: G */
    public static final void m72662G(String str, boolean z, C32224a<C13598b0> aVar, long j) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(aVar, "block");
        ((C119157j) C119157j.f356862d).mo183879j(new C35101k(str, aVar, z), j, str);
    }

    /* renamed from: H */
    public static /* synthetic */ void m72663H(String str, boolean z, C32224a aVar, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            j = 0;
        }
        m72662G(str, z, aVar, j);
    }

    /* renamed from: I */
    public static final Bitmap m72664I(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        int[] iArr = new int[(bitmap.getWidth() * bitmap.getHeight())];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        createBitmap.setPixels(iArr, 0, createBitmap.getWidth(), 0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    /* renamed from: J */
    public static final <T, R> C88629c<R> m72665J(C88629c<T> cVar, C32226l<? super T, ? extends R> lVar) {
        C87412m.m108594g(cVar, "<this>");
        C87412m.m108594g(lVar, "func");
        C88629c<_Ret> e = cVar.mo123062e(new C11347l(lVar));
        C87412m.m108593f(e, "func: (t: T?) -> R?): Pi… {\n        func(it)\n    }");
        return e;
    }

    /* renamed from: K */
    public static final void m72666K(long j, C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "block");
        MMHandlerThread.postToMainThreadDelayed(new C35098g(aVar), j);
    }

    /* renamed from: L */
    public static final void m72667L(long j, Runnable runnable) {
        C87412m.m108594g(runnable, "task");
        MMHandlerThread.postToMainThreadDelayed(runnable, j);
    }

    /* renamed from: M */
    public static final void m72668M(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "block");
        if (C87412m.m108589b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            aVar.invoke();
        } else {
            MMHandlerThread.postToMainThread(new C35098g(aVar));
        }
    }

    /* renamed from: N */
    public static final void m72669N(Runnable runnable) {
        C87412m.m108594g(runnable, "task");
        if (C87412m.m108589b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            runnable.run();
        } else {
            MMHandlerThread.postToMainThread(runnable);
        }
    }

    /* renamed from: O */
    public static final <T> T m72670O(byte[] bArr, Parcelable.Creator<T> creator) {
        C87412m.m108594g(bArr, ByteRange.BYTES_UNIT);
        C87412m.m108594g(creator, "creator");
        Parcel obtain = Parcel.obtain();
        C87412m.m108593f(obtain, "obtain()");
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    /* renamed from: P */
    public static final long m72671P(String str) {
        if (str == null) {
            return 0;
        }
        if (str.length() == 0) {
            return 0;
        }
        try {
            return new BigInteger(str).longValue();
        } catch (Throwable th) {
            Log.printErrStackTrace("Common.Kt", th, "", new Object[0]);
            return 0;
        }
    }

    /* renamed from: Q */
    public static final <T> T m72672Q(HashSet<T> hashSet, C32226l<? super T, Boolean> lVar) {
        C87412m.m108594g(hashSet, "<this>");
        C87412m.m108594g(lVar, "func");
        Iterator<T> it = hashSet.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (lVar.invoke(next).booleanValue()) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    /* renamed from: R */
    public static final <T> boolean m72673R(ArrayList<T> arrayList, C32226l<? super T, Boolean> lVar) {
        C87412m.m108594g(arrayList, "<this>");
        C87412m.m108594g(lVar, "func");
        ArrayList<Object> arrayList2 = new ArrayList<>();
        for (T next : arrayList) {
            if (lVar.invoke(next).booleanValue()) {
                arrayList2.add(next);
            }
        }
        boolean z = !arrayList2.isEmpty();
        for (Object remove : arrayList2) {
            arrayList.remove(remove);
        }
        return z;
    }

    /* renamed from: S */
    public static final <T> boolean m72674S(Collection<T> collection, C32226l<? super T, Boolean> lVar) {
        C87412m.m108594g(collection, "<this>");
        C87412m.m108594g(lVar, "f");
        ArrayList<Object> arrayList = new ArrayList<>();
        for (T next : collection) {
            if (lVar.invoke(next).booleanValue()) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (Object remove : arrayList) {
            collection.remove(remove);
        }
        return true;
    }

    /* renamed from: T */
    public static final <T> boolean m72675T(LinkedList<T> linkedList, C32226l<? super T, Boolean> lVar) {
        C87412m.m108594g(linkedList, "<this>");
        C87412m.m108594g(lVar, "func");
        LinkedList<Object> linkedList2 = new LinkedList<>();
        for (T next : linkedList) {
            if (lVar.invoke(next).booleanValue()) {
                linkedList2.add(next);
            }
        }
        boolean z = !linkedList2.isEmpty();
        for (Object remove : linkedList2) {
            linkedList.remove(remove);
        }
        return z;
    }

    /* renamed from: a */
    public static final void m72676a(View view, C32224a<C13598b0> aVar) {
        C87412m.m108594g(view, "<this>");
        C87412m.m108594g(aVar, "call");
        C61927a aVar2 = new C61927a(aVar, view);
        view.addOnLayoutChangeListener(aVar2);
        C61929b bVar = new C61929b(aVar2, view);
        Object tag = view.getTag(C0966R.C0970id.f5472g2);
        View.OnAttachStateChangeListener onAttachStateChangeListener = tag instanceof View.OnAttachStateChangeListener ? (View.OnAttachStateChangeListener) tag : null;
        if (onAttachStateChangeListener != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        view.addOnAttachStateChangeListener(bVar);
        view.setTag(C0966R.C0970id.f5472g2, bVar);
    }

    /* renamed from: b */
    public static final void m72677b(View view, C32224a<C13598b0> aVar) {
        C87412m.m108594g(view, "<this>");
        C87412m.m108594g(aVar, "call");
        view.addOnLayoutChangeListener(new C61930c(view, aVar));
    }

    /* renamed from: c */
    public static final void m72678c(TextView textView) {
        C87412m.m108594g(textView, "textView");
        textView.setShadowLayer((float) C76577a.m92151b(textView.getContext(), 3), 0.0f, (float) C76577a.m92151b(textView.getContext(), 1), Integer.MIN_VALUE);
    }

    /* renamed from: d */
    public static void m72679d(Intent intent, Bundle bundle, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        C87412m.m108594g(intent, "<this>");
        C87412m.m108594g(str, "key");
        intent.putExtra(str, bundle != null ? Boolean.valueOf(bundle.getBoolean(str, z)) : null);
    }

    /* renamed from: e */
    public static void m72680e(Intent intent, Intent intent2, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        C87412m.m108594g(intent, "<this>");
        C87412m.m108594g(str, "key");
        intent.putExtra(str, intent2 != null ? Integer.valueOf(intent2.getIntExtra(str, i)) : null);
    }

    /* renamed from: f */
    public static void m72681f(Intent intent, Bundle bundle, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        C87412m.m108594g(intent, "<this>");
        C87412m.m108594g(str, "key");
        intent.putExtra(str, bundle != null ? Integer.valueOf(bundle.getInt(str, i)) : null);
    }

    /* renamed from: g */
    public static void m72682g(Intent intent, Bundle bundle, String str, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 0;
        }
        C87412m.m108594g(intent, "<this>");
        C87412m.m108594g(str, "key");
        intent.putExtra(str, bundle != null ? Long.valueOf(bundle.getLong(str, j)) : null);
    }

    /* renamed from: h */
    public static final void m72683h(Intent intent, Bundle bundle, String str) {
        C87412m.m108594g(intent, "<this>");
        C87412m.m108594g(str, "key");
        intent.putExtra(str, bundle != null ? bundle.getStringArrayList(str) : null);
    }

    /* renamed from: i */
    public static final void m72684i(Intent intent, Bundle bundle, String str) {
        C87412m.m108594g(intent, "<this>");
        C87412m.m108594g(str, "key");
        intent.putExtra(str, bundle != null ? bundle.getString(str) : null);
    }

    /* renamed from: j */
    public static final <R> HandlerThread m72685j(String str, boolean z, C32224a<? extends R> aVar) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(aVar, "block");
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a(str, 5);
        a.start();
        new MMHandler(a.getLooper()).post(new C61932d(aVar, z, a));
        return a;
    }

    /* renamed from: k */
    public static final Bitmap m72686k(Drawable drawable) {
        C87412m.m108594g(drawable, "drawable");
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        C87412m.m108593f(createBitmap, "bitmap");
        return createBitmap;
    }

    /* renamed from: l */
    public static final <T> LongSparseArray<T> m72687l(LongSparseArray<T> longSparseArray, C32227p<? super Long, ? super T, Boolean> pVar) {
        C87412m.m108594g(longSparseArray, "<this>");
        C87412m.m108594g(pVar, "func");
        LongSparseArray<T> longSparseArray2 = new LongSparseArray<>();
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long keyAt = longSparseArray.keyAt(i);
            T valueAt = longSparseArray.valueAt(i);
            if (pVar.invoke(Long.valueOf(keyAt), valueAt).booleanValue()) {
                longSparseArray2.put(keyAt, valueAt);
            }
        }
        return longSparseArray2;
    }

    /* renamed from: m */
    public static final Rect m72688m(View view) {
        C87412m.m108594g(view, "<this>");
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    /* renamed from: n */
    public static final int[] m72689n(View view) {
        C87412m.m108594g(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr;
    }

    /* renamed from: o */
    public static final int[] m72690o(View view) {
        C87412m.m108594g(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* renamed from: p */
    public static final String m72691p(long j) {
        String bigInteger = new BigInteger(Long.toBinaryString(j), 2).toString();
        C87412m.m108593f(bigInteger, "big.toString()");
        return bigInteger;
    }

    /* renamed from: q */
    public static final byte[] m72692q(Parcelable parcelable) {
        C87412m.m108594g(parcelable, "parcelable");
        Parcel obtain = Parcel.obtain();
        C87412m.m108593f(obtain, "obtain()");
        parcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        C87412m.m108593f(marshall, ByteRange.BYTES_UNIT);
        return marshall;
    }

    /* renamed from: r */
    public static final void m72693r(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "block");
        if (!C87412m.m108589b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            aVar.invoke();
        } else {
            m72656A((String) null, aVar);
        }
    }

    /* renamed from: s */
    public static final <T> void m72694s(LiveData<T> liveData, C0120a0<T> a0Var) {
        C87412m.m108594g(liveData, "<this>");
        C87412m.m108594g(a0Var, "observer");
        m72668M(new C61933e(liveData, a0Var));
    }

    /* renamed from: t */
    public static final <T> void m72695t(LiveData<T> liveData, C0125s sVar, C0120a0<T> a0Var) {
        C87412m.m108594g(liveData, "<this>");
        C87412m.m108594g(sVar, "owner");
        C87412m.m108594g(a0Var, "observer");
        m72668M(new C61934f(liveData, sVar, a0Var));
    }

    /* renamed from: u */
    public static final boolean m72696u(int i, int i2) {
        return (i & i2) > 0;
    }

    /* renamed from: v */
    public static final boolean m72697v(long j, long j2) {
        return (j & j2) > 0;
    }

    /* renamed from: w */
    public static final void m72698w(Runnable runnable) {
        C87412m.m108594g(runnable, "task");
        MMHandlerThread.removeRunnable(runnable);
    }

    /* renamed from: x */
    public static final <T extends C47465a> byte[] m72699x(T t) {
        if (t == null) {
            return null;
        }
        try {
            return t.toByteArray();
        } catch (Exception e) {
            Log.printInfoStack("safeToByteArray", "", e);
            return null;
        }
    }

    /* renamed from: y */
    public static final <T> boolean m72700y(List<T> list, C32226l<? super T, Boolean> lVar) {
        boolean t;
        C87412m.m108594g(list, "<this>");
        C87412m.m108594g(lVar, "predicate");
        synchronized (list) {
            t = C64175a0.m75512t(list, lVar);
        }
        return t;
    }

    /* renamed from: z */
    public static final <R, T> C88629c<R> m72701z(C88629c<T> cVar, C32226l<? super T, ? extends R> lVar) {
        C87412m.m108594g(cVar, "<this>");
        C87412m.m108594g(lVar, "func");
        C88629c<_Ret> d = cVar.mo123057H(C61938i.f176062a).mo123061d(new C11346h(lVar));
        C87412m.m108593f(d, "func: (t: T?) -> R?): Pi… {\n        func(it)\n    }");
        return d;
    }
}
