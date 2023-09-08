package p520fi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import z20.C112576e;

/* renamed from: fi.k */
public class C107551k implements C107549g<C112576e> {

    /* renamed from: d */
    public Stack<C112576e> f321782d;

    /* renamed from: e */
    public Stack<C112576e> f321783e;

    /* renamed from: f */
    public SparseArray<String> f321784f;

    /* renamed from: g */
    public HashMap<String, Bitmap> f321785g;

    /* renamed from: h */
    public int f321786h;

    /* renamed from: D1 */
    public int mo157975D1(boolean z) {
        if (z) {
            Stack<C112576e> stack = this.f321782d;
            if (stack != null) {
                return stack.size();
            }
            return 0;
        }
        Stack<C112576e> stack2 = this.f321783e;
        if (stack2 != null) {
            return stack2.size();
        }
        return 0;
    }

    /* renamed from: F1 */
    public void mo157976F1(Canvas canvas) {
        Bitmap a = mo157994a();
        if (a != null && !a.isRecycled()) {
            canvas.drawBitmap(a, 0.0f, 0.0f, (Paint) null);
        }
    }

    /* renamed from: Z */
    public void mo157977Z(boolean z) {
        Log.m105925i("MicroMsg.MosaicCache", "[onSave] size:%s", Integer.valueOf(this.f321782d.size()));
        Stack<C112576e> stack = this.f321783e;
        if (stack != null) {
            stack.clear();
        }
        this.f321783e = (Stack) this.f321782d.clone();
        if (z) {
            this.f321782d.clear();
        }
    }

    /* renamed from: a */
    public Bitmap mo157994a() {
        String str = this.f321784f.get(mo157975D1(true));
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.MosaicCache", "[getCacheFromLocal] path is null");
            return null;
        }
        Log.m105925i("MicroMsg.MosaicCache", "[getCacheFromLocal] path:%s size:%s", str, Integer.valueOf(mo157975D1(true)));
        Bitmap bitmap = this.f321785g.containsKey(str) ? this.f321785g.get(str) : null;
        if (bitmap == null || bitmap.isRecycled()) {
            Log.m105924i("MicroMsg.MosaicCache", "");
            bitmap = BitmapUtil.getBitmapNative(str);
            Log.m105924i("MicroMsg.MosaicCache", "[getCacheFromLocal] get from local!");
        }
        if (bitmap == null) {
            Log.m105921e("MicroMsg.MosaicCache", "[getCacheFromLocal] null == bitmap path:%s", str);
            return null;
        }
        Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        Log.m105925i("MicroMsg.MosaicCache", "bitmap recycle %s", bitmap);
        bitmap.recycle();
        return copy;
    }

    public void add(Object obj) {
        C112576e eVar = (C112576e) obj;
        Stack<C112576e> stack = this.f321782d;
        if (stack != null) {
            stack.push(eVar);
        }
    }

    public void clear() {
        Stack<C112576e> stack = this.f321782d;
        if (stack != null) {
            stack.clear();
        }
    }

    /* renamed from: i */
    public void mo157980i(Canvas canvas, boolean z) {
        if (!z) {
            Stack<C112576e> stack = this.f321782d;
            C112576e peek = (stack == null || stack.size() <= 0) ? null : this.f321782d.peek();
            if (peek != null && peek.f337090d == C112576e.C112577a.ONE) {
                peek.mo164322a(canvas);
            }
        }
    }

    public void onCreate() {
        Log.m105924i("MicroMsg.MosaicCache", "[onCreate]");
        this.f321782d = new Stack<>();
        this.f321784f = new SparseArray<>();
        this.f321785g = new HashMap<>();
    }

    public void onDestroy() {
        Stack<C112576e> stack = this.f321782d;
        if (stack != null) {
            Iterator<C112576e> it = stack.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
            this.f321782d.clear();
        }
        Stack<C112576e> stack2 = this.f321783e;
        if (stack2 != null) {
            Iterator<C112576e> it4 = stack2.iterator();
            while (it4.hasNext()) {
                it4.next().getClass();
            }
            this.f321783e.clear();
        }
        this.f321784f.clear();
        for (Map.Entry<String, Bitmap> value : this.f321785g.entrySet()) {
            Bitmap bitmap = (Bitmap) value.getValue();
            if (bitmap != null && !bitmap.isRecycled()) {
                Log.m105925i("MicroMsg.MosaicCache", "bitmap recycle %s", bitmap.toString());
                bitmap.recycle();
            }
        }
        this.f321785g.clear();
    }

    public Object pop() {
        if (this.f321782d.size() > 0) {
            return this.f321782d.pop();
        }
        Log.m105920e("MicroMsg.MosaicCache", "[pop]");
        return null;
    }

    /* renamed from: z0 */
    public void mo157984z0() {
        this.f321786h++;
    }

    /* renamed from: z1 */
    public void mo157985z1(boolean z) {
        Log.m105925i("MicroMsg.MosaicCache", "[onRestore] size:%s", Integer.valueOf(this.f321782d.size()));
        this.f321782d.clear();
        Stack<C112576e> stack = this.f321783e;
        if (stack != null) {
            Log.m105925i("MicroMsg.MosaicCache", "[onRestore] %s", Integer.valueOf(stack.size()));
            this.f321782d.addAll(this.f321783e);
            if (z) {
                this.f321783e.clear();
            }
        }
    }
}
