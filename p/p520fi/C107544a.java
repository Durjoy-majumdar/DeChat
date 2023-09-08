package p520fi;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Stack;
import z20.C112571a;

/* renamed from: fi.a */
public class C107544a implements C107549g<C112571a> {

    /* renamed from: d */
    public Stack<C112571a> f321765d;

    /* renamed from: e */
    public Stack<C112571a> f321766e;

    /* renamed from: f */
    public Matrix f321767f = new Matrix();

    /* renamed from: D1 */
    public int mo157975D1(boolean z) {
        if (z) {
            Stack<C112571a> stack = this.f321765d;
            if (stack != null) {
                return stack.size();
            }
            return 0;
        }
        Stack<C112571a> stack2 = this.f321766e;
        if (stack2 != null) {
            return stack2.size();
        }
        return 0;
    }

    /* renamed from: F1 */
    public void mo157976F1(Canvas canvas) {
    }

    /* renamed from: Z */
    public void mo157977Z(boolean z) {
        Log.m105925i("MicroMsg.CropCache", "[onSave] size:%s", Integer.valueOf(this.f321765d.size()));
        Stack<C112571a> stack = this.f321766e;
        if (stack != null) {
            stack.clear();
        }
        this.f321766e = (Stack) this.f321765d.clone();
        if (z) {
            this.f321765d.clear();
        }
    }

    public void add(Object obj) {
        C112571a aVar = (C112571a) obj;
        Stack<C112571a> stack = this.f321765d;
        if (stack != null) {
            stack.push(aVar);
        }
    }

    public void clear() {
        Stack<C112571a> stack = this.f321765d;
        if (stack != null) {
            stack.clear();
        }
    }

    /* renamed from: i */
    public void mo157980i(Canvas canvas, boolean z) {
    }

    public void onCreate() {
        Log.m105924i("MicroMsg.CropCache", "[onCreate]");
        this.f321765d = new Stack<>();
    }

    public void onDestroy() {
        Stack<C112571a> stack = this.f321765d;
        if (stack != null) {
            stack.clear();
        }
        Stack<C112571a> stack2 = this.f321766e;
        if (stack2 != null) {
            stack2.clear();
        }
        this.f321767f.reset();
    }

    public Object pop() {
        if (this.f321765d.size() > 0) {
            return this.f321765d.pop();
        }
        Log.m105920e("MicroMsg.CropCache", "[pop]");
        return null;
    }

    /* renamed from: z0 */
    public void mo157984z0() {
    }

    /* renamed from: z1 */
    public void mo157985z1(boolean z) {
        Log.m105925i("MicroMsg.CropCache", "[onRestore] size:%s", Integer.valueOf(this.f321765d.size()));
        this.f321765d.clear();
        Stack<C112571a> stack = this.f321766e;
        if (stack != null) {
            Log.m105925i("MicroMsg.CropCache", "[onRestore] %s", Integer.valueOf(stack.size()));
            this.f321765d.addAll(this.f321766e);
            if (z) {
                this.f321766e.clear();
            }
        }
    }
}
