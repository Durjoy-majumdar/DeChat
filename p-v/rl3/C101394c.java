package rl3;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import com.tencent.p014mm.sdk.platformtools.Log;
import go3.C76003c;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p329d3.C20434g;
import pl3.C100822b;

/* renamed from: rl3.c */
public final class C101394c extends SpannableStringBuilder {

    /* renamed from: d */
    public final Class<?> f297002d;

    /* renamed from: e */
    public final List<C101395a> f297003e = new ArrayList();

    /* renamed from: rl3.c$a */
    public static class C101395a implements TextWatcher, SpanWatcher {

        /* renamed from: d */
        public final Object f297004d;

        /* renamed from: e */
        public final AtomicInteger f297005e = new AtomicInteger(0);

        public C101395a(Object obj) {
            this.f297004d = obj;
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f297004d).afterTextChanged(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f297004d).beforeTextChanged(charSequence, i, i2, i3);
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            Log.m105919d("MicroMsg.Emoji.SpannableBuilder", "onSpanAdded not prevent, mBlockCall:%d, span class:%s", Integer.valueOf(this.f297005e.get()), obj.getClass().getName());
            ((SpanWatcher) this.f297004d).onSpanAdded(spannable, obj, i, i2);
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            if (this.f297005e.get() <= 0 || (!(obj instanceof C76003c) && !(obj instanceof C100822b))) {
                Log.m105919d("MicroMsg.Emoji.SpannableBuilder", "onSpanChanged not prevent, mBlockCall:%d, span class:%s", Integer.valueOf(this.f297005e.get()), obj.getClass().getName());
                ((SpanWatcher) this.f297004d).onSpanChanged(spannable, obj, i, i2, i3, i4);
                return;
            }
            Log.m105919d("MicroMsg.Emoji.SpannableBuilder", "onSpanChanged prevent, mBlockCall:%d, span class:%s", Integer.valueOf(this.f297005e.get()), obj.getClass().getName());
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f297005e.get() <= 0 || (!(obj instanceof C76003c) && !(obj instanceof C100822b))) {
                Log.m105919d("MicroMsg.Emoji.SpannableBuilder", "onSpanRemoved not prevent, mBlockCall:%d, span class:%s", Integer.valueOf(this.f297005e.get()), obj.getClass().getName());
                ((SpanWatcher) this.f297004d).onSpanRemoved(spannable, obj, i, i2);
                return;
            }
            Log.m105919d("MicroMsg.Emoji.SpannableBuilder", "onSpanRemoved prevent, mBlockCall:%d, span class:%s", Integer.valueOf(this.f297005e.get()), obj.getClass().getName());
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f297004d).onTextChanged(charSequence, i, i2, i3);
        }
    }

    public C101394c(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        C20434g.m22020d(cls, "watcherClass must not be null");
        this.f297002d = cls;
    }

    /* renamed from: a */
    public final void mo140886a() {
        for (int i = 0; i < ((ArrayList) this.f297003e).size(); i++) {
            ((C101395a) ((ArrayList) this.f297003e).get(i)).f297005e.incrementAndGet();
        }
    }

    public Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: b */
    public final C101395a mo140891b(Object obj) {
        for (int i = 0; i < this.f297003e.size(); i++) {
            C101395a aVar = this.f297003e.get(i);
            if (aVar.f297004d == obj) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo140892c(Object obj) {
        if (obj != null) {
            if (this.f297002d == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void mo140893d() {
        for (int i = 0; i < ((ArrayList) this.f297003e).size(); i++) {
            ((C101395a) ((ArrayList) this.f297003e).get(i)).f297005e.decrementAndGet();
        }
    }

    public Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public int getSpanEnd(Object obj) {
        C101395a b;
        if (mo140892c(obj) && (b = mo140891b(obj)) != null) {
            obj = b;
        }
        return super.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        C101395a b;
        if (mo140892c(obj) && (b = mo140891b(obj)) != null) {
            obj = b;
        }
        return super.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        C101395a b;
        if (mo140892c(obj) && (b = mo140891b(obj)) != null) {
            obj = b;
        }
        return super.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (!(this.f297002d == cls)) {
            return super.getSpans(i, i2, cls);
        }
        C101395a[] aVarArr = (C101395a[]) super.getSpans(i, i2, C101395a.class);
        T[] tArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            tArr[i3] = aVarArr[i3].f297004d;
        }
        return tArr;
    }

    public Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    public int nextSpanTransition(int i, int i2, Class<C101395a> cls) {
        if (this.f297002d == cls) {
            cls = C101395a.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        C101395a aVar;
        if (mo140892c(obj)) {
            aVar = mo140891b(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            ((ArrayList) this.f297003e).remove(aVar);
        }
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (mo140892c(obj)) {
            C101395a aVar = new C101395a(obj);
            ((ArrayList) this.f297003e).add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    public CharSequence subSequence(int i, int i2) {
        return new C101394c(this.f297002d, this, i, i2);
    }

    /* renamed from: append  reason: collision with other method in class */
    public SpannableStringBuilder m168883append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: delete  reason: collision with other method in class */
    public SpannableStringBuilder m168888delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    /* renamed from: insert  reason: collision with other method in class */
    public SpannableStringBuilder m168889insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public Appendable m168886append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        mo140886a();
        super.replace(i, i2, charSequence);
        mo140893d();
        return this;
    }

    public Editable append(char c) {
        super.append(c);
        return this;
    }

    /* renamed from: insert  reason: collision with other method in class */
    public SpannableStringBuilder m168890insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public C101394c(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        C20434g.m22020d(cls, "watcherClass must not be null");
        this.f297002d = cls;
    }

    /* renamed from: append  reason: collision with other method in class */
    public SpannableStringBuilder m168882append(char c) {
        super.append(c);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public Appendable m168885append(char c) {
        super.append(c);
        return this;
    }

    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        mo140886a();
        super.replace(i, i2, charSequence, i3, i4);
        mo140893d();
        return this;
    }

    public Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public SpannableStringBuilder m168884append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public Appendable m168887append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
