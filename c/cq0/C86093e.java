package cq0;

import android.util.SparseIntArray;
import android.webkit.ValueCallback;
import bq0.C79768h;
import c30.C104289g;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import java.util.Locale;
import java.util.Map;
import p225rc.C48016e;

/* renamed from: cq0.e */
public abstract class C86093e {

    /* renamed from: a */
    public final C81925i2 f250577a;

    /* renamed from: b */
    public final C86094a f250578b;

    /* renamed from: c */
    public final SparseIntArray f250579c = new SparseIntArray();

    /* renamed from: cq0.e$a */
    public interface C86094a {
    }

    public C86093e(C86094a aVar, C81925i2 i2Var) {
        this.f250578b = aVar;
        this.f250577a = i2Var;
    }

    /* renamed from: a */
    public abstract void mo120518a();

    /* renamed from: b */
    public abstract void mo120519b();

    /* renamed from: c */
    public void mo120520c(Map<String, Object> map) {
        int size;
        int[] iArr;
        synchronized (this) {
            size = this.f250579c.size();
            iArr = new int[size];
            for (int i = 0; i < this.f250579c.size(); i++) {
                iArr[i] = this.f250579c.keyAt(i);
            }
        }
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = iArr[i2];
            C79768h hVar = (C79768h) this.f250578b;
            hVar.getClass();
            C48016e.m53378d(map);
            String gVar = new C104289g((Map) map).toString();
            hVar.f233771b.evaluateJavascript(String.format(Locale.ENGLISH, "typeof gNodeController != 'undefined' && gNodeController.javaOnTrigger(%d, %s);", new Object[]{Integer.valueOf(i3), gVar}), (ValueCallback<String>) null);
        }
    }
}
