package f31;

import android.os.Handler;
import android.os.Message;
import android.view.inputmethod.InputMethodManager;
import c31.C79925c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import oa1.C117731d;

/* renamed from: f31.a */
public class C86706a implements C79925c {

    /* renamed from: f31.a$a */
    public class C86707a implements Handler.Callback {

        /* renamed from: d */
        public Handler f251713d;

        /* renamed from: e */
        public int f251714e;

        public C86707a(C86706a aVar, Handler handler, int i) {
            this.f251713d = handler;
            this.f251714e = i;
        }

        public boolean handleMessage(Message message) {
            if (this.f251714e == message.what) {
                try {
                    this.f251713d.handleMessage(message);
                    return true;
                } catch (IndexOutOfBoundsException unused) {
                    Log.m105920e("MicroMsg.GetTextBeforeCursorFix", "catch IndexOutOfBoundsException");
                    return true;
                }
            } else {
                this.f251713d.handleMessage(message);
                return true;
            }
        }
    }

    /* renamed from: f31.a$b */
    public class C86708b implements InvocationHandler {

        /* renamed from: a */
        public Object f251715a;

        /* renamed from: b */
        public Class f251716b;

        /* renamed from: c */
        public Class f251717c;

        /* renamed from: d */
        public Field f251718d;

        /* renamed from: e */
        public Field f251719e;

        /* renamed from: f */
        public int f251720f;

        public C86708b(Object obj) {
            this.f251715a = obj;
            try {
                Log.m105924i("MicroMsg.GetTextBeforeCursorFix", "MyProxy init start");
                Class<?> cls = Class.forName("com.android.internal.view.IInputConnectionWrapper");
                this.f251717c = cls;
                Field f = C86706a.m107518f(C86706a.this, cls, "mH");
                this.f251718d = f;
                f.setAccessible(true);
                Field declaredField = Handler.class.getDeclaredField("mCallback");
                this.f251719e = declaredField;
                declaredField.setAccessible(true);
                Field f2 = C86706a.m107518f(C86706a.this, this.f251717c, "DO_GET_TEXT_BEFORE_CURSOR");
                f2.setAccessible(true);
                this.f251720f = ((Integer) f2.get((Object) null)).intValue();
                this.f251716b = Class.forName("com.android.internal.view.IInputConnectionWrapper");
                Log.m105924i("MicroMsg.GetTextBeforeCursorFix", "MyProxy init succ");
            } catch (Exception e) {
                Log.m105924i("MicroMsg.GetTextBeforeCursorFix", "MyProxy init fail");
                Log.printErrStackTrace("MicroMsg.GetTextBeforeCursorFix", e, "", new Object[0]);
            }
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (this.f251716b != null && C86706a.this.mo121094g() && method.getName().equals("startInputOrWindowGainedFocus")) {
                int i = 0;
                while (true) {
                    if (i >= objArr.length) {
                        break;
                    }
                    Object obj2 = objArr[i];
                    if (obj2 == null || obj2.getClass().getSuperclass() != this.f251716b) {
                        i++;
                    } else {
                        Handler handler = (Handler) this.f251718d.get(objArr[i]);
                        if (this.f251719e.get(handler) == null) {
                            this.f251719e.set(handler, new C86707a(C86706a.this, handler, this.f251720f));
                            Log.m105924i("MicroMsg.GetTextBeforeCursorFix", "protect succ");
                        }
                        Log.m105924i("MicroMsg.GetTextBeforeCursorFix", "add protected succ");
                    }
                }
            }
            return method.invoke(this.f251715a, objArr);
        }
    }

    /* renamed from: f */
    public static Field m107518f(C86706a aVar, Class cls, String str) {
        aVar.getClass();
        Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredField", new Class[]{String.class});
        declaredMethod.setAccessible(true);
        return (Field) declaredMethod.invoke(cls, new Object[]{str});
    }

    /* renamed from: a */
    public boolean mo58760a(int i) {
        return (i == 29 || i == 30) && mo121094g();
    }

    /* renamed from: d */
    public boolean mo58763d() {
        try {
            Log.m105924i("MicroMsg.GetTextBeforeCursorFix", "hook start");
            InputMethodManager inputMethodManager = (InputMethodManager) MMApplicationContext.getContext().getSystemService("input_method");
            Class<InputMethodManager> cls = InputMethodManager.class;
            cls.getDeclaredMethod("getInputContext", new Class[0]).setAccessible(true);
            Field declaredField = cls.getDeclaredField("mService");
            declaredField.setAccessible(true);
            try {
                Field declaredField2 = Field.class.getDeclaredField("accessFlags");
                declaredField2.setAccessible(true);
                declaredField2.setInt(declaredField, declaredField.getModifiers() & -17);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.GetTextBeforeCursorFix", e.getMessage());
            }
            Object obj = declaredField.get(inputMethodManager);
            declaredField.set(inputMethodManager, Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new C86708b(obj)));
            Log.m105924i("MicroMsg.GetTextBeforeCursorFix", "hook succ");
            return true;
        } catch (Exception e2) {
            Log.m105920e("MicroMsg.GetTextBeforeCursorFix", "hook fail");
            Log.printErrStackTrace("MicroMsg.GetTextBeforeCursorFix", e2, "", new Object[0]);
            return false;
        }
    }

    /* renamed from: g */
    public final boolean mo121094g() {
        try {
            return Util.getInt(C117731d.m166007c().mo182444f("clicfg_inputconnection_protect", "0", false, true), 0) > 0;
        } catch (Exception e) {
            Log.m105924i("MicroMsg.GetTextBeforeCursorFix", "get clicfg_inputconnection_protect error!");
            Log.printErrStackTrace("MicroMsg.GetTextBeforeCursorFix", e, "", new Object[0]);
        }
    }
}
