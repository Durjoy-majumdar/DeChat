package p520fi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.Stack;
import z20.C112573c;
import z20.C112579f;

/* renamed from: fi.d */
public class C107547d implements C107549g<C112573c> {

    /* renamed from: d */
    public Stack<C112573c> f321774d;

    /* renamed from: e */
    public Stack<C112573c> f321775e;

    /* renamed from: D1 */
    public int mo157975D1(boolean z) {
        if (z) {
            Stack<C112573c> stack = this.f321774d;
            if (stack != null) {
                return stack.size();
            }
            return 0;
        }
        Stack<C112573c> stack2 = this.f321775e;
        if (stack2 != null) {
            return stack2.size();
        }
        return 0;
    }

    /* renamed from: F1 */
    public void mo157976F1(Canvas canvas) {
        Iterator<C112573c> it = this.f321774d.iterator();
        while (it.hasNext()) {
            C112573c next = it.next();
            next.mo164319m(false);
            next.mo164308c(canvas);
        }
    }

    /* renamed from: Z */
    public void mo157977Z(boolean z) {
        Log.m105925i("MicroMsg.EmojiAndTextCache", "[onSave] size:%s isExit:%s", Integer.valueOf(this.f321774d.size()), Boolean.valueOf(z));
        Stack<C112573c> stack = this.f321775e;
        if (stack != null) {
            stack.clear();
        }
        this.f321775e = new Stack<>();
        Iterator<C112573c> it = this.f321774d.iterator();
        while (it.hasNext()) {
            this.f321775e.push(it.next().clone());
        }
        Log.m105925i("MicroMsg.EmojiAndTextCache", "[onSave] mLastStack size:%s", Integer.valueOf(this.f321775e.size()));
        if (z) {
            this.f321774d.clear();
            Iterator<C112573c> it4 = this.f321775e.iterator();
            while (it4.hasNext()) {
                it4.next().mo164317k();
            }
        }
    }

    /* renamed from: a */
    public int[] mo157988a(boolean z) {
        int[] iArr = new int[2];
        if (z) {
            Iterator<C112573c> it = this.f321774d.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof C112579f) {
                    iArr[1] = iArr[1] + 1;
                } else {
                    iArr[0] = iArr[0] + 1;
                }
            }
        } else {
            Stack<C112573c> stack = this.f321775e;
            if (stack != null) {
                Iterator<C112573c> it4 = stack.iterator();
                while (it4.hasNext()) {
                    if (it4.next() instanceof C112579f) {
                        iArr[1] = iArr[1] + 1;
                    } else {
                        iArr[0] = iArr[0] + 1;
                    }
                }
            }
        }
        return iArr;
    }

    public void add(Object obj) {
        C112573c cVar = (C112573c) obj;
        Stack<C112573c> stack = this.f321774d;
        if (stack != null) {
            stack.push(cVar);
        }
    }

    /* renamed from: b */
    public String[] mo157989b(boolean z, String str) {
        String[] strArr = {"", ""};
        if (z) {
            Iterator<C112573c> it = this.f321774d.iterator();
            while (it.hasNext()) {
                C112573c next = it.next();
                if (next instanceof C112579f) {
                    strArr[1] = strArr[1] + ((C112579f) next).f337106C.toString() + str;
                } else {
                    strArr[0] = strArr[0] + next.f337066f.getMd5() + str;
                }
            }
        } else {
            Stack<C112573c> stack = this.f321775e;
            if (stack != null) {
                Iterator<C112573c> it4 = stack.iterator();
                while (it4.hasNext()) {
                    C112573c next2 = it4.next();
                    if (next2 instanceof C112579f) {
                        strArr[1] = strArr[1] + ((C112579f) next2).f337106C.toString() + str;
                    } else {
                        strArr[0] = strArr[0] + next2.f337066f.getMd5() + str;
                    }
                }
            }
        }
        return strArr;
    }

    /* renamed from: c */
    public Stack<C112573c> mo157990c(boolean z) {
        return z ? this.f321774d : this.f321775e;
    }

    public void clear() {
        Stack<C112573c> stack = this.f321774d;
        if (stack != null) {
            stack.clear();
        }
    }

    /* renamed from: d */
    public C112573c mo157991d() {
        Stack<C112573c> stack = this.f321774d;
        if (stack == null || stack.size() <= 0) {
            return null;
        }
        return this.f321774d.peek();
    }

    /* renamed from: i */
    public void mo157980i(Canvas canvas, boolean z) {
        if (z) {
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            Iterator<C112573c> it = this.f321774d.iterator();
            while (it.hasNext()) {
                C112573c next = it.next();
                if (!next.f337073p) {
                    next.mo164308c(canvas);
                }
            }
            return;
        }
        C112573c d = mo157991d();
        if (d != null && !d.f337073p) {
            d.mo164308c(canvas);
        }
    }

    public void onCreate() {
        Log.m105924i("MicroMsg.EmojiAndTextCache", "[onCreate]");
        this.f321774d = new Stack<>();
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.EmojiAndTextCache", "[onDestroy]");
        Stack<C112573c> stack = this.f321774d;
        if (stack != null) {
            Iterator<C112573c> it = stack.iterator();
            while (it.hasNext()) {
                it.next().clear();
            }
            this.f321774d.clear();
        }
        Stack<C112573c> stack2 = this.f321775e;
        if (stack2 != null) {
            Iterator<C112573c> it4 = stack2.iterator();
            while (it4.hasNext()) {
                it4.next().clear();
            }
            this.f321775e.clear();
        }
    }

    public Object pop() {
        return this.f321774d.pop();
    }

    /* renamed from: z0 */
    public void mo157984z0() {
    }

    /* renamed from: z1 */
    public void mo157985z1(boolean z) {
        Log.m105925i("MicroMsg.EmojiAndTextCache", "[onRestore] size:%s isExit:%s", Integer.valueOf(this.f321774d.size()), Boolean.valueOf(z));
        this.f321774d.clear();
        Stack<C112573c> stack = this.f321775e;
        if (stack != null) {
            Log.m105925i("MicroMsg.EmojiAndTextCache", "[onRestore] %s", Integer.valueOf(stack.size()));
            this.f321774d.addAll(this.f321775e);
        }
        Log.m105925i("MicroMsg.EmojiAndTextCache", "[onRestore] mCurStack size:%s ", Integer.valueOf(this.f321774d.size()));
        if (z) {
            Iterator<C112573c> it = this.f321774d.iterator();
            while (it.hasNext()) {
                it.next().mo164317k();
            }
            Stack<C112573c> stack2 = this.f321775e;
            if (stack2 != null) {
                stack2.clear();
                return;
            }
            return;
        }
        Iterator<C112573c> it4 = this.f321774d.iterator();
        while (it4.hasNext()) {
            C112573c next = it4.next();
            next.getClass();
            Log.m105918d("MicroMsg.EmojiItem", "[checkBitmap]");
            Bitmap bitmap = next.f337067g;
            if (bitmap == null || bitmap.isRecycled()) {
                next.f337067g = next.mo164311d(next.mo164314g());
            }
        }
    }
}
