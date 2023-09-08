package in3;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import in3.C87771d;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: in3.c */
public class C87770c implements View.OnApplyWindowInsetsListener {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f254119d;

    /* renamed from: e */
    public final /* synthetic */ C87771d f254120e;

    public C87770c(C87771d dVar, ViewGroup viewGroup) {
        this.f254120e = dVar;
        this.f254119d = viewGroup;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT < 31 || !this.f254120e.f254127c) {
            this.f254120e.f254129e = windowInsets.getSystemWindowInsetTop();
        } else {
            int i = windowInsets.getInsets(WindowInsets.Type.systemBars()).top;
            int i2 = windowInsets.getInsets(WindowInsets.Type.tappableElement()).top;
            this.f254120e.f254129e = Math.max(i, i2);
        }
        C87771d dVar = this.f254120e;
        int i3 = dVar.f254129e;
        dVar.getClass();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(dVar.f254126b);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C87771d.C46280b bVar = (C87771d.C46280b) weakReference.get();
            if (bVar != null) {
                bVar.mo6344U3(i3);
            } else {
                ((HashSet) dVar.f254126b).remove(weakReference);
            }
        }
        WindowInsets consumeSystemWindowInsets = windowInsets.consumeSystemWindowInsets();
        if (view != this.f254119d) {
            view.onApplyWindowInsets(consumeSystemWindowInsets);
        }
        return consumeSystemWindowInsets;
    }
}
