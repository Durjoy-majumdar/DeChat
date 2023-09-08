package p520fi;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.Stack;
import z20.C112572b;

/* renamed from: fi.b */
public class C107545b implements C107549g<C112572b> {

    /* renamed from: d */
    public Stack<C112572b> f321768d;

    /* renamed from: e */
    public Stack<C112572b> f321769e;

    /* renamed from: f */
    public int f321770f;

    /* renamed from: D1 */
    public int mo157975D1(boolean z) {
        if (z) {
            Stack<C112572b> stack = this.f321768d;
            if (stack != null) {
                return stack.size();
            }
            return 0;
        }
        Stack<C112572b> stack2 = this.f321769e;
        if (stack2 != null) {
            return stack2.size();
        }
        return 0;
    }

    /* renamed from: F1 */
    public void mo157976F1(Canvas canvas) {
        Iterator<C112572b> it = this.f321768d.iterator();
        while (it.hasNext()) {
            it.next().mo164305a(canvas);
        }
    }

    /* renamed from: Z */
    public void mo157977Z(boolean z) {
        Log.m105925i("MicroMsg.DoodleCache", "[onSave] size:%s", Integer.valueOf(this.f321768d.size()));
        Stack<C112572b> stack = this.f321769e;
        if (stack != null) {
            stack.clear();
        }
        this.f321769e = (Stack) this.f321768d.clone();
        if (z) {
            this.f321768d.clear();
        }
    }

    public void add(Object obj) {
        C112572b bVar = (C112572b) obj;
        Stack<C112572b> stack = this.f321768d;
        if (stack != null) {
            stack.push(bVar);
        }
    }

    public void clear() {
        Stack<C112572b> stack = this.f321768d;
        if (stack != null) {
            stack.clear();
        }
    }

    /* renamed from: i */
    public void mo157980i(Canvas canvas, boolean z) {
        if (z) {
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            Iterator<C112572b> it = this.f321768d.iterator();
            while (it.hasNext()) {
                it.next().mo164305a(canvas);
            }
            return;
        }
        Stack<C112572b> stack = this.f321768d;
        C112572b peek = (stack == null || stack.size() <= 0) ? null : this.f321768d.peek();
        if (peek != null) {
            peek.mo164305a(canvas);
        }
    }

    public void onCreate() {
        this.f321768d = new Stack<>();
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.DoodleCache", "[onDestroy]");
        Stack<C112572b> stack = this.f321768d;
        if (stack != null) {
            stack.clear();
        }
        Stack<C112572b> stack2 = this.f321769e;
        if (stack2 != null) {
            stack2.clear();
        }
    }

    public Object pop() {
        if (this.f321768d.size() <= 0) {
            return null;
        }
        return this.f321768d.pop();
    }

    /* renamed from: z0 */
    public void mo157984z0() {
        this.f321770f++;
    }

    /* renamed from: z1 */
    public void mo157985z1(boolean z) {
        Log.m105925i("MicroMsg.DoodleCache", "[onRestore] size:%s", Integer.valueOf(this.f321768d.size()));
        this.f321768d.clear();
        Stack<C112572b> stack = this.f321769e;
        if (stack != null) {
            Log.m105925i("MicroMsg.DoodleCache", "[onRestore] %s", Integer.valueOf(stack.size()));
            this.f321768d.addAll(this.f321769e);
            if (z) {
                this.f321769e.clear();
            }
        }
    }
}
