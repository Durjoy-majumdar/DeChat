package com.tencent.p014mm.p136ui.base.sortview;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import qj3.C47864f;

/* renamed from: com.tencent.mm.ui.base.sortview.b */
public class C44721b extends BaseAdapter {

    /* renamed from: d */
    public List<C47864f> f121310d = null;

    /* renamed from: e */
    public Map<String, Integer> f121311e;

    /* renamed from: f */
    public C44723b f121312f;

    /* renamed from: com.tencent.mm.ui.base.sortview.b$a */
    public class C44722a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f121313d;

        public C44722a(List list) {
            this.f121313d = list;
        }

        public void run() {
            C44721b.this.mo69953a(this.f121313d);
        }
    }

    /* renamed from: com.tencent.mm.ui.base.sortview.b$b */
    public interface C44723b {
        /* renamed from: a */
        View mo63508a(C47864f fVar, View view, ViewGroup viewGroup, int i, int i2, boolean z, boolean z2);
    }

    public C44721b(C44723b bVar) {
        if (bVar != null) {
            this.f121312f = bVar;
            this.f121310d = new ArrayList();
            this.f121311e = new HashMap();
            return;
        }
        throw new RuntimeException("ViewCreator can not be null.");
    }

    /* renamed from: a */
    public final void mo69953a(List<C47864f> list) {
        String str;
        List<C47864f> list2 = this.f121310d;
        if (list2 != list) {
            ((ArrayList) list2).clear();
            if (list != null) {
                ((ArrayList) this.f121310d).addAll(list);
            }
        }
        ((HashMap) this.f121311e).clear();
        String str2 = null;
        for (int i = 0; i < ((ArrayList) this.f121310d).size(); i++) {
            C47864f fVar = (C47864f) ((ArrayList) this.f121310d).get(i);
            if (fVar == null || (str = fVar.f128465a) == null) {
                str = null;
            }
            if (str != null && !str.equalsIgnoreCase(str2)) {
                ((HashMap) this.f121311e).put(str, Integer.valueOf(i));
                str2 = str;
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public void mo69954b(List<C47864f> list) {
        if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId()) {
            MMHandlerThread.postToMainThread(new C44722a(list));
        } else {
            mo69953a(list);
        }
    }

    public int getCount() {
        return ((ArrayList) this.f121310d).size();
    }

    public Object getItem(int i) {
        return ((ArrayList) this.f121310d).get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C47864f fVar = (C47864f) getItem(i);
        String str = null;
        String str2 = (i < 0 || i >= ((ArrayList) this.f121310d).size()) ? null : ((C47864f) ((ArrayList) this.f121310d).get(i)).f128465a;
        int i2 = i + 1;
        if (i2 >= 0 && i2 < ((ArrayList) this.f121310d).size()) {
            str = ((C47864f) ((ArrayList) this.f121310d).get(i2)).f128465a;
        }
        return this.f121312f.mo63508a(fVar, view, viewGroup, i, getCount(), i == Util.nullAs((Integer) ((HashMap) this.f121311e).get(str2), -1), str2 != null && !str2.equalsIgnoreCase(str));
    }
}
