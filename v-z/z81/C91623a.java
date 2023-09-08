package z81;

import com.eclipsesource.mmv8.C80135V8;
import com.eclipsesource.mmv8.V8Array;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.List;
import u24.C90599h;
import w81.C90900a;

/* renamed from: z81.a */
public class C91623a implements C91624b {

    /* renamed from: a */
    public C80135V8 f262482a;

    public C91623a() {
        try {
            this.f262482a = C80135V8.createV8Runtime();
            C90900a.m114035h(true);
        } catch (Throwable th) {
            C90900a.m114035h(false);
            Log.m105921e("EdgeComputingJSScriptEngine", "[EdgeComputingJSScriptEngine] init V8 fail for : %s", th.getMessage());
        }
    }

    /* renamed from: a */
    public List<String> mo125487a(String str, String str2, String str3) {
        C80135V8 v8;
        V8Array v8Array;
        V8Array v8Array2;
        if (C90599h.m113511d(str) || C90599h.m113511d(str2) || (v8 = this.f262482a) == null || v8.isReleased() || C90599h.m113511d(str3)) {
            return null;
        }
        try {
            v8Array2 = new V8Array(this.f262482a).push(str2).push(str3);
            try {
                v8Array = this.f262482a.executeArrayFunction(str, v8Array2);
            } catch (Throwable th) {
                th = th;
                v8Array = null;
                try {
                    Log.m105921e("EdgeComputingJSScriptEngine", "[EdgeComputingJSScriptEngine] executeArrayFunction funcName : %s, throw Throwable e : %s", str, th.getMessage());
                    return null;
                } finally {
                    if (v8Array2 != null && !v8Array2.isReleased()) {
                        v8Array2.release();
                    }
                    if (v8Array != null && !v8Array.isReleased()) {
                        v8Array.release();
                    }
                }
            }
            try {
                ArrayList arrayList = new ArrayList();
                if (v8Array != null && v8Array.length() > 0) {
                    for (int i = 0; i < v8Array.length(); i++) {
                        String string = v8Array.getString(i);
                        if (!C90599h.m113511d(string)) {
                            arrayList.add(string);
                        }
                    }
                }
                v8Array2.release();
                v8Array.release();
                if (!v8Array2.isReleased()) {
                    v8Array2.release();
                }
                if (!v8Array.isReleased()) {
                    v8Array.release();
                }
                return arrayList;
            } catch (Throwable th4) {
                th = th4;
                Log.m105921e("EdgeComputingJSScriptEngine", "[EdgeComputingJSScriptEngine] executeArrayFunction funcName : %s, throw Throwable e : %s", str, th.getMessage());
                return null;
            }
        } catch (Throwable th5) {
            th = th5;
            v8Array2 = null;
            v8Array = v8Array2;
            Log.m105921e("EdgeComputingJSScriptEngine", "[EdgeComputingJSScriptEngine] executeArrayFunction funcName : %s, throw Throwable e : %s", str, th.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public boolean mo125488b(String str) {
        C80135V8 v8;
        if (!C90599h.m113511d(str) && (v8 = this.f262482a) != null && !v8.isReleased()) {
            try {
                this.f262482a.executeVoidScript(str);
                return true;
            } catch (Throwable th) {
                Log.m105921e("EdgeComputingJSScriptEngine", "[EdgeComputingJSScriptEngine] loadScript throw Throwable e : %s", th.getMessage());
            }
        }
        return false;
    }
}
