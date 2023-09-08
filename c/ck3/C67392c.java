package ck3;

import android.animation.Animator;
import android.app.Activity;
import android.app.Instrumentation;
import android.os.Handler;
import android.os.Looper;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.autogen.mmdata.rpt.ErrorMsgInfoStruct;
import com.tencent.p014mm.p136ui.chatting.C73672d2;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.ChattingUIProxy;
import com.tencent.p014mm.p136ui.chatting.view.MMChattingListView;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72826s1;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.observer.MvvmObserverOwner;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import ob0.C11385n;
import q31.C118148a;
import ro3.C110584g;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import sx3.C26236u;
import sx3.C64197v;
import uo3.C78253a;
import wk3.C78606a;
import z04.C112551y;

/* renamed from: ck3.c */
public final class C67392c implements C67400j {

    /* renamed from: a */
    public static final C67392c f193301a = new C67392c();

    /* renamed from: b */
    public static final boolean f193302b = BuildInfo.DEBUG;

    /* renamed from: c */
    public static final HashSet<String> f193303c = new HashSet<>();

    /* renamed from: d */
    public static final List<C13604l<Class<? extends Object>, List<String>>> f193304d = C64197v.m75537f(new C13604l(MTimerHandler.CallBack.class, C26236u.m33719b("*")), new C13604l(C67398g.class, C26236u.m33719b("*")), new C13604l(C67397f.class, C26236u.m33719b("*")), new C13604l(View.class, C64197v.m75537f("layout", "performClick", "measure", "dispatchApplyWindowInsets", "updateDisplayListIfDirty", "performLongClick", "onConfigurationChanged")), new C13604l(ViewGroup.class, C26236u.m33719b("dispatchTouchEvent")), new C13604l(ChattingUIFragment.class, C64197v.m75537f("onSwipeBack", "onActivityResult", "triggerGoBack", "onConfigurationChanged")), new C13604l(C74023i.class, C64197v.m75537f("fillingItem", "onItemClick")), new C13604l(Activity.class, C64197v.m75537f("onSaveInstanceState", "onActivityResult", "dispatchKeyEvent", "onRequestPermissionsResult")), new C13604l(FragmentManager.class, C26236u.m33719b("moveToState")), new C13604l(RecyclerView.C16613e.class, C26236u.m33719b("onBindViewHolder")), new C13604l(RecyclerView.class, C64197v.m75537f("dispatchOnScrollStateChanged", "dispatchOnScrolled")), new C13604l(Instrumentation.class, C26236u.m33719b("*")), new C13604l(AbsListView.class, C26236u.m33719b("performItemClick")), new C13604l(MMChattingListView.class, C64197v.m75537f("onTopLoadData", "onBottomLoadData")), new C13604l(View.OnClickListener.class, C26236u.m33719b("onClick")), new C13604l(C73672d2.class, C26236u.m33719b("onDoubleClick")), new C13604l(C78606a.class, C26236u.m33719b("onLoad")), new C13604l(TextWatcher.class, C64197v.m75537f("onTextChanged", "beforeTextChanged", "afterTextChanged")), new C13604l(C118148a.class, C26236u.m33719b("*")), new C13604l(KeyboardHeightProvider.class, C26236u.m33719b("*")), new C13604l(ChattingUIProxy.class, C26236u.m33719b("*")), new C13604l(C72826s1.class, C64197v.m75537f("show", "checkIfShow")), new C13604l(Animator.AnimatorListener.class, C26236u.m33719b("*")), new C13604l(AdapterView.OnItemLongClickListener.class, C26236u.m33719b("onItemLongClick")), new C13604l(C110584g.class, C26236u.m33719b("*")), new C13604l(C78253a.class, C26236u.m33719b("*")));

    /* renamed from: e */
    public static final List<String> f193305e = C26236u.m33719b(".ui.widget.textview.SelectableTextHelper");

    /* renamed from: f */
    public static final List<String> f193306f = C64197v.m75537f("EmojiEggComponent$eggMsgFilter", "com.tencent.mm.plugin.datareport");

    /* renamed from: g */
    public static final List<C13604l<Class<? extends Object>, List<String>>> f193307g = C64197v.m75537f(new C13604l(MStorageEvent.class, C26236u.m33719b("processEvent")), new C13604l(MvvmObserverOwner.class, C26236u.m33719b("notify")));

    /* renamed from: h */
    public static final C13601g f193308h = C36568h.m40985a(C0650b.f1537d);

    /* renamed from: ck3.c$b */
    public static final class C0650b extends C87413o implements C32224a<List<C13604l<? extends Class<? extends Object>, ? extends List<? extends String>>>> {

        /* renamed from: d */
        public static final C0650b f1537d = new C0650b();

        public C0650b() {
            super(0);
        }

        public Object invoke() {
            List h = C64197v.m75539h(new C13604l(Handler.class, C26236u.m33719b("handleMessage")), new C13604l(IListener.class, C26236u.m33719b("callback")), new C13604l(C11385n.class, C26236u.m33719b("onSceneEnd")), new C13604l(Runnable.class, C26236u.m33719b("run")));
            try {
                h.add(new C13604l(Class.forName("gy3.o"), C26236u.m33719b("invoke")));
            } catch (Throwable th) {
                Log.printErrStackTrace("ChatCheck.checker", th, "parse kt lambda err", new Object[0]);
            }
            try {
                h.add(new C13604l(Class.forName("yx3.j"), C26236u.m33719b("invokeSuspend")));
            } catch (Throwable th4) {
                Log.printErrStackTrace("ChatCheck.checker", th4, "parse kt suspend lambda err", new Object[0]);
            }
            return h;
        }
    }

    /* renamed from: ck3.c$a */
    public static final class C67393a {

        /* renamed from: c */
        public static final C67393a f193309c = new C67393a(true, (String) null);

        /* renamed from: a */
        public final boolean f193310a;

        /* renamed from: b */
        public final String f193311b;

        public C67393a(boolean z, String str) {
            this.f193310a = z;
            this.f193311b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C67393a)) {
                return false;
            }
            C67393a aVar = (C67393a) obj;
            return this.f193310a == aVar.f193310a && C87412m.m108589b(this.f193311b, aVar.f193311b);
        }

        public int hashCode() {
            boolean z = this.f193310a;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            String str = this.f193311b;
            return i + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "CheckResult(isValid=" + this.f193310a + ", extraInfo=" + this.f193311b + ')';
        }
    }

    /* renamed from: a */
    public void mo91586a() {
        if (f193302b) {
            if (!C87412m.m108589b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                ErrorMsgInfoStruct errorMsgInfoStruct = new ErrorMsgInfoStruct();
                errorMsgInfoStruct.f194200e = 39;
                errorMsgInfoStruct.f194201f = errorMsgInfoStruct.mo86045b("LastMsgId", Util.getStack().toString(), true);
                errorMsgInfoStruct.mo86054n();
            }
            long nanoTime = System.nanoTime();
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            C87412m.m108593f(stackTrace, "Throwable().stackTrace");
            int length = stackTrace.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                try {
                    if (mo91591f(Class.forName(stackTraceElement.getClassName()), stackTraceElement.getMethodName())) {
                        Log.m105919d("ChatCheck.checker", "markCurCallUncheck() catch:%s cost:%s cur:", stackTraceElement.toString(), Long.valueOf(System.nanoTime() - nanoTime));
                        f193303c.add(mo91590e(stackTraceElement));
                        break;
                    }
                    i++;
                } catch (Throwable th) {
                    Log.printErrStackTrace("ChatCheck.checker", th, "check err", new Object[0]);
                }
            }
            Log.m105919d("ChatCheck.checker", "markCurCallUncheck() not catch cost:%s", Long.valueOf(System.nanoTime() - nanoTime));
        }
    }

    /* renamed from: b */
    public void mo91587b(String str) {
        C87412m.m108594g(str, "funName");
        if (f193302b) {
            C67393a c = mo91588c(str);
            if (!c.f193310a && Log.isDebug()) {
                String format = String.format("Only specific main thread can call ChattingContext.%s, try to copy final value to use or change call way, %s, refer:%s", Arrays.copyOf(new Object[]{str, c.f193311b, "https://iwiki.woa.com/pages/viewpage.action?pageId=4007490231"}, 3));
                C87412m.m108593f(format, "format(format, *args)");
                Log.printErrStackTrace("ChatCheck.checker", new C67403k(format), "checkContextCalled err", new Object[0]);
                ErrorMsgInfoStruct errorMsgInfoStruct = new ErrorMsgInfoStruct();
                errorMsgInfoStruct.f194200e = 38;
                errorMsgInfoStruct.f194201f = errorMsgInfoStruct.mo86045b("LastMsgId", Util.getStack().toString(), true);
                errorMsgInfoStruct.f194199d = C87412m.m108589b(Looper.getMainLooper(), Looper.myLooper()) ? 1 : 2;
                errorMsgInfoStruct.mo86054n();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091 A[Catch:{ all -> 0x00e4 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ck3.C67392c.C67393a mo91588c(java.lang.String r19) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            java.lang.String r3 = " isMain:"
            java.lang.String r0 = "funName"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.ThreadLocal<java.lang.Boolean> r0 = ck3.C67394d.f193312a
            java.lang.ThreadLocal<java.lang.Boolean> r0 = ck3.C67394d.f193312a
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r0 = gy3.C87412m.m108589b(r0, r4)
            if (r0 == 0) goto L_0x001e
            ck3.c$a r0 = ck3.C67392c.C67393a.f193309c
            return r0
        L_0x001e:
            long r4 = java.lang.System.currentTimeMillis()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r6 = android.os.Looper.myLooper()
            boolean r6 = gy3.C87412m.m108589b(r0, r6)
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r7 = r0.getStackTrace()
            java.lang.String r0 = "Throwable().stackTrace"
            gy3.C87412m.m108593f(r7, r0)
            int r8 = r7.length
            r0 = 0
            r10 = r0
            r11 = r10
            r12 = 0
            r13 = 0
        L_0x0042:
            java.lang.String r14 = "ChatCheck.checker"
            if (r12 >= r8) goto L_0x00f7
            r15 = r7[r12]
            java.lang.String r16 = r15.getClassName()     // Catch:{ all -> 0x00e6 }
            java.lang.Class r0 = java.lang.Class.forName(r16)     // Catch:{ all -> 0x00e6 }
            java.lang.String r9 = r15.getMethodName()     // Catch:{ all -> 0x00e6 }
            r17 = r7
            if (r6 == 0) goto L_0x0063
            java.lang.String r7 = r15.getClassName()     // Catch:{ all -> 0x00e4 }
            boolean r7 = r1.mo91592g(r0, r9, r7)     // Catch:{ all -> 0x00e4 }
            if (r7 == 0) goto L_0x0063
            goto L_0x006d
        L_0x0063:
            java.lang.String r7 = r15.getClassName()     // Catch:{ all -> 0x00e4 }
            boolean r7 = r1.mo91593h(r0, r9, r7)     // Catch:{ all -> 0x00e4 }
            if (r7 == 0) goto L_0x0070
        L_0x006d:
            r9 = 0
            goto L_0x00f8
        L_0x0070:
            boolean r0 = r1.mo91591f(r0, r9)     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x00e2
            java.util.HashSet<java.lang.String> r0 = f193303c     // Catch:{ all -> 0x00e4 }
            java.lang.String r7 = r1.mo91590e(r15)     // Catch:{ all -> 0x00e4 }
            boolean r0 = r0.contains(r7)     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x0083
            goto L_0x006d
        L_0x0083:
            if (r10 == 0) goto L_0x008e
            boolean r0 = z04.C112551y.m153811k(r10)     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r0 = 0
            goto L_0x008f
        L_0x008e:
            r0 = 1
        L_0x008f:
            if (r0 == 0) goto L_0x00df
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r0.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r7 = "invalid runnable call "
            r0.append(r7)     // Catch:{ all -> 0x00e4 }
            r0.append(r2)     // Catch:{ all -> 0x00e4 }
            java.lang.String r7 = " runnableTrace:"
            r0.append(r7)     // Catch:{ all -> 0x00e4 }
            r0.append(r15)     // Catch:{ all -> 0x00e4 }
            r0.append(r3)     // Catch:{ all -> 0x00e4 }
            r0.append(r6)     // Catch:{ all -> 0x00e4 }
            java.lang.String r7 = " fun:"
            r0.append(r7)     // Catch:{ all -> 0x00e4 }
            java.lang.String r7 = r15.getMethodName()     // Catch:{ all -> 0x00e4 }
            r0.append(r7)     // Catch:{ all -> 0x00e4 }
            java.lang.String r7 = " detail:"
            r0.append(r7)     // Catch:{ all -> 0x00e4 }
            java.lang.String r7 = r18.mo91589d()     // Catch:{ all -> 0x00e4 }
            r0.append(r7)     // Catch:{ all -> 0x00e4 }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x00e4 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r0.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r7 = "caller:"
            r0.append(r7)     // Catch:{ all -> 0x00e4 }
            r0.append(r15)     // Catch:{ all -> 0x00e4 }
            r0.append(r3)     // Catch:{ all -> 0x00e4 }
            r0.append(r6)     // Catch:{ all -> 0x00e4 }
            java.lang.String r11 = r0.toString()     // Catch:{ all -> 0x00e4 }
        L_0x00df:
            r7 = 0
            r13 = 1
            goto L_0x00f1
        L_0x00e2:
            r7 = 0
            goto L_0x00f1
        L_0x00e4:
            r0 = move-exception
            goto L_0x00e9
        L_0x00e6:
            r0 = move-exception
            r17 = r7
        L_0x00e9:
            r7 = 0
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.String r15 = "check err"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r15, r9)
        L_0x00f1:
            int r12 = r12 + 1
            r7 = r17
            goto L_0x0042
        L_0x00f7:
            r9 = r13
        L_0x00f8:
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r4
            if (r9 == 0) goto L_0x011e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "check() called with: funName = "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = " cost= "
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r0)
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r10)
        L_0x011e:
            ck3.c$a r0 = new ck3.c$a
            r2 = 1
            r2 = r2 ^ r9
            r0.<init>(r2, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ck3.C67392c.mo91588c(java.lang.String):ck3.c$a");
    }

    /* renamed from: d */
    public final String mo91589d() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace == null || stackTrace.length < 4) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = stackTrace.length;
        for (int i = 2; i < length; i++) {
            sb.append("[");
            String className = stackTrace[i].getClassName();
            C87412m.m108593f(className, "stes[i].className");
            sb.append(C112551y.m153814n(className, "com.tencent.mm", "", false));
            sb.append(XVFSFile.PATH_SEPARATOR);
            sb.append(stackTrace[i].getMethodName());
            sb.append('(' + stackTrace[i].getLineNumber() + ")]");
        }
        return sb.toString();
    }

    /* renamed from: e */
    public final String mo91590e(StackTraceElement stackTraceElement) {
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        C87412m.m108593f(str, "StringBuilder().append(c…nd(methodName).toString()");
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo91591f(java.lang.Class<?> r6, java.lang.String r7) {
        /*
            r5 = this;
            rx3.g r0 = f193308h
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x000e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0049
            java.lang.Object r1 = r0.next()
            rx3.l r1 = (rx3.C13604l) r1
            A r2 = r1.f38555d
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r2 = r2.isAssignableFrom(r6)
            if (r2 == 0) goto L_0x000e
            B r1 = r1.f38556e
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x002c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x000e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "*"
            boolean r3 = gy3.C87412m.m108589b(r2, r3)
            r4 = 1
            if (r3 == 0) goto L_0x0042
            return r4
        L_0x0042:
            boolean r2 = gy3.C87412m.m108589b(r2, r7)
            if (r2 == 0) goto L_0x002c
            return r4
        L_0x0049:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ck3.C67392c.mo91591f(java.lang.Class, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo91592g(java.lang.Class<?> r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            java.util.List<rx3.l<java.lang.Class<? extends java.lang.Object>, java.util.List<java.lang.String>>> r0 = f193304d
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L_0x0041
            java.lang.Object r1 = r0.next()
            rx3.l r1 = (rx3.C13604l) r1
            A r3 = r1.f38555d
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r3 = r3.isAssignableFrom(r6)
            if (r3 == 0) goto L_0x0006
            B r1 = r1.f38556e
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0025:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0006
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "*"
            boolean r4 = gy3.C87412m.m108589b(r3, r4)
            if (r4 == 0) goto L_0x003a
            return r2
        L_0x003a:
            boolean r3 = gy3.C87412m.m108589b(r3, r7)
            if (r3 == 0) goto L_0x0025
            return r2
        L_0x0041:
            java.util.List<java.lang.String> r6 = f193305e
            java.util.Iterator r6 = r6.iterator()
        L_0x0047:
            boolean r7 = r6.hasNext()
            r0 = 0
            if (r7 == 0) goto L_0x0060
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            if (r8 == 0) goto L_0x005d
            boolean r7 = z04.C112550d0.m153801u(r8, r7, r0)
            if (r7 != r2) goto L_0x005d
            r0 = 1
        L_0x005d:
            if (r0 == 0) goto L_0x0047
            return r2
        L_0x0060:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ck3.C67392c.mo91592g(java.lang.Class, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo91593h(java.lang.Class<?> r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            java.util.List<rx3.l<java.lang.Class<? extends java.lang.Object>, java.util.List<java.lang.String>>> r0 = f193307g
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L_0x0041
            java.lang.Object r1 = r0.next()
            rx3.l r1 = (rx3.C13604l) r1
            A r3 = r1.f38555d
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r3 = r3.isAssignableFrom(r6)
            if (r3 == 0) goto L_0x0006
            B r1 = r1.f38556e
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0025:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0006
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "*"
            boolean r4 = gy3.C87412m.m108589b(r3, r4)
            if (r4 == 0) goto L_0x003a
            return r2
        L_0x003a:
            boolean r3 = gy3.C87412m.m108589b(r3, r7)
            if (r3 == 0) goto L_0x0025
            return r2
        L_0x0041:
            java.util.List<java.lang.String> r6 = f193306f
            java.util.Iterator r6 = r6.iterator()
        L_0x0047:
            boolean r7 = r6.hasNext()
            r0 = 0
            if (r7 == 0) goto L_0x0060
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            if (r8 == 0) goto L_0x005d
            boolean r7 = z04.C112550d0.m153801u(r8, r7, r0)
            if (r7 != r2) goto L_0x005d
            r0 = 1
        L_0x005d:
            if (r0 == 0) goto L_0x0047
            return r2
        L_0x0060:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ck3.C67392c.mo91593h(java.lang.Class, java.lang.String, java.lang.String):boolean");
    }
}
